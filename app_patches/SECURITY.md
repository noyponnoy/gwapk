# GW — client security & reverse-engineering resistance

The user asked for maximum RE resistance (payload, SSH user/pass, proxy host/port,
the connection scheme, keys/secrets, the config-decrypt algorithm, API endpoints).
**No mobile client can be made un-crackable** — any secret the client must decrypt and
use locally can, in principle, be extracted from a sufficiently compromised client. The
goal of this design is therefore **blast-radius minimization**: one compromised client
must not reveal a global secret or the whole fleet's credentials.

## What we actually do

### 1. No shared key in the APK
The GW config (SSH creds, proxy, payload, SNI) is delivered per-request, encrypted to
the **individual user's secp256k1 public key** (ECIES: ECDH + AES-256-GCM). The APK
contains **no** symmetric master key. See `crypto/GwCrypto.kt` (client) and
`api/src/utils/crypto_gw.py` (server). A passive network observer and an APK-extractor
both get only ciphertext + per-user ephemeral pubkeys.

### 2. The user's private key is not in plain resources
The app derives the secp256k1 key from the user's BIP-39 mnemonic (the same identity
key it already uses). On devices that support it, the key material is held inside
**Android Keystore** (hardware-backed where available). Decryption happens in memory;
the plaintext config is never written to disk.

### 3. R8 / ProGuard obfuscation + minification
`app/build.gradle` release: `minifyEnabled true`, `shrinkResources true`.
`gw-tunnel/consumer-rules.pro` (applied automatically) keeps sshj + BouncyCastle + the
GW public API while obfuscating everything else. This raises the cost of static
analysis — class/method names, string constants, and control flow are mangled.

### 4. Sensitive strings are not hardcoded literals where avoidable
- The **payload template** is not compiled into the app; it comes from the encrypted
  server config. The app only knows the token-expansion algorithm (`[host]`, `[crlf]`,
  …), which is generic.
- **SSH user/pass, proxy host/port, SNI** are all in the encrypted config, never in code.
- **API endpoints** are the only unavoidable client-side secret-ish value. They're
  already configurable via Firebase Remote Config in this app (see `base_url` resValue +
  Remote Config override), so they're not static literals — they can be rotated server-side.

### 5. Certificate / public-key pinning
- SSH host-key pinning: the server config can carry `ssh_hostkey` (ed25519 pub). When
  set, `GwSshTunnel` uses a `PinnedKeyVerifier` and refuses any mismatch. This is the
  real integrity guarantee for the tunnel (TLS to the CDN is only transport).
- TLS to the CDN uses the system trust store by default; if the operator pins a
  Cloudflare origin cert, extend `InjectorSocketFactory.wrapTls` with a pinned
  `X509TrustManager`. (Left as an operator choice — pinning CF's edge cert is fragile
  because CF rotates it.)

### 6. App integrity / tamper resistance
Add (operator responsibility, standard Android) to `MyApp`:
- `PackageManager.getPackageInfo(..., GET_SIGNING_CERTIFICATES)` check against the
  expected signing cert hash → refuse to run if repackaged.
- Play Integrity API (if distributed via Play) or a self-check token to the API.
- Root/emulator detection (fail-closed on obvious instrumented environments) — only as
  a speed bump, never as a single point of security.

### 7. Safe handling of temporary secrets
- The decrypted `GwServerConfig` lives only in `GwManager.lastConfig` (in-memory) and
  is passed to `GwVpnService` via an Intent extra (within the app's own process, not
  persisted). On disconnect, `GwManager.reset()` clears the traffic counters; the config
  reference is dropped when the service stops.
- No `Log` statement prints credentials. `GwLog` never logs `cfg.ssh_password` or the
  payload's expanded form.

### 8. Blast-radius minimization (the most important part)
- The operator uses a **small pool of shared SSH accounts per region**, not one global
  account. Rotating one region's creds (one `--gw-pass` on the installer + one API
  update) does not invalidate other regions.
- The API can rotate the per-server creds at any time; clients get the new creds on
  their next `/user/server_gw` fetch (encrypted to their own key).
- A compromised client reveals **only the configs it personally received** — not a
  master key, not other users' configs, not the full fleet.

## What we explicitly do NOT promise

- We do not promise a compromised client cannot extract *its own* SSH creds. It can —
  it must, to use them. The architecture ensures that leak is **bounded** (per-client,
  per-region, rotatable) rather than catastrophic.
- We do not promise obfuscation stops a determined reverse engineer. R8 raises the bar;
  it is not a cryptographic guarantee.
- We do not promise root-detection cannot be bypassed. It's a speed bump.

This is the honest, production-correct posture for an Android VPN client. Any claim
stronger than this (e.g. "unbreakable payload protection") is not achievable and should
not be made to users or in marketing.
