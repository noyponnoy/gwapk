package com.witvpn.gw.ssh

import com.witvpn.gw.inject.InjectorSocketFactory
import com.witvpn.gw.model.GwServerConfig
import com.witvpn.gw.util.GwLog
import net.schmizz.sshj.SSHClient
import net.schmizz.sshj.connection.channel.direct.DirectConnection
import net.schmizz.sshj.transport.verification.PromiscuousVerifier
import java.io.IOException
import java.security.MessageDigest
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

/**
 * GwSshTunnel — owns the single SSH connection to a GW node and exposes a SOCKS5-like
 * "open direct-tcpip channel" API to the local SOCKS5 server.
 *
 * Flow: sshj connects to sshHost:sshPort THROUGH [InjectorSocketFactory] (which does
 * the proxy+payload+SNI injection). On connect it does the SSH kex, then authenticates
 * with username/password. We do NOT request a shell/session — the gw user is
 * ForceCommand /bin/false anyway. We only open `direct-tcpip` channels for each
 * outgoing connection the TUN stack wants to make.
 *
 * Reconnect/backoff is handled by [GwVpnService]; this class is a focused, restartable
 * connection holder.
 */
class GwSshTunnel(
    private val cfg: GwServerConfig,
    private val onState: (GwSshState) -> Unit,
) {
    private val log = GwLog.tag("SshTunnel")
    @Volatile private var ssh: SSHClient? = null
    @Volatile private var alive = false

    private val channels = ConcurrentHashMap<Long, DirectConnection>()
    private val nextId = AtomicLong(0)

    fun isConnected(): Boolean = alive && ssh?.isConnected == true

    @Throws(IOException::class)
    fun connect() {
        onState(GwSshState.CONNECTING)
        val client = SSHClient()
        client.connectTimeout = 15_000
        client.timeout = 20_000
        // Host-key handling: if the server pinned an ed25519 key, verify it; otherwise
        // accept (the tunnel's integrity is what matters; we are already inside an
        // encrypted channel). Pinning is preferred — set cfg.ssh_hostkey in the bot.
        if (cfg.ssh_hostkey.isNotBlank()) {
            client.addHostKeyVerifier(PinnedKeyVerifier(cfg.ssh_hostkey))
        } else {
            client.addHostKeyVerifier(PromiscuousVerifier())
        }
        client.setSocketFactory(InjectorSocketFactory(cfg))
        client.connect(cfg.ip_address, cfg.ssh_port)
        // always modern kex — the installer only enables curve25519 + ed25519

        client.authPassword(cfg.ssh_username, cfg.ssh_password)

        // No session channel — we only forward. KeepAlive is handled by DefaultConfig (HEARTBEAT).

        ssh = client
        alive = true
        onState(GwSshState.CONNECTED)
        log.i { "SSH connected to ${cfg.ip_address}:${cfg.ssh_port} as ${cfg.ssh_username}" }
    }

    /**
     * Open a `direct-tcpip` channel to [host]:[port] and return it. The SOCKS5 server
     * reads/writes the channel's streams to proxy the TUN connection.
     * Throws if the SSH connection is down.
     */
    @Throws(IOException::class)
    fun openDirectChannel(host: String, port: Int): DirectConnection {
        val s = ssh ?: throw IOException("ssh not connected")
        val id = nextId.incrementAndGet()
        val ch = s.newDirectConnection(host, port)
        channels[id] = ch
        return ch
    }

    fun disconnect() {
        alive = false
        onState(GwSshState.DISCONNECTING)
        try {
            channels.values.forEach { runCatching { it.close() } }
            channels.clear()
            ssh?.disconnect()
        } catch (e: Throwable) {
            log.w { "disconnect: ${e.message}" }
        } finally {
            ssh = null
            onState(GwSshState.DISCONNECTED)
        }
    }

    /** Verify a pinned ed25519 host key (base64 of the OpenSSH pub key). */
    private class PinnedKeyVerifier(private val pinned: String) : net.schmizz.sshj.transport.verification.HostKeyVerifier {
        override fun verify(hostname: String, port: Int, key: java.security.PublicKey): Boolean {
            val actual = net.schmizz.sshj.common.SecurityUtils.getFingerprint(key)
            val pin = pinned.trim()
            val keyBytes = key.encoded
            val actualB64 = android.util.Base64.encodeToString(keyBytes, android.util.Base64.NO_WRAP)
            val ok = actualB64 == pin || actual.equals(pin, ignoreCase = true)
            return ok
        }
        override fun findExistingAlgorithms(hostname: String, port: Int): MutableList<String> = mutableListOf()
    }
}

enum class GwSshState { DISCONNECTED, CONNECTING, CONNECTED, DISCONNECTING, ERROR }
