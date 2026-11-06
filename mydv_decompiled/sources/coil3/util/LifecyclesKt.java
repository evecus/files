package coil3.util;

import defpackage.li2;
import defpackage.ui2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LifecyclesKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitStarted(defpackage.li2 r5, defpackage.fj0 r6) {
        /*
            boolean r0 = r6 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            wd5 r2 = defpackage.wd5.a
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            r24 r5 = (defpackage.r24) r5
            java.lang.Object r0 = r0.L$0
            li2 r0 = (defpackage.li2) r0
            defpackage.mu0.V(r6)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r6 = move-exception
            goto L84
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L38:
            defpackage.mu0.V(r6)
            r6 = r5
            xi2 r6 = (defpackage.xi2) r6
            ki2 r6 = r6.i
            ki2 r1 = defpackage.ki2.L
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L49
            return r2
        L49:
            r24 r6 = new r24
            r6.<init>()
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            k10 r1 = new k10     // Catch: java.lang.Throwable -> L7f
            fj0 r0 = defpackage.mu0.G(r0)     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7f
            r1.t()     // Catch: java.lang.Throwable -> L7f
            coil3.util.LifecyclesKt$awaitStarted$2$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$2$1     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            r6.I = r0     // Catch: java.lang.Throwable -> L7f
            r5.a(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7f
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r5
            r5 = r6
        L75:
            java.lang.Object r5 = r5.I
            ui2 r5 = (defpackage.ui2) r5
            if (r5 == 0) goto L7e
            r0.b(r5)
        L7e:
            return r2
        L7f:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L84:
            java.lang.Object r5 = r5.I
            ui2 r5 = (defpackage.ui2) r5
            if (r5 == 0) goto L8d
            r0.b(r5)
        L8d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.LifecyclesKt.awaitStarted(li2, fj0):java.lang.Object");
    }

    public static final void removeAndAddObserver(li2 li2Var, ui2 ui2Var) {
        li2Var.b(ui2Var);
        li2Var.a(ui2Var);
    }
}
