package com.witvpn.gw.tunnel

import android.util.Log
import androidx.annotation.Keep

/**
 * JNI bridge to the bundled `libhev-socks5-tunnel.so` (the same native tun2socks
 * engine the VLESS module uses). We declare our own JNI surface here so the
 * gw-tunnel module is self-contained and does not depend on vyom-tun-sdk internals.
 *
 * The native library exposes (matching v2rayNG / hev's Android build):
 *   TProxyStartService(configPath: String, fd: Int)   // blocking run on a native thread
 *   TProxyStopService()                                // signal quit
 *   TProxyGetStats(): LongArray?                        // [rx, tx]
 *
 * The config YAML points the SOCKS5 client at our local [GwSocks5Server].
 */
@Keep
object HevTunnelNative {
    private const val TAG = "GW/HevNative"
    @Volatile private var loaded = false

    init {
        try {
            System.loadLibrary("hev-socks5-tunnel")
            loaded = true
            Log.i(TAG, "loaded libhev-socks5-tunnel")
        } catch (e: UnsatisfiedLinkError) {
            // The .so is also shipped via the vyom-tun-sdk module; if the app already
            // loaded it from that module's classloader, a second load here can fail.
            // We tolerate that — the native methods are still resolvable process-wide.
            Log.w(TAG, "hev-socks5-tunnel already loaded or unavailable: ${e.message}")
            loaded = true // assume the other module loaded it
        }
    }

    @JvmStatic external fun TProxyStartService(configPath: String, fd: Int)
    @JvmStatic external fun TProxyStopService()
    @JvmStatic external fun TProxyGetStats(): LongArray?
}
