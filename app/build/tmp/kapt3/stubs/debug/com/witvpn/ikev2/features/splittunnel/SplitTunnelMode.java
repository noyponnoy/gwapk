package com.witvpn.ikev2.features.splittunnel;

/**
 * Split Tunneling operating mode.
 *
 * [OFF] — the feature is disabled, every application is routed through the
 * VPN tunnel. This is the default for fresh installs.
 * [ONLY_SELECTED] — only the applications the user ticked are routed through
 * the tunnel, everything else connects directly.
 * [EXCEPT_SELECTED] — every application is routed through the tunnel except
 * the ones the user ticked.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/features/splittunnel/SplitTunnelMode;", "", "prefValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPrefValue", "()Ljava/lang/String;", "OFF", "ONLY_SELECTED", "EXCEPT_SELECTED", "Companion", "GreyWebVPN-3.0.8 [278]_debug"})
public enum SplitTunnelMode {
    /*public static final*/ OFF /* = new OFF(null) */,
    /*public static final*/ ONLY_SELECTED /* = new ONLY_SELECTED(null) */,
    /*public static final*/ EXCEPT_SELECTED /* = new EXCEPT_SELECTED(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefValue = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.features.splittunnel.SplitTunnelMode.Companion Companion = null;
    
    SplitTunnelMode(java.lang.String prefValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefValue() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.Nullable()
    public static final com.witvpn.ikev2.features.splittunnel.SplitTunnelMode fromPrefValue(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.witvpn.ikev2.features.splittunnel.SplitTunnelMode> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/features/splittunnel/SplitTunnelMode$Companion;", "", "<init>", "()V", "fromPrefValue", "Lcom/witvpn/ikev2/features/splittunnel/SplitTunnelMode;", "value", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.Nullable()
        public final com.witvpn.ikev2.features.splittunnel.SplitTunnelMode fromPrefValue(@org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
    }
}