package com.witvpn.ikev2.presentation.ui.otp;

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
public final class ConfirmOTPViewModel_Factory implements Factory<ConfirmOTPViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public ConfirmOTPViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public ConfirmOTPViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static ConfirmOTPViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new ConfirmOTPViewModel_Factory(userRepositoryProvider);
  }

  public static ConfirmOTPViewModel newInstance(UserRepository userRepository) {
    return new ConfirmOTPViewModel(userRepository);
  }
}
