package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class q51 extends v51 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q51(java.math.BigInteger r5) {
        /*
            r4 = this;
            ct3 r0 = defpackage.xe1.a
            int r0 = r5.bitLength()
            int r1 = r5.signum()
            if (r1 <= 0) goto L3d
            r1 = 2
            if (r0 < r1) goto L3d
            r2 = 3
            if (r0 >= r2) goto L33
            java.math.BigInteger r0 = defpackage.zv.a
            int r0 = r5.bitLength()
            r3 = 31
            if (r0 > r3) goto L2b
            int r0 = r5.intValue()
            if (r0 == r1) goto L28
            if (r0 == r2) goto L25
            goto L33
        L25:
            ct3 r5 = defpackage.xe1.b
            goto L39
        L28:
            ct3 r5 = defpackage.xe1.a
            goto L39
        L2b:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "BigInteger out of int range"
            r4.<init>(r5)
            throw r4
        L33:
            ct3 r0 = new ct3
            r0.<init>(r5)
            r5 = r0
        L39:
            r4.<init>(r5)
            return
        L3d:
            java.lang.String r4 = "'characteristic' must be >= 2"
            defpackage.s83.t(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q51.<init>(java.math.BigInteger):void");
    }

    @Override // defpackage.v51
    public final g61 f(int i, BigInteger bigInteger) {
        e41 h = h(bigInteger);
        e41 p0 = h.q0().k(this.b).X(h).k(this.c).p0();
        if (p0 == null) {
            s83.t("Invalid point compression");
            return null;
        }
        if (p0.v0() != (i == 1)) {
            p0 = p0.a0();
        }
        return d(h, p0);
    }

    @Override // defpackage.v51
    public e41 o(SecureRandom secureRandom) {
        BigInteger a;
        BigInteger q = q();
        while (true) {
            a = zv.a(q.bitLength(), secureRandom);
            if (a.signum() > 0 && a.compareTo(q) < 0) {
                break;
            }
        }
        e41 h = h(a);
        while (true) {
            BigInteger a2 = zv.a(q.bitLength(), secureRandom);
            if (a2.signum() > 0 && a2.compareTo(q) < 0) {
                return h.X(h(a2));
            }
        }
    }

    public BigInteger q() {
        return rm0.i;
    }
}
