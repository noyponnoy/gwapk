package com.witvpn.ikev2.presentation.ui.billing;

import com.witvpn.ikev2.domain.repository.PayRepository;
import com.witvpn.ikev2.domain.repository.UserRepository;
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
public final class BillingViewModel_Factory implements Factory<BillingViewModel> {
  private final Provider<PayRepository> payRepoProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public BillingViewModel_Factory(Provider<PayRepository> payRepoProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.payRepoProvider = payRepoProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public BillingViewModel get() {
    return newInstance(payRepoProvider.get(), userRepositoryProvider.get());
  }

  public static BillingViewModel_Factory create(Provider<PayRepository> payRepoProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new BillingViewModel_Factory(payRepoProvider, userRepositoryProvider);
  }

  public static BillingViewModel newInstance(PayRepository payRepo, UserRepository userRepository) {
    return new BillingViewModel(payRepo, userRepository);
  }
}
