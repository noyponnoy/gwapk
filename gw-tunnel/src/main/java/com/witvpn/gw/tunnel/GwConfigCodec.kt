package com.witvpn.gw.tunnel

import com.witvpn.gw.model.GwServerConfig
import org.json.JSONObject

/**
 * Encode/decode [GwServerConfig] to a compact JSON string for passing through the
 * VpnService start Intent (Intents have a ~1MB Binder limit and a flat key/value
 * shape; a single JSON string is the simplest robust transport).
 *
 * No secrets are persisted to disk by this module — the host app owns the encrypted
 * envelope and decrypts it in memory before calling [GwManager]/startService.
 */
object GwConfigCodec {
    fun encode(c: GwServerConfig): String {
        val o = JSONObject()
        o.put("id", c.id)
        o.put("ip_address", c.ip_address)
        o.put("ssh_port", c.ssh_port)
        o.put("ssh_username", c.ssh_username)
        o.put("ssh_password", c.ssh_password)
        o.put("proxy_host", c.proxy_host)
        o.put("proxy_port", c.proxy_port)
        o.put("proxy_scheme", c.proxy_scheme)
        o.put("payload", c.payload)
        o.put("sni", c.sni)
        o.put("ssh_hostkey", c.ssh_hostkey)
        return o.toString()
    }

    fun decode(json: String): GwServerConfig? = try {
        val o = JSONObject(json)
        GwServerConfig(
            id = o.optString("id"),
            ip_address = o.optString("ip_address"),
            ssh_port = o.optInt("ssh_port", 22),
            ssh_username = o.optString("ssh_username").ifEmpty { "gw" },
            ssh_password = o.optString("ssh_password"),
            proxy_host = o.optString("proxy_host"),
            proxy_port = o.optInt("proxy_port", 80),
            proxy_scheme = o.optString("proxy_scheme").ifEmpty { "http" },
            payload = o.optString("payload"),
            sni = o.optString("sni"),
            ssh_hostkey = o.optString("ssh_hostkey"),
        )
    } catch (e: Throwable) { null }
}
