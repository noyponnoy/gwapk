package com.witvpn.ikev2.presentation.ui.splittunnel;

/**
 * List of installed applications with a per-app selection switch. What a tick
 * means depends on the Split Tunneling mode ("Only selected" — the app uses
 * the tunnel, "All except selected" — the app bypasses it); the screen header
 * above the list spells it out. Icons are loaded off the main thread and
 * cached, so scrolling a long list stays smooth and the initial load never
 * blocks the UI.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001d\u001eBG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u000e2\n\u0010\u001a\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0014\u0010\u001c\u001a\u00020\u000e2\n\u0010\u001a\u001a\u00060\u0003R\u00020\u0000H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelApp;", "Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter$ViewHolder;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onToggle", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "packageName", "", "selected", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "iconCache", "Landroid/util/LruCache;", "Landroid/graphics/drawable/Drawable;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "onViewRecycled", "ViewHolder", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class SplitTunnelAppAdapter extends androidx.recyclerview.widget.ListAdapter<com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelApp, com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Boolean, kotlin.Unit> onToggle = null;
    @org.jetbrains.annotations.NotNull()
    private final android.util.LruCache<java.lang.String, android.graphics.drawable.Drawable> iconCache = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelApp> DIFF = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter.Companion Companion = null;
    
    public SplitTunnelAppAdapter(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onToggle) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter.ViewHolder holder) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter$Companion;", "", "<init>", "()V", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/witvpn/ikev2/databinding/ItemSplitTunnelAppBinding;", "<init>", "(Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter;Lcom/witvpn/ikev2/databinding/ItemSplitTunnelAppBinding;)V", "iconJob", "Lkotlinx/coroutines/Job;", "boundPackage", "", "bind", "", "item", "Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelApp;", "loadIcon", "packageName", "cancelIconLoad", "GreyWebVPN-3.0.8 [278]_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.witvpn.ikev2.databinding.ItemSplitTunnelAppBinding binding = null;
        @org.jetbrains.annotations.Nullable()
        private kotlinx.coroutines.Job iconJob;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String boundPackage;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.databinding.ItemSplitTunnelAppBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelApp item) {
        }
        
        private final void loadIcon(java.lang.String packageName) {
        }
        
        public final void cancelIconLoad() {
        }
    }
}