package com.witvpn.ikev2.presentation.ui.profile;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\tH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&\u00a8\u0006\u0015\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/profile/MnemonicView;", "", "setInput", "", "mnemonic", "", "getInput", "setInputError", "error", "", "clearError", "setRestoreButton", "isEnabled", "", "setInputHint", "hint", "showInfoAlert", "alert", "getViewContext", "Landroid/content/Context;", "reloadUser", "GreyWebVPN-3.0.8 [278]_debug"})
public abstract interface MnemonicView {
    
    public abstract void setInput(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getInput();
    
    public abstract void setInputError(@androidx.annotation.StringRes()
    int error);
    
    public abstract void clearError();
    
    public abstract void setRestoreButton(boolean isEnabled);
    
    public abstract void setInputHint(@androidx.annotation.StringRes()
    int hint);
    
    public abstract void showInfoAlert(@androidx.annotation.StringRes()
    int alert);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getViewContext();
    
    public abstract void reloadUser();
}