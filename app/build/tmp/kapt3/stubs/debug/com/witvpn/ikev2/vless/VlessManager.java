package com.witvpn.ikev2.vless;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010!\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/witvpn/ikev2/vless/VlessManager;", "", "<init>", "()V", "TAG", "", "vlessServers", "", "Lcom/witvpn/ikev2/vless/VlessConfig;", "getVlessServers", "()Ljava/util/List;", "setVlessServers", "(Ljava/util/List;)V", "selectedServer", "getSelectedServer", "()Lcom/witvpn/ikev2/vless/VlessConfig;", "setSelectedServer", "(Lcom/witvpn/ikev2/vless/VlessConfig;)V", "client", "Lokhttp3/OkHttpClient;", "fetchSubscription", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "", "initialize", "startVpn", "startVpnWithPermission", "activity", "Landroid/app/Activity;", "stopVpn", "isConnected", "GreyWebVPN-3.0.8 [278]_debug"})
public final class VlessManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "VlessManager";
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.witvpn.ikev2.vless.VlessConfig> vlessServers;
    @org.jetbrains.annotations.Nullable()
    private static com.witvpn.ikev2.vless.VlessConfig selectedServer;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.vless.VlessManager INSTANCE = null;
    
    private VlessManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.witvpn.ikev2.vless.VlessConfig> getVlessServers() {
        return null;
    }
    
    public final void setVlessServers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.witvpn.ikev2.vless.VlessConfig> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.vless.VlessConfig getSelectedServer() {
        return null;
    }
    
    public final void setSelectedServer(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.vless.VlessConfig p0) {
    }
    
    public final void fetchSubscription(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startVpn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startVpnWithPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void stopVpn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isConnected() {
        return false;
    }
}