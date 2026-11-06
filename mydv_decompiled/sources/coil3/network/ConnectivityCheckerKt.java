package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import coil3.network.internal.Utils_androidKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ConnectivityCheckerKt {
    public static final ConnectivityChecker ConnectivityChecker(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || !Utils_androidKt.isPermissionGranted(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return ConnectivityChecker.ONLINE;
        }
        try {
            return Build.VERSION.SDK_INT > 23 ? new ConnectivityCheckerApi23(connectivityManager) : new ConnectivityCheckerApi21(connectivityManager);
        } catch (Exception unused) {
            return ConnectivityChecker.ONLINE;
        }
    }
}
