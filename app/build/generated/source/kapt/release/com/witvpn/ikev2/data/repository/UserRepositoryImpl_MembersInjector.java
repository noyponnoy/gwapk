package com.witvpn.ikev2.data.repository;

import com.witvpn.ikev2.data.remote.ApiService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class UserRepositoryImpl_MembersInjector implements MembersInjector<UserRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public UserRepositoryImpl_MembersInjector(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  public static MembersInjector<UserRepositoryImpl> create(
      Provider<ApiService> apiServiceProvider) {
    return new UserRepositoryImpl_MembersInjector(apiServiceProvider);
  }

  @Override
  public void injectMembers(UserRepositoryImpl instance) {
    injectApiService(instance, apiServiceProvider.get());
  }

  @InjectedFieldSignature("com.witvpn.ikev2.data.repository.UserRepositoryImpl.apiService")
  public static void injectApiService(UserRepositoryImpl instance, ApiService apiService) {
    instance.apiService = apiService;
  }
}
