package com.witvpn.ikev2.presentation.ui.entropy;

import com.witvpn.ikev2.domain.repository.UserRepository;
import com.witvpn.ikev2.features.entropy.EntropyUseCase;
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
public final class MnemonicViewModel_Factory implements Factory<MnemonicViewModel> {
  private final Provider<EntropyUseCase> entropyUseCaseProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public MnemonicViewModel_Factory(Provider<EntropyUseCase> entropyUseCaseProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.entropyUseCaseProvider = entropyUseCaseProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public MnemonicViewModel get() {
    return newInstance(entropyUseCaseProvider.get(), userRepositoryProvider.get());
  }

  public static MnemonicViewModel_Factory create(Provider<EntropyUseCase> entropyUseCaseProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new MnemonicViewModel_Factory(entropyUseCaseProvider, userRepositoryProvider);
  }

  public static MnemonicViewModel newInstance(EntropyUseCase entropyUseCase,
      UserRepository userRepository) {
    return new MnemonicViewModel(entropyUseCase, userRepository);
  }
}
