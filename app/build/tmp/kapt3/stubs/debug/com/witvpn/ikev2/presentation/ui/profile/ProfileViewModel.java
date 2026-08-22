package com.witvpn.ikev2.presentation.ui.profile;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/profile/ProfileViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "entropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "<init>", "(Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;)V", "aView", "Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicView;", "clearInputError", "", "setInputError", "error", "", "bindView", "view", "onMnemonicInput", "mnemonic", "", "onRestoreClick", "onCopyClick", "getMnemonic", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProfileViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase = null;
    @org.jetbrains.annotations.Nullable()
    private com.witvpn.ikev2.presentation.ui.entropy.MnemonicView aView;
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase) {
        super();
    }
    
    private final void clearInputError() {
    }
    
    private final void setInputError(@androidx.annotation.StringRes()
    int error) {
    }
    
    public final void bindView(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.entropy.MnemonicView view) {
    }
    
    public final void onMnemonicInput(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic) {
    }
    
    public final void onRestoreClick() {
    }
    
    public final void onCopyClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMnemonic() {
        return null;
    }
}