package com.witvpn.ikev2.presentation.ui.connectlimit;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R@\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019\u00a8\u0006!"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/connectlimit/VpnServiceLimitListener;", "Lorg/strongswan/android/logic/VpnStateService$VpnStateListener;", "service", "Lorg/strongswan/android/logic/VpnStateService;", "<init>", "(Lorg/strongswan/android/logic/VpnStateService;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "isRunnablePaused", "", "ticker", "Ljava/util/TimerTask;", "value", "Lkotlin/Function1;", "", "", "elapsedListener", "getElapsedListener", "()Lkotlin/jvm/functions/Function1;", "setElapsedListener", "(Lkotlin/jvm/functions/Function1;)V", "isLimitElapsed", "()Z", "isEnabled", "setEnabled", "(Z)V", "onConnect", "onDisconnect", "onEverySecond", "onTimeElapsed", "onTimeElapsedReset", "stateChanged", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class VpnServiceLimitListener implements org.strongswan.android.logic.VpnStateService.VpnStateListener {
    @org.jetbrains.annotations.NotNull()
    private final org.strongswan.android.logic.VpnStateService service = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    private static final long MILLIS_ELAPSED_LIMIT = 0L;
    private boolean isRunnablePaused = true;
    @org.jetbrains.annotations.NotNull()
    private final java.util.TimerTask ticker = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> elapsedListener;
    private boolean isEnabled = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.ui.connectlimit.VpnServiceLimitListener.Companion Companion = null;
    
    public VpnServiceLimitListener(@org.jetbrains.annotations.NotNull()
    org.strongswan.android.logic.VpnStateService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getElapsedListener() {
        return null;
    }
    
    public final void setElapsedListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> value) {
    }
    
    public final boolean isLimitElapsed() {
        return false;
    }
    
    public final boolean isEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean value) {
    }
    
    private final void onConnect() {
    }
    
    private final void onDisconnect() {
    }
    
    private final void onEverySecond() {
    }
    
    private final void onTimeElapsed() {
    }
    
    private final void onTimeElapsedReset() {
    }
    
    @java.lang.Override()
    public void stateChanged() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/connectlimit/VpnServiceLimitListener$Companion;", "", "<init>", "()V", "MILLIS_ELAPSED_LIMIT", "", "getMILLIS_ELAPSED_LIMIT", "()J", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final long getMILLIS_ELAPSED_LIMIT() {
            return 0L;
        }
    }
}