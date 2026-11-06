package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.a74;
import defpackage.ay5;
import defpackage.c15;
import defpackage.cc;
import defpackage.fr2;
import defpackage.g4;
import defpackage.iw0;
import defpackage.j81;
import defpackage.m45;
import defpackage.ml2;
import defpackage.nl2;
import defpackage.ny5;
import defpackage.oy5;
import defpackage.qy5;
import defpackage.ux5;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ml2 a() {
        ux5 e = ux5.e(getApplicationContext());
        e.getClass();
        WorkDatabase workDatabase = e.c;
        workDatabase.getClass();
        oy5 w = workDatabase.w();
        ay5 u = workDatabase.u();
        qy5 x = workDatabase.x();
        c15 t = workDatabase.t();
        j81 j81Var = e.b.d;
        List list = (List) g4.V(w.a, true, false, new cc(System.currentTimeMillis() - 86400000, (byte) 3));
        a74 a74Var = w.a;
        List list2 = (List) g4.V(a74Var, true, false, new m45((byte) 27));
        List list3 = (List) g4.V(a74Var, true, false, new ny5((byte) 1));
        if (!list.isEmpty()) {
            fr2 e2 = fr2.e();
            String str = iw0.a;
            e2.g(str, "Recently completed work:\n\n");
            fr2.e().g(str, iw0.a(u, x, t, list));
        }
        if (!list2.isEmpty()) {
            fr2 e3 = fr2.e();
            String str2 = iw0.a;
            e3.g(str2, "Running work:\n\n");
            fr2.e().g(str2, iw0.a(u, x, t, list2));
        }
        if (!list3.isEmpty()) {
            fr2 e4 = fr2.e();
            String str3 = iw0.a;
            e4.g(str3, "Enqueued work:\n\n");
            fr2.e().g(str3, iw0.a(u, x, t, list3));
        }
        return nl2.a();
    }
}
