package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fe implements dl0 {
    public final View I;
    public final j55 J;
    public final dl0 K;
    public final AtomicReference L = new AtomicReference(null);

    public fe(AndroidComposeView androidComposeView, j55 j55Var, dl0 dl0Var) {
        this.I = androidComposeView;
        this.J = j55Var;
        this.K = dl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ph2 r8, defpackage.gj0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.de
            if (r0 == 0) goto L13
            r0 = r9
            de r0 = (defpackage.de) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            de r0 = new de
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return
        L27:
            defpackage.mu0.V(r9)
            goto L4f
        L2b:
            defpackage.mu0.V(r9)
            r9 = r2
            be r2 = new be
            r1 = 0
            r2.<init>(r8, r7, r1)
            r r4 = new r
            r8 = 3
            r5 = 0
            r4.<init>(r7, r5, r8)
            r0.K = r9
            f31 r1 = new f31
            r6 = 3
            java.util.concurrent.atomic.AtomicReference r3 = r7.L
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.i42.o0(r1, r0)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L4f
            return
        L4f:
            defpackage.zy.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.a(ph2, gj0):void");
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.K.getCoroutineContext();
    }
}
