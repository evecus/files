package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ty implements s13 {
    public final rm1 I;
    public final ns J = new ns();

    public ty(rm1 rm1Var) {
        this.I = rm1Var;
    }

    @Override // defpackage.s13
    public final Object E(tm1 tm1Var, fj0 fj0Var) {
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        ry ryVar = new ry();
        ryVar.a = k10Var;
        ryVar.b = tm1Var;
        k10Var.v(new sy(this.J.a(ryVar, this.I)));
        return k10Var.r();
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
        return q8.s0;
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
