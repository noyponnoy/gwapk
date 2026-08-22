package com.witvpn.ikev2.presentation.ui;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(J\u0016\u00103\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(J\b\u00104\u001a\u00020\u001dH\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\b\u00106\u001a\u00020+H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/MainActivity;", "Lcom/witvpn/ikev2/presentation/base/BaseActivity;", "Lcom/witvpn/ikev2/databinding/ActivityMainBinding;", "Lcom/witvpn/ikev2/presentation/ui/MainDelegate;", "<init>", "()V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/ShareViewModel;", "viewModel$delegate", "handleUserResource", "Landroidx/lifecycle/Observer;", "Lcom/witvpn/ikev2/domain/model/User;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "getUserRepository", "()Lcom/witvpn/ikev2/domain/repository/UserRepository;", "setUserRepository", "(Lcom/witvpn/ikev2/domain/repository/UserRepository;)V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "checkAndRequestNotificationPermissions", "initBinding", "configureButtomNavigation", "initView", "onResume", "calculateDaysLeft", "", "premiumEnd", "", "initAdmob", "refresh", "", "recreateApp", "showInterstitialAd", "telegramJoinIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "tg", "telegramUserIntent", "openLeftMenu", "closeLeftMenu", "isLeftMenuOpen", "GreyWebVPN-3.0.8 [278]_debug"})
public final class MainActivity extends com.witvpn.ikev2.presentation.base.BaseActivity<com.witvpn.ikev2.databinding.ActivityMainBinding> implements com.witvpn.ikev2.presentation.ui.MainDelegate {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navController$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.Observer<com.witvpn.ikev2.domain.model.User> handleUserResource = null;
    @javax.inject.Inject()
    public com.witvpn.ikev2.domain.repository.UserRepository userRepository;
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    
    public MainActivity() {
        super();
    }
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    private final com.witvpn.ikev2.presentation.ui.ShareViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.domain.repository.UserRepository getUserRepository() {
        return null;
    }
    
    public final void setUserRepository(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkAndRequestNotificationPermissions() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.ActivityMainBinding initBinding() {
        return null;
    }
    
    private final void configureButtomNavigation() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final int calculateDaysLeft(java.lang.String premiumEnd) {
        return 0;
    }
    
    private final void initAdmob(boolean refresh) {
    }
    
    @java.lang.Override()
    public void recreateApp() {
    }
    
    @java.lang.Override()
    public void showInterstitialAd() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent telegramJoinIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String tg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent telegramUserIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String tg) {
        return null;
    }
    
    @java.lang.Override()
    public void openLeftMenu() {
    }
    
    @java.lang.Override()
    public void closeLeftMenu() {
    }
    
    @java.lang.Override()
    public boolean isLeftMenuOpen() {
        return false;
    }
}