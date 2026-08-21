# gw-tunnel — GW protocol Android transport module

A self-contained Android library module implementing the **GW** tunnel transport for the
GWVPN app. Replaces the IKEv2 *transport core* with an HTTP-proxy + custom-payload +
SSH-over-CDN scheme, **without root**, using the Android `VpnService`.

## Architecture

```
                         ┌─────────────────────────────────────────────────────────────┐
                         │ GwVpnService (VpnService, foreground, specialUse)            │
                         │   establishes TUN 0.0.0.0/0 + ::/0, DNS 1.1.1.1/8.8.8.8      │
  App UI ──start(cfg)──▶ │   hands TUN fd to native engine                              │
                         │                                                               │
                         │  TUN fd ──▶ libhev-socks5-tunnel.so (native userspace TCP/IP) │
                         │                       │ SOCKS5 CONNECT 127.0.0.1:<ephemeral>  │
                         │                       ▼                                        │
                         │              GwSocks5Server (pure-Java, local)                │
                         │                       │ per CONNECT:                          │
                         │                       ▼                                        │
                         │              GwSshTunnel (sshj, pure-Java SSH)                 │
                         │   openDirectChannel(host,port) -> direct-tcpip                │
                         │                       │ connects via                          │
                         │                       ▼                                        │
                         │    InjectorSocketFactory (the "GW injector")                  │
                         │   1. TCP to proxyHost:proxyPort (or direct)                   │
                         │   2. optional TLS + SNI (Cloudflare front)                    │
                         │   3. send payload (GET / ... Upgrade: websocket ...)          │
                         │   4. read response; if HTTP, ACK 200 OK; wait for SSH- banner │
                         │   5. return tunneled socket to sshj                           │
                         └────────────────────────┼──────────────────────────────────────┘
                                                  ▼
                              VPS node (gw user, forward-only SSH)
                                  └─▶ internet (user traffic egresses here)
```

This mirrors the existing **VLESS** (vyom-tun-sdk) and **AWG** (amneziawg-tunnel)
module pattern: separate Gradle module, own `VpnService`, native lib in `jniLibs`,
manager singleton (`GwManager`). The app branches on `protocol == "gw"` the same way
it branches on `"vless"` / `"awg"`.

## Why this scheme (and how it maps to the reference repo)

The reference `abdoxfox/HTTP-CUSTOM-HEADERS-VPN` is a Termux/root prototype:
Python injector (`tunnel.py`) listens locally → ssh binary connects through it via
`ProxyCommand corkscrew` → iptables+redsocks route all TCP to the SSH SOCKS5 →
dns2socks for DNS.

For a **production no-root Android** client we replace each root-dependent piece:
| Reference (root) | gw-tunnel (no root) |
|---|---|
| iptables NAT + redsocks | `VpnService` TUN + native `hev-socks5-tunnel` (already in APK) |
| `ssh` binary + `ProxyCommand` | sshj (pure-Java) + `InjectorSocketFactory` as the `SocketFactory` |
| Python injector (`inject.py`) | `InjectorSocketFactory` (same payload expansion + banner-wait logic) |
| dns2socks | DNS over the tunnel (TUN DNS = 1.1.1.1/8.8.8.8 → engine → SOCKS5 → SSH) |
| `WS-Proxy.js` 101 bridge | server-side `vps/install.sh` `ws-bridge.js` |

## Files

| Path | Role |
|---|---|
| `tunnel/GwVpnService.kt` | Android foreground VpnService; owns TUN, SSH, SOCKS5, native engine; reconnect/timeout/error handling; DNS-leak prevention |
| `tunnel/GwManager.kt` | Process-wide state/traffic StateFlow the UI observes |
| `tunnel/GwVpn.kt` | Facade: `prepare()` / `start(cfg)` / `stop()` |
| `tunnel/GwState.kt` | `GwState` + `GwError` enums |
| `tunnel/GwConfigCodec.kt` | Encode/decode `GwServerConfig` ↔ JSON for the Intent extra |
| `tunnel/GwConfigFetcher.kt` | Reference API fetch + ECIES decrypt helper |
| `tunnel/GwTunnelConfig.kt` | Builds the hev-socks5-tunnel YAML |
| `tunnel/HevTunnelNative.kt` | JNI bridge to `libhev-socks5-tunnel.so` |
| `ssh/GwSshTunnel.kt` | sshj SSH connection + `direct-tcpip` channels + host-key pinning |
| `socks/GwSocks5Server.kt` | Pure-Java SOCKS5 server → bridges to SSH channels |
| `inject/InjectorSocketFactory.kt` | The "GW injector": proxy + payload + SNI + banner-wait |
| `inject/GwPushbackSocket.kt` | Socket wrapper to push back peeked SSH banner bytes |
| `crypto/GwCrypto.kt` | Client ECIES decrypt (secp256k1 ECDH + AES-256-GCM) via BouncyCastle |
| `model/GwServerConfig.kt` | Decrypted config + API response/envelope models |
| `util/GwLog.kt` | Tagged logger (never logs secrets) |

## Dependencies (in `build.gradle`)
- `com.hierynomus:sshj:0.39.0` — pure-Java SSH
- `org.bouncycastle:bcprov-jdk18on:1.78.1` — secp256k1 + AES-GCM
- `kotlinx-coroutines-android` — connection lifecycle
- `okhttp` — only for the reference fetcher
- native: `libhev-socks5-tunnel.so` (reuse the one already shipped via vyom-tun-sdk, or
  drop a copy in this module's `jniLibs/<abi>/` for the three filtered ABIs)

## Integration into the app
See `app_patches/INTEGRATION_PATCH.md` (settings.gradle, app/build.gradle, ConnectFragment
branch, ApiService method, strings rebrand) and `app_patches/SECURITY.md` (threat model).
