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
public final class PayRepositoryImpl_MembersInjector implements MembersInjector<PayRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public PayRepositoryImpl_MembersInjector(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  public static MembersInjector<PayRepositoryImpl> create(Provider<ApiService> apiServiceProvider) {
    return new PayRepositoryImpl_MembersInjector(apiServiceProvider);
  }

  @Override
  public void injectMembers(PayRepositoryImpl instance) {
    injectApiService(instance, apiServiceProvider.get());
  }

  @InjectedFieldSignature("com.witvpn.ikev2.data.repository.PayRepositoryImpl.apiService")
  public static void injectApiService(PayRepositoryImpl instance, ApiService apiService) {
    instance.apiService = apiService;
  }
}
