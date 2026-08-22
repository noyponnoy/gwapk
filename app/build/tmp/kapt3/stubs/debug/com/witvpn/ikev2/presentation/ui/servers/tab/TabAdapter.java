package com.witvpn.ikev2.presentation.ui.servers.tab;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ<\u0010\u0012\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000fJ\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u001c\u0010\u001b\u001a\u00020\u00062\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/tab/TabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/witvpn/ikev2/presentation/ui/servers/tab/TabAdapter$ServerViewHolder;", "click", "Lkotlin/Function1;", "Lcom/witvpn/ikev2/domain/model/Server;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "isPremium", "", "servers", "", "serversLoad", "", "", "", "protocolFilter", "updateData", "", "premium", "protocol", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "ServerViewHolder", "GreyWebVPN-3.0.8 [278]_debug"})
public final class TabAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.witvpn.ikev2.presentation.ui.servers.tab.TabAdapter.ServerViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.witvpn.ikev2.domain.model.Server, kotlin.Unit> click = null;
    private boolean isPremium = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.witvpn.ikev2.domain.model.Server> servers = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.Integer> serversLoad;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String protocolFilter = "IKEv2";
    
    public TabAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.domain.model.Server, kotlin.Unit> click) {
        super();
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.witvpn.ikev2.domain.model.Server> servers, boolean premium, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> serversLoad, @org.jetbrains.annotations.NotNull()
    java.lang.String protocol) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.presentation.ui.servers.tab.TabAdapter.ServerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.servers.tab.TabAdapter.ServerViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/tab/TabAdapter$ServerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/witvpn/ikev2/presentation/ui/servers/tab/TabAdapter;Landroid/view/View;)V", "server", "Lcom/witvpn/ikev2/domain/model/Server;", "bindData", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public final class ServerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.witvpn.ikev2.domain.model.Server server;
        
        public ServerViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.domain.model.Server server) {
        }
    }
}