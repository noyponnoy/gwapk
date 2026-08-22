package com.witvpn.ikev2.features.splittunnel;

/**
 * Single source of truth for the Split Tunneling feature.
 *
 * Model: the user picks one of three [SplitTunnelMode]s. Each selection mode
 * keeps its own independent app list, so switching between "Only selected"
 * and "All except selected" never silently reinterprets the user's ticks:
 * - [SplitTunnelMode.EXCEPT_SELECTED] uses the legacy `bypass_packages` set
 *   (apps that go around the tunnel);
 * - [SplitTunnelMode.ONLY_SELECTED] uses the `only_packages` set (the only
 *   apps that go through the tunnel).
 *
 * Backends must not read the raw sets directly — they use the effective
 * routing API ([getEffectiveMode], [getDisallowedPackagesSorted],
 * [getAllowedPackagesSorted] and the installed-filtered variants), which
 * collapses degenerate states (an empty selection behaves exactly like
 * [SplitTunnelMode.OFF], so an empty "Only selected" list can never
 * accidentally capture the whole device, and the VPN app itself is never part
 * of an allow list).
 *
 * The state is persisted in its own SharedPreferences file. All VPN backends
 * (IKEv2/strongSwan, VLESS/Xray and AmneziaWG) read it at connect time, so
 * changes made while a tunnel is up take effect after the next reconnect
 * (the UI informs the user about that).
 *
 * Migration: builds that shipped before the mode selector only stored
 * `bypass_packages`. A non-empty legacy set was a deliberate user choice, so
 * it migrates to [SplitTunnelMode.EXCEPT_SELECTED]; otherwise the mode
 * defaults to [SplitTunnelMode.OFF].
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0005H\u0002J&\u0010%\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J$\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\f\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/witvpn/ikev2/features/splittunnel/SplitTunnelStore;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_MODE", "KEY_BYPASS_PACKAGES", "KEY_ONLY_PACKAGES", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getMode", "Lcom/witvpn/ikev2/features/splittunnel/SplitTunnelMode;", "setMode", "", "mode", "getSelectedPackages", "", "setSelected", "packageName", "selected", "", "prune", "installedPackages", "", "getEffectiveMode", "getDisallowedPackagesSorted", "Ljava/util/SortedSet;", "getAllowedPackagesSorted", "getInstalledDisallowedPackages", "getInstalledAllowedPackages", "allowedPackages", "readSet", "key", "writeSet", "packages", "filterInstalled", "GreyWebVPN-3.0.8 [278]_release"})
public final class SplitTunnelStore {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFS_NAME = "split_tunnel_prefs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_MODE = "mode";
    
    /**
     * Apps that bypass the tunnel in [SplitTunnelMode.EXCEPT_SELECTED] (legacy key).
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_BYPASS_PACKAGES = "bypass_packages";
    
    /**
     * Apps routed through the tunnel in [SplitTunnelMode.ONLY_SELECTED].
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_ONLY_PACKAGES = "only_packages";
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.features.splittunnel.SplitTunnelStore INSTANCE = null;
    
    private SplitTunnelStore() {
        super();
    }
    
    private final android.content.SharedPreferences prefs(android.content.Context context) {
        return null;
    }
    
    /**
     * The mode the user picked on the Split Tunneling screen.
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.features.splittunnel.SplitTunnelMode getMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.splittunnel.SplitTunnelMode mode) {
    }
    
    /**
     * The selection list backing the given mode; empty for [SplitTunnelMode.OFF].
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<java.lang.String> getSelectedPackages(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.splittunnel.SplitTunnelMode mode) {
        return null;
    }
    
    /**
     * Adds or removes a single package from the given mode's selection list.
     */
    @kotlin.jvm.JvmStatic()
    public static final void setSelected(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.features.splittunnel.SplitTunnelMode mode, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, boolean selected) {
    }
    
    /**
     * Drops packages that are no longer installed from both selection lists.
     * Called when the app list is (re)loaded so the stored sets do not
     * accumulate stale entries after uninstalls.
     */
    @kotlin.jvm.JvmStatic()
    public static final void prune(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> installedPackages) {
    }
    
    /**
     * The mode that must actually be applied to the tunnel. Degenerate states
     * collapse to [SplitTunnelMode.OFF]:
     * - an empty "Only selected" list would otherwise make Android route the
     *   whole device through the tunnel (an empty allow list means "all"),
     *   which is the opposite of what the user asked for;
     * - an empty "All except selected" list is simply equivalent to OFF.
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.features.splittunnel.SplitTunnelMode getEffectiveMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Packages that must go around the tunnel
     * (VpnService.Builder.addDisallowedApplication). Non-empty only when the
     * effective mode is [SplitTunnelMode.EXCEPT_SELECTED].
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.SortedSet<java.lang.String> getDisallowedPackagesSorted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * The only packages that must go through the tunnel
     * (VpnService.Builder.addAllowedApplication). Non-empty only when the
     * effective mode is [SplitTunnelMode.ONLY_SELECTED]. Never contains the
     * VPN app itself: our own traffic (config fetchers, the Xray/WireGuard
     * userspace engines) must stay outside the tunnel it creates.
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.SortedSet<java.lang.String> getAllowedPackagesSorted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Same as [getDisallowedPackagesSorted] but filtered to packages actually
     * resolvable right now. Backends that don't tolerate unknown package names
     * in addDisallowedApplication (AmneziaWG's GoBackend fails the whole
     * tunnel on NameNotFoundException) must use this variant.
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<java.lang.String> getInstalledDisallowedPackages(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Same as [getAllowedPackagesSorted] but filtered to installed packages.
     */
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<java.lang.String> getInstalledAllowedPackages(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.util.Set<java.lang.String> allowedPackages(android.content.Context context) {
        return null;
    }
    
    private final java.util.Set<java.lang.String> readSet(android.content.Context context, java.lang.String key) {
        return null;
    }
    
    private final void writeSet(android.content.Context context, java.lang.String key, java.util.Set<java.lang.String> packages) {
    }
    
    private final java.util.Set<java.lang.String> filterInstalled(android.content.Context context, java.util.Collection<java.lang.String> packages) {
        return null;
    }
}