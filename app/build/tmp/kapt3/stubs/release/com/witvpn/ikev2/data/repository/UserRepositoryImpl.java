package com.witvpn.ikev2.data.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@\u00a2\u0006\u0002\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/witvpn/ikev2/data/repository/UserRepositoryImpl;", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "<init>", "()V", "apiService", "Lcom/witvpn/ikev2/data/remote/ApiService;", "getApiService", "()Lcom/witvpn/ikev2/data/remote/ApiService;", "setApiService", "(Lcom/witvpn/ikev2/data/remote/ApiService;)V", "login", "Lcom/witvpn/ikev2/domain/model/User;", "param", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "otp", "profile", "createAnonymousUser", "updateTotalUploadDownload", "packages", "", "Lcom/witvpn/ikev2/domain/model/Package;", "ads", "Lcom/witvpn/ikev2/domain/model/Ads;", "subscription", "", "GreyWebVPN-3.0.8 [278]_release"})
public final class UserRepositoryImpl implements com.witvpn.ikev2.domain.repository.UserRepository {
    @javax.inject.Inject()
    public com.witvpn.ikev2.data.remote.ApiService apiService;
    
    @javax.inject.Inject()
    public UserRepositoryImpl() {
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
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object otp(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object profile(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createAnonymousUser(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateTotalUploadDownload(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object packages(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.witvpn.ikev2.domain.model.Package>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object ads(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.witvpn.ikev2.domain.model.Ads>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object subscription(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}