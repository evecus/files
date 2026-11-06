package defpackage;

/* loaded from: classes2.dex */
public final class bd3 extends n0 {
    public g0 I;
    public q0 J;
    public p8 K;
    public a0 L;

    public static bd3 m(ct ctVar) {
        g0 g0Var;
        int i = 0;
        x0 x0Var = (x0) x0.J.j(ctVar, false);
        if (x0Var != null) {
            x0 x = x0.x(x0Var);
            bd3 bd3Var = new bd3();
            if (x.size() <= 4 && x.size() >= 3) {
                Object y = x.y(0);
                if (y == null || (y instanceof g0)) {
                    g0Var = (g0) y;
                } else {
                    if (!(y instanceof byte[])) {
                        s83.t("illegal object in getInstance: ".concat(y.getClass().getName()));
                        return null;
                    }
                    try {
                        u0 s = u0.s((byte[]) y);
                        if (!g0.class.isInstance(s)) {
                            throw new IllegalArgumentException("unexpected object: ".concat(il2.E(s)));
                        }
                        g0Var = (g0) s;
                    } catch (Exception e) {
                        j0.h(e);
                        return null;
                    }
                }
                bd3Var.I = g0Var;
                if (x.size() == 4) {
                    i = 1;
                    bd3Var.J = q0.z(x.y(1));
                }
                bd3Var.K = p8.m(x.y(i + 1));
                bd3Var.L = a0.x(x.y(i + 2));
                return bd3Var;
            }
            hn3.g(x.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(4);
        f0Var.a(this.I);
        q0 q0Var = this.J;
        if (q0Var != null) {
            f0Var.a(q0Var);
        }
        f0Var.a(this.K);
        f0Var.a(this.L);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
