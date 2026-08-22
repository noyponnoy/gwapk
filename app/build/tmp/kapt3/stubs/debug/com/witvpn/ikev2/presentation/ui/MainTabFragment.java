package com.witvpn.ikev2.presentation.ui;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002#$B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/MainTabFragment;", "Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "Lcom/witvpn/ikev2/databinding/FragmentMainTabBinding;", "Lcom/witvpn/ikev2/presentation/ui/MainTabUIDelegate;", "<init>", "()V", "shareViewModel", "Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "getShareViewModel", "()Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "shareViewModel$delegate", "Lkotlin/Lazy;", "fragments", "", "Landroidx/viewbinding/ViewBinding;", "delegate", "Lcom/witvpn/ikev2/presentation/ui/MainDelegate;", "getDelegate", "()Lcom/witvpn/ikev2/presentation/ui/MainDelegate;", "delegate$delegate", "initBinding", "view", "Landroid/view/View;", "initView", "", "initObserve", "onViewStateRestored", "savedInstanceState", "Landroid/os/Bundle;", "setCurrentTab", "tabIndex", "", "setServerToConnect", "server", "Lcom/witvpn/ikev2/domain/model/Server;", "ViewPagerAdapter", "OnTabChanged", "GreyWebVPN-3.0.8 [278]_debug"})
public final class MainTabFragment extends com.witvpn.ikev2.presentation.base.BaseFragment<com.witvpn.ikev2.databinding.FragmentMainTabBinding> implements com.witvpn.ikev2.presentation.ui.MainTabUIDelegate {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy shareViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.witvpn.ikev2.presentation.base.BaseFragment<? extends androidx.viewbinding.ViewBinding>> fragments = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy delegate$delegate = null;
    
    public MainTabFragment() {
        super(0);
    }
    
    private final com.witvpn.ikev2.presentation.ui.ShareViewModel getShareViewModel() {
        return null;
    }
    
    private final com.witvpn.ikev2.presentation.ui.MainDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.FragmentMainTabBinding initBinding(@org.jetbrains.annotations.NotNull()
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
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setCurrentTab(int tabIndex) {
    }
    
    @java.lang.Override()
    public void setServerToConnect(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.Server server) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/MainTabFragment$OnTabChanged;", "", "onChange", "", "tabIndex", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public static abstract interface OnTabChanged {
        
        public abstract void onChange(int tabIndex);
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/MainTabFragment$ViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "<init>", "(Lcom/witvpn/ikev2/presentation/ui/MainTabFragment;Landroidx/fragment/app/FragmentManager;)V", "getItem", "Landroidx/fragment/app/Fragment;", "position", "", "getCount", "GreyWebVPN-3.0.8 [278]_debug"})
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
    }
}