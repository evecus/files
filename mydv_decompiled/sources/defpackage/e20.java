package defpackage;

/* loaded from: classes2.dex */
public final class e20 extends n0 {
    public i15 I;
    public p8 J;
    public a0 K;
    public boolean L;
    public int M;

    public static e20 m(u0 u0Var) {
        x0 x = x0.x(u0Var);
        e20 e20Var = new e20();
        int i = 0;
        e20Var.L = false;
        i15 i15Var = null;
        if (x.size() != 3) {
            s83.t("sequence wrong size for CertificateList");
            return null;
        }
        e0 y = x.y(0);
        if (y instanceof i15) {
            i15Var = (i15) y;
        } else if (y != null) {
            x0 x2 = x0.x(y);
            i15 i15Var2 = new i15();
            if (x2.size() < 3 || x2.size() > 7) {
                hn3.g(x2.size(), "Bad sequence size: ");
                return null;
            }
            if (x2.y(0) instanceof l0) {
                i15Var2.I = l0.v(x2.y(0));
                i = 1;
            } else {
                i15Var2.I = null;
            }
            i15Var2.J = p8.m(x2.y(i));
            int i2 = i + 2;
            sz5 m = sz5.m(x2.y(i + 1));
            i15Var2.K = m;
            if (m.L.length == 0) {
                s83.t("CRL issuer is an empty distinguished name");
                return null;
            }
            int i3 = i + 3;
            i15Var2.L = m75.m(x2.y(i2));
            if (i3 < x2.size() && ((x2.y(i3) instanceof c1) || (x2.y(i3) instanceof i0) || (x2.y(i3) instanceof m75))) {
                i15Var2.M = m75.m(x2.y(i3));
                i3 = i + 4;
            }
            if (i3 < x2.size() && !(x2.y(i3) instanceof ct)) {
                i15Var2.N = x0.x(x2.y(i3));
                i3++;
            }
            if (i3 < x2.size() && (x2.y(i3) instanceof ct)) {
                i15Var2.O = xc1.m((x0) x0.J.j((ct) x2.y(i3), true));
            }
            i15Var = i15Var2;
        }
        e20Var.I = i15Var;
        e20Var.J = p8.m(x.y(1));
        e20Var.K = a0.x(x.y(2));
        return e20Var;
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

    @Override // defpackage.n0
    public final int hashCode() {
        if (!this.L) {
            this.M = super.hashCode();
            this.L = true;
        }
        return this.M;
    }
}
