package com.witvpn.ikev2.presentation.di;

import com.witvpn.ikev2.data.AppSettings;
import com.witvpn.ikev2.features.entropy.EntropyUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvideEntropyUseCaseFactory implements Factory<EntropyUseCase> {
  private final Provider<AppSettings> appSettingsProvider;

  public UseCaseModule_ProvideEntropyUseCaseFactory(Provider<AppSettings> appSettingsProvider) {
    this.appSettingsProvider = appSettingsProvider;
  }

  @Override
  public EntropyUseCase get() {
    return provideEntropyUseCase(appSettingsProvider.get());
  }

  public static UseCaseModule_ProvideEntropyUseCaseFactory create(
      Provider<AppSettings> appSettingsProvider) {
    return new UseCaseModule_ProvideEntropyUseCaseFactory(appSettingsProvider);
  }

  public static EntropyUseCase provideEntropyUseCase(AppSettings appSettings) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideEntropyUseCase(appSettings));
  }
}
