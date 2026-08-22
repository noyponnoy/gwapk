package com.witvpn.ikev2.presentation.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.strongswan.android.data.VpnProfileDataSource;

@ScopeMetadata("javax.inject.Singleton")
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
public final class LocalSourceModule_ProvideVpnProfileDataSourceFactory implements Factory<VpnProfileDataSource> {
  private final Provider<Context> contextProvider;

  public LocalSourceModule_ProvideVpnProfileDataSourceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public VpnProfileDataSource get() {
    return provideVpnProfileDataSource(contextProvider.get());
  }

  public static LocalSourceModule_ProvideVpnProfileDataSourceFactory create(
      Provider<Context> contextProvider) {
    return new LocalSourceModule_ProvideVpnProfileDataSourceFactory(contextProvider);
  }

  public static VpnProfileDataSource provideVpnProfileDataSource(Context context) {
    return Preconditions.checkNotNullFromProvides(LocalSourceModule.INSTANCE.provideVpnProfileDataSource(context));
  }
}
