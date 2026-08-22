package com.witvpn.ikev2.presentation.ui.vless;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u00020\u00062\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter$VlessViewHolder;", "click", "Lkotlin/Function1;", "Lcom/witvpn/ikev2/vless/VlessConfig;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "servers", "", "serversLoad", "", "", "", "updateData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "VlessViewHolder", "GreyWebVPN-3.0.8 [278]_debug"})
public final class VlessAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.witvpn.ikev2.presentation.ui.vless.VlessAdapter.VlessViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.witvpn.ikev2.vless.VlessConfig, kotlin.Unit> click = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.witvpn.ikev2.vless.VlessConfig> servers = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.Integer> serversLoad;
    
    public VlessAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.vless.VlessConfig, kotlin.Unit> click) {
        super();
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.witvpn.ikev2.vless.VlessConfig> servers, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> serversLoad) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.presentation.ui.vless.VlessAdapter.VlessViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.vless.VlessAdapter.VlessViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter$VlessViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter;Landroid/view/View;)V", "bindData", "", "server", "Lcom/witvpn/ikev2/vless/VlessConfig;", "GreyWebVPN-3.0.8 [278]_debug"})
    public final class VlessViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public VlessViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.vless.VlessConfig server) {
        }
    }
}