package com.witvpn.ikev2.presentation.utils.connectivity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderImpl;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderBaseImpl;", "cm", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", "networkCallback", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderImpl$ConnectivityCallback;", "subscribeListener", "", "getNetworkState", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "ConnectivityCallback", "GreyWebVPN-3.0.8 [278]_debug"})
@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
public final class ConnectivityProviderImpl extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProviderBaseImpl {
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager cm = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProviderImpl.ConnectivityCallback networkCallback = null;
    
    public ConnectivityProviderImpl(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderImpl$ConnectivityCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "(Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderImpl;)V", "onCapabilitiesChanged", "", "network", "Landroid/net/Network;", "capabilities", "Landroid/net/NetworkCapabilities;", "onLost", "GreyWebVPN-3.0.8 [278]_debug"})
    final class ConnectivityCallback extends android.net.ConnectivityManager.NetworkCallback {
        
        public ConnectivityCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onCapabilitiesChanged(@org.jetbrains.annotations.NotNull()
        android.net.Network network, @org.jetbrains.annotations.NotNull()
        android.net.NetworkCapabilities capabilities) {
        }
        
        @java.lang.Override()
        public void onLost(@org.jetbrains.annotations.NotNull()
        android.net.Network network) {
        }
    }
}