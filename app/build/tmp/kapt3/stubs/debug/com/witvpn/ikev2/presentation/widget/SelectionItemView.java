package com.witvpn.ikev2.presentation.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002)*B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"J\u0015\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020(R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/SelectionItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/witvpn/ikev2/databinding/ItemLocationBinding;", "initAttrs", "", "setFlag", "icon", "Landroid/graphics/drawable/Drawable;", "resId", "", "setTitle", "title", "", "leadingIconRes", "setDescription", "description", "setEndAction", "ordinal", "setPrice", "price", "setSelected", "selected", "", "purchase", "initWith", "setState", "server", "Lcom/witvpn/ikev2/domain/model/Server;", "setLoadPercentage", "percent", "(Ljava/lang/Integer;)V", "setStatus", "status", "Lcom/witvpn/ikev2/presentation/widget/SelectionItemView$Status;", "Companion", "Status", "GreyWebVPN-3.0.8 [278]_debug"})
public final class SelectionItemView extends android.widget.RelativeLayout {
    public static final int ACTION_CHECK_BOX = 0;
    public static final int ACTION_PREMIUM = 1;
    public static final int ACTION_ARROW = 2;
    public static final int ACTION_CHECK = 3;
    @org.jetbrains.annotations.NotNull()
    private com.witvpn.ikev2.databinding.ItemLocationBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.widget.SelectionItemView.Companion Companion = null;
    
    public SelectionItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void setFlag(android.graphics.drawable.Drawable icon) {
    }
    
    public final void setFlag(int resId) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    /**
     * Заголовок; опционально маленькая иконка слева от текста
     * (размер ≈ textSize * 1.12 — чуть больше текста ~12%).
     */
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @androidx.annotation.DrawableRes()
    int leadingIconRes) {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String description) {
    }
    
    public final void setEndAction(int ordinal) {
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String price) {
    }
    
    @java.lang.Override()
    public void setSelected(boolean selected) {
    }
    
    public final void purchase() {
    }
    
    public final void initWith(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.model.Server server) {
    }
    
    public final void setLoadPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer percent) {
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.presentation.widget.SelectionItemView.Status status) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/SelectionItemView$Companion;", "", "<init>", "()V", "ACTION_CHECK_BOX", "", "ACTION_PREMIUM", "ACTION_ARROW", "ACTION_CHECK", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/SelectionItemView$Status;", "", "<init>", "(Ljava/lang/String;I)V", "UNLOCKED", "LOCKED", "SELECTED", "GreyWebVPN-3.0.8 [278]_debug"})
    public static enum Status {
        /*public static final*/ UNLOCKED /* = new UNLOCKED() */,
        /*public static final*/ LOCKED /* = new LOCKED() */,
        /*public static final*/ SELECTED /* = new SELECTED() */;
        
        Status() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.witvpn.ikev2.presentation.widget.SelectionItemView.Status> getEntries() {
            return null;
        }
    }
}