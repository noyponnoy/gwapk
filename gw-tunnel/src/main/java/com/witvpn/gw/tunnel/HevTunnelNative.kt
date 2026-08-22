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
    fun TProxyStartService(configPath: String, fd: Int) {
        hev.htproxy.TProxyService.TProxyStartService(configPath, fd)
    }

    fun TProxyStopService() {
        hev.htproxy.TProxyService.TProxyStopService()
    }

    fun TProxyGetStats(): LongArray? {
        return hev.htproxy.TProxyService.TProxyGetStats()
    }
}
