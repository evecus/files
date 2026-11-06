package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class nz5 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jz5 a(defpackage.a2 r7, defpackage.be0 r8, defpackage.tc0 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.ar1.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L40
            r0 = 6
            iz r0 = defpackage.qb.g(r2, r0, r3)
            u05 r4 = defpackage.bg.S
            java.lang.Object r4 = r4.getValue()
            tk0 r4 = (defpackage.tk0) r4
            dj0 r4 = defpackage.i42.H(r4)
            ni r5 = new ni
            r6 = 4
            r5.<init>(r0, r3, r6)
            r6 = 3
            defpackage.p70.g0(r4, r3, r3, r5, r6)
            i9 r4 = new i9
            r5 = 8
            r4.<init>(r0, r5)
            java.lang.Object r0 = defpackage.ws4.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.ws4.i     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r4 = defpackage.o70.g1(r5, r4)     // Catch: java.lang.Throwable -> L3d
            defpackage.ws4.i = r4     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            defpackage.ws4.c()
            goto L40
        L3d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L40:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5a
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L51
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L58
            r0.setComposeViewContext(r8)
            goto L5e
        L58:
            r0 = r3
            goto L5e
        L5a:
            r7.removeAllViews()
            goto L58
        L5e:
            if (r0 != 0) goto L72
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.nz5.a
            r7.addView(r1, r4)
        L72:
            r0.setComposeViewContext(r8)
            be0 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L81
            r8.e()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L81:
            r7 = 2131362674(0x7f0a0372, float:1.8345135E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.jz5
            if (r2 == 0) goto L8f
            r3 = r1
            jz5 r3 = (defpackage.jz5) r3
        L8f:
            if (r3 != 0) goto Lab
            jz5 r3 = new jz5
            ld5 r1 = new ld5
            wa2 r2 = r0.getRoot()
            r1.<init>(r2)
            re0 r2 = r8.c()
            we0 r4 = new we0
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lab:
            r3.a(r9)
            re0 r7 = r8.c()
            mz5 r8 = new mz5
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz5.a(a2, be0, tc0):jz5");
    }
}
