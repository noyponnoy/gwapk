package com.witvpn.ikev2.presentation.ui.newpassword;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class NewPasswordViewModel_Factory implements Factory<NewPasswordViewModel> {
  @Override
  public NewPasswordViewModel get() {
    return newInstance();
  }

  public static NewPasswordViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewPasswordViewModel newInstance() {
    return new NewPasswordViewModel();
  }

  private static final class InstanceHolder {
    static final NewPasswordViewModel_Factory INSTANCE = new NewPasswordViewModel_Factory();
  }
}
