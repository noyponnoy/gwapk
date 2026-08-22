package com.witvpn.ikev2.presentation.ui;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/MainDelegate;", "", "recreateApp", "", "showInterstitialAd", "openLeftMenu", "closeLeftMenu", "isLeftMenuOpen", "", "GreyWebVPN-3.0.8 [278]_debug"})
public abstract interface MainDelegate {
    
    public abstract void recreateApp();
    
    public abstract void showInterstitialAd();
    
    public abstract void openLeftMenu();
    
    public abstract void closeLeftMenu();
    
    public abstract boolean isLeftMenuOpen();
}