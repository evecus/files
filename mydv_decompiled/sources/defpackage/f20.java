package defpackage;

/* loaded from: classes2.dex */
public final class f20 extends n0 {
    public g20 I;
    public p8 J;
    public dn0 K;

    public static f20 m(u0 u0Var) {
        z0 z0Var;
        g20 g20Var = null;
        if (u0Var == null) {
            return null;
        }
        x0 x = x0.x(u0Var);
        f20 f20Var = new f20();
        f20Var.I = null;
        f20Var.J = null;
        f20Var.K = null;
        int i = 0;
        e0 y = x.y(0);
        if (y instanceof g20) {
            g20Var = (g20) y;
        } else if (y != null) {
            x0 x2 = x0.x(y);
            g20 g20Var2 = new g20();
            g20Var2.I = l0.M;
            g20Var2.L = null;
            g20Var2.I = (l0) x2.y(0);
            g20Var2.J = sz5.m(x2.y(1));
            g20Var2.K = zy4.m(x2.y(2));
            if (x2.size() > 3) {
                z0Var = (z0) z0.K.j((ct) x2.y(3), false);
                g20Var2.L = z0Var;
            } else {
                z0Var = null;
            }
            if (z0Var != null) {
                e0[] e0VarArr = z0Var.I;
                while (i < e0VarArr.length) {
                    if (i >= e0VarArr.length) {
                        zy.k();
                        return null;
                    }
                    int i2 = i + 1;
                    ar m = ar.m(e0VarArr[i]);
                    if (m.I.r(yh3.f) && m.J.I.length != 1) {
                        s83.t("challengePassword attribute must have one value");
                        return null;
                    }
                    i = i2;
                }
            }
            if (g20Var2.J == null || g20Var2.I == null || g20Var2.K == null) {
                s83.t("Not all mandatory fields set in CertificationRequestInfo generator.");
                return null;
            }
            g20Var = g20Var2;
        }
        f20Var.I = g20Var;
        f20Var.J = p8.m(x.y(1));
        f20Var.K = (dn0) x.y(2);
        return f20Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        f0Var.a(this.I);
        f0Var.a(this.J);
        f0Var.a(this.K);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
