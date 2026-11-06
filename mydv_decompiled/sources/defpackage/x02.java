package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x02 extends na3 {
    public static final pd L0;
    public final p15 J0;
    public w02 K0;

    static {
        pd U = i42.U();
        U.f(x70.d);
        U.l(1.0f);
        U.m(1);
        L0 = U;
    }

    public x02(wa2 wa2Var) {
        super(wa2Var);
        p15 p15Var = new p15();
        p15Var.setAggregateChildKindSet$ui(0);
        this.J0 = p15Var;
        p15Var.updateCoordinator$ui(this);
        this.K0 = wa2Var.P != null ? new w02(this) : null;
    }

    @Override // defpackage.na3
    public final void F0() {
        if (this.K0 == null) {
            this.K0 = new w02(this);
        }
    }

    @Override // defpackage.na3
    public final js2 I0() {
        return this.K0;
    }

    @Override // defpackage.na3
    public final k13 K0() {
        return this.J0;
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        return this.c0.u().I(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [b53] */
    @Override // defpackage.na3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(defpackage.o63 r18, long r19, defpackage.kt1 r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.R0(o63, long, kt1, int, boolean):void");
    }

    @Override // defpackage.na3
    public final void a1(o10 o10Var, jr1 jr1Var) {
        wa2 wa2Var = this.c0;
        qh3 a = za2.a(wa2Var);
        b53 z = wa2Var.z();
        Object[] objArr = z.I;
        int i = z.K;
        for (int i2 = 0; i2 < i; i2++) {
            wa2 wa2Var2 = (wa2) objArr[i2];
            if (wa2Var2.L()) {
                try {
                    wa2Var2.n0.d.D0(o10Var, jr1Var);
                } catch (Throwable th) {
                    wa2Var2.b0(th);
                    throw null;
                }
            }
        }
        if (a.getShowLayoutBounds()) {
            long j = this.K;
            o10Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, L0);
        }
    }

    @Override // defpackage.a42
    public final int b(int i) {
        return this.c0.u().G(i);
    }

    @Override // defpackage.bn3
    public final void d0(long j, float f, tm1 tm1Var) {
        b1(j, f, tm1Var);
        if (this.V) {
            return;
        }
        this.c0.o0.p.n0();
    }

    @Override // defpackage.hs2
    public final int k0(v8 v8Var) {
        w02 w02Var = this.K0;
        if (w02Var != null) {
            return w02Var.k0(v8Var);
        }
        tw2 tw2Var = this.c0.o0.p;
        xa2 xa2Var = tw2Var.f0;
        if (!tw2Var.U) {
            if (tw2Var.N.d == sa2.I) {
                xa2Var.f = true;
                if (xa2Var.b) {
                    tw2Var.d0 = true;
                    tw2Var.e0 = true;
                }
            } else {
                xa2Var.g = true;
            }
        }
        x02 f = tw2Var.f();
        boolean z = f.W;
        f.W = true;
        tw2Var.E();
        f.W = z;
        Integer num = (Integer) xa2Var.i.get(v8Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.a42
    public final int p(int i) {
        return this.c0.u().J(i);
    }

    @Override // defpackage.a42
    public final int t(int i) {
        return this.c0.u().H(i);
    }

    @Override // defpackage.pw2
    public final bn3 u(long j) {
        g0(j);
        wa2 wa2Var = this.c0;
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            ((wa2) objArr[i2]).o0.p.T = ua2.K;
        }
        e1(wa2Var.e0.mo35measure3p2s80s(this, wa2Var.n(), j));
        V0();
        return this;
    }
}
