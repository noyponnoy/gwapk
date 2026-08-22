package com.witvpn.ikev2.features.entropy;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/witvpn/ikev2/features/entropy/EntropyUseCase;", "", "appSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "<init>", "(Lcom/witvpn/ikev2/data/AppSettings;)V", "rsa", "", "getRsa", "()Ljava/lang/String;", "mnemonic", "getMnemonic", "pubKey", "getPubKey", "refresh", "", "restore", "clear", "updateEntropy", "entropy", "", "store", "entropyMnemonic", "entropyRSA", "isMnemonicValid", "", "Companion", "GreyWebVPN-3.0.8 [278]_release"})
public final class EntropyUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.data.AppSettings appSettings = null;
    public static final int WORD_COUNT = 12;
    private static final int BIT_LENGTH = 128;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.features.entropy.EntropyUseCase.Companion Companion = null;
    
    @javax.inject.Inject()
    public EntropyUseCase(@org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.AppSettings appSettings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRsa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMnemonic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPubKey() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final void restore(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic) {
    }
    
    public final void clear() {
    }
    
    private final void updateEntropy(byte[] entropy) {
    }
    
    private final void store(java.lang.String entropy, java.lang.String entropyMnemonic, java.lang.String entropyRSA, java.lang.String pubKey) {
    }
    
    private final boolean isMnemonicValid(java.lang.String mnemonic) {
        return false;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/witvpn/ikev2/features/entropy/EntropyUseCase$Companion;", "", "<init>", "()V", "WORD_COUNT", "", "BIT_LENGTH", "GreyWebVPN-3.0.8 [278]_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}