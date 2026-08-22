package com.witvpn.ikev2.presentation.utils.connectivity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider;", "", "subscribe", "", "getNetworkState", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "NetworkState", "Companion", "GreyWebVPN-3.0.8 [278]_debug"})
public abstract interface ConnectivityProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.Companion Companion = null;
    
    public abstract void subscribe();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState getNetworkState();
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider createProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$Companion;", "", "<init>", "()V", "createProvider", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider;", "context", "Landroid/content/Context;", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider createProvider(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "", "<init>", "()V", "NotConnectedState", "ConnectedState", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$NotConnectedState;", "GreyWebVPN-3.0.8 [278]_debug"})
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "CanBeParameter"})
    public static abstract class NetworkState {
        
        private NetworkState() {
            super();
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "hasInternet", "", "<init>", "(Z)V", "getHasInternet", "()Z", "Connected", "ConnectedLegacy", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState$Connected;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState$ConnectedLegacy;", "GreyWebVPN-3.0.8 [278]_debug"})
        public static abstract class ConnectedState extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState {
            private final boolean hasInternet = false;
            
            private ConnectedState(boolean hasInternet) {
            }
            
            public final boolean getHasInternet() {
                return false;
            }
            
            @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState$Connected;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState;", "capabilities", "Landroid/net/NetworkCapabilities;", "<init>", "(Landroid/net/NetworkCapabilities;)V", "getCapabilities", "()Landroid/net/NetworkCapabilities;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "GreyWebVPN-3.0.8 [278]_debug"})
            @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
            public static final class Connected extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState.ConnectedState {
                @org.jetbrains.annotations.NotNull()
                private final android.net.NetworkCapabilities capabilities = null;
                
                public Connected(@org.jetbrains.annotations.NotNull()
                android.net.NetworkCapabilities capabilities) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkCapabilities getCapabilities() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkCapabilities component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState.ConnectedState.Connected copy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkCapabilities capabilities) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                @org.jetbrains.annotations.NotNull()
                public java.lang.String toString() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState$ConnectedLegacy;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$ConnectedState;", "networkInfo", "Landroid/net/NetworkInfo;", "<init>", "(Landroid/net/NetworkInfo;)V", "getNetworkInfo", "()Landroid/net/NetworkInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "GreyWebVPN-3.0.8 [278]_debug"})
            @kotlin.Suppress(names = {"DEPRECATION"})
            public static final class ConnectedLegacy extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState.ConnectedState {
                @org.jetbrains.annotations.NotNull()
                private final android.net.NetworkInfo networkInfo = null;
                
                public ConnectedLegacy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkInfo networkInfo) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkInfo getNetworkInfo() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkInfo component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState.ConnectedState.ConnectedLegacy copy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkInfo networkInfo) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                @org.jetbrains.annotations.NotNull()
                public java.lang.String toString() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState$NotConnectedState;", "Lcom/witvpn/ikev2/presentation/utils/connectivity/ConnectivityProvider$NetworkState;", "<init>", "()V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class NotConnectedState extends com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState {
            @org.jetbrains.annotations.NotNull()
            public static final com.witvpn.ikev2.presentation.utils.connectivity.ConnectivityProvider.NetworkState.NotConnectedState INSTANCE = null;
            
            private NotConnectedState() {
            }
        }
    }
}