package com.witvpn.ikev2.presentation.di;

import com.witvpn.ikev2.data.repository.UserRepositoryImpl;
import com.witvpn.ikev2.domain.repository.UserRepository;
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
public final class RepositoryModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final Provider<UserRepositoryImpl> userRepositoryImplProvider;

  public RepositoryModule_ProvideUserRepositoryFactory(
      Provider<UserRepositoryImpl> userRepositoryImplProvider) {
    this.userRepositoryImplProvider = userRepositoryImplProvider;
  }

  @Override
  public UserRepository get() {
    return provideUserRepository(userRepositoryImplProvider.get());
  }

  public static RepositoryModule_ProvideUserRepositoryFactory create(
      Provider<UserRepositoryImpl> userRepositoryImplProvider) {
    return new RepositoryModule_ProvideUserRepositoryFactory(userRepositoryImplProvider);
  }

  public static UserRepository provideUserRepository(UserRepositoryImpl userRepositoryImpl) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideUserRepository(userRepositoryImpl));
  }
}
