package com.witvpn.ikev2.presentation.widget.bottomnav;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002#$B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tabHome", "Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavItem;", "tabPremium", "tabProfile", "tabQR", "listener", "Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar$OnTabChangedListener;", "getListener", "()Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar$OnTabChangedListener;", "setListener", "(Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar$OnTabChangedListener;)V", "value", "", "currentTabSelected", "getCurrentTabSelected", "()I", "setCurrentTabSelected", "(I)V", "onFinishInflate", "", "onClick", "p0", "Landroid/view/View;", "toggle", "", "tabSelected", "Companion", "OnTabChangedListener", "GreyWebVPN-3.0.8 [278]_debug"})
public final class BottomNavBar extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public static final int TAB_HOME = 0;
    public static final int TAB_PREMIUM = 1;
    public static final int TAB_PROFILE = 2;
    public static final int TAB_SERVERS = 3;
    public static final int TAB_QR = 4;
    private com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavItem tabHome;
    private com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavItem tabPremium;
    private com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavItem tabProfile;
    private com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavItem tabQR;
    @org.jetbrains.annotations.Nullable()
    private com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavBar.OnTabChangedListener listener;
    private int currentTabSelected = -1;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavBar.Companion Companion = null;
    
    public BottomNavBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavBar.OnTabChangedListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.presentation.widget.bottomnav.BottomNavBar.OnTabChangedListener p0) {
    }
    
    public final int getCurrentTabSelected() {
        return 0;
    }
    
    public final void setCurrentTabSelected(int value) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    private final boolean toggle(int tabSelected) {
        return false;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar$Companion;", "", "<init>", "()V", "TAB_HOME", "", "TAB_PREMIUM", "TAB_PROFILE", "TAB_SERVERS", "TAB_QR", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/widget/bottomnav/BottomNavBar$OnTabChangedListener;", "", "changed", "", "tabIndex", "", "reSelected", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public static abstract interface OnTabChangedListener {
        
        public abstract boolean changed(int tabIndex);
        
        public abstract void reSelected(int tabIndex);
    }
}