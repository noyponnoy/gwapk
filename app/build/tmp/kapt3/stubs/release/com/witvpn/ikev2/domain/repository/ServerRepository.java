package com.witvpn.ikev2.domain.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\"\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0016H\u00a6@\u00a2\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0016H\u00a6@\u00a2\u0006\u0002\u0010\u0017J*\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u001a\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u001dR\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u001e\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/domain/repository/ServerRepository;", "", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/witvpn/ikev2/domain/model/Server;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "serversLoadFlow", "", "", "", "getServersLoadFlow", "awgStateFlow", "Lcom/witvpn/ikev2/domain/model/ServerAwg;", "getAwgStateFlow", "gwServersStateFlow", "Lcom/witvpn/gw/model/GwServerConfig;", "getGwServersStateFlow", "getServers", "", "param", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServersAwg", "getServersGw", "privHex", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchServersLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GreyWebVPN-3.0.8 [278]_release"})
public abstract interface ServerRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.Server>> getStateFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, java.lang.Integer>> getServersLoadFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.ikev2.domain.model.ServerAwg>> getAwgStateFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.util.List<com.witvpn.gw.model.GwServerConfig>> getGwServersStateFlow();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServers(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServersAwg(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getServersGw(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    java.lang.String privHex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchServersLoad(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}