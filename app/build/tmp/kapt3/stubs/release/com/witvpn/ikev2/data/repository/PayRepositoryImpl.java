package com.witvpn.ikev2.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/data/repository/PayRepositoryImpl;", "Lcom/witvpn/ikev2/domain/repository/PayRepository;", "<init>", "()V", "apiService", "Lcom/witvpn/ikev2/data/remote/ApiService;", "getApiService", "()Lcom/witvpn/ikev2/data/remote/ApiService;", "setApiService", "(Lcom/witvpn/ikev2/data/remote/ApiService;)V", "getPayFK2Url", "", "userID", "plan", "Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;", "(Ljava/lang/String;Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GreyWebVPN-3.0.8 [278]_release"})
public final class PayRepositoryImpl implements com.witvpn.ikev2.domain.repository.PayRepository {
    @javax.inject.Inject()
    public com.witvpn.ikev2.data.remote.ApiService apiService;
    
    @javax.inject.Inject()
    public PayRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.data.remote.ApiService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.remote.ApiService p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPayFK2Url(@org.jetbrains.annotations.NotNull()
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.PayRepository.Plan plan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
}