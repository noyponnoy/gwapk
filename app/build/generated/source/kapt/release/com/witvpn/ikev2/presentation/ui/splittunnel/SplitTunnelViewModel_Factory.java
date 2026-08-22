package com.witvpn.ikev2.presentation.ui.splittunnel;

import android.content.Context;
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
public final class SplitTunnelViewModel_Factory implements Factory<SplitTunnelViewModel> {
  private final Provider<Context> contextAppProvider;

  public SplitTunnelViewModel_Factory(Provider<Context> contextAppProvider) {
    this.contextAppProvider = contextAppProvider;
  }

  @Override
  public SplitTunnelViewModel get() {
    return newInstance(contextAppProvider.get());
  }

  public static SplitTunnelViewModel_Factory create(Provider<Context> contextAppProvider) {
    return new SplitTunnelViewModel_Factory(contextAppProvider);
  }

  public static SplitTunnelViewModel newInstance(Context contextApp) {
    return new SplitTunnelViewModel(contextApp);
  }
}
