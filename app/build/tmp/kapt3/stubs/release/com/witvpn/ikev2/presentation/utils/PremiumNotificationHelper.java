package com.witvpn.ikev2.presentation.utils;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/PremiumNotificationHelper;", "", "<init>", "()V", "CHANNEL_ID", "", "CHANNEL_NAME", "createChannel", "", "context", "Landroid/content/Context;", "getPendingIntent", "Landroid/app/PendingIntent;", "sendActivationNotification", "endDate", "sendExpirationReminder", "daysLeft", "", "NOTIFICATION_ID_ACTIVATION", "GreyWebVPN-3.0.8 [278]_release"})
public final class PremiumNotificationHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "premium_notifications";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_NAME = "Premium";
    private static final int NOTIFICATION_ID_ACTIVATION = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.utils.PremiumNotificationHelper INSTANCE = null;
    
    private PremiumNotificationHelper() {
        super();
    }
    
    private final void createChannel(android.content.Context context) {
    }
    
    private final android.app.PendingIntent getPendingIntent(android.content.Context context) {
        return null;
    }
    
    public final void sendActivationNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate) {
    }
    
    public final void sendExpirationReminder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int daysLeft, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate) {
    }
}