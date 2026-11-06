package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class p06 {
    public static jq a(qt3 qt3Var) {
        p8 p8Var = qt3Var.J;
        q0 q0Var = p8Var.I;
        if (q0Var.r(zh3.a) || q0Var.r(h52.a)) {
            try {
                i06 m = i06.m(p8Var.J);
                if (m == null) {
                    throw new IOException("no parameters found in XMSS private key");
                }
                q0 q0Var2 = m.K.I;
                r06 m2 = r06.m(qt3Var.o());
                u06 u06Var = new u06(new q06(m.J, zw0.c(zw0.a(q0Var2).c()), -1));
                int i = m2.J;
                byte[] bArr = m2.P;
                byte[] bArr2 = m2.M;
                u06Var.b = i;
                u06Var.d = g4.s(g4.s(m2.K));
                u06Var.e = g4.s(g4.s(m2.L));
                u06Var.f = g4.s(g4.s(bArr2));
                u06Var.g = g4.s(g4.s(m2.N));
                if (m2.I != 0) {
                    u06Var.c = m2.O;
                }
                if (g4.s(bArr) != null) {
                    qs qsVar = (qs) ry5.b(g4.s(bArr), qs.class, g4.s(bArr2));
                    qsVar.getClass();
                    u06Var.a(new qs(qsVar, q0Var2, -1));
                }
                if (u06Var.i == null && (u06Var.f == null || u06Var.d == null)) {
                    throw new IllegalStateException("publicSeed or secretKeySeed is null");
                }
                return new v06(u06Var);
            } catch (ArithmeticException e) {
                throw k21.Z("malformed XMSS private key: " + e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw k21.Z("ClassNotFoundException processing BDS state: " + e2.getMessage(), e2);
            } catch (IllegalArgumentException e3) {
                throw k21.Z("malformed XMSS private key: " + e3.getMessage(), e3);
            } catch (IllegalStateException e4) {
                throw k21.Z("malformed XMSS private key: " + e4.getMessage(), e4);
            }
        }
        if (q0Var.r(zh3.b) || q0Var.r(h52.b)) {
            try {
                j06 m3 = j06.m(p8Var.J);
                if (m3 == null) {
                    throw new IOException("no parameters found in XMSS^MT private key");
                }
                q0 q0Var3 = m3.L.I;
                l06 m4 = l06.m(qt3Var.o());
                m06 m06Var = new m06(new k06(m3.J, m3.K, -1, zw0.c(zw0.a(q0Var3).c())));
                long j = m4.J;
                byte[] bArr3 = m4.P;
                byte[] bArr4 = m4.N;
                m06Var.b = j;
                m06Var.d = g4.s(g4.s(m4.L));
                m06Var.e = g4.s(g4.s(m4.M));
                m06Var.f = g4.s(g4.s(bArr4));
                m06Var.g = g4.s(g4.s(m4.O));
                if (m4.I != 0) {
                    m06Var.c = m4.K;
                }
                if (g4.s(bArr3) != null) {
                    ss ssVar = (ss) ry5.b(g4.s(bArr3), ss.class, g4.s(bArr4));
                    m06Var.a(ssVar.h(ssVar.J, q0Var3, -1));
                }
                if (m06Var.i == null && (m06Var.f == null || m06Var.d == null)) {
                    throw new IllegalStateException("publicSeed or secretKeySeed is null");
                }
                return new n06(m06Var);
            } catch (ArithmeticException e5) {
                throw k21.Z("malformed XMSS^MT private key: " + e5.getMessage(), e5);
            } catch (ClassNotFoundException e6) {
                throw k21.Z("ClassNotFoundException processing BDS state: " + e6.getMessage(), e6);
            } catch (IllegalArgumentException e7) {
                throw k21.Z("malformed XMSS^MT private key: " + e7.getMessage(), e7);
            } catch (IllegalStateException e8) {
                throw k21.Z("malformed XMSS^MT private key: " + e8.getMessage(), e8);
            }
        }
        if (q0Var.r(dw1.a)) {
            try {
                byte[] bArr5 = r0.v(qt3Var.o()).I;
                if (bArr5.length < 4) {
                    throw new IOException("XMSS private key data too short");
                }
                int k = dq2.k(0, bArr5);
                q06 q06Var = (q06) q06.g.get(Integer.valueOf(k));
                if (q06Var == null) {
                    throw new IOException("unknown XMSS private key OID: " + k);
                }
                u06 u06Var2 = new u06(q06Var);
                byte[] s = g4.s(g4.x(bArr5, 4, bArr5.length));
                u06Var2.i = s;
                if (s == null && (u06Var2.f == null || u06Var2.d == null)) {
                    throw new IllegalStateException("publicSeed or secretKeySeed is null");
                }
                return new v06(u06Var2);
            } catch (IllegalArgumentException e9) {
                throw k21.Z("malformed XMSS private key: " + e9.getMessage(), e9);
            }
        }
        if (!q0Var.r(dw1.b)) {
            return null;
        }
        try {
            byte[] bArr6 = r0.v(qt3Var.o()).I;
            if (bArr6.length < 4) {
                throw new IOException("XMSS^MT private key data too short");
            }
            int k2 = dq2.k(0, bArr6);
            k06 k06Var = (k06) k06.d.get(Integer.valueOf(k2));
            if (k06Var == null) {
                throw new IOException("unknown XMSS^MT private key OID: " + k2);
            }
            m06 m06Var2 = new m06(k06Var);
            byte[] s2 = g4.s(g4.x(bArr6, 4, bArr6.length));
            m06Var2.i = s2;
            if (s2 == null && (m06Var2.f == null || m06Var2.d == null)) {
                throw new IllegalStateException("publicSeed or secretKeySeed is null");
            }
            return new n06(m06Var2);
        } catch (IllegalArgumentException e10) {
            throw k21.Z("malformed XMSS^MT private key: " + e10.getMessage(), e10);
        }
    }

    public static o06 b(mc3 mc3Var, g73 g73Var, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        double d;
        int i = ((yz) mc3Var.a).c;
        byte[][] bArr4 = (byte[][]) g73Var.J;
        o06[] o06VarArr = new o06[bArr4.length];
        for (int i2 = 0; i2 != bArr4.length; i2++) {
            o06VarArr[i2] = new o06(0, bArr4[i2]);
        }
        dq2.a0(bArr, 0, 20);
        int i3 = 0;
        while (i > 1) {
            int i4 = 0;
            while (true) {
                d = i / 2;
                if (i4 >= ((int) Math.floor(d))) {
                    break;
                }
                dq2.a0(bArr, i4, 24);
                int i5 = i4 * 2;
                o06VarArr[i4] = c(mc3Var, o06VarArr[i5], o06VarArr[i5 + 1], bArr, bArr2, bArr3);
                i4++;
            }
            if (i % 2 == 1) {
                o06VarArr[(int) Math.floor(d)] = o06VarArr[i - 1];
            }
            i = (int) Math.ceil(i / 2.0d);
            i3++;
            dq2.a0(bArr, i3, 20);
        }
        return o06VarArr[0];
    }

    public static o06 c(mc3 mc3Var, o06 o06Var, o06 o06Var2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (o06Var.I != o06Var2.I) {
            zy.i("height of both nodes must be equal");
            return null;
        }
        byte[] bArr4 = (byte[]) mc3Var.d;
        z82 z82Var = (z82) mc3Var.b;
        int i = ((yz) mc3Var.a).b;
        dq2.a0(bArr, 0, 28);
        z82Var.a(3, bArr4, bArr, bArr2, 0);
        dq2.a0(bArr, 1, 28);
        z82Var.a(3, bArr4, bArr, bArr3, 0);
        dq2.a0(bArr, 2, 28);
        z82Var.a(3, bArr4, bArr, bArr3, i);
        byte[] bArr5 = o06Var.J;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr5[i2]);
        }
        byte[] bArr6 = o06Var2.J;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i + i3;
            bArr3[i4] = (byte) (bArr3[i4] ^ bArr6[i3]);
        }
        byte[] bArr7 = new byte[i];
        z82Var.a(1, bArr2, bArr3, bArr7, 0);
        return new o06(o06Var.I, bArr7);
    }
}
