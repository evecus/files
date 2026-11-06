package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ss5 {
    static {
        fr2.h("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (ts5.a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
