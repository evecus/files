package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class b06 extends n0 implements f06 {
    public static final BigInteger N = BigInteger.valueOf(1);
    public e06 I;
    public a06 J;
    public d06 K;
    public BigInteger L;
    public BigInteger M;

    public b06(v51 v51Var, d06 d06Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        e06 e06Var;
        a06 a06Var = new a06();
        a06Var.K = null;
        a06Var.I = v51Var;
        a06Var.J = g4.s(bArr);
        we1 we1Var = v51Var.a;
        int a = we1Var.a();
        q0 q0Var = f06.f;
        if (a == 1) {
            a06Var.K = q0Var;
        } else {
            if (we1Var.a() <= 1 || !we1Var.b().equals(n51.c) || !(we1Var instanceof ip1)) {
                s83.t("This type of ECCurve is not implemented");
                throw null;
            }
            a06Var.K = f06.g;
        }
        this.J = a06Var;
        this.K = d06Var;
        this.L = bigInteger;
        this.M = bigInteger2;
        if (we1Var.a() == 1) {
            BigInteger b = we1Var.b();
            e06Var = new e06();
            e06Var.I = q0Var;
            e06Var.J = new l0(b);
        } else {
            if (we1Var.a() <= 1 || !we1Var.b().equals(n51.c) || !(we1Var instanceof ip1)) {
                s83.t("'curve' is of an unsupported type");
                throw null;
            }
            int[] iArr = ((ip1) we1Var).b.a;
            int[] iArr2 = iArr == null ? null : (int[]) iArr.clone();
            if (iArr2.length == 3) {
                e06Var = new e06(iArr2[2], iArr2[1], 0, 0);
            } else {
                if (iArr2.length != 5) {
                    s83.t("Only trinomial and pentomial curves are supported");
                    throw null;
                }
                e06Var = new e06(iArr2[4], iArr2[1], iArr2[2], iArr2[3]);
            }
        }
        this.I = e06Var;
    }

    public static b06 m(u0 u0Var) {
        e06 e06Var;
        int A;
        int i;
        int i2;
        v51 t51Var;
        int i3;
        x0 x0Var;
        if (u0Var != null) {
            x0 x = x0.x(u0Var);
            b06 b06Var = new b06();
            if ((x.y(0) instanceof l0) && ((l0) x.y(0)).y(1)) {
                BigInteger x2 = ((l0) x.y(4)).x();
                b06Var.L = x2;
                if (x.size() == 6) {
                    b06Var.M = ((l0) x.y(5)).x();
                }
                e0 y = x.y(1);
                if (y instanceof e06) {
                    e06Var = (e06) y;
                } else if (y != null) {
                    x0 x3 = x0.x(y);
                    e06 e06Var2 = new e06();
                    e06Var2.I = q0.z(x3.y(0));
                    e06Var2.J = x3.y(1).d();
                    e06Var = e06Var2;
                } else {
                    e06Var = null;
                }
                b06Var.I = e06Var;
                BigInteger bigInteger = b06Var.M;
                x0 x4 = x0.x(x.y(2));
                a06 a06Var = new a06();
                a06Var.K = null;
                q0 q0Var = e06Var.I;
                u0 u0Var2 = e06Var.J;
                a06Var.K = q0Var;
                if (q0Var.r(f06.f)) {
                    t51Var = new u51(((l0) u0Var2).x(), new BigInteger(1, r0.v(x4.y(0)).I), new BigInteger(1, r0.v(x4.y(1)).I), x2, bigInteger, false);
                    a06Var.I = t51Var;
                    i3 = 2;
                    x0Var = x4;
                } else {
                    if (!a06Var.K.r(f06.g)) {
                        s83.t("This type of ECCurve is not implemented");
                        return null;
                    }
                    x0 x5 = x0.x(u0Var2);
                    int A2 = ((l0) x5.y(0)).A();
                    q0 q0Var2 = (q0) x5.y(1);
                    if (q0Var2.r(f06.h)) {
                        i = l0.v(x5.y(2)).A();
                        A = 0;
                        i2 = 0;
                    } else {
                        if (!q0Var2.r(f06.i)) {
                            s83.t("This type of EC basis is not implemented");
                            return null;
                        }
                        x0 x6 = x0.x(x5.y(2));
                        int A3 = l0.v(x6.y(0)).A();
                        int A4 = l0.v(x6.y(1)).A();
                        A = l0.v(x6.y(2)).A();
                        i = A3;
                        i2 = A4;
                    }
                    i3 = 2;
                    int i4 = A;
                    x0Var = x4;
                    t51Var = new t51(A2, i, i2, i4, new BigInteger(1, r0.v(x4.y(0)).I), new BigInteger(1, r0.v(x4.y(1)).I), x2, bigInteger);
                    a06Var.I = t51Var;
                }
                if (x0Var.size() == 3) {
                    a06Var.J = ((dn0) x0Var.y(i3)).w();
                }
                b06Var.J = a06Var;
                e0 y2 = x.y(3);
                if (y2 instanceof d06) {
                    b06Var.K = (d06) y2;
                    return b06Var;
                }
                b06Var.K = new d06(t51Var, ((r0) y2).I);
                return b06Var;
            }
            s83.t("bad version in X9ECParameters");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(6);
        f0Var.a(new l0(N));
        f0Var.a(this.I);
        f0Var.a(this.J);
        f0Var.a(this.K);
        f0Var.a(new l0(this.L));
        BigInteger bigInteger = this.M;
        if (bigInteger != null) {
            f0Var.a(new l0(bigInteger));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
