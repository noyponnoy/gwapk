package com.witvpn.gw.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.VpnService
import android.os.Build
import android.os.IBinder
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.app.NotificationCompat
import com.witvpn.gw.model.GwServerConfig
import com.witvpn.gw.socks.GwSocks5Server
import com.witvpn.gw.ssh.GwSshState
import com.witvpn.gw.ssh.GwSshTunnel
import com.witvpn.gw.util.GwLog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.io.File
import java.net.InetSocketAddress
import kotlin.coroutines.CoroutineContext

/**
 * GwVpnService — the Android foreground [VpnService] that owns the entire GW tunnel:
 *
 *   TUN (this service) -> libhev-socks5-tunnel (native) -> GwSocks5Server (local, pure-Java)
 *                       -> GwSshTunnel (sshj) -> InjectorSocketFactory (proxy+payload+SNI)
 *                       -> SSH server on the VPS -> internet
 *
 * Responsibilities:
 *   - establish the TUN with routes 0.0.0.0/0 and ::/0 and DNS servers 1.1.1.1 / 8.8.8.8
 *     (so the system's DNS goes THROUGH the tunnel — no DNS leak)
 *   - start the local SOCKS5 server on an ephemeral port
 *   - write the hev-socks5-tunnel YAML and start the native engine with the TUN fd
 *   - establish + maintain the SSH connection (with bounded reconnect backoff)
 *   - map sshj/IO errors to [GwError] for the UI
 *   - survive screen-off / doze as a foreground service (specialUse type on A14+)
 *   - tear everything down cleanly on disconnect / system revoke
 *
 * State is broadcast via [GwManager] (a process-wide singleton the app observes), so
 * the existing UI observers wired to the strongSwan VpnStateService can be reused.
 */
class GwVpnService : VpnService(), CoroutineScope {

    companion object {
        const val ACTION_START = "com.witvpn.gw.action.START"
        const val ACTION_STOP = "com.witvpn.gw.action.STOP"
        const val EXTRA_CONFIG = "gw_config_json"
        const val EXTRA_ALLOWED = "gw_allowed_apps"
        const val EXTRA_DISALLOWED = "gw_disallowed_apps"

        private const val CH_ID = "gw_vpn"
        private const val NOTIF_ID = 0xA011
        private const val TUN_IPV4 = "198.18.0.1"
        private const val TUN_IPV6 = "fc00::1"
        private const val MTU = 8500

        private val log = GwLog.tag("GwVpnService")
    }

    override val coroutineContext: CoroutineContext = SupervisorJob() + Dispatchers.IO
    private val mux = Mutex()

    @Volatile private var tun: ParcelFileDescriptor? = null
    @Volatile private var socks: GwSocks5Server? = null
    @Volatile private var ssh: GwSshTunnel? = null
    @Volatile private var nativeThread: Thread? = null
    @Volatile private var running = false
    private var reconnectJob: Job? = null
    private var statsJob: Job? = null

    // ---- lifecycle ----------------------------------------------------------
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_STOP -> { stopGw(); return START_NOT_STICKY }
            ACTION_START -> {
                val json = intent.getStringExtra(EXTRA_CONFIG) ?: run {
                    log.e { "no config in start intent" }; stopSelf(); return START_NOT_STICKY
                }
                val cfg = GwConfigCodec.decode(json) ?: run {
                    GwManager.publishError(GwError.GENERIC); stopSelf(); return START_NOT_STICKY
                }
                startForeground()
                launch { startGw(cfg, intent) }
            }
            else -> {
                // always-on / restart: try last config
                val last = GwManager.lastConfig
                if (last != null) {
                    startForeground()
                    launch { startGw(last, intent) }
                } else { stopSelf() }
            }
        }
        return START_STICKY
    }

    override fun onRevoke() {
        // system revoked VPN (e.g. another VPN started) — tear down, don't keep trying
        log.i { "onRevoke" }
        stopGw()
        super.onRevoke()
    }

    override fun onDestroy() {
        stopGw()
        runCatching { coroutineContext[Job]?.cancel() }
        super.onDestroy()
    }

    // ---- core ---------------------------------------------------------------
    private suspend fun startGw(cfg: GwServerConfig, intent: Intent?) {
        if (!mux.tryLock()) return // already starting
        try {
            running = true
            GwManager.lastConfig = cfg
            GwManager.publish(GwState.CONNECTING, GwError.NONE)

            // 1. SOCKS5 server first (the native engine connects to it immediately)
            val sshTunnel = GwSshTunnel(cfg) { st -> onSshState(st) }
            val socks5 = GwSocks5Server(sshTunnel)
            socks5.start()
            socks = socks5
            ssh = sshTunnel

            // 2. establish SSH (with bounded retry handled below)
            connectWithRetry(sshTunnel)

            // 3. establish TUN + start native tun2socks pointing at our SOCKS5
            val pfd = establishTun(cfg, intent)
            if (pfd == null) {
                GwManager.publishError(GwError.GENERIC)
                stopGw(); return
            }
            tun = pfd

            val configYaml = GwTunnelConfig.build(socks5.listenPort)
            val cfgFile = File(filesDir, "gw-hev-socks5-tunnel.yaml")
            cfgFile.writeText(configYaml)

            // hand the (still-open) fd to the native engine; the engine blocks on its
            // own thread until TProxyStopService. We must NOT close pfd here.
            val fd = pfd.detachFd()
            nativeThread = Thread({ runNative(cfgFile.absolutePath, fd) }, "gw-hev-tunnel").apply {
                isDaemon = true
                start()
            }

            GwManager.publish(GwState.CONNECTED, GwError.NONE)
            startStatsPolling()
        } catch (e: Throwable) {
            log.e({ "startGw failed: ${e.message}" }, e)
            GwManager.publishError(mapError(e))
            stopGw()
        } finally {
            mux.unlock()
        }
    }

    private fun runNative(configPath: String, fd: Int) {
        try {
            HevTunnelNative.TProxyStartService(configPath, fd)
        } catch (e: Throwable) {
            log.e({ "native tunnel exited: ${e.message}" }, e)
            if (running) GwManager.publishError(GwError.GENERIC)
        }
    }

    private suspend fun connectWithRetry(t: GwSshTunnel) {
        var attempt = 0
        var backoff = 1_000L
        while (running && !t.isConnected()) {
            attempt++
            try {
                t.connect()
                return
            } catch (e: Throwable) {
                log.w { "ssh connect attempt $attempt failed: ${e.message}" }
                if (attempt == 1) GwManager.publishError(mapError(e))
                if (attempt >= 5) throw e
                delay(backoff)
                backoff = (backoff * 2).coerceAtMost(15_000L)
            }
        }
    }

    private fun onSshState(st: GwSshState) {
        when (st) {
            GwSshState.CONNECTED -> { /* state published in startGw */ }
            GwSshState.ERROR, GwSshState.DISCONNECTED -> {
                if (running) {
                    // the SSH link dropped while we expect to be up -> reconnect
                    scheduleReconnect()
                }
            }
            else -> {}
        }
    }

    private fun scheduleReconnect() {
        reconnectJob?.cancel()
        reconnectJob = launch {
            var backoff = 2_000L
            while (running && ssh?.isConnected() != true) {
                GwManager.publish(GwState.CONNECTING, GwError.NONE)
                try {
                    ssh?.connect(); return@launch
                } catch (_: Throwable) {}
                delay(backoff); backoff = (backoff * 2).coerceAtMost(30_000L)
            }
        }
    }

    // ---- TUN ----------------------------------------------------------------
    private fun establishTun(cfg: GwServerConfig, intent: Intent?): ParcelFileDescriptor? {
        val builder = Builder()
            .setSession("GW")
            .setMtu(MTU)
            .addAddress(TUN_IPV4, 32)
            .addAddress(TUN_IPV6, 128)
            // Route EVERYTHING through the tunnel — no split, no leak.
            .addRoute("0.0.0.0", 0)
            .addRoute("::", 0)
            // DNS served through the tunnel (resolved over SOCKS5 by the engine).
            .addDnsServer("1.1.1.1")
            .addDnsServer("8.8.8.8")

        // Search domains (optional, helps some apps)
        try { builder.addSearchDomain("lan") } catch (_: Throwable) {}

        // Split-tunneling: allow/disallow apps if the caller supplied them.
        val allowed = intent?.getStringArrayExtra(EXTRA_ALLOWED)
        val disallowed = intent?.getStringArrayExtra(EXTRA_DISALLOWED)
        if (!allowed.isNullOrEmpty()) {
            allowed.forEach { runCatching { builder.addAllowedApplication(it) } }
        }
        if (!disallowed.isNullOrEmpty()) {
            disallowed.forEach { runCatching { builder.addDisallowedApplication(it) } }
        }
        // Always exclude our own app from the tunnel to avoid a routing loop on the
        // control plane (API calls should still work over the underlay).
        runCatching { builder.addDisallowedApplication(packageName) }

        return runCatching { builder.establish() }
            .onFailure { log.e({ "establish TUN failed: ${it.message}" }, it) }
            .getOrNull()
    }

    // ---- stats --------------------------------------------------------------
    private fun startStatsPolling() {
        statsJob?.cancel()
        statsJob = launch {
            var lastRx = 0L; var lastTx = 0L
            while (running) {
                val stats = runCatching { HevTunnelNative.TProxyGetStats() }.getOrNull()
                if (stats != null && stats.size >= 2) {
                    val rx = stats[0]; val tx = stats[1]
                    GwManager.publishTraffic(rx, tx)
                    lastRx = rx; lastTx = tx
                }
                delay(1000)
            }
        }
    }

    // ---- teardown -----------------------------------------------------------
    private fun stopGw() {
        if (!running && tun == null && ssh == null) return
        running = false
        GwManager.publish(GwState.DISCONNECTING, GwError.NONE)
        runCatching { reconnectJob?.cancel() }
        runCatching { statsJob?.cancel() }
        runCatching { HevTunnelNative.TProxyStopService() }
        runCatching { socks?.stop() }
        runCatching { ssh?.disconnect() }
        runCatching { tun?.close() }
        tun = null; socks = null; ssh = null; nativeThread = null
        GwManager.publish(GwState.DISABLED, GwError.NONE)
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    // ---- error mapping ------------------------------------------------------
    private fun mapError(e: Throwable): GwError {
        val msg = e.message.orEmpty().lowercase()
        return when {
            "auth" in msg || "password" in msg || "permission denied" in msg -> GwError.AUTH_FAILED
            "host key" in msg -> GwError.HOST_KEY_FAILED
            "refused" in msg || "ruleset" in msg || "403" in msg -> GwError.PROXY_REFUSED
            "timeout" in msg || "timed out" in msg -> GwError.TIMEOUT
            "unreachable" in msg || "no route" in msg -> GwError.UNREACHABLE
            "banner" in msg || "ssh-" in msg -> GwError.PAYLOAD_ERROR
            else -> GwError.GENERIC
        }
    }

    // ---- foreground notification -------------------------------------------
    private fun startForeground() {
        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && nm.getNotificationChannel(CH_ID) == null) {
            nm.createNotificationChannel(
                NotificationChannel(CH_ID, "GW VPN", NotificationManager.IMPORTANCE_LOW)
            )
        }
        // NOTE: replace android.R.drawable.stat_sys_vp with the app's real VPN icon.
        val n: Notification = NotificationCompat.Builder(this, CH_ID)
            .setSmallIcon(android.R.drawable.stat_sys_vp)
            .setContentTitle("GW VPN")
            .setContentText("Connected via GW")
            .setOngoing(true)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .build()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            startForeground(NOTIF_ID, n, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
        } else {
            startForeground(NOTIF_ID, n)
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
