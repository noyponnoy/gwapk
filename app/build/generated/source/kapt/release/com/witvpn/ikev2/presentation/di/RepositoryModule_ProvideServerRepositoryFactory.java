package com.witvpn.ikev2.presentation.di;

import com.witvpn.ikev2.data.repository.ServerRepositoryImpl;
import com.witvpn.ikev2.domain.repository.ServerRepository;
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
public final class RepositoryModule_ProvideServerRepositoryFactory implements Factory<ServerRepository> {
  private final Provider<ServerRepositoryImpl> serverRepositoryImplProvider;

  public RepositoryModule_ProvideServerRepositoryFactory(
      Provider<ServerRepositoryImpl> serverRepositoryImplProvider) {
    this.serverRepositoryImplProvider = serverRepositoryImplProvider;
  }

  @Override
  public ServerRepository get() {
    return provideServerRepository(serverRepositoryImplProvider.get());
  }

  public static RepositoryModule_ProvideServerRepositoryFactory create(
      Provider<ServerRepositoryImpl> serverRepositoryImplProvider) {
    return new RepositoryModule_ProvideServerRepositoryFactory(serverRepositoryImplProvider);
  }

  public static ServerRepository provideServerRepository(
      ServerRepositoryImpl serverRepositoryImpl) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideServerRepository(serverRepositoryImpl));
  }
}
