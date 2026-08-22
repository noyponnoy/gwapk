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
public final class UserRepositoryImpl_Factory implements Factory<UserRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public UserRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public UserRepositoryImpl get() {
    UserRepositoryImpl instance = newInstance();
    UserRepositoryImpl_MembersInjector.injectApiService(instance, apiServiceProvider.get());
    return instance;
  }

  public static UserRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new UserRepositoryImpl_Factory(apiServiceProvider);
  }

  public static UserRepositoryImpl newInstance() {
    return new UserRepositoryImpl();
  }
}
