package com.witvpn.ikev2.presentation.di;

import android.content.Context;
import com.google.gson.Gson;
import com.witvpn.ikev2.presentation.utils.interceptor.ApiExceptionInterceptor;
import com.witvpn.ikev2.presentation.utils.interceptor.ModifyRequestInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class RemoteSourceModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Context> contextProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<HttpLoggingInterceptor> loggingProvider;

  private final Provider<ApiExceptionInterceptor> apiExceptionInterceptorProvider;

  private final Provider<ModifyRequestInterceptor> modifyRequestInterceptorProvider;

  public RemoteSourceModule_ProvideRetrofitFactory(Provider<Context> contextProvider,
      Provider<Gson> gsonProvider, Provider<HttpLoggingInterceptor> loggingProvider,
      Provider<ApiExceptionInterceptor> apiExceptionInterceptorProvider,
      Provider<ModifyRequestInterceptor> modifyRequestInterceptorProvider) {
    this.contextProvider = contextProvider;
    this.gsonProvider = gsonProvider;
    this.loggingProvider = loggingProvider;
    this.apiExceptionInterceptorProvider = apiExceptionInterceptorProvider;
    this.modifyRequestInterceptorProvider = modifyRequestInterceptorProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(contextProvider.get(), gsonProvider.get(), loggingProvider.get(), apiExceptionInterceptorProvider.get(), modifyRequestInterceptorProvider.get());
  }

  public static RemoteSourceModule_ProvideRetrofitFactory create(Provider<Context> contextProvider,
      Provider<Gson> gsonProvider, Provider<HttpLoggingInterceptor> loggingProvider,
      Provider<ApiExceptionInterceptor> apiExceptionInterceptorProvider,
      Provider<ModifyRequestInterceptor> modifyRequestInterceptorProvider) {
    return new RemoteSourceModule_ProvideRetrofitFactory(contextProvider, gsonProvider, loggingProvider, apiExceptionInterceptorProvider, modifyRequestInterceptorProvider);
  }

  public static Retrofit provideRetrofit(Context context, Gson gson, HttpLoggingInterceptor logging,
      ApiExceptionInterceptor apiExceptionInterceptor,
      ModifyRequestInterceptor modifyRequestInterceptor) {
    return Preconditions.checkNotNullFromProvides(RemoteSourceModule.INSTANCE.provideRetrofit(context, gson, logging, apiExceptionInterceptor, modifyRequestInterceptor));
  }
}
