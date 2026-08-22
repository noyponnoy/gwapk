package com.witvpn.ikev2.presentation.ui.connect;

import android.content.Context;
import com.witvpn.ikev2.data.AppSettings;
import com.witvpn.ikev2.domain.repository.UserRepository;
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
public final class ConnectViewModel_Factory implements Factory<ConnectViewModel> {
  private final Provider<Context> contextAppProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<AppSettings> appSettingsProvider;

  public ConnectViewModel_Factory(Provider<Context> contextAppProvider,
      Provider<UserRepository> userRepositoryProvider, Provider<AppSettings> appSettingsProvider) {
    this.contextAppProvider = contextAppProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.appSettingsProvider = appSettingsProvider;
  }

  @Override
  public ConnectViewModel get() {
    return newInstance(contextAppProvider.get(), userRepositoryProvider.get(), appSettingsProvider.get());
  }

  public static ConnectViewModel_Factory create(Provider<Context> contextAppProvider,
      Provider<UserRepository> userRepositoryProvider, Provider<AppSettings> appSettingsProvider) {
    return new ConnectViewModel_Factory(contextAppProvider, userRepositoryProvider, appSettingsProvider);
  }

  public static ConnectViewModel newInstance(Context contextApp, UserRepository userRepository,
      AppSettings appSettings) {
    return new ConnectViewModel(contextApp, userRepository, appSettings);
  }
}
