package com.witvpn.ikev2.presentation.utils

import android.content.Context
import kotlinx.coroutines.*
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import timber.log.Timber

object ConnectionTracker {
    private val client = OkHttpClient.Builder()
        .addInterceptor(com.witvpn.ikev2.presentation.utils.interceptor.ModifyRequestInterceptor())
        .build()
    private var heartbeatJob: Job? = null
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    fun reportConnect(context: Context, userId: String, serverIp: String, protocol: String = "ikev2") {
        scope.launch {
            try {
                val body = FormBody.Builder()
                    .add("userId", userId)
                    .add("serverIp", serverIp)
                    .add("protocol", protocol)
                    .add("action", "connect")
                    .build()
                val request = Request.Builder()
                    .url("${getBaseUrl(context)}/user/connection/update")
                    .post(body)
                    .build()
                client.newCall(request).execute().close()
                Timber.d("ConnectionTracker: connect reported for $serverIp")
            } catch (e: Exception) {
                Timber.e(e, "ConnectionTracker: failed to report connect")
            }
        }
        startHeartbeat(userId, serverIp, protocol, context)
    }

    fun reportDisconnect(context: Context, userId: String) {
        stopHeartbeat()
        scope.launch {
            try {
                val body = FormBody.Builder()
                    .add("userId", userId)
                    .add("serverIp", "")
                    .add("protocol", "ikev2")
                    .add("action", "disconnect")
                    .build()
                val request = Request.Builder()
                    .url("${getBaseUrl(context)}/user/connection/update")
                    .post(body)
                    .build()
                client.newCall(request).execute().close()
                Timber.d("ConnectionTracker: disconnect reported")
            } catch (e: Exception) {
                Timber.e(e, "ConnectionTracker: failed to report disconnect")
            }
        }
    }

    private fun startHeartbeat(userId: String, serverIp: String, protocol: String, context: Context) {
        stopHeartbeat()
        heartbeatJob = scope.launch {
            while (isActive) {
                delay(60_000) // every 60 seconds
                try {
                    val body = FormBody.Builder()
                        .add("userId", userId)
                        .add("serverIp", serverIp)
                        .add("protocol", protocol)
                        .add("action", "heartbeat")
                        .build()
                    val request = Request.Builder()
                        .url("${getBaseUrl(context)}/user/connection/update")
                        .post(body)
                        .build()
                    client.newCall(request).execute().close()
                    Timber.d("ConnectionTracker: heartbeat sent")
                } catch (e: Exception) {
                    Timber.e(e, "ConnectionTracker: heartbeat failed")
                }
            }
        }
    }

    private fun stopHeartbeat() {
        heartbeatJob?.cancel()
        heartbeatJob = null
    }

    private fun getBaseUrl(context: Context): String {
        return context.getString(com.witvpn.ikev2.R.string.base_url).removeSuffix("/")
    }
}
