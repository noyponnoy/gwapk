package com.witvpn.ikev2.presentation;

import com.witvpn.ikev2.presentation.di.LocalSourceModule;
import com.witvpn.ikev2.presentation.di.RemoteSourceModule;
import com.witvpn.ikev2.presentation.di.RepositoryModule;
import com.witvpn.ikev2.presentation.di.UseCaseModule;
import com.witvpn.ikev2.presentation.ui.MainActivity_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.MainTabFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.ShareViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.billing.BillingFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.billing.BillingViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.connect.ConnectFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.connect.ConnectViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.entropy.MnemonicViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.forgotpassword.ForgotPasswordFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.newpassword.NewPasswordViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.otp.ConfirmOTPViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.otp.OTPFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.otp.OTPViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.profile.ProfileFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.profile.ProfileViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.qr.QRFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.qr.QRViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.restoreAccount.RestoreFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.servers.ServersFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.servers.ServersViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.servers.tab.TabFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.splash.SplashFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.splash.SplashViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel_HiltModules;
import com.witvpn.ikev2.presentation.ui.support.SupportFragment_GeneratedInjector;
import com.witvpn.ikev2.presentation.ui.vless.VlessServersBottomSheet_GeneratedInjector;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;
import org.strongswan.android.logic.VpnStateService_GeneratedInjector;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class MyApp_HiltComponents {
  private MyApp_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApplicationContextModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          LocalSourceModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          RemoteSourceModule.class,
          RepositoryModule.class,
          UseCaseModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements MyApp_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent,
      VpnStateService_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          BillingViewModel_HiltModules.KeyModule.class,
          ConfirmOTPViewModel_HiltModules.KeyModule.class,
          ConnectViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HiltWrapper_SavedStateHandleModule.class,
          MnemonicViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          NewPasswordViewModel_HiltModules.KeyModule.class,
          OTPViewModel_HiltModules.KeyModule.class,
          ProfileViewModel_HiltModules.KeyModule.class,
          QRViewModel_HiltModules.KeyModule.class,
          ServersViewModel_HiltModules.KeyModule.class,
          ShareViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class,
          SplitTunnelViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          BillingViewModel_HiltModules.BindsModule.class,
          ConfirmOTPViewModel_HiltModules.BindsModule.class,
          ConnectViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          MnemonicViewModel_HiltModules.BindsModule.class,
          NewPasswordViewModel_HiltModules.BindsModule.class,
          OTPViewModel_HiltModules.BindsModule.class,
          ProfileViewModel_HiltModules.BindsModule.class,
          QRViewModel_HiltModules.BindsModule.class,
          ServersViewModel_HiltModules.BindsModule.class,
          ShareViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class,
          SplitTunnelViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements MainTabFragment_GeneratedInjector,
      BillingFragment_GeneratedInjector,
      ConnectFragment_GeneratedInjector,
      MnemonicFragment_GeneratedInjector,
      ForgotPasswordFragment_GeneratedInjector,
      NewPasswordFragment_GeneratedInjector,
      ConfirmOTPFragment_GeneratedInjector,
      OTPFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      QRFragment_GeneratedInjector,
      RestoreFragment_GeneratedInjector,
      ServersFragment_GeneratedInjector,
      TabFragment_GeneratedInjector,
      SplashFragment_GeneratedInjector,
      SplitTunnelFragment_GeneratedInjector,
      SupportFragment_GeneratedInjector,
      VlessServersBottomSheet_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
