package com.witvpn.ikev2.presentation.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010%\u001a\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\u0010\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u00a8\u0006+"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/AuthToolbar;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/witvpn/ikev2/databinding/LayoutAuthToolbarBinding;", "onBtnLeftClicked", "Lkotlin/Function0;", "", "getOnBtnLeftClicked", "()Lkotlin/jvm/functions/Function0;", "setOnBtnLeftClicked", "(Lkotlin/jvm/functions/Function0;)V", "onBtnRightClicked", "", "getOnBtnRightClicked", "setOnBtnRightClicked", "value", "Landroid/graphics/drawable/Drawable;", "leftIcon", "getLeftIcon", "()Landroid/graphics/drawable/Drawable;", "setLeftIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "rightText", "getRightText", "setRightText", "initAttrs", "initView", "handleBtnLeftClicked", "view", "Landroid/view/View;", "handleBtnRightClicked", "GreyWebVPN-3.0.8 [278]_debug"})
public final class AuthToolbar extends android.widget.RelativeLayout {
    @org.jetbrains.annotations.NotNull()
    private com.witvpn.ikev2.databinding.LayoutAuthToolbarBinding binding;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<java.lang.Boolean> onBtnLeftClicked;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onBtnRightClicked;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable leftIcon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rightText;
    
    public AuthToolbar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getOnBtnLeftClicked() {
        return null;
    }
    
    public final void setOnBtnLeftClicked(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBtnRightClicked() {
        return null;
    }
    
    public final void setOnBtnRightClicked(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getLeftIcon() {
        return null;
    }
    
    public final void setLeftIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRightText() {
        return null;
    }
    
    public final void setRightText(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    private final void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initView() {
    }
    
    private final void handleBtnLeftClicked(android.view.View view) {
    }
    
    private final void handleBtnRightClicked(android.view.View view) {
    }
}