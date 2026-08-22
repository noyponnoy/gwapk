package com.witvpn.ikev2.presentation.ui.splittunnel;

/**
 * Split Tunneling screen. The user picks one of three modes:
 * - Off — every application is routed through the VPN tunnel (default);
 * - Only selected — only the ticked applications use the tunnel;
 * - All except selected — the ticked applications bypass the tunnel.
 *
 * The choice is persisted in [com.witvpn.ikev2.features.splittunnel.SplitTunnelStore]
 * and is applied by every VPN backend (IKEv2, VLESS/Hysteria2, AmneziaWG) on the
 * next tunnel establishment.
 *
 * Expanded (full-screen list) UX: the header block (title, description, mode
 * card) can be collapsed so the app list takes the whole screen. The state is
 * entered automatically when the user starts scrolling the list or focuses
 * the search field, and is left explicitly — via the back arrow that appears
 * to the left of the search field or via the system Back gesture. Closing
 * the keyboard does NOT collapse the list back: the keyboard visibility and
 * the expanded state are independent, so after searching the user can hide
 * the keyboard and keep picking apps on the full screen.
 * See [initSearchUx] and [setExpanded].
 */
@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0003J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u001bH\u0002J\u0018\u0010\'\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelFragment;", "Lcom/witvpn/ikev2/presentation/base/BaseFragment;", "Lcom/witvpn/ikev2/databinding/FragmentSplitTunnelBinding;", "<init>", "()V", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelAppAdapter;", "radioInactiveTint", "Landroid/content/res/ColorStateList;", "imeVisible", "", "expanded", "backCallback", "Landroidx/activity/OnBackPressedCallback;", "keyboardWatcherRoot", "Landroid/view/View;", "keyboardWatcher", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "initBinding", "view", "initView", "", "initSearchUx", "onImeVisibleChanged", "visible", "setExpanded", "value", "animate", "exitExpandedState", "applyHeaderState", "dismissKeyboard", "initObserve", "render", "bindRadio", "Landroid/widget/ImageView;", "checked", "onResume", "onDestroyView", "Companion", "GreyWebVPN-3.0.8 [278]_debug"})
public final class SplitTunnelFragment extends com.witvpn.ikev2.presentation.base.BaseFragment<com.witvpn.ikev2.databinding.FragmentSplitTunnelBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelAppAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final android.content.res.ColorStateList radioInactiveTint = null;
    
    /**
     * Last known soft-keyboard visibility.
     */
    private boolean imeVisible = false;
    
    /**
     * Whether the screen is in the expanded (full-screen list) state: the
     * header is collapsed, the search row is pinned to the top with a back
     * arrow, and the system Back gesture collapses the state instead of
     * leaving the screen. Independent from [imeVisible] — hiding the
     * keyboard keeps the list full-screen.
     */
    private boolean expanded = false;
    
    /**
     * Consumes the system Back gesture while [expanded] is true.
     */
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.OnBackPressedCallback backCallback;
    
    /**
     * The view the keyboard watcher is attached to. Kept as a plain reference
     * because the binding is auto-cleared before onDestroyView() runs (see
     * AutoClearedValue) and the listener must still be detached there.
     */
    @org.jetbrains.annotations.Nullable()
    private android.view.View keyboardWatcherRoot;
    @org.jetbrains.annotations.Nullable()
    private android.view.ViewTreeObserver.OnGlobalLayoutListener keyboardWatcher;
    
    /**
     * Fraction of the window height that must be covered before the
     * overlap is treated as the keyboard. Small enough for compact
     * keyboards on tall screens, large enough to never confuse a
     * navigation bar (3-button included) with the IME.
     */
    private static final float IME_VISIBLE_FRACTION = 0.15F;
    
    /**
     * Duration of the header collapse/expand animation.
     */
    private static final long HEADER_TRANSITION_MS = 180L;
    @org.jetbrains.annotations.NotNull()
    private static final com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelFragment.Companion Companion = null;
    
    public SplitTunnelFragment() {
        super(0);
    }
    
    private final com.witvpn.ikev2.presentation.ui.splittunnel.SplitTunnelViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.witvpn.ikev2.databinding.FragmentSplitTunnelBinding initBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    /**
     * Keyboard- and scroll-aware behaviour of the search block:
     * 1. the root view absorbs the IME inset, so on edge-to-edge devices
     *    (Android 15+ / targetSdk 35, where adjustResize no longer resizes
     *    the window) the content shrinks instead of being covered;
     * 2. focusing the search field (or any keyboard appearance) switches
     *    the screen into the expanded state — the search field is pinned to
     *    the top and the list gets all the remaining space;
     * 3. the keyboard is dismissed by scrolling the list, tapping outside
     *    the search field, or pressing the IME search action — but the list
     *    stays full-screen; collapsing back is an explicit action (the back
     *    arrow next to the field or the system Back gesture). Tapping an app
     *    row keeps the keyboard: the user can tick several found apps in a
     *    row without re-opening it;
     * 4. starting to scroll the list on the normal screen also enters the
     *    expanded state, so browsing the full app catalog immediately gives
     *    the whole screen to the list.
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void initSearchUx() {
    }
    
    /**
     * Deduplicated IME visibility change; safe to call from any watcher.
     */
    private final void onImeVisibleChanged(boolean visible) {
    }
    
    /**
     * Switches the expanded (full-screen list) state. While expanded the
     * header block is hidden, the search row is pinned to the top with a
     * back arrow next to it, and the system Back gesture collapses the state
     * instead of leaving the screen.
     */
    private final void setExpanded(boolean value, boolean animate) {
    }
    
    /**
     * Leaves the full-screen list: closes the keyboard, restores the header.
     */
    private final void exitExpandedState() {
    }
    
    /**
     * Shows/hides the block above the search field. In the expanded state
     * the block is collapsed: the search row moves to the top of the visible
     * area (gaining a back arrow) and the app list below it takes the rest
     * of the space.
     */
    private final void applyHeaderState(boolean animate) {
    }
    
    private final void dismissKeyboard() {
    }
    
    @java.lang.Override()
    public void initObserve() {
    }
    
    /**
     * Single place that reconciles the whole screen with the current state
     * (mode, loading flag, filtered list). Keeping it in one function avoids
     * visibility races between individual observers, including right after a
     * configuration change when all observers re-fire in a row.
     */
    private final void render() {
    }
    
    private final void bindRadio(android.widget.ImageView view, boolean checked) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/splittunnel/SplitTunnelFragment$Companion;", "", "<init>", "()V", "IME_VISIBLE_FRACTION", "", "HEADER_TRANSITION_MS", "", "GreyWebVPN-3.0.8 [278]_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}