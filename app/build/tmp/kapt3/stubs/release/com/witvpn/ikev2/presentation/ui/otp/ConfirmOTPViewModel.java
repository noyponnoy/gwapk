package com.witvpn.ikev2.presentation.ui.otp;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0013J\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b0\u0013J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/otp/ConfirmOTPViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "<init>", "(Lcom/witvpn/ikev2/domain/repository/UserRepository;)V", "_signUpStateMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/witvpn/ikev2/domain/model/Resource;", "", "_loginStateMutableLiveData", "Lcom/witvpn/ikev2/domain/model/User;", "signUp", "", "email", "", "login", "code", "getSignUpState", "Landroidx/lifecycle/LiveData;", "getLoginState", "handleError", "msg", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ConfirmOTPViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.witvpn.ikev2.domain.model.Resource<java.lang.Boolean>> _signUpStateMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.User>> _loginStateMutableLiveData = null;
    
    @javax.inject.Inject()
    public ConfirmOTPViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepository) {
        super();
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<java.lang.Boolean>> getSignUpState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.User>> getLoginState() {
        return null;
    }
    
    @java.lang.Override()
    public void handleError(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
}