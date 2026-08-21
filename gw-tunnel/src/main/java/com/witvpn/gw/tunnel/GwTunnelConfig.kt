package com.witvpn.gw.tunnel

/**
 * Builds the hev-socks5-tunnel YAML config that points the tun2socks engine at our
 * local pure-Java SOCKS5 server ([com.witvpn.gw.socks.GwSocks5Server]).
 *
 * The engine reads IP packets from the TUN fd (handed to it by [GwVpnService]) and
 * emits SOCKS5 CONNECT requests to 127.0.0.1:socksPort. Our SOCKS5 server turns each
 * request into an SSH `direct-tcpip` channel through the GW node.
 *
 * DNS leak prevention: we force a remote-resolved DNS path by NOT advertising a local
 * DNS resolver to the engine and by having [GwVpnService] add 8.8.8.8 / 1.1.1.1 as the
 * VPN DNS servers — the system sends DNS queries INTO the TUN, the engine forwards
 * them over SOCKS5 (TCP DNS to 8.8.8.8:53), and they exit via the SSH tunnel.
 */
object GwTunnelConfig {

    /** Tun interface parameters (mirror vyom's defaults; the fd is supplied at runtime). */
    data class Tun(
        val mtu: Int = 8500,
        val ipv4: String = "198.18.0.1",
        val ipv6: String? = null,
    )

    /** Build the YAML config string. */
    fun build(
        socks5Port: Int,
        tun: Tun = Tun(),
        tcpTimeoutSec: Int = 300,
        udpTimeoutSec: Int = 60,
        logLevel: String = "warn",
    ): String = buildString {
        appendLine("tunnel:")
        appendLine("  mtu: ${tun.mtu}")
        appendLine("  ipv4: ${tun.ipv4}")
        if (!tun.ipv6.isNullOrBlank()) appendLine("  ipv6: '${tun.ipv6}'")
        appendLine("socks5:")
        appendLine("  port: $socks5Port")
        appendLine("  address: 127.0.0.1")
        appendLine("  udp: 'tcp'")           // force TCP relay (DNS over TCP => no UDP leak)
        appendLine("misc:")
        appendLine("  tcp-read-write-timeout: ${tcpTimeoutSec * 1000}")
        appendLine("  udp-read-write-timeout: ${udpTimeoutSec * 1000}")
        appendLine("  log-level: $logLevel")
    }
}
