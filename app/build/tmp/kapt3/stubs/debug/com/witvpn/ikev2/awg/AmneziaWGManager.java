package com.witvpn.ikev2.awg;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u0005H\u0002J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/witvpn/ikev2/awg/AmneziaWGManager;", "", "<init>", "()V", "TAG", "", "selectedServer", "Lcom/witvpn/ikev2/domain/model/ServerAwg;", "getSelectedServer", "()Lcom/witvpn/ikev2/domain/model/ServerAwg;", "setSelectedServer", "(Lcom/witvpn/ikev2/domain/model/ServerAwg;)V", "backend", "Lorg/amnezia/awg/backend/GoBackend;", "isConnected", "", "trafficJob", "Lkotlinx/coroutines/Job;", "awgTunnel", "Lorg/amnezia/awg/backend/Tunnel;", "Lorg/amnezia/awg/backend/Tunnel;", "startTrafficPolling", "", "ensureBackend", "context", "Landroid/content/Context;", "stopTrafficPolling", "listeners", "", "Lcom/witvpn/ikev2/awg/AmneziaWGManager$StateListener;", "registerListener", "listener", "unregisterListener", "notifyListeners", "state", "Lorg/amnezia/awg/backend/Tunnel$State;", "initialize", "startVpn", "applySplitTunneling", "configText", "stopVpn", "getTrafficStats", "Lkotlin/Pair;", "", "StateListener", "GreyWebVPN-3.0.8 [278]_debug"})
public final class AmneziaWGManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "AmneziaWGManager";
    @org.jetbrains.annotations.Nullable()
    private static com.witvpn.ikev2.domain.model.ServerAwg selectedServer;
    @org.jetbrains.annotations.Nullable()
    private static org.amnezia.awg.backend.GoBackend backend;
    private static boolean isConnected = false;
    @org.jetbrains.annotations.Nullable()
    private static kotlinx.coroutines.Job trafficJob;
    @org.jetbrains.annotations.NotNull()
    private static final org.amnezia.awg.backend.Tunnel awgTunnel = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.witvpn.ikev2.awg.AmneziaWGManager.StateListener> listeners = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.awg.AmneziaWGManager INSTANCE = null;
    
    private AmneziaWGManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.domain.model.ServerAwg getSelectedServer() {
        return null;
    }
    
    public final void setSelectedServer(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.ServerAwg p0) {
    }
    
    private final void startTrafficPolling() {
    }
    
    /**
     * Lazily creates the [GoBackend] on first use. Constructing [GoBackend] loads
     * libwg-go.so (Go 1.24 runtime). Doing that on the main thread at app startup
     * can trigger a non-catchable native crash on some devices (e.g. Honor 8X /
     * Honor 30i running EMUI 9/10 on Kirin 710). Deferring the load to the first
     * VPN connect makes the app start reliably everywhere.
     */
    private final org.amnezia.awg.backend.GoBackend ensureBackend(android.content.Context context) {
        return null;
    }
    
    private final void stopTrafficPolling() {
    }
    
    public final void registerListener(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.awg.AmneziaWGManager.StateListener listener) {
    }
    
    public final void unregisterListener(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.awg.AmneziaWGManager.StateListener listener) {
    }
    
    private final void notifyListeners(org.amnezia.awg.backend.Tunnel.State state) {
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startVpn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Injects the user's Split Tunneling choice into the AWG config as an
     * "ExcludedApplications" (mode "All except selected") or
     * "IncludedApplications" (mode "Only selected") attribute of the
     * [Interface] section.
     *
     * In exclude mode the AWG config parser merges repeated attribute lines,
     * so a server-provided exclusion list (if any) is preserved. In include
     * mode any pre-existing app-list attributes are stripped first:
     * VpnService.Builder forbids mixing allowed and disallowed applications
     * and GoBackend would fail the whole tunnel otherwise.
     *
     * Only currently installed packages are passed through: GoBackend applies
     * the lists with VpnService.Builder.addDisallowedApplication /
     * addAllowedApplication, which throw for unknown package names and would
     * fail the whole tunnel.
     */
    private final java.lang.String applySplitTunneling(android.content.Context context, java.lang.String configText) {
        return null;
    }
    
    public final void stopVpn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getTrafficStats() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/awg/AmneziaWGManager$StateListener;", "", "onStateChange", "", "state", "Lorg/amnezia/awg/backend/Tunnel$State;", "onTrafficUpdate", "rx", "", "tx", "GreyWebVPN-3.0.8 [278]_debug"})
    public static abstract interface StateListener {
        
        public abstract void onStateChange(@org.jetbrains.annotations.NotNull()
        org.amnezia.awg.backend.Tunnel.State state);
        
        public abstract void onTrafficUpdate(long rx, long tx);
    }
}