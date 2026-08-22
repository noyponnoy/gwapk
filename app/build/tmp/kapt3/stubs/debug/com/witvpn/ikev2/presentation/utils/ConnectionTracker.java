package com.witvpn.ikev2.presentation.utils;

/**
 * Репортинг подключений в API (connect / heartbeat / disconnect).
 *
 * ВАЖНО: используется ТОЛЬКО для VLESS и AWG.
 * Для IKEv2 клиент больше НИЧЕГО не шлёт — онлайн IKEv2 сервер API считает
 * сам, опрашивая каждый IKEv2-сервер напрямую (node_exporter, ipsec_clients).
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/ConnectionTracker;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "heartbeatJob", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "reportConnect", "", "context", "Landroid/content/Context;", "userId", "", "serverIp", "protocol", "reportDisconnect", "startHeartbeat", "stopHeartbeat", "getBaseUrl", "GreyWebVPN-3.0.8 [278]_debug"})
public final class ConnectionTracker {
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlinx.coroutines.Job heartbeatJob;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.utils.ConnectionTracker INSTANCE = null;
    
    private ConnectionTracker() {
        super();
    }
    
    public final void reportConnect(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String serverIp, @org.jetbrains.annotations.NotNull()
    java.lang.String protocol) {
    }
    
    public final void reportDisconnect(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    private final void startHeartbeat(java.lang.String userId, java.lang.String serverIp, java.lang.String protocol, android.content.Context context) {
    }
    
    private final void stopHeartbeat() {
    }
    
    private final java.lang.String getBaseUrl(android.content.Context context) {
        return null;
    }
}