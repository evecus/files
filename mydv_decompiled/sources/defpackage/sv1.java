package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sv1 extends k13 implements vp3 {
    public t33 I;
    public mv1 J;

    @Override // defpackage.vp3
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.vp3
    public final void e0() {
        l0();
    }

    @Override // defpackage.vp3
    public final long h() {
        return c95.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pv1
            if (r0 == 0) goto L13
            r0 = r5
            pv1 r0 = (defpackage.pv1) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            pv1 r0 = new pv1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.J
            int r1 = r0.L
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            mv1 r0 = r0.I
            defpackage.mu0.V(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.mu0.V(r5)
            mv1 r5 = r4.J
            if (r5 != 0) goto L4c
            mv1 r5 = new mv1
            r5.<init>()
            t33 r1 = r4.I
            r0.I = r5
            r0.L = r2
            java.lang.Object r0 = r1.a(r5, r0)
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.J = r0
        L4c:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv1.j0(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qv1
            if (r0 == 0) goto L13
            r0 = r5
            qv1 r0 = (defpackage.qv1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            qv1 r0 = new qv1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2c:
            defpackage.mu0.V(r5)
            mv1 r5 = r4.J
            if (r5 == 0) goto L47
            nv1 r1 = new nv1
            r1.<init>(r5)
            t33 r5 = r4.I
            r0.K = r3
            java.lang.Object r5 = r5.a(r1, r0)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.J = r2
        L47:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv1.k0(gj0):java.lang.Object");
    }

    public final void l0() {
        mv1 mv1Var = this.J;
        if (mv1Var != null) {
            this.I.b(new nv1(mv1Var));
            this.J = null;
        }
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        l0();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        l0();
    }

    @Override // defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        if (lp3Var == lp3.J) {
            int i = kp3Var.f;
            fj0 fj0Var = null;
            if (i == 4) {
                p70.g0(getCoroutineScope(), null, null, new rv1(this, fj0Var, (byte) 0), 3);
            } else if (i == 5) {
                p70.g0(getCoroutineScope(), null, null, new rv1(this, fj0Var, (byte) 1), 3);
            }
        }
    }

    @Override // defpackage.vp3
    public final void y() {
        l0();
    }

    @Override // defpackage.vp3
    public final void D() {
    }
}
