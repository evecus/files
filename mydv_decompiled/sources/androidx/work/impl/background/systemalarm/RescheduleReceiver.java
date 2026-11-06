package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.fr2;
import defpackage.ux5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = fr2.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fr2.e().a(a, "Received intent " + intent);
        try {
            ux5 e = ux5.e(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            e.getClass();
            synchronized (ux5.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = e.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    e.i = goAsync;
                    if (e.h) {
                        goAsync.finish();
                        e.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e2) {
            fr2.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
