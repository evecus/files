package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class v51 {
    public final we1 a;
    public e41 b;
    public e41 c;
    public BigInteger d;
    public BigInteger e;
    public byte f = 0;
    public j81 g = null;

    public v51(we1 we1Var) {
        this.a = we1Var;
    }

    public v51 a() {
        return new xf4();
    }

    public j16 b(g61[] g61VarArr, int i) {
        int i2 = i();
        byte[] bArr = new byte[i * i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            g61 g61Var = g61VarArr[i4];
            g61Var.b.C(i3, bArr);
            int i5 = i3 + i2;
            g61Var.c.C(i5, bArr);
            i3 = i5 + i2;
        }
        return new o51(this, i, i2, bArr);
    }

    public g61 c(BigInteger bigInteger, BigInteger bigInteger2) {
        return d(h(bigInteger), h(bigInteger2));
    }

    public g61 d(e41 e41Var, e41 e41Var2) {
        return new h61(this, e41Var, e41Var2, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g61 e(byte[] r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v51.e(byte[]):g61");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v51) && g((v51) obj);
        }
        return true;
    }

    public abstract g61 f(int i, BigInteger bigInteger);

    public final boolean g(v51 v51Var) {
        if (this != v51Var) {
            return v51Var != null && this.a.equals(v51Var.a) && this.b.w0().equals(v51Var.b.w0()) && this.c.w0().equals(v51Var.c.w0());
        }
        return true;
    }

    public e41 h(BigInteger bigInteger) {
        return new wf4(bigInteger);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.w0().hashCode(), 16) ^ (this.a.hashCode() ^ Integer.rotateLeft(this.b.w0().hashCode(), 8));
    }

    public int i() {
        return (j() + 7) / 8;
    }

    public int j() {
        return 113;
    }

    public abstract g61 k();

    public g61 l(g61 g61Var) {
        if (this == g61Var.a) {
            return g61Var;
        }
        if (g61Var.i()) {
            return k();
        }
        g61 l = g61Var.l();
        return c(l.b.w0(), l.f().w0());
    }

    public final void m(g61[] g61VarArr) {
        String str;
        int length = g61VarArr.length;
        if (length >= 0 && g61VarArr.length - length >= 0) {
            for (g61 g61Var : g61VarArr) {
                if (g61Var != null && this != g61Var.a) {
                    str = "'points' entries must be null or on this curve";
                }
            }
            byte b = this.f;
            if (b == 0 || b == 5) {
                return;
            }
            e41[] e41VarArr = new e41[length];
            int[] iArr = new int[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                g61 g61Var2 = g61VarArr[i2];
                if (g61Var2 != null && !g61Var2.j()) {
                    e41VarArr[i] = g61Var2.g();
                    iArr[i] = i2;
                    i++;
                }
            }
            if (i == 0) {
                return;
            }
            e41[] e41VarArr2 = new e41[i];
            e41VarArr2[0] = e41VarArr[0];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    break;
                }
                e41VarArr2[i4] = e41VarArr2[i3].X(e41VarArr[i4]);
                i3 = i4;
            }
            e41 P = e41VarArr2[i3].P();
            while (i3 > 0) {
                int i5 = i3 - 1;
                e41 e41Var = e41VarArr[i3];
                e41VarArr[i3] = e41VarArr2[i5].X(P);
                P = P.X(e41Var);
                i3 = i5;
            }
            e41VarArr[0] = P;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i6];
                g61VarArr[i7] = g61VarArr[i7].m(e41VarArr[i6]);
            }
            return;
        }
        str = "invalid range specified for 'points'";
        s83.t(str);
    }

    public final er3 n(g61 g61Var, String str, dr3 dr3Var) {
        Hashtable hashtable;
        er3 a;
        if (g61Var == null || this != g61Var.a) {
            s83.t("'point' must be non-null and on this curve");
            return null;
        }
        synchronized (g61Var) {
            try {
                hashtable = g61Var.e;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    g61Var.e = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                er3 er3Var = (er3) hashtable.get(str);
                a = dr3Var.a(er3Var);
                if (a != er3Var) {
                    hashtable.put(str, a);
                }
            } finally {
            }
        }
        return a;
    }

    public e41 o(SecureRandom secureRandom) {
        BigInteger a;
        BigInteger a2;
        int j = j();
        do {
            a = zv.a(j, secureRandom);
        } while (a.signum() <= 0);
        e41 h = h(a);
        do {
            a2 = zv.a(j, secureRandom);
        } while (a2.signum() <= 0);
        return h.X(h(a2));
    }

    public boolean p(int i) {
        return i == 0 || i == 1 || i == 6;
    }
}
