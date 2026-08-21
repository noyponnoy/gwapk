package com.witvpn.gw.util

import android.util.Log

/**
 * Tiny logger for the gw-tunnel module. Tagged, level-filtered, no allocation on
 * disabled levels (the lambda is only evaluated when the level is on).
 */
object GwLog {
    @Volatile var enabled: Boolean = true
    @Volatile var verbose: Boolean = false

    private const val PREFIX = "GW"

    fun tag(sub: String) = Logger("$PREFIX/$sub")

    class Logger(private val tag: String) {
        fun d(msg: () -> String) { if (enabled && verbose) Log.d(tag, safe(msg)) }
        fun i(msg: () -> String) { if (enabled) Log.i(tag, safe(msg)) }
        fun w(msg: () -> String) { if (enabled) Log.w(tag, safe(msg)) }
        fun e(msg: () -> String, t: Throwable? = null) {
            if (enabled) Log.e(tag, safe(msg), t)
        }
        private fun safe(m: () -> String) = try { m() } catch (_: Throwable) { "<log err>" }
    }
}
