package com.witvpn.gw.tunnel

import com.witvpn.gw.crypto.GwCrypto
import com.witvpn.gw.model.GwEnvelope
import com.witvpn.gw.model.GwServerResponse
import com.witvpn.gw.util.GwLog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

/**
 * Reference network helper for fetching + decrypting the GW server list from the API.
 *
 * The host app's own Retrofit `ApiService` is the preferred path (add a
 * `@POST("user/server_gw") suspend fun getServersGw(...)` there and call it through
 * the existing auth interceptor). This class is provided as a self-contained fallback
 * so the gw-tunnel module is usable standalone for testing.
 *
 * Flow:
 *   POST {base}/vpn/api/v1/user/server_gw  (form: user_id, pubkey, + android-signature)
 *     -> { servers: [ { meta: {...}, enc: { eph, ct, iv } } ] }
 *   for each row: GwCrypto.decryptConfig(userPrivHex, enc) -> GwServerConfig
 *
 * The user's secp256k1 private key (hex) is supplied by the app; never stored here.
 */
class GwConfigFetcher(
    private val baseUrl: String,
    private val androidSignature: String,   // the EXPECTED_SECRET the API middleware checks
) {
    private val log = GwLog.tag("Fetcher")
    private val http = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .build()

    data class Decoded(val meta: com.witvpn.gw.model.GwServerMeta, val config: GwServerConfig)

    suspend fun fetch(userId: String, userPrivHex: String): List<Decoded> = withContext(Dispatchers.IO) {
        val pubHex = GwCrypto.publicKeyHex(userPrivHex)
        val body = "user_id=$userId&pubkey=$pubHex&signature=$androidSignature"
            .toRequestBody("application/x-www-form-urlencoded".toMediaType())
        val req = Request.Builder()
            .url("${baseUrl.trimEnd('/')}/vpn/api/v1/user/server_gw")
            .post(body)
            .build()

        val resp = http.newCall(req).execute()
        val raw = resp.body?.string().orEmpty()
        if (!resp.isSuccessful) {
            log.w { "server_gw HTTP ${resp.code}" }
            return@withContext emptyList()
        }

        val arr: JSONArray = try {
            JSONObject(raw).optJSONArray("servers") ?: JSONArray()
        } catch (e: Throwable) {
            log.w { "bad json: ${e.message}" }; return@withContext emptyList()
        }

        val out = mutableListOf<Decoded>()
        for (i in 0 until arr.length()) {
            val row = arr.getJSONObject(i)
            val meta = parseMeta(row.optJSONObject("meta"))
            val env = parseEnvelope(row.optJSONObject("enc"))
            if (env.eph.isBlank() || env.ct.isBlank()) continue
            try {
                val cfg = GwCrypto.decryptConfig(userPrivHex, env)
                out.add(Decoded(meta, cfg))
            } catch (e: Throwable) {
                // wrong key / tampered / server using a different pubkey for this user
                log.w { "decrypt failed for ${meta.id}: ${e.message}" }
            }
        }
        out
    }

    private fun parseMeta(o: JSONObject?) = com.witvpn.gw.model.GwServerMeta(
        id = o?.optString("id"), name = o?.optString("name"),
        country = o?.optString("country"), country_code = o?.optString("country_code"),
        state = o?.optString("state"), premium = o?.optBoolean("premium", false),
        recommend = o?.optBoolean("recommend", false), priority = o?.optInt("priority", 0),
        status = o?.optBoolean("status", true) ?: true,
    )

    private fun parseEnvelope(o: JSONObject?) = GwEnvelope(
        eph = o?.optString("eph").orEmpty(),
        ct = o?.optString("ct").orEmpty(),
        iv = o?.optString("iv").orEmpty(),
    )
}
