package com.witvpn.ikev2.presentation.ui;

import com.witvpn.ikev2.domain.repository.ServerRepository;
import com.witvpn.ikev2.domain.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.strongswan.android.data.VpnProfileDataSource;

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
public final class ShareViewModel_Factory implements Factory<ShareViewModel> {
  private final Provider<VpnProfileDataSource> dataSourceProvider;

  private final Provider<UserRepository> userReposProvider;

  private final Provider<ServerRepository> serversProvider;

  public ShareViewModel_Factory(Provider<VpnProfileDataSource> dataSourceProvider,
      Provider<UserRepository> userReposProvider, Provider<ServerRepository> serversProvider) {
    this.dataSourceProvider = dataSourceProvider;
    this.userReposProvider = userReposProvider;
    this.serversProvider = serversProvider;
  }

  @Override
  public ShareViewModel get() {
    return newInstance(dataSourceProvider.get(), userReposProvider.get(), serversProvider.get());
  }

  public static ShareViewModel_Factory create(Provider<VpnProfileDataSource> dataSourceProvider,
      Provider<UserRepository> userReposProvider, Provider<ServerRepository> serversProvider) {
    return new ShareViewModel_Factory(dataSourceProvider, userReposProvider, serversProvider);
  }

  public static ShareViewModel newInstance(VpnProfileDataSource dataSource,
      UserRepository userRepos, ServerRepository servers) {
    return new ShareViewModel(dataSource, userRepos, servers);
  }
}
