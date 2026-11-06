package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class p51 extends v51 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p51(int r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "org.bouncycastle.ec.max_f2m_field_size"
            r1 = 1142(0x476, float:1.6E-42)
            int r0 = defpackage.ox3.a(r1, r0)
            r1 = 0
            if (r7 > r0) goto L77
            r0 = r9 | r10
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L1c
            int[] r9 = new int[r3]
            r9[r5] = r5
            r9[r4] = r8
            r9[r2] = r7
            goto L2b
        L1c:
            r0 = 5
            int[] r0 = new int[r0]
            r0[r5] = r5
            r0[r4] = r8
            r0[r2] = r9
            r0[r3] = r10
            r8 = 4
            r0[r8] = r7
            r9 = r0
        L2b:
            ct3 r7 = defpackage.xe1.a
            r7 = r9[r5]
            if (r7 != 0) goto L71
        L31:
            int r7 = r9.length
            if (r4 >= r7) goto L45
            r7 = r9[r4]
            int r8 = r4 + (-1)
            r8 = r9[r8]
            if (r7 <= r8) goto L3f
            int r4 = r4 + 1
            goto L31
        L3f:
            java.lang.String r6 = "Polynomial exponents must be monotonically increasing"
            defpackage.s83.t(r6)
            throw r1
        L45:
            ip1 r7 = new ip1
            ct3 r8 = defpackage.xe1.a
            xn1 r10 = new xn1
            r10.<init>(r9)
            r7.<init>(r8, r10)
            r6.<init>(r7)
            java.lang.String r6 = "org.bouncycastle.ec.disable"
            boolean r6 = defpackage.ox3.c(r6)
            if (r6 != 0) goto L6b
            java.lang.String r6 = "org.bouncycastle.ec.disable_f2m"
            boolean r6 = defpackage.ox3.c(r6)
            if (r6 != 0) goto L65
            return
        L65:
            java.lang.String r6 = "F2M disabled by \"org.bouncycastle.ec.disable_f2m\""
            defpackage.zy.p(r6)
            throw r1
        L6b:
            java.lang.String r6 = "F2M disabled by \"org.bouncycastle.ec.disable\""
            defpackage.zy.p(r6)
            throw r1
        L71:
            java.lang.String r6 = "Irreducible polynomials in GF(2) must have constant term"
            defpackage.s83.t(r6)
            throw r1
        L77:
            java.lang.String r6 = "field size out of range: "
            java.lang.String r6 = defpackage.hf1.u(r7, r6)
            defpackage.s83.t(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p51.<init>(int, int, int, int):void");
    }

    @Override // defpackage.v51
    public final g61 c(BigInteger bigInteger, BigInteger bigInteger2) {
        e41 h = h(bigInteger);
        e41 h2 = h(bigInteger2);
        byte b = this.f;
        if (b == 5 || b == 6) {
            if (!h.T()) {
                h2 = h2.B(h).k(h);
            } else if (!h2.q0().equals(this.c)) {
                s83.d();
                return null;
            }
        }
        return d(h, h2);
    }

    @Override // defpackage.v51
    public final g61 f(int i, BigInteger bigInteger) {
        e41 e41Var;
        e41 h = h(bigInteger);
        if (h.T()) {
            e41Var = this.c.p0();
        } else {
            e41 q = q(h.q0().P().X(this.c).k(this.b).k(h));
            if (q != null) {
                if (q.v0() != (i == 1)) {
                    q = q.l();
                }
                byte b = this.f;
                e41Var = (b == 5 || b == 6) ? q.k(h) : q.X(h);
            } else {
                e41Var = null;
            }
        }
        if (e41Var != null) {
            return d(h, e41Var);
        }
        s83.t("Invalid point compression");
        return null;
    }

    public final e41 q(e41 e41Var) {
        e41 e41Var2;
        x51 x51Var = (x51) e41Var;
        boolean C0 = x51Var.C0();
        if (C0 && x51Var.D0() != 0) {
            return null;
        }
        int j = j();
        if ((j & 1) != 0) {
            e41 B0 = x51Var.B0();
            if (C0 || B0.q0().k(B0).k(e41Var).T()) {
                return B0;
            }
            return null;
        }
        if (e41Var.T()) {
            return e41Var;
        }
        e41 h = h(n51.a);
        Random random = new Random();
        do {
            e41 h2 = h(new BigInteger(j, random));
            e41 e41Var3 = e41Var;
            e41Var2 = h;
            for (int i = 1; i < j; i++) {
                e41 q0 = e41Var3.q0();
                e41Var2 = e41Var2.q0().k(q0.X(h2));
                e41Var3 = q0.k(e41Var);
            }
            if (!e41Var3.T()) {
                return null;
            }
        } while (e41Var2.q0().k(e41Var2).T());
        return e41Var2;
    }
}
