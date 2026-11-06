package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pa2 extends na3 {
    public static final pd L0;
    public na2 J0;
    public oa2 K0;

    static {
        pd U = i42.U();
        U.f(x70.e);
        U.l(1.0f);
        U.m(1);
        L0 = U;
    }

    public pa2(wa2 wa2Var, na2 na2Var) {
        super(wa2Var);
        this.J0 = na2Var;
        this.K0 = wa2Var.P != null ? new oa2(this) : null;
        if ((na2Var.getNode().getKindSet$ui() & 512) == 0) {
            return;
        }
        zl1.c();
        throw null;
    }

    @Override // defpackage.na3
    public final void F0() {
        if (this.K0 == null) {
            this.K0 = new oa2(this);
        }
    }

    @Override // defpackage.na3
    public final js2 I0() {
        return this.K0;
    }

    @Override // defpackage.na3
    public final k13 K0() {
        return this.J0.getNode();
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        na2 na2Var = this.J0;
        na3 na3Var = this.d0;
        na3Var.getClass();
        return na2Var.minIntrinsicHeight(this, na3Var, i);
    }

    @Override // defpackage.a42
    public final int b(int i) {
        na2 na2Var = this.J0;
        na3 na3Var = this.d0;
        na3Var.getClass();
        return na2Var.maxIntrinsicHeight(this, na3Var, i);
    }

    @Override // defpackage.bn3
    public final void d0(long j, float f, tm1 tm1Var) {
        b1(j, f, tm1Var);
        if (this.V) {
            return;
        }
        W0();
        na3 na3Var = this.d0;
        na3Var.getClass();
        boolean z = na3Var.W;
        na3Var.W = this.W;
        r0().b();
        na3Var.W = z;
    }

    @Override // defpackage.hs2
    public final int k0(v8 v8Var) {
        int s;
        oa2 oa2Var = this.K0;
        if (oa2Var == null) {
            s = e41.s(this, v8Var);
            return s;
        }
        a43 a43Var = oa2Var.h0;
        int d = a43Var.d(v8Var);
        if (d >= 0) {
            return a43Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    public final void n1(na2 na2Var) {
        if (na2Var.equals(this.J0) || (na2Var.getNode().getKindSet$ui() & 512) == 0) {
            this.J0 = na2Var;
        } else {
            i82.W(na2Var);
            throw null;
        }
    }

    @Override // defpackage.a42
    public final int p(int i) {
        na2 na2Var = this.J0;
        na3 na3Var = this.d0;
        na3Var.getClass();
        return na2Var.minIntrinsicWidth(this, na3Var, i);
    }

    @Override // defpackage.a42
    public final int t(int i) {
        na2 na2Var = this.J0;
        na3 na3Var = this.d0;
        na3Var.getClass();
        return na2Var.maxIntrinsicWidth(this, na3Var, i);
    }

    @Override // defpackage.pw2
    public final bn3 u(long j) {
        g0(j);
        na2 na2Var = this.J0;
        na3 na3Var = this.d0;
        na3Var.getClass();
        e1(na2Var.mo34measure3p2s80s(this, na3Var, j));
        V0();
        return this;
    }
}
