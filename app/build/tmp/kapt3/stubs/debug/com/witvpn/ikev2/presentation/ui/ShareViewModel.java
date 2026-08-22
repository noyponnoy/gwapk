package com.witvpn.ikev2.presentation.ui;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0016J\u0010\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\fJ\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\fJ(\u0010$\u001a\u00020\u001d2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "dataSource", "Lorg/strongswan/android/data/VpnProfileDataSource;", "userRepos", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "servers", "Lcom/witvpn/ikev2/domain/repository/ServerRepository;", "<init>", "(Lorg/strongswan/android/data/VpnProfileDataSource;Lcom/witvpn/ikev2/domain/repository/UserRepository;Lcom/witvpn/ikev2/domain/repository/ServerRepository;)V", "_userMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/witvpn/ikev2/domain/model/User;", "userLiveData", "Landroidx/lifecycle/LiveData;", "getUserLiveData", "()Landroidx/lifecycle/LiveData;", "user", "getUser", "()Lcom/witvpn/ikev2/domain/model/User;", "_serverMutableLiveData", "Lcom/witvpn/ikev2/domain/model/Resource;", "Lcom/witvpn/ikev2/domain/model/Server;", "serverLiveData", "getServerLiveData", "isPremium", "", "()Z", "execute", "", "server", "refreshAndInsertVPNProfile", "value", "setUser", "data", "replaceUser", "updateSubscription", "param", "", "", "", "callback", "Lkotlin/Function0;", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ShareViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.strongswan.android.data.VpnProfileDataSource dataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepos = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.ServerRepository servers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.witvpn.ikev2.domain.model.User> _userMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.User> userLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.Server>> _serverMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.Server>> serverLiveData = null;
    
    @javax.inject.Inject()
    public ShareViewModel(@org.jetbrains.annotations.NotNull()
    org.strongswan.android.data.VpnProfileDataSource dataSource, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepos, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.ServerRepository servers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.User> getUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.domain.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.witvpn.ikev2.domain.model.Resource<com.witvpn.ikev2.domain.model.Server>> getServerLiveData() {
        return null;
    }
    
    public final boolean isPremium() {
        return false;
    }
    
    public final void execute(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.Server server) {
    }
    
    public final void refreshAndInsertVPNProfile(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.model.Server value) {
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.User data) {
    }
    
    public final void replaceUser(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.model.User user) {
    }
    
    public final void updateSubscription(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
}