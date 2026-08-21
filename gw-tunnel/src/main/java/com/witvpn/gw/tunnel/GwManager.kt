package com.witvpn.gw.tunnel

import com.witvpn.gw.model.GwServerConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * GwManager — process-wide singleton the host app talks to start/stop the GW tunnel
 * and observe its state/traffic. Mirrors the manager-object pattern used by the
 * existing VLESS ([com.witvpn.ikev2.vless.VlessManager]) and AWG
 * ([com.witvpn.ikev2.awg.AmneziaWGManager]) modules, so the app's ConnectFragment can
 * branch on protocol == "gw" the same way it branches on "vless" / "awg".
 *
 * The actual VPN connection lives in [GwVpnService]; this class is the thin facade.
 */
object GwManager {

    @Volatile var lastConfig: GwServerConfig? = null
        internal set

    private val _state = MutableStateFlow(GwState.DISABLED)
    val state: StateFlow<GwState> = _state.asStateFlow()

    private val _error = MutableStateFlow(GwError.NONE)
    val error: StateFlow<GwError> = _error.asStateFlow()

    private val _traffic = MutableStateFlow(0L to 0L) // (rx, tx) cumulative
    val traffic: StateFlow<Pair<Long, Long>> = _traffic.asStateFlow()

    val isConnected: Boolean get() = _state.value == GwState.CONNECTED

    internal fun publish(s: GwState, e: GwError) {
        _state.value = s
        if (e != GwError.NONE) _error.value = e
        if (s == GwState.DISABLED || s == GwState.CONNECTING) _error.value = GwError.NONE
    }

    internal fun publishError(e: GwError) {
        _error.value = e
        if (e != GwError.NONE) _state.value = GwState.DISCONNECTING
    }

    internal fun publishTraffic(rx: Long, tx: Long) {
        _traffic.value = rx to tx
    }

    /** Reset all observable state (called when the app finishes a disconnect). */
    fun reset() {
        _state.value = GwState.DISABLED
        _error.value = GwError.NONE
        _traffic.value = 0L to 0L
    }
}
