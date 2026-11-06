package coil3.network.internal;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import defpackage.j42;
import defpackage.z9;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Utils_androidKt {
    public static final void assertNotOnMainThread() {
        if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        return z9.a(context, str) == 0;
    }
}
