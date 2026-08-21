package com.witvpn.gw.tunnel

/**
 * GW connection state, mirrored on the app's existing [org.strongswan.android.logic.VpnStateService.State]
 * semantics so the UI state observers work unchanged:
 *
 *   DISABLED  -> tunnel down / not started
 *   CONNECTING-> establishing (SSH kex / auth / injector handshake in progress)
 *   CONNECTED -> tunnel up, traffic flowing
 *   DISCONNECTING -> tearing down
 *
 * Errors are surfaced via [GwError] alongside the state.
 */
enum class GwState { DISABLED, CONNECTING, CONNECTED, DISCONNECTING }

enum class GwError {
    NONE,
    AUTH_FAILED,        // SSH password rejected
    HOST_KEY_FAILED,    // pinned host-key mismatch
    PROXY_REFUSED,      // HTTP proxy / CDN refused the CONNECT or payload
    UNREACHABLE,        // can't reach proxy/ssh host
    PAYLOAD_ERROR,      // injector couldn't get an SSH banner
    TIMEOUT,            // connect/kex timed out
    GENERIC
}
