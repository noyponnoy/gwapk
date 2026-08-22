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
public final class ApiExceptionInterceptor_Factory implements Factory<ApiExceptionInterceptor> {
  @Override
  public ApiExceptionInterceptor get() {
    return newInstance();
  }

  public static ApiExceptionInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiExceptionInterceptor newInstance() {
    return new ApiExceptionInterceptor();
  }

  private static final class InstanceHolder {
    static final ApiExceptionInterceptor_Factory INSTANCE = new ApiExceptionInterceptor_Factory();
  }
}
