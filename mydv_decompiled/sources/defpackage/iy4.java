package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iy4 extends wt0 implements vp3, ph1, mi1 {
    public rm1 K;
    public boolean L;
    public final r05 M;

    public iy4(rm1 rm1Var) {
        this.K = rm1Var;
        r05 a = m05.a(new bi4(this, (byte) 1));
        j0(a);
        this.M = a;
    }

    @Override // defpackage.vp3
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.vp3
    public final void e0() {
        y();
    }

    @Override // defpackage.vp3
    public final long h() {
        w11 w11Var = wx5.n0;
        iu0 iu0Var = ut0.U(this).g0;
        w11Var.getClass();
        int i = c95.b;
        return fb4.M(iu0Var.X(10.0f), iu0Var.X(40.0f), iu0Var.X(10.0f), iu0Var.X(40.0f));
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        y();
    }

    @Override // defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        this.M.p(kp3Var, lp3Var, j);
    }

    @Override // defpackage.ph1
    public final void u(oi1 oi1Var) {
        this.L = oi1Var.b();
    }

    @Override // defpackage.vp3
    public final void y() {
        this.M.y();
    }

    @Override // defpackage.vp3
    public final void D() {
    }
}
