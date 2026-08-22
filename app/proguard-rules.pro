# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-keep class org.strongswan.android.** { *; }

# --- GW tunnel: sshj + BouncyCastle + native ---
-keep class net.schmizz.sshj.** { *; }
-keep class com.hierynomus.sshj.** { *; }
-keep class org.bouncycastle.** { *; }
-keep class org.bouncycastle.jcajce.provider.** { *; }
-dontwarn org.bouncycastle.**
-dontwarn javax.naming.**
-keep class com.witvpn.gw.model.** { *; }
-keep class com.witvpn.gw.crypto.** { *; }
-keep class com.witvpn.gw.inject.InjectorSocketFactory { *; }
-keep class com.witvpn.gw.ssh.GwSshTunnel { *; }
-keep class com.witvpn.gw.tunnel.GwVpnService { *; }
-keepclasseswithmembernames class * {
    native <methods>;
}

# --- sshj GSS/Kerberos (not used, but referenced) ---
-dontwarn javax.security.auth.login.**
-dontwarn org.ietf.jgss.**
-dontwarn net.schmizz.sshj.userauth.method.AuthGssApiWithMic

# --- Jackson (referenced transitively) ---
-dontwarn java.beans.ConstructorProperties
-dontwarn java.beans.Transient
-dontwarn com.fasterxml.jackson.**

# --- OkHttp internal ---
-dontwarn okhttp3.internal.Util

# --- Android/SDK stubs ---
-dontwarn sun.security.x509.**
-dontwarn com.google.ads.**

# --- i2p eddsa ---
-dontwarn net.i2p.crypto.eddsa.**
