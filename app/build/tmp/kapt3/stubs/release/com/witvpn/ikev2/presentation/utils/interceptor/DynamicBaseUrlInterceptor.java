package com.witvpn.ikev2.presentation.utils.interceptor;

/**
 * Перенаправляет исходящие запросы на актуальный домен API «на лету».
 *
 * Retrofit фиксирует baseUrl в момент создания клиента (один раз за запуск).
 * Этот интерцептор позволяет применить новый домен из Remote Config уже в
 * ТЕКУЩЕЙ сессии, не дожидаясь перезапуска приложения: перед отправкой каждого
 * запроса он подменяет scheme/host/port на те, что заданы в актуальном
 * api_base_url.
 *
 * Смена префикса пути (напр. .../vpn/api/v1/ -> .../api/v2/) применится при
 * следующем холодном старте, когда Retrofit пересоберётся с новым baseUrl.
 * Для основного сценария («домен заблокировали — сменили адрес в панели»)
 * достаточно подмены хоста, которая работает мгновенно.
 *
 * @param currentBaseUrlProvider лямбда, возвращающая актуальный базовый URL API.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/witvpn/ikev2/presentation/utils/interceptor/DynamicBaseUrlInterceptor;", "Lokhttp3/Interceptor;", "currentBaseUrlProvider", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "GreyWebVPN-3.0.8 [278]_release"})
public final class DynamicBaseUrlInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.lang.String> currentBaseUrlProvider = null;
    
    public DynamicBaseUrlInterceptor(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> currentBaseUrlProvider) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}