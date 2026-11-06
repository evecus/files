package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ck4;
import defpackage.dp0;
import defpackage.jk4;
import defpackage.vk0;
import defpackage.z75;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters a;
    public final ck4 b;
    public final z75 c;
    public final vk0 d;
    public final String e;

    public SessionWorker(Context context, WorkerParameters workerParameters, ck4 ck4Var, z75 z75Var, vk0 vk0Var) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = ck4Var;
        this.c = z75Var;
        this.d = vk0Var;
        dp0 inputData = getInputData();
        ck4Var.getClass();
        String a = inputData.a("KEY");
        if (a != null) {
            this.e = a;
        } else {
            zy.i("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|69|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0128, code lost:
    
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007f, code lost:
    
        if (r13 == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0051, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        if (r9.c.get() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        r1 = defpackage.ta3.I;
        r2 = new defpackage.gu2(r12, r9, r7, r4);
        r0.J = r13;
        r0.M = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0142, code lost:
    
        if (defpackage.p70.D0(r1, r2, r0) != r8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x00b5, B:24:0x00d0, B:31:0x00ef, B:34:0x0108, B:45:0x004c, B:49:0x0062), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(defpackage.fj0 r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.doWork(fj0):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final vk0 getCoroutineContext() {
        return this.d;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, jk4.a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SessionWorker(android.content.Context r7, androidx.work.WorkerParameters r8, defpackage.ck4 r9, defpackage.z75 r10, defpackage.vk0 r11, int r12, defpackage.er0 r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            ik4 r9 = defpackage.jk4.a
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L10
            z75 r10 = new z75
            r10.<init>()
        L10:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L19
            os0 r9 = defpackage.sx0.a
            ns1 r11 = defpackage.ju2.a
        L19:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.<init>(android.content.Context, androidx.work.WorkerParameters, ck4, z75, vk0, int, er0):void");
    }
}
