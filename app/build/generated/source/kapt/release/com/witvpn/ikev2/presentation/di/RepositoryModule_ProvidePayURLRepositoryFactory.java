package com.witvpn.ikev2.presentation.di;

import com.witvpn.ikev2.data.repository.PayRepositoryImpl;
import com.witvpn.ikev2.domain.repository.PayRepository;
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
public final class RepositoryModule_ProvidePayURLRepositoryFactory implements Factory<PayRepository> {
  private final Provider<PayRepositoryImpl> payRepositoryProvider;

  public RepositoryModule_ProvidePayURLRepositoryFactory(
      Provider<PayRepositoryImpl> payRepositoryProvider) {
    this.payRepositoryProvider = payRepositoryProvider;
  }

  @Override
  public PayRepository get() {
    return providePayURLRepository(payRepositoryProvider.get());
  }

  public static RepositoryModule_ProvidePayURLRepositoryFactory create(
      Provider<PayRepositoryImpl> payRepositoryProvider) {
    return new RepositoryModule_ProvidePayURLRepositoryFactory(payRepositoryProvider);
  }

  public static PayRepository providePayURLRepository(PayRepositoryImpl payRepository) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providePayURLRepository(payRepository));
  }
}
