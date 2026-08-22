package com.witvpn.ikev2.presentation.ui.servers;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013J\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u00120\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000b\u00a8\u0006 "}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/servers/ServersViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "serverRepository", "Lcom/witvpn/ikev2/domain/repository/ServerRepository;", "<init>", "(Lcom/witvpn/ikev2/domain/repository/ServerRepository;)V", "serversList", "Landroidx/lifecycle/LiveData;", "", "Lcom/witvpn/ikev2/domain/model/Server;", "getServersList", "()Landroidx/lifecycle/LiveData;", "serversAwgList", "Lcom/witvpn/ikev2/domain/model/ServerAwg;", "getServersAwgList", "serversGwList", "getServersGwList", "serversGwConfigMap", "", "", "Lcom/witvpn/gw/model/GwServerConfig;", "getServersGwConfigMap", "serversLoadMap", "", "getServersLoadMap", "execute", "", "user", "Lcom/witvpn/ikev2/domain/model/User;", "fetchGwServers", "privHex", "fetchLoad", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ServersViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.ServerRepository serverRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.Server>> serversList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> serversAwgList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.Server>> serversGwList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.witvpn.gw.model.GwServerConfig>> serversGwConfigMap = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> serversLoadMap = null;
    
    @javax.inject.Inject()
    public ServersViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.ServerRepository serverRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.Server>> getServersList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> getServersAwgList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.witvpn.ikev2.domain.model.Server>> getServersGwList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.witvpn.gw.model.GwServerConfig>> getServersGwConfigMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> getServersLoadMap() {
        return null;
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.model.User user) {
    }
    
    public final void fetchGwServers(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.model.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String privHex) {
    }
    
    public final void fetchLoad() {
    }
}