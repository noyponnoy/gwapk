# Consumer ProGuard / R8 rules for the gw-tunnel module.
# These are applied automatically to any app that consumes this library (via
# consumerProguardFiles) when minifyEnabled is on in the app.

# --- sshj (pure-Java SSH) ---
# sshj uses reflection internally for transport/connection classes and reads config
# via ServiceLoader-style patterns. Keep the public API and the transport impl.
-keep class net.schmizz.sshj.** { *; }
-keep class net.schmizz.sshj.common.** { *; }
-keep class net.schmizz.sshj.transport.** { *; }
-keep class net.schmizz.sshj.connection.** { *; }
-keep class net.schmizz.sshj.userauth.** { *; }
-keep class com.hierynomus.sshj.** { *; }
# sshj reads some properties by name; keep the keys it references.
-keepclassmembers class net.schmizz.sshj.DefaultConfig {
    <fields>;
}

# --- BouncyCastle ---
# BC registers providers via reflection and uses class-name lookups; keep everything
# it ships. Without this, R8 strips cipher/curve implementations and SSH key exchange
# fails at runtime with NoSuchAlgorithmException.
-keep class org.bouncycastle.** { *; }
-keep class org.bouncycastle.jcajce.provider.** { *; }
-dontwarn org.bouncycastle.**
-dontwarn javax.naming.**

# --- GW tunnel internals ---
# The injector socket factory and SSH connection are constructed by name in a couple
# of places; keep the public surface and the model/data classes used across processes.
-keep class com.witvpn.gw.model.** { *; }
-keep class com.witvpn.gw.crypto.** { *; }
-keep class com.witvpn.gw.inject.InjectorSocketFactory { *; }
-keep class com.witvpn.gw.ssh.GwSshTunnel { *; }
-keep class com.witvpn.gw.tunnel.GwVpnService { *; }

# Native method of hev-socks5-tunnel (loaded via System.loadLibrary).
-keepclasseswithmembernames class * {
    native <methods>;
}
