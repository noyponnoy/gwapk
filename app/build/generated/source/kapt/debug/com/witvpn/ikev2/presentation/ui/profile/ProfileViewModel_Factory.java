package com.witvpn.ikev2.presentation.ui.profile;

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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<EntropyUseCase> entropyUseCaseProvider;

  public ProfileViewModel_Factory(Provider<EntropyUseCase> entropyUseCaseProvider) {
    this.entropyUseCaseProvider = entropyUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(entropyUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<EntropyUseCase> entropyUseCaseProvider) {
    return new ProfileViewModel_Factory(entropyUseCaseProvider);
  }

  public static ProfileViewModel newInstance(EntropyUseCase entropyUseCase) {
    return new ProfileViewModel(entropyUseCase);
  }
}
