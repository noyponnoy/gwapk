package com.witvpn.ikev2.presentation.ui.otp;

import com.witvpn.ikev2.data.AppSettings;
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
public final class OTPViewModel_Factory implements Factory<OTPViewModel> {
  private final Provider<EntropyUseCase> entropyUseCaseProvider;

  private final Provider<AppSettings> appSettingsProvider;

  public OTPViewModel_Factory(Provider<EntropyUseCase> entropyUseCaseProvider,
      Provider<AppSettings> appSettingsProvider) {
    this.entropyUseCaseProvider = entropyUseCaseProvider;
    this.appSettingsProvider = appSettingsProvider;
  }

  @Override
  public OTPViewModel get() {
    return newInstance(entropyUseCaseProvider.get(), appSettingsProvider.get());
  }

  public static OTPViewModel_Factory create(Provider<EntropyUseCase> entropyUseCaseProvider,
      Provider<AppSettings> appSettingsProvider) {
    return new OTPViewModel_Factory(entropyUseCaseProvider, appSettingsProvider);
  }

  public static OTPViewModel newInstance(EntropyUseCase entropyUseCase, AppSettings appSettings) {
    return new OTPViewModel(entropyUseCase, appSettings);
  }
}
