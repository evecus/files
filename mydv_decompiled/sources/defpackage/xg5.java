package defpackage;

/* loaded from: classes2.dex */
public final class xg5 extends n0 {
    public qo1 I;
    public i52 J;
    public bd3 K;

    public static xg5 m(n0 n0Var) {
        int i;
        if (n0Var instanceof xg5) {
            return (xg5) n0Var;
        }
        if (n0Var != null) {
            x0 x = x0.x(n0Var);
            xg5 xg5Var = new xg5();
            if (x.size() <= 3) {
                if (x.size() <= 0 || (x.y(0) instanceof ct)) {
                    i = 0;
                } else {
                    xg5Var.I = qo1.m(x.y(0));
                    i = 1;
                }
                while (i != x.size()) {
                    ct y = ct.y(x.y(i));
                    int i2 = y.K;
                    if (i2 == 0) {
                        xg5Var.J = i52.m(y, false);
                    } else {
                        if (i2 != 1) {
                            hn3.g(y.K, "Bad tag number: ");
                            return null;
                        }
                        xg5Var.K = bd3.m(y);
                    }
                    i++;
                }
                return xg5Var;
            }
            hn3.g(x.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        qo1 qo1Var = this.I;
        if (qo1Var != null) {
            f0Var.a(qo1Var);
        }
        i52 i52Var = this.J;
        int i = 2;
        int i2 = 128;
        if (i52Var != null) {
            f0Var.a(new ct(i, i2, 0, i52Var, (byte) 1));
        }
        bd3 bd3Var = this.K;
        if (bd3Var != null) {
            f0Var.a(new ct(i, i2, 1, bd3Var, (byte) 1));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
