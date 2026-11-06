package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b21 extends k13 implements la5, y92 {
    public b21 I;
    public b21 J;
    public long K;

    @Override // defpackage.la5
    public final Object g() {
        return q8.j0;
    }

    @Override // defpackage.cx2
    public final void i(long j) {
        this.K = j;
    }

    public final boolean j0() {
        b21 b21Var = this.I;
        if (b21Var != null) {
            return b21Var.j0();
        }
        b21 b21Var2 = this.J;
        if (b21Var2 != null) {
            return b21Var2.j0();
        }
        return false;
    }

    public final void k0() {
        b21 b21Var = this.J;
        if (b21Var != null) {
            b21Var.k0();
            return;
        }
        b21 b21Var2 = this.I;
        if (b21Var2 != null) {
            b21Var2.k0();
        }
    }

    public final void l0() {
        b21 b21Var = this.J;
        if (b21Var != null) {
            b21Var.l0();
        }
        b21 b21Var2 = this.I;
        if (b21Var2 != null) {
            b21Var2.l0();
        }
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(defpackage.uu2 r4) {
        /*
            r3 = this;
            b21 r0 = r3.I
            if (r0 == 0) goto L11
            long r1 = defpackage.e21.z(r4)
            boolean r1 = defpackage.c21.f(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            k13 r1 = r3.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L2e
        L1d:
            r24 r1 = new r24
            r1.<init>()
            a21 r2 = new a21
            r2.<init>(r1, r3, r4)
            defpackage.ad4.F(r3, r2)
            java.lang.Object r1 = r1.I
            la5 r1 = (defpackage.la5) r1
        L2e:
            b21 r1 = (defpackage.b21) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            defpackage.c21.g(r1, r4)
            b21 r4 = r3.J
            if (r4 == 0) goto L6c
            r4.l0()
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            b21 r2 = r3.J
            if (r2 == 0) goto L4a
            defpackage.c21.g(r2, r4)
        L4a:
            r0.l0()
            goto L6c
        L4e:
            boolean r2 = defpackage.j42.c(r1, r0)
            if (r2 != 0) goto L5f
            if (r1 == 0) goto L59
            defpackage.c21.g(r1, r4)
        L59:
            if (r0 == 0) goto L6c
            r0.l0()
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.m0(r4)
            goto L6c
        L65:
            b21 r0 = r3.J
            if (r0 == 0) goto L6c
            r0.m0(r4)
        L6c:
            r3.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b21.m0(uu2):void");
    }

    public final void n0() {
        b21 b21Var = this.J;
        if (b21Var != null) {
            b21Var.n0();
            return;
        }
        b21 b21Var2 = this.I;
        if (b21Var2 != null) {
            b21Var2.n0();
        }
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.J = null;
        this.I = null;
    }

    @Override // defpackage.y92
    public final void f(ca2 ca2Var) {
    }
}
