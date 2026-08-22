package hev.htproxy

import androidx.annotation.Keep

/**
 * Native JNI bridge for libhev-socks5-tunnel.so.
 * The C library's JNI_OnLoad dynamically registers native methods specifically
 * on the class name "hev/htproxy/TProxyService".
 */
@Keep
object TProxyService {
    @Volatile
    private var isLoaded = false

    init {
        try {
            System.loadLibrary("hev-socks5-tunnel")
            isLoaded = true
        } catch (e: UnsatisfiedLinkError) {
            // Might already be loaded by vyom-tun-sdk or another classloader
            isLoaded = true
        } catch (e: Throwable) {
            android.util.Log.e("TProxyService", "Failed to load libhev-socks5-tunnel: ${e.message}", e)
        }
    }

    @JvmStatic
    external fun TProxyStartService(configPath: String, fd: Int)

    @JvmStatic
    external fun TProxyStopService()

    @JvmStatic
    external fun TProxyGetStats(): LongArray?
}
