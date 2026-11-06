package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l35 extends wt0 implements ye0, w25 {
    public v05 K;
    public o45 L;
    public p45 M;
    public ck0 N;
    public rv4 O;
    public final wu0 P = dt4.b(new iy3(this, 12));
    public m14 Q = m14.e;

    public l35(v05 v05Var, o45 o45Var, p45 p45Var, ck0 ck0Var) {
        this.K = v05Var;
        this.L = o45Var;
        this.M = p45Var;
        this.N = ck0Var;
    }

    @Override // defpackage.w25
    public final v25 G() {
        return (v25) this.P.getValue();
    }

    @Override // defpackage.w25
    public final long a(ca2 ca2Var) {
        return d(ca2Var).d();
    }

    @Override // defpackage.w25
    public final m14 d(ca2 ca2Var) {
        if (!isAttached()) {
            return this.Q;
        }
        m14 m14Var = (m14) this.N.invoke(ca2Var);
        if (m14Var == null) {
            return this.Q;
        }
        this.Q = m14Var;
        return m14Var;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        v05 v05Var = this.K;
        v05Var.b = v85.K;
        v05Var.a = this;
    }

    @Override // defpackage.k13
    public final void onDetach() {
        v05 v05Var = this.K;
        v05Var.b = v85.J;
        v05Var.a = null;
        super.onDetach();
    }
}
