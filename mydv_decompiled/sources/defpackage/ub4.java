package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ub4 extends wt0 implements ye0, kd3 {
    public gc4 K;
    public pg3 L;
    public boolean M;
    public gf1 N;
    public t33 O;
    public oy P;
    public boolean Q;
    public sc R;
    public fc4 S;
    public wt0 T;
    public tc U;
    public sc V;
    public boolean W;

    @Override // defpackage.kd3
    public final void U() {
        tc tcVar = (tc) j42.r(this, lh3.a);
        if (j42.c(tcVar, this.U)) {
            return;
        }
        this.U = tcVar;
        this.V = null;
        wt0 wt0Var = this.T;
        if (wt0Var != null) {
            k0(wt0Var);
        }
        this.T = null;
        m0();
        fc4 fc4Var = this.S;
        if (fc4Var != null) {
            gc4 gc4Var = this.K;
            pg3 pg3Var = this.L;
            sc scVar = this.Q ? this.V : this.R;
            fc4Var.E0(scVar, this.P, this.N, this.O, pg3Var, gc4Var, this.M, this.W);
        }
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void m0() {
        tt0 tt0Var = this.T;
        if (tt0Var != null) {
            if (tt0Var.getNode().isAttached()) {
                return;
            }
            j0(tt0Var);
            return;
        }
        if (this.Q) {
            mu0.P(this, new q94(this, (byte) 2));
        }
        sc scVar = this.Q ? this.V : this.R;
        if (scVar != null) {
            wt0 wt0Var = scVar.i;
            if (wt0Var.getNode().isAttached()) {
                return;
            }
            j0(wt0Var);
            this.T = wt0Var;
        }
    }

    public final boolean n0() {
        return (isAttached() ? ut0.U(this).h0 : da2.I) != da2.J || this.L == pg3.I;
    }

    public final void o0(sc scVar, oy oyVar, gf1 gf1Var, t33 t33Var, pg3 pg3Var, gc4 gc4Var, boolean z, boolean z2) {
        boolean z3;
        this.K = gc4Var;
        this.L = pg3Var;
        boolean z4 = true;
        if (this.Q != z) {
            this.Q = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j42.c(this.R, scVar)) {
            z4 = false;
        } else {
            this.R = scVar;
        }
        if (z3 || (z4 && !z)) {
            wt0 wt0Var = this.T;
            if (wt0Var != null) {
                k0(wt0Var);
            }
            this.T = null;
            m0();
        }
        this.M = z2;
        this.N = gf1Var;
        this.O = t33Var;
        this.P = oyVar;
        boolean n0 = n0();
        this.W = n0;
        fc4 fc4Var = this.S;
        if (fc4Var != null) {
            fc4Var.E0(this.Q ? this.V : this.R, oyVar, gf1Var, t33Var, pg3Var, gc4Var, z2, n0);
        }
    }

    @Override // defpackage.k13
    public final void onAttach() {
        this.W = n0();
        m0();
        if (this.S == null) {
            gc4 gc4Var = this.K;
            sc scVar = this.Q ? this.V : this.R;
            fc4 fc4Var = new fc4(scVar, this.P, this.N, this.O, this.L, gc4Var, this.M, this.W);
            j0(fc4Var);
            this.S = fc4Var;
        }
    }

    @Override // defpackage.k13
    public final void onDetach() {
        wt0 wt0Var = this.T;
        if (wt0Var != null) {
            k0(wt0Var);
        }
    }

    @Override // defpackage.k13
    public final void onLayoutDirectionChange() {
        boolean n0 = n0();
        if (this.W != n0) {
            this.W = n0;
            gc4 gc4Var = this.K;
            pg3 pg3Var = this.L;
            boolean z = this.Q;
            sc scVar = z ? this.V : this.R;
            o0(scVar, this.P, this.N, this.O, pg3Var, gc4Var, z, this.M);
        }
    }
}
