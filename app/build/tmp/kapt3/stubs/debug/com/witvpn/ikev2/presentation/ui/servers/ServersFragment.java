package com.witvpn.ikev2.presentation.ui.servers;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\'B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u001a\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/ServersFragment;", "Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "Lcom/witvpn/ikev2/databinding/FragmentServers2Binding;", "Lcom/witvpn/ikev2/presentation/ui/servers/ServersUIDelegate;", "<init>", "()V", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/servers/ServersViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/servers/ServersViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "shareViewModel", "Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "getShareViewModel", "()Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "shareViewModel$delegate", "tabs", "", "Lcom/witvpn/ikev2/presentation/ui/servers/tab/TabFragment;", "getTabs", "()Ljava/util/List;", "tabs$delegate", "initBinding", "view", "Landroid/view/View;", "initView", "", "initObserve", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "handleServerClicked", "server", "Lcom/witvpn/ikev2/domain/model/Server;", "showLoading", "show", "", "ViewPagerAdapter", "GreyWebVPN-3.0.8 [278]_debug"})
public final class ServersFragment extends com.witvpn.ikev2.presentation.base.BaseFragment<com.witvpn.ikev2.databinding.FragmentServers2Binding> implements com.witvpn.ikev2.presentation.ui.servers.ServersUIDelegate {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy shareViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy tabs$delegate = null;
    
    public ServersFragment() {
        super(0);
    }
    
    private final com.witvpn.ikev2.presentation.ui.servers.ServersViewModel getViewModel() {
        return null;
    }
    
    private final com.witvpn.ikev2.presentation.ui.ShareViewModel getShareViewModel() {
        return null;
    }
    
    private final java.util.List<com.witvpn.ikev2.presentation.ui.servers.tab.TabFragment> getTabs() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.FragmentServers2Binding initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initObserve() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void handleServerClicked(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.Server server) {
    }
    
    private final void showLoading(boolean show) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/ServersFragment$ViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "<init>", "(Lcom/witvpn/ikev2/presentation/ui/servers/ServersFragment;Landroidx/fragment/app/FragmentManager;)V", "getItem", "Landroidx/fragment/app/Fragment;", "position", "", "getCount", "getPageTitle", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public final class ViewPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        
        public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
    }
}