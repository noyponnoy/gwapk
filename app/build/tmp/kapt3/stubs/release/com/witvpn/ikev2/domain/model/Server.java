package com.witvpn.ikev2.domain.model;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0001>B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\'\u001a\u00020(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b4\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015\u00a8\u0006?"}, d2 = {"Lcom/witvpn/ikev2/domain/model/Server;", "", "id", "", "country", "ipAddress", "premium", "", "recommend", "state", "countryCode", "ca_file", "ca_fileName", "p_nsm", "u_nsm", "uuid", "protocol", "configAwg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCountry", "getIpAddress", "getPremium", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecommend", "getState", "getCountryCode", "getCa_file", "getCa_fileName", "getP_nsm", "getU_nsm", "getUuid", "setUuid", "(Ljava/lang/String;)V", "getProtocol", "getConfigAwg", "saveDraft", "", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/witvpn/ikev2/domain/model/Server;", "toString", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class Server {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ipAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean premium = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean recommend = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String countryCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ca_file = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ca_fileName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String p_nsm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String u_nsm = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String uuid;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String protocol = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String configAwg = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.witvpn.ikev2.domain.model.Server AUTO_CONNECT_STAB = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.domain.model.Server.Companion Companion = null;
    
    public Server(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean premium, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recommend, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    java.lang.String ca_file, @org.jetbrains.annotations.Nullable()
    java.lang.String ca_fileName, @org.jetbrains.annotations.Nullable()
    java.lang.String p_nsm, @org.jetbrains.annotations.Nullable()
    java.lang.String u_nsm, @org.jetbrains.annotations.Nullable()
    java.lang.String uuid, @org.jetbrains.annotations.Nullable()
    java.lang.String protocol, @org.jetbrains.annotations.Nullable()
    java.lang.String configAwg) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPremium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRecommend() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCa_file() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCa_fileName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getP_nsm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getU_nsm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUuid() {
        return null;
    }
    
    public final void setUuid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProtocol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConfigAwg() {
        return null;
    }
    
    public final void saveDraft() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.domain.model.Server copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean premium, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recommend, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    java.lang.String ca_file, @org.jetbrains.annotations.Nullable()
    java.lang.String ca_fileName, @org.jetbrains.annotations.Nullable()
    java.lang.String p_nsm, @org.jetbrains.annotations.Nullable()
    java.lang.String u_nsm, @org.jetbrains.annotations.Nullable()
    java.lang.String uuid, @org.jetbrains.annotations.Nullable()
    java.lang.String protocol, @org.jetbrains.annotations.Nullable()
    java.lang.String configAwg) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\t*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/witvpn/ikev2/domain/model/Server$Companion;", "", "<init>", "()V", "AUTO_CONNECT_STAB", "Lcom/witvpn/ikev2/domain/model/Server;", "getAUTO_CONNECT_STAB", "()Lcom/witvpn/ikev2/domain/model/Server;", "isAutoConnect", "", "(Lcom/witvpn/ikev2/domain/model/Server;)Z", "fromObject", "serverObject", "Lcom/witvpn/ikev2/data/remote/model/ServerObject;", "fromAwg", "awg", "Lcom/witvpn/ikev2/domain/model/ServerAwg;", "draftKeyForProtocol", "", "protocol", "getDraft", "getDraftForProtocol", "readDraft", "key", "clearDraft", "", "clearDraftForProtocol", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.witvpn.ikev2.domain.model.Server getAUTO_CONNECT_STAB() {
            return null;
        }
        
        public final boolean isAutoConnect(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.domain.model.Server $this$isAutoConnect) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.witvpn.ikev2.domain.model.Server fromObject(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.data.remote.model.ServerObject serverObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.witvpn.ikev2.domain.model.Server fromAwg(@org.jetbrains.annotations.NotNull()
        com.witvpn.ikev2.domain.model.ServerAwg awg) {
            return null;
        }
        
        private final java.lang.String draftKeyForProtocol(java.lang.String protocol) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.witvpn.ikev2.domain.model.Server getDraft() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.witvpn.ikev2.domain.model.Server getDraftForProtocol(@org.jetbrains.annotations.NotNull()
        java.lang.String protocol) {
            return null;
        }
        
        private final com.witvpn.ikev2.domain.model.Server readDraft(java.lang.String key) {
            return null;
        }
        
        public final void clearDraft() {
        }
        
        public final void clearDraftForProtocol(@org.jetbrains.annotations.NotNull()
        java.lang.String protocol) {
        }
    }
}