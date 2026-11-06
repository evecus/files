package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xo implements rk0 {
    public final /* synthetic */ AtomicReference I;
    public final /* synthetic */ bu3 J;

    public xo(AtomicReference atomicReference, bu3 bu3Var) {
        this.I = atomicReference;
        this.J = bu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.hn1 r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wo
            if (r0 == 0) goto L13
            r0 = r6
            wo r0 = (defpackage.wo) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            wo r0 = new wo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L27:
            defpackage.mu0.V(r6)
            goto L61
        L2b:
            defpackage.mu0.V(r6)
            r0.K = r2
            k10 r6 = new k10
            fj0 r0 = defpackage.mu0.G(r0)
            r6.<init>(r2, r0)
            r6.t()
            oe r0 = new oe
            r1 = 2
            bu3 r2 = r4.J
            r0.<init>(r2, r1)
            r6.v(r0)
            java.util.concurrent.atomic.AtomicReference r4 = r4.I
            java.lang.Object r4 = r4.getAndSet(r6)
            i10 r4 = (defpackage.i10) r4
            if (r4 == 0) goto L55
            r0 = 0
            r4.j(r0)
        L55:
            r2.d(r5)
            java.lang.Object r4 = r6.r()
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L61
            return
        L61:
            defpackage.zy.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo.a(hn1, gj0):void");
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return k04.P;
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}
