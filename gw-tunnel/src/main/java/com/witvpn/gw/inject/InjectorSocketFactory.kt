package com.witvpn.gw.inject

import com.witvpn.gw.model.GwServerConfig
import com.witvpn.gw.util.GwLog
import java.io.IOException
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import javax.net.SocketFactory
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocket
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

/**
 * InjectorSocketFactory — the GW transport's custom [SocketFactory] for sshj.
 *
 * Replicates the HTTP-Injector scheme from abdoxfox/HTTP-CUSTOM-HEADERS-VPN in pure
 * Java (no root, no iptables):
 *
 *   1. open a TCP socket to proxyHost:proxyPort (or directly to sshHost:sshPort
 *      when no proxy is configured)
 *   2. if proxy_scheme == https or an SNI is set, wrap the socket in TLS with that
 *      SNI (this is the Cloudflare-front / direct-TLS path)
 *   3. send the HTTP-injector **payload** (the template from the server config),
 *      expanding tokens: [host] [port] [protocol] [ua] [crlf] [cr] [lf] [crlf*2]
 *      [method] [ssh] [host_port] [split] [delay_split] [instant_split]
 *   4. read the server's response: if the first line starts with "SSH-" we're
 *      talking straight to SSH — forward the banner. If it's an HTTP status line,
 *      the injector path expects us to ACK with "HTTP/1.1 200 OK\r\n\r\n" and keep
 *      reading until the SSH banner arrives (this is the WS-Proxy / CDN 101 flow:
 *      the CDN already upgraded; the origin bridge sent 101, and now SSH bytes flow).
 *   5. return the now-tunneled socket. sshj performs the SSH handshake over it.
 *
 * Split/delay tokens allow fragmenting the payload to evade naive DPI — each
 * `=0.1=` / `=0.5=` / `=0.0=` segment is sent with a sleep between, matching the
 * reference implementation.
 */
class InjectorSocketFactory(
    private val cfg: GwServerConfig,
) : SocketFactory() {

    private val log = GwLog.tag("Injector")

    override fun createSocket(): Socket = throw UnsupportedOperationException("use createSocket(host,port)")

    override fun createSocket(host: String, port: Int): Socket =
        connectAndInject(host, port)

    override fun createSocket(host: String, port: Int, localHost: InetAddress, localPort: Int): Socket =
        createSocket(host, port)

    override fun createSocket(host: InetAddress, port: Int): Socket =
        connectAndInject(host.hostAddress, port)

    override fun createSocket(address: InetAddress, port: Int, localAddress: InetAddress, localPort: Int): Socket =
        createSocket(address, port)

    // ------------------------------------------------------------------
    private fun connectAndInject(sshHost: String, sshPort: Int): Socket {
        val proxyHost = if (cfg.usesProxy) cfg.proxy_host else sshHost
        val proxyPort = if (cfg.usesProxy) cfg.proxy_port else sshPort

        log.d { "connect -> $proxyHost:$proxyPort (ssh target ${sshHost}:${sshPort})" }

        val raw = Socket()
        raw.tcpNoDelay = true
        raw.keepAlive = true
        // generous connect timeout; the tunnel itself keeps alive
        raw.connect(InetSocketAddress(proxyHost, proxyPort), 15_000)

        // Perform TLS over the raw socket if needed (the pushback wrapper goes on
        // the FINAL socket so it works for both plain and TLS paths).
        val tunneled: Socket = if (cfg.useTls) wrapTls(raw, cfg.sni.ifBlank { proxyHost }) else raw

        // Wrap so the injector can push back bytes it peeked (the SSH banner) and
        // sshj later reads the full banner from the start.
        val sock: Socket = GwPushbackSocket(tunneled)

        // If a payload is configured, perform the injection handshake.
        // Mode "0" (direct SSH, no payload) just returns the socket as-is.
        if (cfg.payload.isNotBlank()) {
            sendPayloadAndAwaitSsh(sock, sshHost, sshPort)
        }
        return sock
    }

    private fun wrapTls(raw: Socket, sni: String): SSLSocket {
        // We trust the CDN certificate (Cloudflare). For direct-TLS to our own
        // origin we accept whatever the origin presents — host-key pinning of the
        // SSH layer is the real integrity guarantee, not TLS CA validation here.
        val ctx = SSLContext.getInstance("TLS")
        ctx.init(null, arrayOf<TrustManager>(TrustAll), java.security.SecureRandom())
        val ssl = ctx.socketFactory.createSocket(raw, sni, raw.port, true) as SSLSocket
        // SNI
        try {
            val params = ssl.sslParameters
            params.serverNames = listOf(javax.net.ssl.SNIHostName(sni))
            ssl.sslParameters = params
        } catch (e: Throwable) {
            log.w { "SNI set failed (old API?): ${e.message}" }
        }
        // Prefer modern protocols.
        ssl.enabledProtocols = arrayOf("TLSv1.3", "TLSv1.2").intersect(ssl.enabledProtocols.toList()).toTypedArray()
            .ifEmpty { ssl.enabledProtocols }
        ssl.startHandshake()
        log.d { "TLS handshake OK to $sni (${ssl.session.protocol})" }
        return ssl
    }

    private fun sendPayloadAndAwaitSsh(sock: Socket, sshHost: String, sshPort: Int) {
        val out = sock.getOutputStream()
        val payload = expandPayload(cfg.payload, sshHost, sshPort.toString())
        log.d { "payload segments=${payload.size}" }

        // Send each segment, honoring split/delay tokens.
        for (seg in payload) {
            when (seg) {
                "0.0" -> { /* instant split: no delay */ }
                "0.1" -> Thread.sleep(100)
                "0.5" -> Thread.sleep(500)
                else -> out.write(seg.toByteArray(Charsets.US_ASCII))
            }
        }
        out.flush()

        // Read the response. The reference impl waits for an "SSH-" banner; if it
        // sees an HTTP status line instead, it ACKs "HTTP/1.1 200 OK\r\n\r\n" and
        // keeps reading (CDN/WS-Proxy path).
        awaitSshBanner(sock)
    }

    /** Read until we see the SSH banner (starts with "SSH-"). Fake 200 OK for HTTP. */
    private fun awaitSshBanner(sock: Socket) {
        val ins = sock.getInputStream()
        val buf = ByteArray(256)
        // We only peek the first line(s). After SSH- shows up, we must push back the
        // bytes we consumed so the SSH transport reads the full banner.
        val peek = readLineBytes(ins, buf) ?: throw IOException("injector: no response from proxy")
        val line = String(peek, Charsets.US_ASCII).trim()
        log.d { "resp: ${line.take(80)}" }

        if (line.startsWith("SSH-", ignoreCase = true)) {
            // Push the banner back into the stream so sshj can read it.
            pushBack(sock, peek)
            return
        }
        if (line.startsWith("HTTP/", ignoreCase = true)) {
            // Acknowledge and keep reading for the SSH banner.
            sock.getOutputStream().write("HTTP/1.1 200 OK\r\n\r\n".toByteArray(Charsets.US_ASCII))
            sock.getOutputStream().flush()
            // The 101/200 response may have headers; read until empty line, then SSH-.
            // For simplicity we read lines until one starts with SSH-.
            val collected = mutableListOf<ByteArray>()
            collected.add(peek)
            while (true) {
                val l = readLineBytes(ins, buf) ?: throw IOException("injector: stream closed before SSH banner")
                val s = String(l, Charsets.US_ASCII).trim()
                if (s.startsWith("SSH-", ignoreCase = true)) {
                    collected.add(l)
                    pushBack(sock, collected.flatten())
                    return
                }
                collected.add(l)
                if (s.isEmpty() && collected.size > 1) {
                    // end of HTTP headers, keep going for SSH bytes
                    continue
                }
            }
        }
        // Unknown — push back and let sshj try (some injectors emit raw SSH after a 200).
        pushBack(sock, peek)
    }

    private fun readLineBytes(ins: java.io.InputStream, buf: ByteArray): ByteArray? {
        val baos = java.io.ByteArrayOutputStream()
        var b: Int
        var n = 0
        while (ins.read().also { b = it } != -1) {
            baos.write(b); n++
            if (b == '\n'.code) break
            if (n >= buf.size) break
        }
        if (n == 0) return null
        return baos.toByteArray()
    }

    private fun pushBack(sock: Socket, bytes: ByteArray) {
        // sshj reads from the socket's InputStream; wrap it so the peeked bytes are
        // re-served first. We stash the pushed-back bytes on the stream via reflection-
        // free approach: a PushbackInputStream. Since sshj obtained the stream already,
        // we instead use a thread-local override by re-creating the socket's input.
        // Simpler & robust: wrap the whole socket in GwPushbackSocket at creation time.
        // (Handled in connectAndInject by returning GwPushbackSocket — see below.)
        // Here we just store it on the socket if it's our wrapper.
        if (sock is GwPushbackSocket) sock.pushBack(bytes)
        else throw IOException("injector: cannot push back on non-GwPushbackSocket")
    }

    private fun List<ByteArray>.flatten(): ByteArray {
        val total = sumOf { it.size }
        val out = ByteArray(total); var off = 0
        for (b in this) { System.arraycopy(b, 0, out, off, b.size); off += b.size }
        return out
    }

    // ------------------------------------------------------------------
    /** Expand the HTTP-injector payload template, returning sendable segments
     *  (split on the `=N.N=` delay tokens so the caller can sleep between them). */
    private fun expandPayload(template: String, host: String, port: String): List<String> {
        var p = template
            .replace("[crlf*2]", "\r\n\r\n")
            .replace("[crlf]", "\r\n")
            .replace("[lfcr]", "\n\r")
            .replace("[cr]", "\r")
            .replace("[lf]", "\n")
            .replace("\\r", "\r")
            .replace("\\n", "\n")
            .replace("[protocol]", "HTTP/1.1")
            .replace("[ua]", "Dalvik/2.1.0")
            .replace("[method]", "CONNECT")
            .replace("[ssh]", "$host:$port")
            .replace("[host_port]", "$host:$port")
            .replace("[host]", host)
            .replace("[port]", port)
            .replace("[split]", "=0.1=")
            .replace("[delay_split]", "=0.5=")
            .replace("[instant_split]", "=0.0=")
            .replace("[split_instant]", "=0.0=")
            .replace("[split_delay]", "=0.5=")
            .replace("[auth]", "")
        // split on the delay tokens
        return p.split("=0.0=", "=0.1=", "=0.5=").let { segs ->
            // re-insert markers so the loop knows which delay to apply
            val out = mutableListOf<String>()
            val rx = Regex("=0\\.[05]=")
            var last = 0
            for (m in rx.findAll(p)) {
                out.add(p.substring(last, m.range.first))
                out.add(m.value)
                last = m.range.last + 1
            }
            out.add(p.substring(last))
            out.filter { it.isNotEmpty() }
        }
    }

    // Allow-all trust manager for the CDN/origin TLS hop. The security boundary is
    // the SSH host-key (optionally pinned via cfg.ssh_hostkey), not this TLS hop.
    private object TrustAll : X509TrustManager {
        override fun checkClientTrained(chain: Array<out java.security.cert.X509Certificate>?, authType: String?) {}
        override fun checkServerTrusted(chain: Array<out java.security.cert.X509Certificate>?, authType: String?) {}
        override fun getAcceptedIssuers(): Array<java.security.cert.X509Certificate> = emptyArray()
    }
}
