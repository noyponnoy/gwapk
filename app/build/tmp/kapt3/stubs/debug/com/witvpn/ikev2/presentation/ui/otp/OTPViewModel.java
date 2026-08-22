package com.witvpn.ikev2.presentation.ui.otp;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/otp/OTPViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "entropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "appSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "<init>", "(Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;Lcom/witvpn/ikev2/data/AppSettings;)V", "getAppSettings", "()Lcom/witvpn/ikev2/data/AppSettings;", "clearEntropyData", "", "GreyWebVPN-3.0.8 [278]_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OTPViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.data.AppSettings appSettings = null;
    
    @javax.inject.Inject()
    public OTPViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.AppSettings appSettings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.data.AppSettings getAppSettings() {
        return null;
    }
    
    public final void clearEntropyData() {
    }
}