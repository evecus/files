package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class uz5 implements Serializable {
    public final transient e20 I;

    public uz5(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            u0 n = new k0(byteArrayInputStream, byteArrayInputStream.available(), true).n();
            if (n == null) {
                throw new IOException("no content found");
            }
            e20 m = e20.m(n);
            i15 i15Var = m.I;
            this.I = m;
            try {
                a(i15Var.O);
                sz5 sz5Var = i15Var.K;
            } catch (RuntimeException e) {
                hn3.j("malformed IssuingDistributionPoint extension: ", e.getMessage(), e);
                throw null;
            }
        } catch (RuntimeException e2) {
            hn3.j("malformed data: ", e2.getMessage(), e2);
            throw null;
        }
    }

    public static void a(xc1 xc1Var) {
        j52 j52Var;
        my0 my0Var;
        if (xc1Var == null) {
            return;
        }
        hc1 hc1Var = (hc1) xc1Var.I.get(hc1.L);
        if (hc1Var != null) {
            try {
                u0 s = u0.s(hc1Var.K.I);
                if (s != null) {
                    x0 x = x0.x(s);
                    j52Var = new j52();
                    j52Var.O = x;
                    for (int i = 0; i != x.size(); i++) {
                        ct y = ct.y(x.y(i));
                        int i2 = y.K;
                        if (i2 != 0) {
                            y yVar = c0.J;
                            if (i2 == 1) {
                                wx5.f(y);
                                u0 v = y.v(false, yVar);
                                yVar.c(v);
                                j52Var.J = ((c0) v).v();
                            } else if (i2 == 2) {
                                wx5.f(y);
                                u0 v2 = y.v(false, yVar);
                                yVar.c(v2);
                                j52Var.K = ((c0) v2).v();
                            } else if (i2 == 3) {
                                wx5.f(y);
                                y yVar2 = a0.J;
                                u0 v3 = y.v(false, yVar2);
                                yVar2.c(v3);
                                a0 a0Var = (a0) v3;
                                j52Var.L = new u04(a0Var.w(), a0Var.h());
                            } else if (i2 == 4) {
                                wx5.f(y);
                                u0 v4 = y.v(false, yVar);
                                yVar.c(v4);
                                j52Var.M = ((c0) v4).v();
                            } else {
                                if (i2 != 5) {
                                    s83.t("unknown tag in IssuingDistributionPoint");
                                    return;
                                }
                                wx5.f(y);
                                u0 v5 = y.v(false, yVar);
                                yVar.c(v5);
                                j52Var.N = ((c0) v5).v();
                            }
                        } else {
                            wx5.f(y);
                            n0 x2 = y.x();
                            if (x2 == null || (x2 instanceof my0)) {
                                my0Var = (my0) x2;
                            } else {
                                if (!(x2 instanceof ct)) {
                                    s83.t("unknown object in factory: ".concat(x2.getClass().getName()));
                                    return;
                                }
                                my0Var = new my0((ct) x2);
                            }
                            j52Var.I = my0Var;
                        }
                    }
                } else {
                    j52Var = null;
                }
                boolean z = j52Var.M;
            } catch (IOException e) {
                hn3.i(e, "can't convert extension: ");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uz5) {
            return this.I.equals(((uz5) obj).I);
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }
}
