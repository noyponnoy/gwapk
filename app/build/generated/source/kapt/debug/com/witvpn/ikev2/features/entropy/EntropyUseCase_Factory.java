package com.witvpn.ikev2.features.entropy;

import com.witvpn.ikev2.data.AppSettings;
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
public final class EntropyUseCase_Factory implements Factory<EntropyUseCase> {
  private final Provider<AppSettings> appSettingsProvider;

  public EntropyUseCase_Factory(Provider<AppSettings> appSettingsProvider) {
    this.appSettingsProvider = appSettingsProvider;
  }

  @Override
  public EntropyUseCase get() {
    return newInstance(appSettingsProvider.get());
  }

  public static EntropyUseCase_Factory create(Provider<AppSettings> appSettingsProvider) {
    return new EntropyUseCase_Factory(appSettingsProvider);
  }

  public static EntropyUseCase newInstance(AppSettings appSettings) {
    return new EntropyUseCase(appSettings);
  }
}
