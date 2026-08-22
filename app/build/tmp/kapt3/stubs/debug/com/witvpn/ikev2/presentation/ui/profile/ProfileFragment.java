package com.witvpn.ikev2.presentation.ui.profile;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006&"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/profile/ProfileFragment;", "Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "Lcom/witvpn/ikev2/databinding/FragmentMnemonicBinding;", "Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicView;", "<init>", "()V", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initBinding", "view", "Landroid/view/View;", "initView", "", "initRestoreFromMnemonic", "initShowMnemonic", "mnemonic", "", "setInput", "getInput", "setInputError", "error", "", "clearError", "setRestoreButton", "isEnabled", "", "setInputHint", "hint", "showInfoAlert", "alert", "getViewContext", "Landroid/content/Context;", "reloadUser", "Companion", "GreyWebVPN-3.0.8 [278]_debug"})
public final class ProfileFragment extends com.witvpn.ikev2.presentation.base.BaseFragment<com.witvpn.ikev2.databinding.FragmentMnemonicBinding> implements com.witvpn.ikev2.presentation.ui.entropy.MnemonicView {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MODE_KEY = "view_mode";
    private static final int RESTORE_MODE = 1;
    private static final int VIEW_MODE = 2;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.ui.profile.ProfileFragment.Companion Companion = null;
    
    public ProfileFragment() {
        super(0);
    }
    
    private final com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.FragmentMnemonicBinding initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void initRestoreFromMnemonic() {
    }
    
    private final void initShowMnemonic(java.lang.String mnemonic) {
    }
    
    @java.lang.Override()
    public void setInput(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getInput() {
        return null;
    }
    
    @java.lang.Override()
    public void setInputError(int error) {
    }
    
    @java.lang.Override()
    public void setInputError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void clearError() {
    }
    
    @java.lang.Override()
    public void setRestoreButton(boolean isEnabled) {
    }
    
    @java.lang.Override()
    public void setInputHint(int hint) {
    }
    
    @java.lang.Override()
    public void showInfoAlert(int alert) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.content.Context getViewContext() {
        return null;
    }
    
    @java.lang.Override()
    public void reloadUser() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/profile/ProfileFragment$Companion;", "", "<init>", "()V", "MODE_KEY", "", "RESTORE_MODE", "", "VIEW_MODE", "newReadMnemonic", "Landroid/os/Bundle;", "newRestoreFromMnemonic", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle newReadMnemonic() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle newRestoreFromMnemonic() {
            return null;
        }
    }
}