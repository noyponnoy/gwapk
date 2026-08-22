package com.witvpn.ikev2.presentation.utils;

/**
 * Достаёт emoji-флаг из названия сервера подписки (например «🇩🇪 GWAPP DE01»)
 * и возвращает ISO-код страны (de) + имя без флага.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/SubscriptionNameFlags;", "", "<init>", "()V", "RI_START", "", "RI_END", "parse", "Lcom/witvpn/ikev2/presentation/utils/SubscriptionNameFlags$Parsed;", "rawName", "", "Parsed", "GreyWebVPN-3.0.8 [278]_debug"})
public final class SubscriptionNameFlags {
    private static final int RI_START = 127462;
    private static final int RI_END = 127487;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.utils.SubscriptionNameFlags INSTANCE = null;
    
    private SubscriptionNameFlags() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.presentation.utils.SubscriptionNameFlags.Parsed parse(@org.jetbrains.annotations.Nullable()
    java.lang.String rawName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/SubscriptionNameFlags$Parsed;", "", "countryCode", "", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getDisplayName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Parsed {
        
        /**
         * ISO 3166-1 alpha-2 lowercase, или null если флага нет
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String countryCode = null;
        
        /**
         * Имя без emoji-флага в начале
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        
        public Parsed(@org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String displayName) {
            super();
        }
        
        /**
         * ISO 3166-1 alpha-2 lowercase, или null если флага нет
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        /**
         * Имя без emoji-флага в начале
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.witvpn.ikev2.presentation.utils.SubscriptionNameFlags.Parsed copy(@org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String displayName) {
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