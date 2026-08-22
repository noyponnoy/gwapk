package com.witvpn.ikev2.presentation.di;

import android.content.SharedPreferences;
import com.witvpn.ikev2.data.AppSettings;
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
public final class LocalSourceModule_ProvideAppSettingsFactory implements Factory<AppSettings> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public LocalSourceModule_ProvideAppSettingsFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public AppSettings get() {
    return provideAppSettings(sharedPreferencesProvider.get());
  }

  public static LocalSourceModule_ProvideAppSettingsFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new LocalSourceModule_ProvideAppSettingsFactory(sharedPreferencesProvider);
  }

  public static AppSettings provideAppSettings(SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(LocalSourceModule.INSTANCE.provideAppSettings(sharedPreferences));
  }
}
