package defpackage;

/* loaded from: classes2.dex */
public final class d20 extends n0 {
    public x0 I;
    public j15 J;

    public static d20 m(u0 u0Var) {
        l0 l0Var;
        int i;
        boolean z;
        boolean z2;
        x0 x = x0.x(u0Var);
        d20 d20Var = new d20();
        d20Var.I = x;
        j15 j15Var = null;
        if (x.size() != 3) {
            s83.t("sequence wrong size for a certificate");
            return null;
        }
        e0 y = x.y(0);
        if (y instanceof j15) {
            j15Var = (j15) y;
        } else if (y != null) {
            x0 x2 = x0.x(y);
            j15 j15Var2 = new j15();
            j15Var2.I = x2;
            if (x2.y(0) instanceof ct) {
                l0Var = (l0) l0.K.j((ct) x2.y(0), true);
                j15Var2.J = l0Var;
                i = 0;
            } else {
                l0Var = l0.M;
                j15Var2.J = l0Var;
                i = -1;
            }
            if (l0Var.y(0)) {
                z2 = false;
                z = true;
            } else if (j15Var2.J.y(1)) {
                z = false;
                z2 = true;
            } else {
                if (!j15Var2.J.y(2)) {
                    j15.m("version number not recognised");
                    throw null;
                }
                z = false;
                z2 = false;
            }
            j15Var2.K = l0.v(x2.y(i + 1));
            j15Var2.L = p8.m(x2.y(i + 2));
            sz5 m = sz5.m(x2.y(i + 3));
            j15Var2.M = m;
            if (m.L.length == 0 && !ox3.c("org.bouncycastle.x509.allow_empty_issuer_cert")) {
                j15.m("certificate issuer is an empty distinguished name");
                throw null;
            }
            e0 y2 = x2.y(i + 4);
            j15Var2.N = y2 instanceof ah5 ? (ah5) y2 : y2 != null ? new ah5(x0.x(y2)) : null;
            j15Var2.O = sz5.m(x2.y(i + 5));
            int i2 = i + 6;
            j15Var2.P = zy4.m(x2.y(i2));
            int size = (x2.size() - i2) - 1;
            if (size != 0 && z) {
                j15.m("version 1 certificate contains extra data");
                throw null;
            }
            while (size > 0) {
                ct ctVar = (ct) x2.y(i2 + size);
                int i3 = ctVar.K;
                y yVar = a0.J;
                if (i3 == 1) {
                    wx5.f(ctVar);
                    u0 v = ctVar.v(false, yVar);
                    yVar.c(v);
                    j15Var2.Q = (a0) v;
                } else if (i3 == 2) {
                    wx5.f(ctVar);
                    u0 v2 = ctVar.v(false, yVar);
                    yVar.c(v2);
                    j15Var2.R = (a0) v2;
                } else {
                    if (i3 != 3) {
                        j15.m("Unknown tag encountered in structure: " + ctVar.K);
                        throw null;
                    }
                    if (z2) {
                        j15.m("version 2 certificate cannot contain extensions");
                        throw null;
                    }
                    wx5.f(ctVar);
                    y yVar2 = x0.J;
                    u0 v3 = ctVar.v(true, yVar2);
                    yVar2.c(v3);
                    j15Var2.S = xc1.m((x0) v3);
                }
                size--;
            }
            j15Var = j15Var2;
        }
        d20Var.J = j15Var;
        p8.m(x.y(1));
        a0.x(x.y(2));
        return d20Var;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }
}
