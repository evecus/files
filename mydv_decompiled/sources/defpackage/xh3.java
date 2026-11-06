package defpackage;

/* loaded from: classes2.dex */
public final class xh3 {
    public final f20 a;

    public xh3(byte[] bArr) {
        p8 p8Var;
        zy4 zy4Var;
        a0 a0Var;
        try {
            f20 m = f20.m(u0.s(bArr));
            if (m == null) {
                throw new h0("empty data passed to constructor", (byte) 2);
            }
            this.a = m;
            z0 z0Var = m.I.L;
            if (z0Var != null) {
                e0[] e0VarArr = z0Var.I;
                p8Var = null;
                zy4Var = null;
                a0Var = null;
                int i = 0;
                while (i < e0VarArr.length) {
                    if (i >= e0VarArr.length) {
                        zy.k();
                        throw null;
                    }
                    int i2 = i + 1;
                    ar m2 = ar.m(e0VarArr[i]);
                    q0 q0Var = hc1.N;
                    q0 q0Var2 = m2.I;
                    p8Var = q0Var.r(q0Var2) ? p8.m(a(m2)) : p8Var;
                    zy4Var = hc1.M.r(q0Var2) ? zy4.m(a(m2)) : zy4Var;
                    if (hc1.O.r(q0Var2)) {
                        a0Var = a0.x(a(m2));
                    }
                    i = i2;
                }
            } else {
                p8Var = null;
                zy4Var = null;
                a0Var = null;
            }
            if (((p8Var != null) | (zy4Var != null)) || (a0Var != null)) {
                if (((p8Var != null) & (zy4Var != null)) && (a0Var != null)) {
                    return;
                }
                s83.t("invalid alternate public key details found");
                throw null;
            }
        } catch (ClassCastException e) {
            throw new h0("malformed data: " + e.getMessage(), e, (byte) 2);
        } catch (IllegalArgumentException e2) {
            throw new h0("malformed data: " + e2.getMessage(), e2, (byte) 2);
        }
    }

    public static e0 a(ar arVar) {
        e0[] b = f0.b(arVar.J.I);
        if (b.length == 1) {
            return b[0];
        }
        s83.t("single value attribute value not size of 1");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xh3) {
            return this.a.equals(((xh3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
