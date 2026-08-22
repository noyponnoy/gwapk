package com.witvpn.gw.crypto

import android.util.Base64
import com.witvpn.gw.model.GwEnvelope
import com.witvpn.gw.model.GwServerConfig
import org.bouncycastle.asn1.sec.SECNamedCurves
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement
import org.bouncycastle.crypto.params.ECDomainParameters
import org.bouncycastle.crypto.params.ECPrivateKeyParameters
import org.bouncycastle.crypto.params.ECPublicKeyParameters
import org.bouncycastle.crypto.signers.ECDSASigner
import org.bouncycastle.math.ec.ECPoint
import java.security.MessageDigest
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * GW encrypted-config decryption (client side of [com.witvpn.gw.crypto] in the API repo).
 *
 * Envelope = ECIES on secp256k1:
 *   shared = ECDH(user_priv, ephemeral_pub).getEncoded()  (X coordinate, 32 bytes)
 *   key    = SHA256(shared || "gw|key")
 *   iv     = SHA256(shared || "gw|iv")[0..11]
 *   plain  = AES-256-GCM(key, iv, ct, aad="gw-config-v1")
 *
 * The user's secp256k1 private key is supplied by the app (it already derives one
 * from the user's BIP-39 mnemonic via the Ethereum path m/44'/60'/0'/0/0 — the same
 * key used for user identity; see api/src/utils/crypto_user.py). Where the device
 * supports it, the app keeps this key inside Android Keystore.
 *
 * NOTE: we use BouncyCastle directly (already on the classpath via sshj) rather than
 * adding a separate secp256k1 library, so the GW transport has no extra native deps.
 */
object GwCrypto {

    private const val AAD = "gw-config-v1"
    private val secp256k1Params: ECDomainParameters by lazy {
        val spec = SECNamedCurves.getByName("secp256k1")
        ECDomainParameters(spec.curve, spec.g, spec.n, spec.h)
    }

    /** Derive the compressed-pubkey hex (33 bytes) for a private-key hex.
     *  Used to send `pubkey` to the API in the request body. */
    fun publicKeyHex(privHex: String): String {
        val priv = privHex.hexToBigInteger()
        val q = secp256k1Params.g.multiply(priv).normalize()
        return q.getEncoded(true).toHex()
    }

    /** Decrypt a [GwEnvelope] into a [GwServerConfig] using the user's private key (hex). */
    fun decryptConfig(privHex: String, env: GwEnvelope): GwServerConfig {
        val shared = ecdhSharedSecret(privHex, env.eph)
        val key = sha256(shared + "gw|key".toByteArray())
        val iv = sha256(shared + "gw|iv".toByteArray()).copyOfRange(0, 12)

        val ct = Base64.decode(env.ct, Base64.NO_WRAP)
        val ivBytes = Base64.decode(env.iv, Base64.NO_WRAP).also {
            require(it.contentEquals(iv)) { "iv mismatch — envelope tampered or wrong key" }
        }

        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"), GCMParameterSpec(128, ivBytes))
        cipher.updateAAD(AAD.toByteArray(Charsets.UTF_8))
        val plain = cipher.doFinal(ct) // throws AEADBadTag if wrong key/tampered
        val json = String(plain, Charsets.UTF_8)
        return parseConfig(json)
    }

    /** ECDH X-coordinate (32 bytes), matching the server's coincurve ecdh() default. */
    private fun ecdhSharedSecret(privHex: String, ephemeralPubHex: String): ByteArray {
        val priv = privHex.hexToBigInteger()
        val pubBytes = ephemeralPubHex.hexToByteArray()
        val pub: ECPoint = secp256k1Params.curve.decodePoint(pubBytes)
        val agreement = ECDHBasicAgreement().apply {
            init(ECPrivateKeyParameters(priv, secp256k1Params))
        }
        val z = agreement.calculateAgreement(
            ECPublicKeyParameters(pub, secp256k1Params)
        )
        // coincurve returns sha256(compressed-ss) by default; but our server uses
        // coincurve's .ecdh() which returns the SHA-256 of the *X coordinate* (32 bytes)
        // per libsecp256k1's secp256k1_ecdh() default hashfn. To match, hash the 32-byte X.
        val x32 = unsigned32(z)
        return sha256(x32)
    }

    private fun unsigned32(v: java.math.BigInteger): ByteArray {
        val b = v.toByteArray()
        return when {
            b.size == 32 -> b
            b.size == 33 && b[0].toInt() == 0 -> b.copyOfRange(1, 33) // strip sign byte
            b.size < 32 -> ByteArray(32 - b.size) + b          // left-pad
            else -> b.copyOfRange(b.size - 32, b.size)
        }
    }

    private fun sha256(d: ByteArray): ByteArray =
        MessageDigest.getInstance("SHA-256").digest(d)

    // ---- hex helpers ----
    private fun String.hexToByteArray(): ByteArray {
        require(length % 2 == 0) { "bad hex length" }
        return ByteArray(length / 2) { i ->
            ((Character.digit(this[i * 2], 16) shl 4) +
                    Character.digit(this[i * 2 + 1], 16)).toByte()
        }
    }

    private fun String.hexToBigInteger(): java.math.BigInteger =
        java.math.BigInteger(1, hexToByteArray())

    private fun ByteArray.toHex(): String =
        joinToString("") { "%02x".format(it) }

    /** Minimal JSON parse of the decrypted config blob (no Gson dependency in the module). */
    private fun parseConfig(json: String): GwServerConfig {
        fun String?.str(): String = this?.trim()?.trim('"') ?: ""
        // tiny tolerant extractor — the payload is a flat object from the server
        fun field(name: String): String? {
            val rx = Regex("\"$name\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)")
            return rx.find(json)?.groupValues?.getOrNull(1)
        }
        fun intF(name: String, default: Int) = field(name)?.toIntOrNull() ?: default
        return GwServerConfig(
            id = field("id").str(),
            ip_address = field("ip_address").str(),
            ssh_port = intF("ssh_port", 22),
            ssh_username = field("ssh_username").str().ifEmpty { "gw" },
            ssh_password = field("ssh_password").str(),
            proxy_host = field("proxy_host").str(),
            proxy_port = intF("proxy_port", 80),
            proxy_scheme = field("proxy_scheme").str().ifEmpty { "http" },
            payload = field("payload").str(),
            sni = field("sni").str(),
            ssh_hostkey = field("ssh_hostkey").str(),
        )
    }
}
