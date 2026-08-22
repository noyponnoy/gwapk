package com.witvpn.ikev2.presentation;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.witvpn.ikev2.data.AppSettings;
import com.witvpn.ikev2.data.remote.ApiService;
import com.witvpn.ikev2.data.repository.PayRepositoryImpl;
import com.witvpn.ikev2.data.repository.PayRepositoryImpl_Factory;
import com.witvpn.ikev2.data.repository.PayRepositoryImpl_MembersInjector;
import com.witvpn.ikev2.data.repository.ServerRepositoryImpl;
import com.witvpn.ikev2.data.repository.UserRepositoryImpl;
import com.witvpn.ikev2.data.repository.UserRepositoryImpl_Factory;
import com.witvpn.ikev2.data.repository.UserRepositoryImpl_MembersInjector;
import com.witvpn.ikev2.domain.repository.PayRepository;
import com.witvpn.ikev2.domain.repository.ServerRepository;
import com.witvpn.ikev2.domain.repository.UserRepository;
import com.witvpn.ikev2.features.entropy.EntropyUseCase;
import com.witvpn.ikev2.presentation.di.LocalSourceModule_ProvideAppSettingsFactory;
import com.witvpn.ikev2.presentation.di.LocalSourceModule_ProvideAppSharedPreferencesFactory;
import com.witvpn.ikev2.presentation.di.LocalSourceModule_ProvideVpnProfileDataSourceFactory;
import com.witvpn.ikev2.presentation.di.RemoteSourceModule_ProvideApiServiceFactory;
import com.witvpn.ikev2.presentation.di.RemoteSourceModule_ProvideGsonFactory;
import com.witvpn.ikev2.presentation.di.RemoteSourceModule_ProvideHttpLoggingInterceptorFactory;
import com.witvpn.ikev2.presentation.di.RemoteSourceModule_ProvideRetrofitFactory;
import com.witvpn.ikev2.presentation.di.RepositoryModule_ProvidePayURLRepositoryFactory;
import com.witvpn.ikev2.presentation.di.RepositoryModule_ProvideServerRepositoryFactory;
import com.witvpn.ikev2.presentation.di.RepositoryModule_ProvideUserRepositoryFactory;
import com.witvpn.ikev2.presentation.di.UseCaseModule_ProvideEntropyUseCaseFactory;
import com.witvpn.ikev2.presentation.ui.MainActivity;
import com.witvpn.ikev2.presentation.ui.MainActivity_MembersInjector;
import com.witvpn.ikev2.presentation.ui.MainTabFragment;
import com.witvpn.ikev2.presentation.ui.ShareViewModel;
import com.witvpn.ikev2.presentation.ui.ShareViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.ShareViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.ShareViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.billing.BillingFragment;
import com.witvpn.ikev2.presentation.ui.billing.BillingViewModel;
import com.witvpn.ikev2.presentation.ui.billing.BillingViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.billing.BillingViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.billing.BillingViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.connect.ConnectFragment;
import com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel;
import com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicFragment;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.forgotpassword.ForgotPasswordFragment;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordFragment;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPFragment;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.otp.OTPFragment;
import com.witvpn.ikev2.presentation.ui.otp.OTPViewModel;
import com.witvpn.ikev2.presentation.ui.otp.OTPViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.otp.OTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.otp.OTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.profile.ProfileFragment;
import com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel;
import com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.qr.QRFragment;
import com.witvpn.ikev2.presentation.ui.qr.QRViewModel;
import com.witvpn.ikev2.presentation.ui.qr.QRViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.qr.QRViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.qr.QRViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.restoreAccount.RestoreFragment;
import com.witvpn.ikev2.presentation.ui.servers.ServersFragment;
import com.witvpn.ikev2.presentation.ui.servers.ServersViewModel;
import com.witvpn.ikev2.presentation.ui.servers.ServersViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.servers.ServersViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.servers.ServersViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.servers.tab.TabFragment;
import com.witvpn.ikev2.presentation.ui.splash.SplashFragment;
import com.witvpn.ikev2.presentation.ui.splash.SplashViewModel;
import com.witvpn.ikev2.presentation.ui.splash.SplashViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.splash.SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.splash.SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelFragment;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.witvpn.ikev2.presentation.ui.support.SupportFragment;
import com.witvpn.ikev2.presentation.ui.vless.VlessServersBottomSheet;
import com.witvpn.ikev2.presentation.utils.interceptor.ApiExceptionInterceptor;
import com.witvpn.ikev2.presentation.utils.interceptor.ModifyRequestInterceptor;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import okhttp3.logging.HttpLoggingInterceptor;
import org.strongswan.android.data.VpnProfileDataSource;
import org.strongswan.android.logic.VpnStateService;
import retrofit2.Retrofit;

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
public final class DaggerMyApp_HiltComponents_SingletonC {
  private DaggerMyApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MyApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements MyApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MyApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MyApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MyApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MyApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MyApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements MyApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MyApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MyApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectMainTabFragment(MainTabFragment arg0) {
    }

    @Override
    public void injectBillingFragment(BillingFragment arg0) {
    }

    @Override
    public void injectConnectFragment(ConnectFragment arg0) {
    }

    @Override
    public void injectMnemonicFragment(MnemonicFragment arg0) {
    }

    @Override
    public void injectForgotPasswordFragment(ForgotPasswordFragment arg0) {
    }

    @Override
    public void injectNewPasswordFragment(NewPasswordFragment arg0) {
    }

    @Override
    public void injectConfirmOTPFragment(ConfirmOTPFragment arg0) {
    }

    @Override
    public void injectOTPFragment(OTPFragment arg0) {
    }

    @Override
    public void injectProfileFragment(ProfileFragment arg0) {
    }

    @Override
    public void injectQRFragment(QRFragment arg0) {
    }

    @Override
    public void injectRestoreFragment(RestoreFragment arg0) {
    }

    @Override
    public void injectServersFragment(ServersFragment arg0) {
    }

    @Override
    public void injectTabFragment(TabFragment arg0) {
    }

    @Override
    public void injectSplashFragment(SplashFragment arg0) {
    }

    @Override
    public void injectSplitTunnelFragment(SplitTunnelFragment arg0) {
    }

    @Override
    public void injectSupportFragment(SupportFragment arg0) {
    }

    @Override
    public void injectVlessServersBottomSheet(VlessServersBottomSheet arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MyApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MyApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
      injectMainActivity2(arg0);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(ImmutableMap.<String, Boolean>builderWithExpectedSize(12).put(BillingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, BillingViewModel_HiltModules.KeyModule.provide()).put(ConfirmOTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ConfirmOTPViewModel_HiltModules.KeyModule.provide()).put(ConnectViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ConnectViewModel_HiltModules.KeyModule.provide()).put(MnemonicViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, MnemonicViewModel_HiltModules.KeyModule.provide()).put(NewPasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, NewPasswordViewModel_HiltModules.KeyModule.provide()).put(OTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, OTPViewModel_HiltModules.KeyModule.provide()).put(ProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ProfileViewModel_HiltModules.KeyModule.provide()).put(QRViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, QRViewModel_HiltModules.KeyModule.provide()).put(ServersViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ServersViewModel_HiltModules.KeyModule.provide()).put(ShareViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ShareViewModel_HiltModules.KeyModule.provide()).put(SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SplashViewModel_HiltModules.KeyModule.provide()).put(SplitTunnelViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SplitTunnelViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectUserRepository(instance, singletonCImpl.provideUserRepositoryProvider.get());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends MyApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<BillingViewModel> billingViewModelProvider;

    Provider<ConfirmOTPViewModel> confirmOTPViewModelProvider;

    Provider<ConnectViewModel> connectViewModelProvider;

    Provider<MnemonicViewModel> mnemonicViewModelProvider;

    Provider<NewPasswordViewModel> newPasswordViewModelProvider;

    Provider<OTPViewModel> oTPViewModelProvider;

    Provider<ProfileViewModel> profileViewModelProvider;

    Provider<QRViewModel> qRViewModelProvider;

    Provider<ServersViewModel> serversViewModelProvider;

    Provider<ShareViewModel> shareViewModelProvider;

    Provider<SplashViewModel> splashViewModelProvider;

    Provider<SplitTunnelViewModel> splitTunnelViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.billingViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.confirmOTPViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.connectViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.mnemonicViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.newPasswordViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.oTPViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.profileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.qRViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.serversViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.shareViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 10);
      this.splitTunnelViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 11);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(ImmutableMap.<String, javax.inject.Provider<ViewModel>>builderWithExpectedSize(12).put(BillingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (billingViewModelProvider))).put(ConfirmOTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (confirmOTPViewModelProvider))).put(ConnectViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (connectViewModelProvider))).put(MnemonicViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (mnemonicViewModelProvider))).put(NewPasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (newPasswordViewModelProvider))).put(OTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (oTPViewModelProvider))).put(ProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (profileViewModelProvider))).put(QRViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (qRViewModelProvider))).put(ServersViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (serversViewModelProvider))).put(ShareViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (shareViewModelProvider))).put(SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (splashViewModelProvider))).put(SplitTunnelViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (splitTunnelViewModelProvider))).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return ImmutableMap.<Class<?>, Object>of();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.witvpn.ikev2.presentation.ui.billing.BillingViewModel
          return (T) new BillingViewModel(singletonCImpl.providePayURLRepositoryProvider.get(), singletonCImpl.provideUserRepositoryProvider.get());

          case 1: // com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel
          return (T) new ConfirmOTPViewModel(singletonCImpl.provideUserRepositoryProvider.get());

          case 2: // com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel
          return (T) new ConnectViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideUserRepositoryProvider.get(), singletonCImpl.provideAppSettingsProvider.get());

          case 3: // com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel
          return (T) new MnemonicViewModel(singletonCImpl.provideEntropyUseCaseProvider.get(), singletonCImpl.provideUserRepositoryProvider.get());

          case 4: // com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel
          return (T) new NewPasswordViewModel();

          case 5: // com.witvpn.ikev2.presentation.ui.otp.OTPViewModel
          return (T) new OTPViewModel(singletonCImpl.provideEntropyUseCaseProvider.get(), singletonCImpl.provideAppSettingsProvider.get());

          case 6: // com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel
          return (T) new ProfileViewModel(singletonCImpl.provideEntropyUseCaseProvider.get());

          case 7: // com.witvpn.ikev2.presentation.ui.qr.QRViewModel
          return (T) new QRViewModel(singletonCImpl.provideEntropyUseCaseProvider.get());

          case 8: // com.witvpn.ikev2.presentation.ui.servers.ServersViewModel
          return (T) new ServersViewModel(singletonCImpl.provideServerRepositoryProvider.get());

          case 9: // com.witvpn.ikev2.presentation.ui.ShareViewModel
          return (T) new ShareViewModel(singletonCImpl.provideVpnProfileDataSourceProvider.get(), singletonCImpl.provideUserRepositoryProvider.get(), singletonCImpl.provideServerRepositoryProvider.get());

          case 10: // com.witvpn.ikev2.presentation.ui.splash.SplashViewModel
          return (T) new SplashViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideUserRepositoryProvider.get(), singletonCImpl.provideEntropyUseCaseProvider.get(), singletonCImpl.provideAppSettingsProvider.get());

          case 11: // com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel
          return (T) new SplitTunnelViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MyApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MyApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }

    @Override
    public void injectVpnStateService(VpnStateService arg0) {
    }
  }

  private static final class SingletonCImpl extends MyApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<Gson> provideGsonProvider;

    Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;

    Provider<Retrofit> provideRetrofitProvider;

    Provider<ApiService> provideApiServiceProvider;

    Provider<UserRepository> provideUserRepositoryProvider;

    Provider<PayRepository> providePayURLRepositoryProvider;

    Provider<SharedPreferences> provideAppSharedPreferencesProvider;

    Provider<AppSettings> provideAppSettingsProvider;

    Provider<EntropyUseCase> provideEntropyUseCaseProvider;

    Provider<ServerRepositoryImpl> serverRepositoryImplProvider;

    Provider<ServerRepository> provideServerRepositoryProvider;

    Provider<VpnProfileDataSource> provideVpnProfileDataSourceProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    UserRepositoryImpl userRepositoryImpl() {
      return injectUserRepositoryImpl(UserRepositoryImpl_Factory.newInstance());
    }

    PayRepositoryImpl payRepositoryImpl() {
      return injectPayRepositoryImpl(PayRepositoryImpl_Factory.newInstance());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideGsonProvider = DoubleCheck.provider(new SwitchingProvider<Gson>(singletonCImpl, 3));
      this.provideHttpLoggingInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<HttpLoggingInterceptor>(singletonCImpl, 4));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 2));
      this.provideApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<ApiService>(singletonCImpl, 1));
      this.provideUserRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<UserRepository>(singletonCImpl, 0));
      this.providePayURLRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<PayRepository>(singletonCImpl, 5));
      this.provideAppSharedPreferencesProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(singletonCImpl, 7));
      this.provideAppSettingsProvider = DoubleCheck.provider(new SwitchingProvider<AppSettings>(singletonCImpl, 6));
      this.provideEntropyUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<EntropyUseCase>(singletonCImpl, 8));
      this.serverRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<ServerRepositoryImpl>(singletonCImpl, 10));
      this.provideServerRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ServerRepository>(singletonCImpl, 9));
      this.provideVpnProfileDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<VpnProfileDataSource>(singletonCImpl, 11));
    }

    @Override
    public void injectMyApp(MyApp myApp) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @CanIgnoreReturnValue
    private UserRepositoryImpl injectUserRepositoryImpl(UserRepositoryImpl instance) {
      UserRepositoryImpl_MembersInjector.injectApiService(instance, provideApiServiceProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PayRepositoryImpl injectPayRepositoryImpl(PayRepositoryImpl instance2) {
      PayRepositoryImpl_MembersInjector.injectApiService(instance2, provideApiServiceProvider.get());
      return instance2;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.witvpn.ikev2.domain.repository.UserRepository
          return (T) RepositoryModule_ProvideUserRepositoryFactory.provideUserRepository(singletonCImpl.userRepositoryImpl());

          case 1: // com.witvpn.ikev2.data.remote.ApiService
          return (T) RemoteSourceModule_ProvideApiServiceFactory.provideApiService(singletonCImpl.provideRetrofitProvider.get());

          case 2: // retrofit2.Retrofit
          return (T) RemoteSourceModule_ProvideRetrofitFactory.provideRetrofit(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideGsonProvider.get(), singletonCImpl.provideHttpLoggingInterceptorProvider.get(), new ApiExceptionInterceptor(), new ModifyRequestInterceptor());

          case 3: // com.google.gson.Gson
          return (T) RemoteSourceModule_ProvideGsonFactory.provideGson();

          case 4: // okhttp3.logging.HttpLoggingInterceptor
          return (T) RemoteSourceModule_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor();

          case 5: // com.witvpn.ikev2.domain.repository.PayRepository
          return (T) RepositoryModule_ProvidePayURLRepositoryFactory.providePayURLRepository(singletonCImpl.payRepositoryImpl());

          case 6: // com.witvpn.ikev2.data.AppSettings
          return (T) LocalSourceModule_ProvideAppSettingsFactory.provideAppSettings(singletonCImpl.provideAppSharedPreferencesProvider.get());

          case 7: // android.content.SharedPreferences
          return (T) LocalSourceModule_ProvideAppSharedPreferencesFactory.provideAppSharedPreferences(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 8: // com.witvpn.ikev2.features.entropy.EntropyUseCase
          return (T) UseCaseModule_ProvideEntropyUseCaseFactory.provideEntropyUseCase(singletonCImpl.provideAppSettingsProvider.get());

          case 9: // com.witvpn.ikev2.domain.repository.ServerRepository
          return (T) RepositoryModule_ProvideServerRepositoryFactory.provideServerRepository(singletonCImpl.serverRepositoryImplProvider.get());

          case 10: // com.witvpn.ikev2.data.repository.ServerRepositoryImpl
          return (T) new ServerRepositoryImpl(singletonCImpl.provideApiServiceProvider.get());

          case 11: // org.strongswan.android.data.VpnProfileDataSource
          return (T) LocalSourceModule_ProvideVpnProfileDataSourceFactory.provideVpnProfileDataSource(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
