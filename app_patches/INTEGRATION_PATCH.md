# GW protocol — Android app (gwapk) integration patch

This document describes the exact, surgical edits to wire the new `gw-tunnel` module
into the existing app **without touching IKEv2/strongSwan, VLESS, AWG, ads, billing,
or any other existing logic.** Only the connect-flow branching and the protocol label
change.

All new code lives in the `gw-tunnel` module; the app edits are small branch adds.

---

## 1. settings.gradle — include the new module

Add `include ':gw-tunnel'` next to the other modules:

```gradle
include ':app'
include ':vyom-tun-sdk'
include ':amneziawg-tunnel'
include ':gw-tunnel'          // <-- NEW
rootProject.name = "Strong VPN"
```

## 2. app/build.gradle — depend on the module + allow the manifest merge

In the `dependencies { ... }` block, next to the other module deps:

```gradle
implementation project(':gw-tun-sdk')      // existing VLESS
implementation project(':amneziawg-tunnel') // existing AWG
implementation project(':gw-tunnel')        // <-- NEW GW
```

The module's AndroidManifest already declares `GwVpnService` with the
`android.net.VpnService` intent-filter and `foregroundServiceType="specialUse"`;
the manifest merger carries it into the app. No app-manifest edit needed.

## 3. proguard-rules.pro — keep GW + sshj + BouncyCastle

Append the `gw-tunnel/consumer-rules.pro` contents to `app/proguard-rules.pro` as well
(consumer rules apply automatically, but belt-and-suspenders while minifyEnabled is off).
Also **turn on minifyEnabled for release** (see §7 hardening):

```proguard
# (contents of gw-tunnel/consumer-rules.pro — sshj, BouncyCastle, GW internals, native methods)
```

## 4. ConnectFragment.kt — add the `gw` protocol branch

### 4a. Add a mode flag (next to `isVlessMode` / `isAwgMode`, ~line 74-75):

```kotlin
private var isVlessMode = false
private var isAwgMode = false
private var isGwMode = false   // <-- NEW
```

### 4b. In `setProtocol(protocol: String)` (~line 880), add:

```kotlin
isVlessMode = protocol == "VLESS"
isAwgMode = protocol == "AWG"
isGwMode = protocol == "GW"     // <-- NEW
```
(and add a `binding.btnGw` highlight branch mirroring the AWG/VLESS ones if you add a
GW protocol chip to the layout — see §6.)

### 4c. In `binding.btnConnect.setOnClickListener { ... }` (~line 384), add a GW branch
**before** the `else if (it.isEnabled)` IKEv2 branch, mirroring the AWG branch:

```kotlin
} else if (isGwMode) {
    if (GwManager.isConnected) {
        GwVpn.stop(requireContext())
        updateGwState(false)
        val userId = shareViewModel.userLiveData.value?.id ?: ""
        if (userId.isNotEmpty()) {
            ConnectionTracker.reportDisconnect(requireContext(), userId)
        }
    } else {
        val gwServer = resolveGwServerForConnection()
        if (gwServer != null) {
            if (shareViewModel.isPremium) {
                startGwVpnWithPermissionCheck(gwServer)
            } else {
                CasAds.showConnectAd(requireActivity()) {
                    startGwVpnWithPermissionCheck(gwServer)
                }
            }
        } else {
            Toast.makeText(context, "GW Server not found for this location", Toast.LENGTH_SHORT).show()
        }
    }
} else if (it.isEnabled) {
```

### 4d. Add the GW helper methods (anywhere in ConnectFragment, e.g. after the AWG ones):

```kotlin
private fun resolveGwServerForConnection(): GwServerConfig? {
    // The app already fetched the GW server list (see §5 ApiService addition) and
    // decrypted the selected row's envelope with the user's secp256k1 key. Return
    // the decrypted GwServerConfig for the currently-selected country/priority.
    return shareViewModel.selectedGwConfig.value
}

private fun startGwVpnWithPermissionCheck(cfg: GwServerConfig) {
    val prepare = GwVpn.prepare(requireActivity())
    if (prepare != null) {
        // stash the config so we can start after the permission activity returns
        pendingGwConfig = cfg
        startActivityForResult(prepare, REQUEST_GW_VPN_PERMISSION)
    } else {
        GwVpn.start(requireContext(), cfg)
    }
}

// in onActivityResult:
if (requestCode == REQUEST_GW_VPN_PERMISSION && resultCode == Activity.RESULT_OK) {
    pendingGwConfig?.let { GwVpn.start(requireContext(), it) }
    pendingGwConfig = null
}

// observe GW state/traffic (in onViewCreated, next to the AWG/VLESS observers):
lifecycleScope.launch {
    GwManager.state.collect { s ->
        updateGwState(s == GwState.CONNECTED)
        binding.tvState.text = when (s) {
            GwState.CONNECTED -> getString(R.string.connected)
            GwState.CONNECTING -> getString(R.string.connecting)
            GwState.DISCONNECTING -> getString(R.string.disconnecting)
            else -> getString(R.string.connect)
        }
        changeButtonColor(s == GwState.CONNECTED)
    }
}
lifecycleScope.launch {
    GwManager.traffic.collect { (rx, tx) ->
        binding.tvDownload.text = Utils.parseTotal(rx)
        binding.tvUpload.text = Utils.parseTotal(tx)
    }
}
```

Constants: `private var pendingGwConfig: GwServerConfig? = null` and
`private val REQUEST_GW_VPN_PERMISSION = 7011`.

Imports:
```kotlin
import com.witvpn.gw.tunnel.GwVpn
import com.witvpn.gw.tunnel.GwManager
import com.witvpn.gw.tunnel.GwState
import com.witvpn.gw.model.GwServerConfig
```

## 5. Fetch the GW server list (API integration)

Add to `ApiService.kt` (next to `getServersAwg`):

```kotlin
@POST("user/server_gw")
suspend fun getServersGw(@FieldMap param: Map<String, String>): Response<GwServersResponse>
```

Add a `GwServersResponse` data class in `data/remote/model/` mirroring `ServersAwgResponse`,
with a list of `{ meta: ..., enc: { eph, ct, iv } }` rows.

In `ServerRepositoryImpl`/`ShareViewModel`, fetch GW servers after login, decrypt each
row with the user's secp256k1 private key via `GwCrypto.decryptConfig(privHex, env)`,
and expose `selectedGwConfig: StateFlow<GwServerConfig?>` for ConnectFragment to read.
(The user's secp256k1 key is already derived in the app for identity — reuse it.)

## 6. UI rebrand: IKEv2 -> GW (user-visible strings only)

Edit `app/src/main/res/values/strings.xml` and `values-ru/strings.xml`:
- `desc_ikev2`: change the `<b>IKEv2</b>` label and any "IKEv2" mention to `<b>GW</b>`
  (keep the descriptive body, just rename the protocol word).
- `fragment_connect2.xml` line ~221: change `android:text="IKEv2"` to `android:text="GW"`.
- Keep the internal `protocol == "ikev2"` string comparisons that drive strongSwan —
  those are NOT user-visible; only the displayed labels change.

Optional: add a `ic_gw.png` drawable and a `btnGw` chip to the protocol selector so the
user can pick GW explicitly. If you keep GW as the *default* protocol (replacing IKEv2
as the main transport), set the default selected protocol to "GW" in SharePrefs.

## 7. Hardening (R8/ProGuard + release build)

In `app/build.gradle`, for the `release` build type:
```gradle
buildTypes {
    release {
        minifyEnabled true
        shrinkResources true
        proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
    }
}
```
This turns on R8 obfuscation/minification for the whole app (sshj + BouncyCastle + GW
internals are kept by the consumer rules). Do NOT strip BouncyCastle or sshj — the
consumer rules already keep them; without them SSH kex fails at runtime.

## 8. What stays untouched (the point)

- strongSwan / CharonVpnService / VpnStateService: unchanged. IKEv2 still works if a
  server's `protocol == "ikev2"`.
- VLESS (vyom-tun-sdk), AWG (amneziawg-tunnel): unchanged.
- Ads (CAS.AI), billing, Firebase, auth, server-list UI: unchanged.
- Only the network *core* for `protocol == "gw"` is new.
