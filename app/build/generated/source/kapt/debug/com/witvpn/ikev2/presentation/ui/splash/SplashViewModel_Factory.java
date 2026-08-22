package com.witvpn.ikev2.presentation.ui.splash;

import android.content.Context;
import com.witvpn.ikev2.data.AppSettings;
import com.witvpn.ikev2.domain.repository.UserRepository;
import com.witvpn.ikev2.features.entropy.EntropyUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<Context> appContextProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<EntropyUseCase> entropyUseCaseProvider;

  private final Provider<AppSettings> appSettingsProvider;

  public SplashViewModel_Factory(Provider<Context> appContextProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<EntropyUseCase> entropyUseCaseProvider, Provider<AppSettings> appSettingsProvider) {
    this.appContextProvider = appContextProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.entropyUseCaseProvider = entropyUseCaseProvider;
    this.appSettingsProvider = appSettingsProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(appContextProvider.get(), userRepositoryProvider.get(), entropyUseCaseProvider.get(), appSettingsProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<Context> appContextProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<EntropyUseCase> entropyUseCaseProvider, Provider<AppSettings> appSettingsProvider) {
    return new SplashViewModel_Factory(appContextProvider, userRepositoryProvider, entropyUseCaseProvider, appSettingsProvider);
  }

  public static SplashViewModel newInstance(Context appContext, UserRepository userRepository,
      EntropyUseCase entropyUseCase, AppSettings appSettings) {
    return new SplashViewModel(appContext, userRepository, entropyUseCase, appSettings);
  }
}
