package com.witvpn.gw.model

/**
 * Decrypted GW server configuration — the secret blob the client receives from
 * `/vpn/api/v1/user/server_gw` and decrypts with its secp256k1 private key
 * (see [com.witvpn.gw.crypto.GwCrypto]).
 *
 * Field names mirror the server pojo (api/src/db/v3/gw/server_pojo.py) so the
 * JSON envelope maps directly.
 */
data class GwServerConfig(
    val id: String = "",
    val ip_address: String = "",        // SSH host
    val ssh_port: Int = 22,
    val ssh_username: String = "gw",
    val ssh_password: String = "",
    val proxy_host: String = "",        // CDN / HTTP-proxy front
    val proxy_port: Int = 80,
    val proxy_scheme: String = "http",  // http | https
    val payload: String = "",           // HTTP-injector template
    val sni: String = "",               // TLS SNI (Cloudflare front / direct TLS)
    val ssh_hostkey: String = ""        // ed25519 pub (base64), optional pin
) {
    /** Where the SSH transport actually connects: through the proxy if set, else direct. */
    val usesProxy: Boolean get() = proxy_host.isNotBlank() && proxy_port > 0
    val useTls: Boolean get() = proxy_scheme.equals("https", true) || sni.isNotBlank()
}

/**
 * Public metadata for a GW server (returned in cleartext alongside the encrypted
 * envelope so the UI can render the list before decryption).
 */
data class GwServerMeta(
    val id: String? = null,
    val name: String? = null,
    val country: String? = null,
    val country_code: String? = null,
    val state: String? = null,
    val premium: Boolean = false,
    val recommend: Boolean = false,
    val priority: Int = 0,
    val status: Boolean = true,
)

/** One server row as returned by the API: public meta + the ECIES envelope. */
data class GwServerResponse(
    val meta: GwServerMeta = GwServerMeta(),
    val enc: GwEnvelope = GwEnvelope(),
)

data class GwEnvelope(
    val eph: String = "",   // ephemeral secp256k1 pubkey (hex)
    val ct: String = "",    // base64(ciphertext || 16-byte GCM tag)
    val iv: String = "",    // base64(12-byte nonce)
)
