package com.witvpn.ikev2.presentation.ui.servers;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/ServersUIDelegate;", "", "handleServerClicked", "", "server", "Lcom/witvpn/ikev2/domain/model/Server;", "GreyWebVPN-3.0.8 [278]_release"})
public abstract interface ServersUIDelegate {
    
    public abstract void handleServerClicked(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.Server server);
}