package com.witvpn.gw.socks

import com.witvpn.gw.ssh.GwSshTunnel
import com.witvpn.gw.util.GwLog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.io.IOException
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket
import kotlin.coroutines.CoroutineContext

/**
 * GwSocks5Server — a tiny pure-Java SOCKS5 server that listens on 127.0.0.1 and, for
 * every CONNECT request, opens an SSH `direct-tcpip` channel via [GwSshTunnel] and
 * pipes bytes both ways.
 *
 * The native `hev-socks5-tunnel` (libhev-socks5-tunnel.so, already packaged for VLESS)
 * reads the TUN file descriptor and turns IP packets into SOCKS5 CONNECT requests to
 * this local server. We are the SOCKS5 server it talks to.
 *
 * DNS: SOCKS5 also carries UDP, but hev-socks5-tunnel resolves DNS itself over the
 * tunnel when configured with a remote DNS — we keep things simple here and only
 * implement CONNECT (TCP). UDP-assiate is refused; the TUN stack handles DNS via a
 * forwarded TCP DNS query (the standard no-leak approach).
 */
class GwSocks5Server(
    private val tunnel: GwSshTunnel,
    private val port: Int = 0,           // 0 = pick a free port
) : CoroutineScope {

    private val log = GwLog.tag("Socks5")
    override val coroutineContext: CoroutineContext = SupervisorJob() + Dispatchers.IO

    @Volatile private var server: ServerSocket? = null
    @Volatile private var running = false
    private var acceptJob: Job? = null

    val listenPort: Int get() = server?.localPort ?: -1

    fun start() {
        if (running) return
        val s = ServerSocket()
        s.bind(InetSocketAddress(InetAddress.getByName("127.0.0.1"), port))
        server = s
        running = true
        log.i { "SOCKS5 listening on 127.0.0.1:${s.localPort}" }
        acceptJob = launch {
            while (running) {
                val client = try {
                    s.accept()
                } catch (e: IOException) {
                    if (running) log.w { "accept: ${e.message}" }
                    break
                }
                launch { handle(client) }
            }
        }
    }

    fun stop() {
        running = false
        runCatching { server?.close() }
        acceptJob?.cancel()
        cancel() // cancel the scope (and all per-connection jobs)
        server = null
        log.i { "SOCKS5 stopped" }
    }

    private fun handle(client: Socket) {
        client.tcpNoDelay = true
        try {
            val ins = client.getInputStream()
            val out = client.getOutputStream()

            // --- SOCKS5 greeting: VER, NMETHODS, METHODS ---
            val ver = ins.read()
            if (ver != 0x05) { client.close(); return }
            val nmethods = ins.read()
            if (nmethods <= 0) { client.close(); return }
            val methods = ByteArray(nmethods)
            readFully(ins, methods)
            // we only support NO-AUTH (0x00)
            out.write(byteArrayOf(0x05, 0x00))
            out.flush()

            // --- request: VER, CMD, RSV, ATYP, DST.ADDR, DST.PORT ---
            if (ins.read() != 0x05) { client.close(); return }
            val cmd = ins.read()
            ins.read() // RSV
            val atyp = ins.read()
            val host: String = when (atyp) {
                0x01 -> { // IPv4
                    val a = ByteArray(4); readFully(ins, a)
                    a.joinToString(".") { (it.toInt() and 0xFF).toString() }
                }
                0x03 -> { // domain
                    val len = ins.read(); val a = ByteArray(len); readFully(ins, a); String(a, Charsets.US_ASCII)
                }
                0x04 -> { // IPv6
                    val a = ByteArray(16); readFully(ins, a)
                    a.joinToString(":") { "%02x".format(it) }
                }
                else -> { reply(out, 0x08); client.close(); return }
            }
            val portHi = ins.read(); val portLo = ins.read()
            val dstPort = (portHi shl 8) or portLo

            if (cmd != 0x01) { // only CONNECT
                reply(out, 0x07) // command not supported
                client.close(); return
            }

            // --- open SSH direct-tcpip channel ---
            val channel = try {
                tunnel.openDirectChannel(host, dstPort)
            } catch (e: Throwable) {
                log.w { "openDirectChannel($host:$dstPort): ${e.message}" }
                reply(out, 0x05) // connection refused
                client.close(); return
            }

            // success
            reply(out, 0x00)
            out.flush()

            // --- pipe both ways until either side closes ---
            val up = launch { pipe(client.getInputStream(), channel.out) }
            val down = launch { pipe(channel.in, client.getOutputStream()) }
            up.join(); down.join()
            runCatching { channel.close() }
            runCatching { client.close() }
        } catch (e: Throwable) {
            log.w { "handle: ${e.message}" }
            runCatching { client.close() }
        }
    }

    private fun reply(out: java.io.OutputStream, rep: Byte) {
        // VER=5, REP, RSV=0, ATYP=1 (IPv4), BND.ADDR=0.0.0.0, BND.PORT=0
        out.write(byteArrayOf(0x05, rep, 0x00, 0x01, 0, 0, 0, 0, 0, 0))
        out.flush()
    }

    private fun pipe(from: java.io.InputStream, to: java.io.OutputStream) {
        val buf = ByteArray(16 * 1024)
        try {
            while (true) {
                val n = from.read(buf)
                if (n <= 0) break
                to.write(buf, 0, n)
                to.flush()
            }
        } catch (_: Throwable) {
            // either side closed — fine
        } finally {
            runCatching { to.flush() }
        }
    }

    private fun readFully(ins: java.io.InputStream, buf: ByteArray) {
        var off = 0; var n = buf.size
        while (n > 0) {
            val r = ins.read(buf, off, n)
            if (r <= 0) throw IOException("short read")
            off += r; n -= r
        }
    }
}
