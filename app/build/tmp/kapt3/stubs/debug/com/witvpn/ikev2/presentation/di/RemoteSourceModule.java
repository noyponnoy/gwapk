package com.witvpn.ikev2.presentation.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J2\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/witvpn/ikev2/presentation/di/RemoteSourceModule;", "", "<init>", "()V", "provideApiService", "Lcom/witvpn/ikev2/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideGson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideRetrofit", "context", "Landroid/content/Context;", "gson", "logging", "apiExceptionInterceptor", "Lcom/witvpn/ikev2/presentation/utils/interceptor/ApiExceptionInterceptor;", "modifyRequestInterceptor", "Lcom/witvpn/ikev2/presentation/utils/interceptor/ModifyRequestInterceptor;", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RemoteSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.di.RemoteSourceModule INSTANCE = null;
    
    private RemoteSourceModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit provideRetrofit(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logging, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.utils.interceptor.ApiExceptionInterceptor apiExceptionInterceptor, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.utils.interceptor.ModifyRequestInterceptor modifyRequestInterceptor) {
        return null;
    }
}