package com.witvpn.ikev2.data.repository;

import com.witvpn.ikev2.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
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
public final class PayRepositoryImpl_Factory implements Factory<PayRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public PayRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public PayRepositoryImpl get() {
    PayRepositoryImpl instance = newInstance();
    PayRepositoryImpl_MembersInjector.injectApiService(instance, apiServiceProvider.get());
    return instance;
  }

  public static PayRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new PayRepositoryImpl_Factory(apiServiceProvider);
  }

  public static PayRepositoryImpl newInstance() {
    return new PayRepositoryImpl();
  }
}
