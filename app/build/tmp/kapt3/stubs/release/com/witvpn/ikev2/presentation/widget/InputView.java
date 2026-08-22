package com.witvpn.ikev2.presentation.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001f\u001a\u00020\u0010H\u0002J\u001c\u0010 \u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\u0012\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\fH\u0014J\b\u0010,\u001a\u00020\u0010H\u0016J\u0012\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0006\u00100\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00062"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/InputView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/witvpn/ikev2/databinding/ViewInputBinding;", "actionType", "", "onTextChanged", "Lkotlin/Function1;", "", "", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "setOnTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "text", "getText", "()Ljava/lang/String;", "value", "", "error", "getError", "()Z", "setError", "(Z)V", "initView", "initAttrs", "toggleIcon", "setLabel", "label", "setInputText", "inputType", "hint", "setIcon", "type", "onCreateDrawableState", "", "extraSpace", "clearFocus", "onClick", "p0", "Landroid/view/View;", "reset", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class InputView extends android.widget.RelativeLayout implements android.view.View.OnClickListener {
    public static final int ACTION_NONE = 0;
    public static final int ACTION_CANCEL = 1;
    public static final int ACTION_HINT = 2;
    @org.jetbrains.annotations.NotNull()
    private com.witvpn.ikev2.databinding.ViewInputBinding binding;
    private int actionType = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged;
    private boolean error = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.widget.InputView.Companion Companion = null;
    
    public InputView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnTextChanged() {
        return null;
    }
    
    public final void setOnTextChanged(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final boolean getError() {
        return false;
    }
    
    public final void setError(boolean value) {
    }
    
    private final void initView() {
    }
    
    private final void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void toggleIcon() {
    }
    
    private final void setLabel(java.lang.String label) {
    }
    
    private final void setInputText(int inputType, java.lang.String hint) {
    }
    
    private final void setIcon(int type) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    @java.lang.Override()
    public void clearFocus() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public final void reset() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/InputView$Companion;", "", "<init>", "()V", "ACTION_NONE", "", "ACTION_CANCEL", "ACTION_HINT", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}