package com.witvpn.ikev2.presentation.ui.qr;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/qr/QRViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "entropyUseCase", "Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "<init>", "(Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/graphics/Bitmap;", "flow", "Lkotlinx/coroutines/flow/StateFlow;", "getFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getQRBitmap", "rsaEntropy", "", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class QRViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<android.graphics.Bitmap> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<android.graphics.Bitmap> flow = null;
    
    @javax.inject.Inject()
    public QRViewModel(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.entropy.EntropyUseCase entropyUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<android.graphics.Bitmap> getFlow() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    private final android.graphics.Bitmap getQRBitmap(java.lang.String rsaEntropy) {
        return null;
    }
}