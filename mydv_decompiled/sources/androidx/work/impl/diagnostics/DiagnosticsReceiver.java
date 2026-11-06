package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.fr2;
import defpackage.ux5;
import defpackage.xe3;
import defpackage.ye3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = fr2.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        fr2 e = fr2.e();
        String str = a;
        e.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            ux5 e2 = ux5.e(context);
            e2.getClass();
            e2.b((ye3) new xe3(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e3) {
            fr2.e().d(str, "WorkManager is not initialized", e3);
        }
    }
}
