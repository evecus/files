package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class v93 {
    public static final String a = fr2.h("NetworkStateTracker");

    public static final t93 a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities networkCapabilities;
        String str = a;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                fr2.e().d(str, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                z = networkCapabilities.hasCapability(16);
                return new t93(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
            z = false;
            return new t93(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        } catch (SecurityException e2) {
            fr2.e().d(str, "Unable to get active network state", e2);
            return new t93(false, false, false, true);
        }
    }
}
