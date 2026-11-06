package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.fj0;
import defpackage.h40;
import defpackage.p70;
import defpackage.rt0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ol2 r5, defpackage.d63 r6, defpackage.ky5 r7, defpackage.gj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.sg0
            if (r0 == 0) goto L13
            r0 = r8
            sg0 r0 = (defpackage.sg0) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            sg0 r0 = new sg0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.I
            int r8 = r0.K
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2c
            if (r8 != r2) goto L26
            defpackage.mu0.V(r4)
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r1
        L2c:
            defpackage.mu0.V(r4)
            tg0 r4 = new tg0
            r4.<init>(r5, r6, r7, r1)
            r0.K = r2
            java.lang.Object r4 = defpackage.i42.o0(r4, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L3f
            return r5
        L3f:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.a(ol2, d63, ky5, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gj0 r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.b(gj0):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(fj0 fj0Var) {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return p70.D0(rt0.u(backgroundExecutor), new h40((Object) this, (fj0) null, (byte) 2), fj0Var);
    }
}
