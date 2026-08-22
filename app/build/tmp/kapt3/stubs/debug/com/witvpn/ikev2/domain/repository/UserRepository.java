package com.witvpn.ikev2.domain.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\t\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\n\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0014\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/domain/repository/UserRepository;", "", "login", "Lcom/witvpn/ikev2/domain/model/User;", "param", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "otp", "profile", "createAnonymousUser", "updateTotalUploadDownload", "packages", "", "Lcom/witvpn/ikev2/domain/model/Package;", "ads", "Lcom/witvpn/ikev2/domain/model/Ads;", "subscription", "", "GreyWebVPN-3.0.8 [278]_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object otp(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object profile(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createAnonymousUser(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTotalUploadDownload(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.witvpn.ikev2.domain.model.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object packages(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.witvpn.ikev2.domain.model.Package>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object ads(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.witvpn.ikev2.domain.model.Ads>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object subscription(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}