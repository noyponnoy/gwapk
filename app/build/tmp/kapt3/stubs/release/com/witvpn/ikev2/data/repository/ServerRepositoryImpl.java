package com.witvpn.ikev2.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001cJ*\u0010\u001d\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u001e\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001fJ\"\u0010%\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010&\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR \u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\"0!0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\"0!0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\r\u00a8\u0006+"}, d2 = {"Lcom/witvpn/ikev2/data/repository/ServerRepositoryImpl;", "Lcom/witvpn/ikev2/domain/repository/ServerRepository;", "api", "Lcom/witvpn/ikev2/data/remote/ApiService;", "<init>", "(Lcom/witvpn/ikev2/data/remote/ApiService;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/witvpn/ikev2/domain/model/Server;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "awgState", "Lcom/witvpn/ikev2/domain/model/ServerAwg;", "awgStateFlow", "getAwgStateFlow", "gwState", "Lcom/witvpn/gw/model/GwServerConfig;", "gwServersStateFlow", "getGwServersStateFlow", "getServersAwg", "", "param", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServersGw", "privHex", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_serversLoad", "", "", "serversLoadFlow", "getServersLoadFlow", "getServers", "fetchServersLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "serverObject", "Lcom/witvpn/ikev2/data/remote/model/ServerObject;", "GreyWebVPN-3.0.8 [278]_release"})
public final class ServerRepositoryImpl implements com.witvpn.ikev2.domain.repository.ServerRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.data.remote.ApiService api = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.witvpn.ikev2.domain.model.Server>> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.Server>> stateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> awgState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> awgStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.witvpn.gw.model.GwServerConfig>> gwState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.gw.model.GwServerConfig>> gwServersStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.lang.Integer>> _serversLoad = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, java.lang.Integer>> serversLoadFlow = null;
    
    @javax.inject.Inject()
    public ServerRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.remote.ApiService api) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.Server>> getStateFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> getAwgStateFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.gw.model.GwServerConfig>> getGwServersStateFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getServersAwg(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getServersGw(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    java.lang.String privHex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, java.lang.Integer>> getServersLoadFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getServers(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchServersLoad(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final com.witvpn.ikev2.domain.model.Server unwrap(com.witvpn.ikev2.data.remote.model.ServerObject serverObject) {
        return null;
    }
}