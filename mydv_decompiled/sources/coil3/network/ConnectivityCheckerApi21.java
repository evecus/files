package coil3.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ConnectivityCheckerApi21 implements ConnectivityChecker {
    private final ConnectivityManager connectivityManager;

    public ConnectivityCheckerApi21(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    @Override // coil3.network.ConnectivityChecker
    public boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
