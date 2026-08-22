package com.witvpn.ikev2.data;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ&\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/witvpn/ikev2/data/AppSettings;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "value", "", "lastUserIsPremium", "getLastUserIsPremium", "()Z", "setLastUserIsPremium", "(Z)V", "needShowInAppReview", "approximateAppReviewCounter", "", "resetAppReviewCounter", "updateEntropy", "entropy", "", "entropyMnemonic", "entropyRSA", "pubKey", "getEntropy", "getMnemonic", "getEntropyRSA", "getEntropyPubKey", "clearEntropy", "clearMnemonic", "Companion", "GreyWebVPN-3.0.8 [278]_debug"})
public final class AppSettings {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPROXIMATE_INT = "app.greywebs.vpn.APPROXIMATE_INT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENTROPY_STR = "app.greywebs.vpn.ENTROPY_STR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENTROPY_MNEMONIC_STR = "app.greywebs.vpn.ENTROPY_MNEMONIC_STR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENTROPY_RSA_STR = "app.greywebs.vpn.ENTROPY_RSA_STR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENTROPY_PUBKEY_STR = "app.greywebs.vpn.ENTROPY_PUBKEY_STR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_USER_IS_PREMIUM = "app.greywebs.vpn.LAST_USER_IS_PREMIUM";
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.data.AppSettings.Companion Companion = null;
    
    @javax.inject.Inject()
    public AppSettings(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final boolean getLastUserIsPremium() {
        return false;
    }
    
    public final void setLastUserIsPremium(boolean value) {
    }
    
    public final boolean needShowInAppReview() {
        return false;
    }
    
    public final void approximateAppReviewCounter() {
    }
    
    public final void resetAppReviewCounter() {
    }
    
    public final void updateEntropy(@org.jetbrains.annotations.NotNull()
    java.lang.String entropy, @org.jetbrains.annotations.NotNull()
    java.lang.String entropyMnemonic, @org.jetbrains.annotations.NotNull()
    java.lang.String entropyRSA, @org.jetbrains.annotations.NotNull()
    java.lang.String pubKey) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntropy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMnemonic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntropyRSA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntropyPubKey() {
        return null;
    }
    
    public final void clearEntropy() {
    }
    
    public final void clearMnemonic() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/witvpn/ikev2/data/AppSettings$Companion;", "", "<init>", "()V", "APPROXIMATE_INT", "", "ENTROPY_STR", "ENTROPY_MNEMONIC_STR", "ENTROPY_RSA_STR", "ENTROPY_PUBKEY_STR", "LAST_USER_IS_PREMIUM", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}