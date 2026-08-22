package com.witvpn.ikev2.presentation.utils;

/**
 * Централизованный источник «живых» доменов приложения.
 *
 * Раньше домены были зашиты в build.gradle / коде:
 *  - base_url          (resValue)      -> API
 *  - GRAYS_BILLING_URL (BuildConfig)   -> оплата
 *  - SUBSCRIPTION_URL  (VlessManager)  -> подписка со списком vless/hy2 нод
 *
 * Теперь актуальные адреса приходят из Firebase Remote Config и могут быть
 * изменены из консоли Firebase без выпуска обновления в Google Play.
 *
 * Логика получения значения (fallback-цепочка, всегда возвращает что-то валидное):
 *  1) Активное значение из Firebase Remote Config (если Firebase доступен).
 *  2) Последнее успешно применённое значение из SharedPreferences
 *     (чтобы уже на «холодном старте», ДО завершения сетевого fetch,
 *      использовать актуальный домен с прошлого запуска).
 *  3) Значение по умолчанию, зашитое в ресурсы/BuildConfig (старое поведение).
 *
 * Ключи Remote Config (их и надо менять в панели Firebase):
 *  - api_base_url     — базовый URL API, напр. https://api.example.com/vpn/api/v1/
 *  - payment_url      — URL оплаты с плейсхолдером %s для userId
 *  - subscription_url — URL подписки со списком vless/hysteria2 нод
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/RemoteConfigManager;", "", "<init>", "()V", "KEY_API_BASE_URL", "", "KEY_PAYMENT_URL", "KEY_SUBSCRIPTION_URL", "PREFS_NAME", "MIN_FETCH_INTERVAL_SECONDS", "", "firebaseAvailable", "", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "init", "", "context", "Landroid/content/Context;", "getApiBaseUrl", "getPaymentUrl", "getSubscriptionUrl", "resolve", "key", "resourceDefault", "persist", "value", "GreyWebVPN-3.0.8 [278]_release"})
public final class RemoteConfigManager {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_API_BASE_URL = "api_base_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PAYMENT_URL = "payment_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SUBSCRIPTION_URL = "subscription_url";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFS_NAME = "remote_config_cache";
    private static final long MIN_FETCH_INTERVAL_SECONDS = 0L;
    @kotlin.jvm.Volatile()
    private static volatile boolean firebaseAvailable = false;
    @org.jetbrains.annotations.Nullable()
    private static com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig;
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.presentation.utils.RemoteConfigManager INSTANCE = null;
    
    private RemoteConfigManager() {
        super();
    }
    
    /**
     * Инициализация + первичная загрузка конфига. Вызывать один раз из
     * Application.onCreate(). Метод неблокирующий: сеть подтягивается в фоне,
     * а до её завершения работают закэшированные значения / дефолты.
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Базовый URL API. Всегда заканчивается на "/" — этого требует Retrofit.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiBaseUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * URL оплаты. Содержит плейсхолдер %s для подстановки userId.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * URL подписки со списком рабочих vless/hysteria2 нод.
     *
     * Даёт возможность заменить домен подписки «на лету» из консоли Firebase
     * (ключ subscription_url), если текущий адрес заблокируют, — без выпуска
     * нового билда в Google Play. Дефолт совпадает с прежним «зашитым»
     * значением из VlessManager (res string subscription_url).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriptionUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.lang.String resolve(android.content.Context context, java.lang.String key, java.lang.String resourceDefault) {
        return null;
    }
    
    private final void persist(android.content.Context context, java.lang.String key, java.lang.String value) {
    }
}