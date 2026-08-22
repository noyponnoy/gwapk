package com.witvpn.ikev2.data;

import android.content.SharedPreferences;
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
public final class AppSettings_Factory implements Factory<AppSettings> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AppSettings_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public AppSettings get() {
    return newInstance(sharedPreferencesProvider.get());
  }

  public static AppSettings_Factory create(Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AppSettings_Factory(sharedPreferencesProvider);
  }

  public static AppSettings newInstance(SharedPreferences sharedPreferences) {
    return new AppSettings(sharedPreferences);
  }
}
