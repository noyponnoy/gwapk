package com.witvpn.ikev2.presentation.utils.connectivity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderLegacyImpl;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderBaseImpl;", "context", "Landroid/content/Context;", "cm", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/content/Context;Landroid/net/ConnectivityManager;)V", "receiver", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderLegacyImpl$ConnectivityReceiver;", "subscribeListener", "", "getNetworkState", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "ConnectivityReceiver", "GreyWebVPN-3.0.8 [278]_release"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class ConnectivityProviderLegacyImpl extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProviderBaseImpl {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager cm = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProviderLegacyImpl.ConnectivityReceiver receiver = null;
    
    public ConnectivityProviderLegacyImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager cm) {
        super();
    }
    
    @java.lang.Override()
    protected void subscribeListener() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState getNetworkState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderLegacyImpl$ConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderLegacyImpl;)V", "onReceive", "", "c", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "GreyWebVPN-3.0.8 [278]_release"})
    final class ConnectivityReceiver extends android.content.BroadcastReceiver {
        
        public ConnectivityReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
}