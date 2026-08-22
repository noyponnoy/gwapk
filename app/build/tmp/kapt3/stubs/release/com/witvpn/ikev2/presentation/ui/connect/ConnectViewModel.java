package com.witvpn.ikev2.presentation.ui.connect;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\b\u0010$\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u00020\'H\u0014J\b\u0010(\u001a\u00020\'H\u0016J(\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0017H\u0016J\b\u0010/\u001a\u00020\'H\u0002J\u0010\u00100\u001a\u00020\'2\b\u00101\u001a\u0004\u0018\u000102R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!\u00a8\u00063"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/connect/ConnectViewModel;", "Lcom/witvpn/ikev2/presentation/base/BaseViewModel;", "Lorg/strongswan/android/logic/VpnStateService$VpnStateListener;", "Lorg/strongswan/android/utils/traffic/ITrafficSpeedListener;", "contextApp", "Landroid/content/Context;", "userRepository", "Lcom/witvpn/ikev2/domain/repository/UserRepository;", "appSettings", "Lcom/witvpn/ikev2/data/AppSettings;", "<init>", "(Landroid/content/Context;Lcom/witvpn/ikev2/domain/repository/UserRepository;Lcom/witvpn/ikev2/data/AppSettings;)V", "getAppSettings", "()Lcom/witvpn/ikev2/data/AppSettings;", "_stateMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/strongswan/android/logic/VpnStateService$State;", "stateLiveData", "Landroidx/lifecycle/LiveData;", "getStateLiveData", "()Landroidx/lifecycle/LiveData;", "_trafficMutableLiveData", "Lkotlin/Pair;", "", "trafficLiveData", "getTrafficLiveData", "_service", "Lorg/strongswan/android/logic/VpnStateService;", "_serviceConnection", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "isLimitElapsed", "", "()Landroidx/lifecycle/MutableLiveData;", "elapsedMillisLiveData", "getElapsedMillisLiveData", "getCurrentVPNProfile", "Lorg/strongswan/android/data/VpnProfile;", "onCleared", "", "stateChanged", "onTrafficSpeedMeasured", "upStream", "", "downStream", "totalUpStream", "totalDownStream", "updateState", "syncDataIfNeed", "value", "Lcom/witvpn/ikev2/domain/model/User;", "GreyWebVPN-3.0.8 [278]_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ConnectViewModel extends com.witvpn.ikev2.presentation.base.BaseViewModel implements org.strongswan.android.logic.VpnStateService.VpnStateListener, org.strongswan.android.utils.traffic.ITrafficSpeedListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context contextApp = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.witvpn.ikev2.data.AppSettings appSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.strongswan.android.logic.VpnStateService.State> _stateMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.strongswan.android.logic.VpnStateService.State> stateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Long, java.lang.Long>> _trafficMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Long, java.lang.Long>> trafficLiveData = null;
    @org.jetbrains.annotations.Nullable()
    private org.strongswan.android.logic.VpnStateService _service;
    @org.jetbrains.annotations.NotNull()
    private final android.content.ServiceConnection _serviceConnection = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLimitElapsed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> elapsedMillisLiveData = null;
    
    @javax.inject.Inject()
    public ConnectViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context contextApp, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.data.AppSettings appSettings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.witvpn.ikev2.data.AppSettings getAppSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.strongswan.android.logic.VpnStateService.State> getStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Long, java.lang.Long>> getTrafficLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLimitElapsed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getElapsedMillisLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.strongswan.android.data.VpnProfile getCurrentVPNProfile() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * VpnStateListener
     */
    @java.lang.Override()
    public void stateChanged() {
    }
    
    /**
     * ITrafficSpeedListener
     */
    @java.lang.Override()
    public void onTrafficSpeedMeasured(double upStream, double downStream, long totalUpStream, long totalDownStream) {
    }
    
    private final void updateState() {
    }
    
    public final void syncDataIfNeed(@org.jetbrains.annotations.Nullable()
    com.witvpn.ikev2.domain.model.User value) {
    }
}