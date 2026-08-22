package com.witvpn.ikev2.vless;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002J \u0010\u001d\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "parseSubscription", "", "Lcom/witvpn/ikev2/vless/VlessConfig;", "subscriptionData", "", "parseQuery", "", "uri", "Ljava/net/URI;", "urlDecode", "s", "parseVlessUrl", "url", "parseHysteria2Url", "toV2RayConfig", "config", "localSocksPort", "", "localHttpPort", "baseInbounds", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$InboundObject;", "directAndBlock", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$OutboundObject;", "toVlessConfig", "toHysteria2Config", "V2RayConfig", "GreyWebVPN-3.0.8 [278]_debug"})
public final class VlessParser {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.vless.VlessParser INSTANCE = null;
    
    private VlessParser() {
        super();
    }
    
    /**
     * Парсит base64-подписку: vless://, hysteria2://, hy2://
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.witvpn.ikev2.vless.VlessConfig> parseSubscription(@org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionData) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> parseQuery(java.net.URI uri) {
        return null;
    }
    
    private final java.lang.String urlDecode(java.lang.String s) {
        return null;
    }
    
    private final com.witvpn.ikev2.vless.VlessConfig parseVlessUrl(java.lang.String url) {
        return null;
    }
    
    /**
     * hysteria2://password@host:port/?sni=...&obfs=salamander&obfs-password=...
     * password в userInfo (как в официальном URI Hysteria2).
     */
    private final com.witvpn.ikev2.vless.VlessConfig parseHysteria2Url(java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toV2RayConfig(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.vless.VlessConfig config, int localSocksPort, int localHttpPort) {
        return null;
    }
    
    private final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.InboundObject> baseInbounds(int localSocksPort, int localHttpPort) {
        return null;
    }
    
    private final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.OutboundObject> directAndBlock() {
        return null;
    }
    
    private final java.lang.String toVlessConfig(com.witvpn.ikev2.vless.VlessConfig config, int localSocksPort, int localHttpPort) {
        return null;
    }
    
    /**
     * Xray outbound protocol "hysteria" + version 2 (Hysteria2).
     * Совместимо с libxray (xtls/xray-core proxy/hysteria).
     */
    private final java.lang.String toHysteria2Config(com.witvpn.ikev2.vless.VlessConfig config, int localSocksPort, int localHttpPort) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig;", "", "<init>", "()V", "log", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$LogObject;", "getLog", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$LogObject;", "setLog", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$LogObject;)V", "inbounds", "", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$InboundObject;", "getInbounds", "()Ljava/util/List;", "setInbounds", "(Ljava/util/List;)V", "outbounds", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$OutboundObject;", "getOutbounds", "setOutbounds", "LogObject", "InboundObject", "SocksInboundSettings", "OutboundObject", "VlessOutboundSettings", "HysteriaOutboundSettings", "FreedomOutboundSettings", "BlackholeOutboundSettings", "StreamSettingsObject", "HysteriaSettingsObject", "HysteriaObfsObject", "TlsSettingsObject", "RealitySettingsObject", "WsSettingsObject", "GrpcSettingsObject", "MuxObject", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class V2RayConfig {
        @org.jetbrains.annotations.Nullable()
        private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.LogObject log;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.InboundObject> inbounds;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.OutboundObject> outbounds;
        
        public V2RayConfig() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.LogObject getLog() {
            return null;
        }
        
        public final void setLog(@org.jetbrains.annotations.Nullable()
        com.witvpn.ikev2.vless.VlessParser.V2RayConfig.LogObject p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.InboundObject> getInbounds() {
            return null;
        }
        
        public final void setInbounds(@org.jetbrains.annotations.Nullable()
        java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.InboundObject> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.OutboundObject> getOutbounds() {
            return null;
        }
        
        public final void setOutbounds(@org.jetbrains.annotations.Nullable()
        java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.OutboundObject> p0) {
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$BlackholeOutboundSettings;", "", "<init>", "()V", "response", "getResponse", "()Ljava/lang/Object;", "setResponse", "(Ljava/lang/Object;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class BlackholeOutboundSettings {
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object response;
            
            public BlackholeOutboundSettings() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getResponse() {
                return null;
            }
            
            public final void setResponse(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$FreedomOutboundSettings;", "", "<init>", "()V", "domainStrategy", "", "getDomainStrategy", "()Ljava/lang/String;", "setDomainStrategy", "(Ljava/lang/String;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class FreedomOutboundSettings {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String domainStrategy = "AsIs";
            
            public FreedomOutboundSettings() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDomainStrategy() {
                return null;
            }
            
            public final void setDomainStrategy(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$GrpcSettingsObject;", "", "<init>", "()V", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "setServiceName", "(Ljava/lang/String;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class GrpcSettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String serviceName;
            
            public GrpcSettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getServiceName() {
                return null;
            }
            
            public final void setServiceName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaObfsObject;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class HysteriaObfsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String type;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String password;
            
            public HysteriaObfsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getType() {
                return null;
            }
            
            public final void setType(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPassword() {
                return null;
            }
            
            public final void setPassword(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        /**
         * settings для protocol=hysteria (Xray)
         */
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaOutboundSettings;", "", "<init>", "()V", "version", "", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "port", "getPort", "setPort", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class HysteriaOutboundSettings {
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer version = 2;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String address;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer port;
            
            public HysteriaOutboundSettings() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getVersion() {
                return null;
            }
            
            public final void setVersion(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAddress() {
                return null;
            }
            
            public final void setAddress(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPort() {
                return null;
            }
            
            public final void setPort(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaSettingsObject;", "", "<init>", "()V", "version", "", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "auth", "", "getAuth", "()Ljava/lang/String;", "setAuth", "(Ljava/lang/String;)V", "udpIdleTimeout", "getUdpIdleTimeout", "setUdpIdleTimeout", "obfs", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaObfsObject;", "getObfs", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaObfsObject;", "setObfs", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaObfsObject;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class HysteriaSettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer version = 2;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String auth;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer udpIdleTimeout = 60;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaObfsObject obfs;
            
            public HysteriaSettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getVersion() {
                return null;
            }
            
            public final void setVersion(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAuth() {
                return null;
            }
            
            public final void setAuth(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUdpIdleTimeout() {
                return null;
            }
            
            public final void setUdpIdleTimeout(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaObfsObject getObfs() {
                return null;
            }
            
            public final void setObfs(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaObfsObject p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$InboundObject;", "", "<init>", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "listen", "getListen", "setListen", "port", "", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol", "getProtocol", "setProtocol", "settings", "getSettings", "()Ljava/lang/Object;", "setSettings", "(Ljava/lang/Object;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class InboundObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String tag;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String listen;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer port;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String protocol;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object settings;
            
            public InboundObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTag() {
                return null;
            }
            
            public final void setTag(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getListen() {
                return null;
            }
            
            public final void setListen(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPort() {
                return null;
            }
            
            public final void setPort(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getProtocol() {
                return null;
            }
            
            public final void setProtocol(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSettings() {
                return null;
            }
            
            public final void setSettings(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$LogObject;", "", "<init>", "()V", "access", "", "getAccess", "()Ljava/lang/String;", "setAccess", "(Ljava/lang/String;)V", "error", "getError", "setError", "loglevel", "getLoglevel", "setLoglevel", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class LogObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String access;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String error;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String loglevel;
            
            public LogObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAccess() {
                return null;
            }
            
            public final void setAccess(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getError() {
                return null;
            }
            
            public final void setError(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLoglevel() {
                return null;
            }
            
            public final void setLoglevel(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$MuxObject;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "concurrency", "", "getConcurrency", "()Ljava/lang/Integer;", "setConcurrency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class MuxObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean enabled;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer concurrency;
            
            public MuxObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getEnabled() {
                return null;
            }
            
            public final void setEnabled(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getConcurrency() {
                return null;
            }
            
            public final void setConcurrency(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$OutboundObject;", "", "<init>", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "protocol", "getProtocol", "setProtocol", "settings", "getSettings", "()Ljava/lang/Object;", "setSettings", "(Ljava/lang/Object;)V", "streamSettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$StreamSettingsObject;", "getStreamSettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$StreamSettingsObject;", "setStreamSettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$StreamSettingsObject;)V", "mux", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$MuxObject;", "getMux", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$MuxObject;", "setMux", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$MuxObject;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class OutboundObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String tag;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String protocol;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object settings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.StreamSettingsObject streamSettings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.MuxObject mux;
            
            public OutboundObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTag() {
                return null;
            }
            
            public final void setTag(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getProtocol() {
                return null;
            }
            
            public final void setProtocol(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSettings() {
                return null;
            }
            
            public final void setSettings(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.StreamSettingsObject getStreamSettings() {
                return null;
            }
            
            public final void setStreamSettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.StreamSettingsObject p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.MuxObject getMux() {
                return null;
            }
            
            public final void setMux(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.MuxObject p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$RealitySettingsObject;", "", "<init>", "()V", "serverName", "", "getServerName", "()Ljava/lang/String;", "setServerName", "(Ljava/lang/String;)V", "publicKey", "getPublicKey", "setPublicKey", "shortId", "getShortId", "setShortId", "fingerprint", "getFingerprint", "setFingerprint", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class RealitySettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String serverName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String publicKey;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String shortId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fingerprint;
            
            public RealitySettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getServerName() {
                return null;
            }
            
            public final void setServerName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPublicKey() {
                return null;
            }
            
            public final void setPublicKey(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getShortId() {
                return null;
            }
            
            public final void setShortId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFingerprint() {
                return null;
            }
            
            public final void setFingerprint(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$SocksInboundSettings;", "", "<init>", "()V", "auth", "", "getAuth", "()Ljava/lang/String;", "setAuth", "(Ljava/lang/String;)V", "udp", "", "getUdp", "()Ljava/lang/Boolean;", "setUdp", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class SocksInboundSettings {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String auth;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean udp;
            
            public SocksInboundSettings() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAuth() {
                return null;
            }
            
            public final void setAuth(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getUdp() {
                return null;
            }
            
            public final void setUdp(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006+"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$StreamSettingsObject;", "", "<init>", "()V", "network", "", "getNetwork", "()Ljava/lang/String;", "setNetwork", "(Ljava/lang/String;)V", "security", "getSecurity", "setSecurity", "tlsSettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$TlsSettingsObject;", "getTlsSettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$TlsSettingsObject;", "setTlsSettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$TlsSettingsObject;)V", "realitySettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$RealitySettingsObject;", "getRealitySettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$RealitySettingsObject;", "setRealitySettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$RealitySettingsObject;)V", "wsSettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$WsSettingsObject;", "getWsSettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$WsSettingsObject;", "setWsSettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$WsSettingsObject;)V", "grpcSettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$GrpcSettingsObject;", "getGrpcSettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$GrpcSettingsObject;", "setGrpcSettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$GrpcSettingsObject;)V", "hysteriaSettings", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaSettingsObject;", "getHysteriaSettings", "()Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaSettingsObject;", "setHysteriaSettings", "(Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$HysteriaSettingsObject;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class StreamSettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String network;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String security;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.TlsSettingsObject tlsSettings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.RealitySettingsObject realitySettings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.WsSettingsObject wsSettings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.GrpcSettingsObject grpcSettings;
            @org.jetbrains.annotations.Nullable()
            private com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaSettingsObject hysteriaSettings;
            
            public StreamSettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNetwork() {
                return null;
            }
            
            public final void setNetwork(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSecurity() {
                return null;
            }
            
            public final void setSecurity(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.TlsSettingsObject getTlsSettings() {
                return null;
            }
            
            public final void setTlsSettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.TlsSettingsObject p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.RealitySettingsObject getRealitySettings() {
                return null;
            }
            
            public final void setRealitySettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.RealitySettingsObject p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.WsSettingsObject getWsSettings() {
                return null;
            }
            
            public final void setWsSettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.WsSettingsObject p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.GrpcSettingsObject getGrpcSettings() {
                return null;
            }
            
            public final void setGrpcSettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.GrpcSettingsObject p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaSettingsObject getHysteriaSettings() {
                return null;
            }
            
            public final void setHysteriaSettings(@org.jetbrains.annotations.Nullable()
            com.witvpn.ikev2.vless.VlessParser.V2RayConfig.HysteriaSettingsObject p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$TlsSettingsObject;", "", "<init>", "()V", "serverName", "", "getServerName", "()Ljava/lang/String;", "setServerName", "(Ljava/lang/String;)V", "allowInsecure", "", "getAllowInsecure", "()Ljava/lang/Boolean;", "setAllowInsecure", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "fingerprint", "getFingerprint", "setFingerprint", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class TlsSettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String serverName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean allowInsecure;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String fingerprint;
            
            public TlsSettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getServerName() {
                return null;
            }
            
            public final void setServerName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getAllowInsecure() {
                return null;
            }
            
            public final void setAllowInsecure(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFingerprint() {
                return null;
            }
            
            public final void setFingerprint(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$VlessOutboundSettings;", "", "<init>", "()V", "vnext", "", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$VlessOutboundSettings$VnextObject;", "getVnext", "()Ljava/util/List;", "setVnext", "(Ljava/util/List;)V", "VnextObject", "UserObject", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class VlessOutboundSettings {
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.VnextObject> vnext;
            
            public VlessOutboundSettings() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.VnextObject> getVnext() {
                return null;
            }
            
            public final void setVnext(@org.jetbrains.annotations.Nullable()
            java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.VnextObject> p0) {
            }
            
            @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$VlessOutboundSettings$UserObject;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "encryption", "getEncryption", "setEncryption", "flow", "getFlow", "setFlow", "GreyWebVPN-3.0.8 [278]_debug"})
            public static final class UserObject {
                @org.jetbrains.annotations.Nullable()
                private java.lang.String id;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String encryption;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String flow;
                
                public UserObject() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getId() {
                    return null;
                }
                
                public final void setId(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getEncryption() {
                    return null;
                }
                
                public final void setEncryption(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getFlow() {
                    return null;
                }
                
                public final void setFlow(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
            }
            
            @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$VlessOutboundSettings$VnextObject;", "", "<init>", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "port", "", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "users", "", "Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$VlessOutboundSettings$UserObject;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "GreyWebVPN-3.0.8 [278]_debug"})
            public static final class VnextObject {
                @org.jetbrains.annotations.Nullable()
                private java.lang.String address;
                @org.jetbrains.annotations.Nullable()
                private java.lang.Integer port;
                @org.jetbrains.annotations.Nullable()
                private java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.UserObject> users;
                
                public VnextObject() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getAddress() {
                    return null;
                }
                
                public final void setAddress(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getPort() {
                    return null;
                }
                
                public final void setPort(@org.jetbrains.annotations.Nullable()
                java.lang.Integer p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.UserObject> getUsers() {
                    return null;
                }
                
                public final void setUsers(@org.jetbrains.annotations.Nullable()
                java.util.List<com.witvpn.ikev2.vless.VlessParser.V2RayConfig.VlessOutboundSettings.UserObject> p0) {
                }
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/witvpn/ikev2/vless/VlessParser$V2RayConfig$WsSettingsObject;", "", "<init>", "()V", "path", "", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "headers", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "GreyWebVPN-3.0.8 [278]_debug"})
        public static final class WsSettingsObject {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String path;
            @org.jetbrains.annotations.Nullable()
            private java.util.Map<java.lang.String, java.lang.String> headers;
            
            public WsSettingsObject() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPath() {
                return null;
            }
            
            public final void setPath(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
                return null;
            }
            
            public final void setHeaders(@org.jetbrains.annotations.Nullable()
            java.util.Map<java.lang.String, java.lang.String> p0) {
            }
        }
    }
}