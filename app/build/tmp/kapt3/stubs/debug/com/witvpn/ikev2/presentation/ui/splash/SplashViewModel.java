package com.witvpn.ikev2.presentation.ui.splash;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splash/SplashViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "appContext", "Landroid/content/Context;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "entropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "appSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "<init>", "(Landroid/content/Context;Lcom/witvpn/ikev2/domain/repository/UserRepository;Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;Lcom/witvpn/ikev2/data/AppSettings;)V", "_userMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/witvpn/ikev2/domain/model/Resource;", "Lcom/witvpn/ikev2/domain/model/User;", "userLiveData", "Landroidx/lifecycle/LiveData;", "getUserLiveData", "()Landroidx/lifecycle/LiveData;", "user", "getUser", "()Lcom/witvpn/ikev2/domain/model/User;", "user$delegate", "Lkotlin/Lazy;", "execute", "", "splashFragment", "Lcom/witvpn/ikev2/presentation/ui/splash/SplashFragment;", "createNew", "", "loadUser", "(Lcom/witvpn/ikev2/presentation/ui/splash/SplashFragment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleError", "msg", "", "provide", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SplashViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.data.AppSettings appSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.User>> _userMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.User>> userLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy user$delegate = null;
    
    @javax.inject.Inject()
    public SplashViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.AppSettings appSettings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.User>> getUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.domain.model.User getUser() {
        return null;
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.splash.SplashFragment splashFragment, boolean createNew) {
    }
    
    private final java.lang.Object loadUser(com.witvpn.ikev2.presentation.ui.splash.SplashFragment splashFragment, boolean createNew, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void handleError(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    public final void provide(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.splash.SplashFragment splashFragment) {
    }
}