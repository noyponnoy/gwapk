package com.witvpn.ikev2.presentation.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/presentation/di/RepositoryModule;", "", "<init>", "()V", "provideServerRepository", "Lcom/witvpn/ikev2/domain/repository/ServerRepository;", "serverRepositoryImpl", "Lcom/witvpn/ikev2/data/repository/ServerRepositoryImpl;", "provideUserRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "userRepositoryImpl", "Lcom/witvpn/ikev2/data/repository/UserRepositoryImpl;", "providePayURLRepository", "Lcom/witvpn/ikev2/domain/repository/PayRepository;", "payRepository", "Lcom/witvpn/ikev2/data/repository/PayRepositoryImpl;", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.domain.repository.ServerRepository provideServerRepository(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.repository.ServerRepositoryImpl serverRepositoryImpl) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.repository.UserRepositoryImpl userRepositoryImpl) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.domain.repository.PayRepository providePayURLRepository(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.repository.PayRepositoryImpl payRepository) {
        return null;
    }
}