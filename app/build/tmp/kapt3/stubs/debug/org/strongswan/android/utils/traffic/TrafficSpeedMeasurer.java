package org.strongswan.android.utils.traffic;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/strongswan/android/utils/traffic/TrafficSpeedMeasurer;", "", "trafficType", "Lorg/strongswan/android/utils/traffic/TrafficType;", "<init>", "(Lorg/strongswan/android/utils/traffic/TrafficType;)V", "mTrafficSpeedListener", "Lorg/strongswan/android/utils/traffic/ITrafficSpeedListener;", "mHandler", "Lorg/strongswan/android/utils/traffic/TrafficSpeedMeasurer$SamplingHandler;", "mLastTimeReading", "", "mPreviousUpStream", "mPreviousDownStream", "mStartTX", "mStartRX", "registerListener", "", "iTrafficSpeedListener", "removeListener", "startMeasuring", "stopMeasuring", "readTrafficStats", "finalReadTrafficStats", "Companion", "SamplingHandler", "GreyWebVPN-3.0.8 [278]_debug"})
public final class TrafficSpeedMeasurer {
    @org.jetbrains.annotations.NotNull()
    private final org.strongswan.android.utils.traffic.TrafficType trafficType = null;
    private static final long SAMPLE_TIME = 1000L;
    private static final int MSG_START = 1;
    @org.jetbrains.annotations.Nullable()
    private org.strongswan.android.utils.traffic.ITrafficSpeedListener mTrafficSpeedListener;
    @org.jetbrains.annotations.NotNull()
    private org.strongswan.android.utils.traffic.TrafficSpeedMeasurer.SamplingHandler mHandler;
    private long mLastTimeReading = 0L;
    private long mPreviousUpStream = 0L;
    private long mPreviousDownStream = 0L;
    private long mStartTX = 0L;
    private long mStartRX = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.strongswan.android.utils.traffic.TrafficSpeedMeasurer.Companion Companion = null;
    
    public TrafficSpeedMeasurer(@org.jetbrains.annotations.NotNull()
    org.strongswan.android.utils.traffic.TrafficType trafficType) {
        super();
    }
    
    public final void registerListener(@org.jetbrains.annotations.NotNull()
    org.strongswan.android.utils.traffic.ITrafficSpeedListener iTrafficSpeedListener) {
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    org.strongswan.android.utils.traffic.ITrafficSpeedListener iTrafficSpeedListener) {
    }
    
    public final void startMeasuring() {
    }
    
    public final void stopMeasuring() {
    }
    
    private final void readTrafficStats() {
    }
    
    private final void finalReadTrafficStats() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/strongswan/android/utils/traffic/TrafficSpeedMeasurer$Companion;", "", "<init>", "()V", "SAMPLE_TIME", "", "MSG_START", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007\u00a8\u0006\f"}, d2 = {"Lorg/strongswan/android/utils/traffic/TrafficSpeedMeasurer$SamplingHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lorg/strongswan/android/utils/traffic/TrafficSpeedMeasurer;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "startSamplingThread", "stopSamplingThread", "GreyWebVPN-3.0.8 [278]_debug"})
    public final class SamplingHandler extends android.os.Handler {
        
        public SamplingHandler(@org.jetbrains.annotations.NotNull()
        android.os.Looper looper) {
            super();
        }
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
        
        public final void startSamplingThread() {
        }
        
        public final void stopSamplingThread() {
        }
    }
}