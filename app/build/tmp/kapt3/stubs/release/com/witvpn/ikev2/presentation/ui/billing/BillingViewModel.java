package com.witvpn.ikev2.presentation.ui.billing;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/billing/BillingViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "payRepo", "Lcom/witvpn/ikev2/domain/repository/PayRepository;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "<init>", "(Lcom/witvpn/ikev2/domain/repository/PayRepository;Lcom/witvpn/ikev2/domain/repository/UserRepository;)V", "needToUpdateUser", "", "goToPayPage", "", "fragment", "Lcom/witvpn/ikev2/presentation/ui/billing/BillingFragment;", "plan", "Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;", "onOneMonthClick", "onThreeMonthClick", "onSixMonthClick", "onResume", "onUserRefreshed", "Lkotlin/Function1;", "Lcom/witvpn/ikev2/domain/model/User;", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BillingViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.PayRepository payRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepository = null;
    private boolean needToUpdateUser = false;
    
    @javax.inject.Inject()
    public BillingViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.PayRepository payRepo, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepository) {
        super();
    }
    
    private final void goToPayPage(com.witvpn.ikev2.presentation.ui.billing.BillingFragment fragment, com.witvpn.ikev2.domain.repository.PayRepository.Plan plan) {
    }
    
    public final void onOneMonthClick(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.billing.BillingFragment fragment) {
    }
    
    public final void onThreeMonthClick(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.billing.BillingFragment fragment) {
    }
    
    public final void onSixMonthClick(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.billing.BillingFragment fragment) {
    }
    
    public final void onResume(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.ui.billing.BillingFragment fragment, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.domain.model.User, kotlin.Unit> onUserRefreshed) {
    }
}