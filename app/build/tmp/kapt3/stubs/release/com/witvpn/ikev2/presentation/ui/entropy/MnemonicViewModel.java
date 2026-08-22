package com.witvpn.ikev2.presentation.ui.entropy;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "entropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "<init>", "(Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;Lcom/witvpn/ikev2/domain/repository/UserRepository;)V", "value", "Lcom/witvpn/ikev2/domain/model/User;", "user", "getUser", "()Lcom/witvpn/ikev2/domain/model/User;", "userConsumer", "Lkotlin/Function1;", "", "getUserConsumer", "()Lkotlin/jvm/functions/Function1;", "setUserConsumer", "(Lkotlin/jvm/functions/Function1;)V", "aView", "Lcom/witvpn/ikev2/presentation/ui/entropy/MnemonicView;", "clearInputError", "setInputError", "error", "", "bindView", "view", "onMnemonicInput", "mnemonic", "", "onRestoreClick", "onCopyClick", "getMnemonic", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MnemonicViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.Nullable()
    private com.witvpn.ikev2.domain.model.User user;
    public kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.domain.model.User, kotlin.Unit> userConsumer;
    @org.jetbrains.annotations.Nullable()
    private com.witvpn.ikev2.presentation.ui.entropy.MnemonicView aView;
    
    @javax.inject.Inject()
    public MnemonicViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.domain.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.witvpn.ikev2.domain.model.User, kotlin.Unit> getUserConsumer() {
        return null;
    }
    
    public final void setUserConsumer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.domain.model.User, kotlin.Unit> p0) {
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