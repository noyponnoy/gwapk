# GW protocol — Android client (gwapk, branch `feature/gw-protocol`)

This branch adds the **GW** transport to the GWVPN app, replacing IKEv2 as the
network core while keeping every existing feature (ads, UI, billing, auth, server list,
stats, VLESS, AWG, strongSwan fallback) intact.

## What's in this branch

### New module: `gw-tunnel/`
A self-contained Android library implementing the GW tunnel:
- `GwVpnService` — foreground `VpnService` (TUN 0.0.0.0/0 + ::/0, DNS through tunnel,
  foreground `specialUse`, reconnect/timeout/error handling, clean teardown, no DNS/IP
  leak).
- `GwSshTunnel` — sshj SSH connection with `direct-tcpip` channels + host-key pinning.
- `InjectorSocketFactory` — the GW injector: HTTP proxy + custom payload + TLS/SNI +
  SSH-banner wait (the HTTP-Injector scheme, in pure Java, no root).
- `GwSocks5Server` — local pure-Java SOCKS5 server bridging the native tun2socks engine
  to SSH `direct-tcpip` channels.
- `GwCrypto` — client ECIES decrypt (secp256k1 ECDH + AES-256-GCM) for the encrypted
  config delivery.
- `GwManager` — process-wide state/traffic StateFlow the UI observes.
- `GwVpn` — facade (`prepare`/`start`/`stop`).
- `HevTunnelNative` — JNI bridge to `libhev-socks5-tunnel.so` (reuses the .so already
  shipped via vyom-tun-sdk).
- `consumer-rules.pro` — keeps sshj + BouncyCastle + GW internals under R8.

### App edits (see `app_patches/`)
- **`INTEGRATION_PATCH.md`** — `settings.gradle` (include `:gw-tunnel`), `app/build.gradle`
  (depend on module + enable R8), `ConnectFragment.kt` (the `gw` protocol branch mirroring
  AWG), `ApiService.kt` (`@POST("user/server_gw")`), `ShareViewModel`/repository (fetch +
  decrypt).
- **`UI_REBRAND_IKEv2_TO_GW.md`** — user-visible "IKEv2" → "GW" in `strings.xml` (en/ru),
  `fragment_connect2.xml`, protocol hint label.
- **`SECURITY.md`** — full threat model + RE-resistance + blast-radius-minimization
  rationale (the honest version: no shared key in APK, per-user ECIES, host-key pinning,
  R8 obfuscation, small shared SSH-account pool + rotation).

## How it works (the 101 Switching Protocols flow)

The user's described scheme — `Android → HTTP proxy → payload → WebSocket/HTTP Upgrade
→ SSH → VPS → internet` — **is** what the reference repo implements, and we preserve it:

1. The client opens a TCP socket to `proxy_host:proxy_port` (a Cloudflare-fronted host).
2. If `proxy_scheme=https` or an SNI is set, it wraps the socket in TLS with that SNI
   (Cloudflare terminates TLS on its edge).
3. It sends the **payload**: an HTTP/1.1 request like
   `GET / HTTP/1.1\r\nHost: <sni>\r\nConnection: Upgrade\r\nUpgrade: websocket\r\n\r\n`.
   Cloudflare sees a WebSocket upgrade and upgrades the edge connection.
4. Cloudflare forwards the upgraded stream to the origin's WebSocket bridge
   (`vps/install.sh`'s `ws-bridge`), which replies
   `HTTP/1.1 101 Switching Protocols\r\nContent-Length: <huge>\r\n\r\n` and then bridges
   raw bytes to the local SSH port.
5. The client reads the response. If it's an HTTP status line, it ACKs
   `HTTP/1.1 200 OK\r\n\r\n` and keeps reading until the `SSH-` banner appears (the
   injector's banner-wait, matching `abdoxfox`'s `inject.py`).
6. The now-tunneled socket is handed to **sshj**, which performs the SSH handshake +
   password auth over it. The `gw` user on the VPS is `ForceCommand /bin/false` +
   forward-only — no shell, only `direct-tcpip` channels.
7. The native `hev-socks5-tunnel` reads IP packets from the TUN fd and emits SOCKS5
   CONNECT requests to the local `GwSocks5Server`, which opens a `direct-tcpip` channel
   for each → user traffic egresses from the VPS.

## Not built/tested in this commit
Per the task instructions ("не надо проверить билд и т.д просто пиши код полностью и
коммит сделай"), this branch is **code-complete but not build-verified**. To build:
1. Apply `app_patches/INTEGRATION_PATCH.md` edits to the app.
2. Ensure `libhev-socks5-tunnel.so` is present (vyom-tun-sdk already ships it).
3. Apply the string rebrand from `app_patches/UI_REBRAND_IKEv2_TO_GW.md`.
4. `./gradlew :app:assembleRelease` with `minifyEnabled true`.

## Server side
The matching server/API/bot/panel/VPS-installer is on the `gwishod` repo, branch
`feature/gw-protocol` (commit `ba15853`).
