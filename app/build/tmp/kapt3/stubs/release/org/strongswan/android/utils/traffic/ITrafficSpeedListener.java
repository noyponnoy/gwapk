package org.strongswan.android.utils.traffic;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lorg/strongswan/android/utils/traffic/ITrafficSpeedListener;", "", "onTrafficSpeedMeasured", "", "upStream", "", "downStream", "totalUpStream", "", "totalDownStream", "GreyWebVPN-3.0.8 [278]_release"})
public abstract interface ITrafficSpeedListener {
    
    public abstract void onTrafficSpeedMeasured(double upStream, double downStream, long totalUpStream, long totalDownStream);
}