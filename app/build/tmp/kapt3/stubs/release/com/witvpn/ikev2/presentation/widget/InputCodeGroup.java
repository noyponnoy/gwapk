package com.witvpn.ikev2.presentation.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001f"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/InputCodeGroup;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/witvpn/ikev2/databinding/ViewInputCodeGroupBinding;", "value", "", "error", "getError", "()Z", "setError", "(Z)V", "inputCodes", "", "Lcom/witvpn/ikev2/presentation/widget/InputCode;", "onInputOTPCodeCompleted", "Lkotlin/Function1;", "", "", "getOnInputOTPCodeCompleted", "()Lkotlin/jvm/functions/Function1;", "setOnInputOTPCodeCompleted", "(Lkotlin/jvm/functions/Function1;)V", "onFinishInflate", "getEditText", "Landroid/widget/EditText;", "GreyWebVPN-3.0.8 [278]_release"})
public final class InputCodeGroup extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private com.witvpn.ikev2.databinding.ViewInputCodeGroupBinding binding;
    private boolean error = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.witvpn.ikev2.presentation.widget.InputCode> inputCodes = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onInputOTPCodeCompleted;
    
    public InputCodeGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final boolean getError() {
        return false;
    }
    
    public final void setError(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnInputOTPCodeCompleted() {
        return null;
    }
    
    public final void setOnInputOTPCodeCompleted(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEditText() {
        return null;
    }
}