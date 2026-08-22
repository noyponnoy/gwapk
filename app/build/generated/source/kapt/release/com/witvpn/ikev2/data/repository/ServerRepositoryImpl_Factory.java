package com.witvpn.ikev2.data.repository;

import com.witvpn.ikev2.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ServerRepositoryImpl_Factory implements Factory<ServerRepositoryImpl> {
  private final Provider<ApiService> apiProvider;

  public ServerRepositoryImpl_Factory(Provider<ApiService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public ServerRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static ServerRepositoryImpl_Factory create(Provider<ApiService> apiProvider) {
    return new ServerRepositoryImpl_Factory(apiProvider);
  }

  public static ServerRepositoryImpl newInstance(ApiService api) {
    return new ServerRepositoryImpl(api);
  }
}
