package com.witvpn.ikev2.presentation.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/presentation/di/LocalSourceModule;", "", "<init>", "()V", "provideAppSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "provideAppSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "sharedPreferences", "provideVpnProfileDataSource", "Lorg/strongswan/android/data/VpnProfileDataSource;", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class LocalSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.di.LocalSourceModule INSTANCE = null;
    
    private LocalSourceModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences provideAppSharedPreferences(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.data.AppSettings provideAppSettings(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final org.strongswan.android.data.VpnProfileDataSource provideVpnProfileDataSource(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}