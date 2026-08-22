package com.witvpn.ikev2.presentation.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/di/UseCaseModule;", "", "<init>", "()V", "provideEntropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "appSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.features.entropy.EntropyUseCase provideEntropyUseCase(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.AppSettings appSettings) {
        return null;
    }
}