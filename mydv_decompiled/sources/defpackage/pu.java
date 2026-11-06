package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class pu extends wt0 {
    public long K;
    public long L;
    public rx4 M;
    public rx4 N;
    public float O;
    public float P;
    public float Q;
    public rv4 S;
    public bh T;
    public rv4 U;
    public final fk3 R = new fk3(0.0f);
    public final zj2 V = new zj2();

    public pu(long j, long j2, rx4 rx4Var, rx4 rx4Var2, float f, float f2, float f3) {
        this.K = j;
        this.L = j2;
        this.M = rx4Var;
        this.N = rx4Var2;
        this.O = f;
        this.P = f2;
        this.Q = f3;
    }

    public abstract void m0();

    public abstract void n0();

    public final void o0(float f) {
        bh bhVar = this.T;
        if (bhVar == null) {
            bhVar = p70.a(f);
            this.T = bhVar;
        }
        if (!isAttached() || ((Number) bhVar.e.getValue()).floatValue() == f) {
            return;
        }
        rv4 rv4Var = this.U;
        if (rv4Var == null || rv4Var.N()) {
            this.U = p70.g0(getCoroutineScope(), null, null, new nu(bhVar, f, null), 3);
        }
    }

    @Override // defpackage.k13
    public final void onAttach() {
        p0();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.T = null;
    }

    public final void p0() {
        rv4 rv4Var = this.S;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.S = null;
        if (isAttached()) {
            if (r11.b(this.Q, 0.0f) <= 0 || r11.b(this.P, 0.0f) <= 0) {
                this.R.i(0.0f);
                return;
            }
            int round = Math.round((this.P / this.Q) * 1000.0f);
            if (round < 50) {
                round = 50;
            }
            this.S = p70.g0(getCoroutineScope(), null, null, new ou(this, round, fj0Var, (byte) 0), 3);
        }
    }
}
