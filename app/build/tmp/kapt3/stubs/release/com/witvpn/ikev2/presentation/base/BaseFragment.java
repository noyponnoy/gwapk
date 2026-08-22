package com.witvpn.ikev2.presentation.base;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0015\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0017H&\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u001fH&J\n\u0010$\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R+\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00008F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "layoutRes", "", "<init>", "(I)V", "<set-?>", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "binding$delegate", "Lcom/witvpn/ikev2/presentation/utils/AutoClearedValue;", "baseViewModel", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "getBaseViewModel", "()Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "baseViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "initBinding", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "initView", "initViewModel", "initObserve", "GreyWebVPN-3.0.8 [278]_release"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.presentation.utils.AutoClearedValue binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy baseViewModel$delegate = null;
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layoutRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    private final com.witvpn.ikev2.presentation.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void initView();
    
    @org.jetbrains.annotations.Nullable()
    public com.witvpn.ikev2.presentation.base.BaseViewModel initViewModel() {
        return null;
    }
    
    public void initObserve() {
    }
}