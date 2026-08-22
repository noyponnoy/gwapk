package com.witvpn.ikev2.presentation.ui.qr;

import com.witvpn.ikev2.features.entropy.EntropyUseCase;
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
public final class QRViewModel_Factory implements Factory<QRViewModel> {
  private final Provider<EntropyUseCase> entropyUseCaseProvider;

  public QRViewModel_Factory(Provider<EntropyUseCase> entropyUseCaseProvider) {
    this.entropyUseCaseProvider = entropyUseCaseProvider;
  }

  @Override
  public QRViewModel get() {
    return newInstance(entropyUseCaseProvider.get());
  }

  public static QRViewModel_Factory create(Provider<EntropyUseCase> entropyUseCaseProvider) {
    return new QRViewModel_Factory(entropyUseCaseProvider);
  }

  public static QRViewModel newInstance(EntropyUseCase entropyUseCase) {
    return new QRViewModel(entropyUseCase);
  }
}
