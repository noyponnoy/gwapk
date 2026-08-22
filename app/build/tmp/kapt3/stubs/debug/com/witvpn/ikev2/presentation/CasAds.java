package com.witvpn.ikev2.presentation;

/**
 * CAS.AI (CleverAdsSolutions) mediation wrapper.
 *
 * Replaces the previous Yandex Mobile Ads integration. Exposes the same surface the UI already
 * relies on: a single interstitial shown to non-premium users when the VPN connection is started
 * or stopped.
 *
 * The SDK's autoload mode handles caching and retry-on-failure internally, so no manual retry
 * loop is needed here.
 *
 * ## Why the watchdogs exist
 *
 * The show callbacks gate the VPN connect flow: whoever calls [showConnectAd] only proceeds once
 * `onFinishOrError` runs. If an ad were shown and the SDK never reported a terminal event, the
 * user would be left unable to connect with no visible error. Every path therefore completes
 * exactly once, and a timeout backs up the SDK callbacks.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00014B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u001c\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$J\u001c\u0010%\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$J&\u0010&\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0005H\u0002J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\u0016\u00102\u001a\u00020\u001c2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c0$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010+\u00a8\u00065"}, d2 = {"Lcom/witvpn/ikev2/presentation/CasAds;", "", "<init>", "()V", "SHOW_TIMEOUT_MS", "", "DISMISS_TIMEOUT_MS", "PLACEMENT_CONNECT", "", "PLACEMENT_DISCONNECT", "casId", "getCasId", "()Ljava/lang/String;", "mainHandler", "Landroid/os/Handler;", "lock", "pending", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/witvpn/ikev2/presentation/CasAds$PendingRequest;", "nextRequestId", "Ljava/util/concurrent/atomic/AtomicLong;", "timeoutRunnable", "Ljava/lang/Runnable;", "interstitialAd", "Lcom/cleveradssolutions/sdk/screen/CASInterstitial;", "initialized", "", "initialize", "", "context", "Landroid/content/Context;", "startLoadAds", "showConnectAd", "activity", "Landroid/app/Activity;", "onFinishOrError", "Lkotlin/Function0;", "showDisconnectAd", "showInterstitial", "placement", "ensureInterstitial", "adCallback", "Lcom/cleveradssolutions/sdk/screen/ScreenAdContentCallback;", "Lcom/cleveradssolutions/sdk/screen/ScreenAdContentCallback;", "completeCurrent", "complete", "id", "scheduleTimeout", "delayMs", "cancelTimeout", "runOnMain", "action", "PendingRequest", "GreyWebVPN-3.0.8 [278]_debug"})
public final class CasAds {
    
    /**
     * `show()` was called but the ad never reached the screen.
     */
    private static final long SHOW_TIMEOUT_MS = 7000L;
    
    /**
     * The ad is on screen but no dismissal was ever reported. Generous: video ads are long.
     */
    private static final long DISMISS_TIMEOUT_MS = 300000L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLACEMENT_CONNECT = "vpn_connect";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLACEMENT_DISCONNECT = "vpn_disconnect";
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Handler mainHandler = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object lock = null;
    
    /**
     * The in-flight show request. Consumed exactly once, by whichever path finishes first.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.atomic.AtomicReference<com.witvpn.ikev2.presentation.CasAds.PendingRequest> pending = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.atomic.AtomicLong nextRequestId = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.lang.Runnable timeoutRunnable;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.cleveradssolutions.sdk.screen.CASInterstitial interstitialAd;
    @kotlin.jvm.Volatile()
    private static volatile boolean initialized = false;
    @org.jetbrains.annotations.NotNull()
    private static final com.cleveradssolutions.sdk.screen.ScreenAdContentCallback adCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.CasAds INSTANCE = null;
    
    private CasAds() {
        super();
    }
    
    private final java.lang.String getCasId() {
        return null;
    }
    
    /**
     * Initializes the CAS SDK. Call once, from the main process only.
     *
     * Test ad mode is enabled for debug builds so development traffic is never billed as real
     * impressions.
     */
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Creates (once) the interstitial instance and starts filling the ad cache.
     * Safe to call repeatedly and from any thread.
     */
    public final void startLoadAds() {
    }
    
    /**
     * Shows the interstitial before establishing a VPN connection.
     *
     * [onFinishOrError] always runs exactly once — when the ad is dismissed, immediately when no
     * ad is available, or via timeout — so the connection flow is never blocked.
     */
    public final void showConnectAd(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinishOrError) {
    }
    
    /**
     * Shows the interstitial before tearing down a VPN connection.
     */
    public final void showDisconnectAd(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinishOrError) {
    }
    
    private final void showInterstitial(android.app.Activity activity, java.lang.String placement, kotlin.jvm.functions.Function0<kotlin.Unit> onFinishOrError) {
    }
    
    private final com.cleveradssolutions.sdk.screen.CASInterstitial ensureInterstitial() {
        return null;
    }
    
    /**
     * Completes the in-flight request, whichever it is.
     */
    private final void completeCurrent() {
    }
    
    /**
     * Completes [id] only if it is still the in-flight request, so stale timeouts are no-ops.
     */
    private final void complete(long id) {
    }
    
    private final void scheduleTimeout(long id, long delayMs) {
    }
    
    private final void cancelTimeout() {
    }
    
    private final void runOnMain(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/presentation/CasAds$PendingRequest;", "", "id", "", "callback", "Lkotlin/Function0;", "", "<init>", "(JLkotlin/jvm/functions/Function0;)V", "getId", "()J", "getCallback", "()Lkotlin/jvm/functions/Function0;", "GreyWebVPN-3.0.8 [278]_debug"})
    static final class PendingRequest {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> callback = null;
        
        public PendingRequest(long id, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getCallback() {
            return null;
        }
    }
}