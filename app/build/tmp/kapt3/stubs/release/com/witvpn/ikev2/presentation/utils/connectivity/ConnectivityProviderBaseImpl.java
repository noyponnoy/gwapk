package com.witvpn.ikev2.presentation.utils.connectivity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0004J\f\u0010\t\u001a\u00020\n*\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0005H$\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProviderBaseImpl;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider;", "<init>", "()V", "subscribe", "", "dispatchChange", "state", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "hasInternet", "", "subscribeListener", "GreyWebVPN-3.0.8 [278]_release"})
public abstract class ConnectivityProviderBaseImpl implements com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider {
    
    public ConnectivityProviderBaseImpl() {
        super();
    }
    
    @java.lang.Override()
    public void subscribe() {
    }
    
    protected final void dispatchChange(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState state) {
    }
    
    private final boolean hasInternet(com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState $this$hasInternet) {
        return false;
    }
    
    protected abstract void subscribeListener();
}