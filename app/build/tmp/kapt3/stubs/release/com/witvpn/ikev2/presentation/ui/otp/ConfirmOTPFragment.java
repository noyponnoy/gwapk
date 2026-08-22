package com.witvpn.ikev2.presentation.ui.otp;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPFragment;", "Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "Lcom/witvpn/ikev2/databinding/FragmentConfirmOtpBinding;", "<init>", "()V", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "args", "Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPFragmentArgs;", "getArgs", "()Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "countJob", "Lkotlinx/coroutines/CompletableJob;", "value", "", "count", "setCount", "(I)V", "initBinding", "view", "Landroid/view/View;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initViewModel", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "initObserve", "onDestroyView", "countDown", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class ConfirmOTPFragment extends com.witvpn.ikev2.presentation.base.BaseFragment<com.witvpn.ikev2.databinding.FragmentConfirmOtpBinding> {
    public static final int MAX_COUNTDOWN = 60;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CompletableJob countJob;
    private int count = 60;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPFragment.Companion Companion = null;
    
    public ConfirmOTPFragment() {
        super(0);
    }
    
    private final com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel getViewModel() {
        return null;
    }
    
    private final com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPFragmentArgs getArgs() {
        return null;
    }
    
    private final void setCount(int value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.FragmentConfirmOtpBinding initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.witvpn.ikev2.presentation.base.BaseViewModel initViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initObserve() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void countDown() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPFragment$Companion;", "", "<init>", "()V", "MAX_COUNTDOWN", "", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}