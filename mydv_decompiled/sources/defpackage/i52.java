package defpackage;

/* loaded from: classes2.dex */
public final class i52 extends n0 {
    public qo1 I;
    public l0 J;
    public a0 K;

    public static i52 m(ct ctVar, boolean z) {
        x0 x0Var = (x0) x0.J.j(ctVar, z);
        if (x0Var == null) {
            return null;
        }
        x0 x = x0.x(x0Var);
        i52 i52Var = new i52();
        if (x.size() != 2 && x.size() != 3) {
            hn3.g(x.size(), "Bad sequence size: ");
            return null;
        }
        i52Var.I = qo1.m(x.y(0));
        i52Var.J = l0.v(x.y(1));
        if (x.size() == 3) {
            i52Var.K = a0.x(x.y(2));
        }
        return i52Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        f0Var.a(this.I);
        f0Var.a(this.J);
        a0 a0Var = this.K;
        if (a0Var != null) {
            f0Var.a(a0Var);
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
