# gw-tunnel native libraries (libhev-socks5-tunnel.so)

This module drives the TUN→SOCKS5 path via the **hev-socks5-tunnel** native engine
(JNI: `TProxyStartService(configPath, fd)` / `TProxyStopService()`).

The same `libhev-socks5-tunnel.so` is **already shipped** in the app via the
`vyom-tun-sdk` module (`vyom-tun-sdk/src/main/jniLibs/<abi>/libhev-socks5-tunnel.so`)
for arm64-v7a, armeabi-v7a, and x86_64 — exactly the ABIs the app's
`abiFilters` allow.

You have two options:

1. **Reuse (recommended, no duplicate binary):** do NOT add the .so here; the manifest
   merger + Gradle's native packaging will pick up the library already present in the
   APK from vyom-tun-sdk. `HevTunnelNative.kt`'s `System.loadLibrary("hev-socks5-tunnel")`
   resolves to whichever module packaged it.

2. **Self-contained module:** copy the three `.so` files into
   `gw-tunnel/src/main/jniLibs/<abi>/libhev-socks5-tunnel.so` (arm64-v8a, armeabi-v7a,
   x86_64) so this module builds standalone for tests. Do NOT add x86 (the app filters
   it out of the final APK anyway).

These directories are intentionally empty in the committed source — pull the binaries
from `vyom-tun-sdk/src/main/jniLibs/` or build hev-socks5-tunnel from source
(https://github.com/heiher/hev-socks5-tunnel) for the Android NDK.
