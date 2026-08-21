package com.witvpn.gw.tunnel

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.VpnService
import com.witvpn.gw.model.GwServerConfig

/**
 * High-level facade the host app calls. Hides the Intent wiring and the
 * VpnService.prepare() permission dance.
 *
 * Usage from the app's connect flow:
 *   1. GwVpn.prepare(activity)  -> returns an Intent if consent is needed (startActivityForResult it)
 *   2. on consent OK: GwVpn.start(context, decryptedConfig)
 *   3. GwVpn.stop(context)
 */
object GwVpn {

    /** Returns null if VPN consent already granted; otherwise the Intent to launch. */
    fun prepare(activity: Activity): Intent? = VpnService.prepare(activity)

    /** Start the GW tunnel with an in-memory decrypted config (no secrets on disk). */
    fun start(context: Context, cfg: GwServerConfig, allowedApps: Array<String>? = null, disallowedApps: Array<String>? = null) {
        GwManager.lastConfig = cfg
        val intent = Intent(context, GwVpnService::class.java).apply {
            action = GwVpnService.ACTION_START
            putExtra(GwVpnService.EXTRA_CONFIG, GwConfigCodec.encode(cfg))
            if (allowedApps != null) putExtra(GwVpnService.EXTRA_ALLOWED, allowedApps)
            if (disallowedApps != null) putExtra(GwVpnService.EXTRA_DISALLOWED, disallowedApps)
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            context.startForegroundService(intent)
        } else {
            context.startService(intent)
        }
    }

    /** Stop the GW tunnel. */
    fun stop(context: Context) {
        val intent = Intent(context, GwVpnService::class.java).apply {
            action = GwVpnService.ACTION_STOP
        }
        context.startService(intent)
    }
}
