package com.witvpn.ikev2.presentation.utils.interceptor;

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
public final class ModifyRequestInterceptor_Factory implements Factory<ModifyRequestInterceptor> {
  @Override
  public ModifyRequestInterceptor get() {
    return newInstance();
  }

  public static ModifyRequestInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ModifyRequestInterceptor newInstance() {
    return new ModifyRequestInterceptor();
  }

  private static final class InstanceHolder {
    static final ModifyRequestInterceptor_Factory INSTANCE = new ModifyRequestInterceptor_Factory();
  }
}
