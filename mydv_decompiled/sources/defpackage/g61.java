package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class g61 {
    public static final e41[] g = new e41[0];
    public final v51 a;
    public final e41 b;
    public final e41 c;
    public final e41[] d;
    public Hashtable e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g61(defpackage.v51 r6, defpackage.e41 r7, defpackage.e41 r8, byte r9) {
        /*
            r5 = this;
            r5.f = r9
            r9 = 0
            if (r6 != 0) goto L7
            r0 = r9
            goto L9
        L7:
            byte r0 = r6.f
        L9:
            if (r0 == 0) goto L43
            r1 = 5
            if (r0 == r1) goto L43
            java.math.BigInteger r1 = defpackage.n51.b
            e41 r1 = r6.h(r1)
            r2 = 1
            if (r0 == r2) goto L3e
            r3 = 2
            if (r0 == r3) goto L3e
            r4 = 3
            if (r0 == r4) goto L34
            r4 = 4
            if (r0 == r4) goto L2b
            r3 = 6
            if (r0 != r3) goto L24
            goto L3e
        L24:
            java.lang.String r5 = "unknown coordinate system"
            defpackage.s83.t(r5)
            r5 = 0
            throw r5
        L2b:
            e41 r0 = r6.b
            e41[] r3 = new defpackage.e41[r3]
            r3[r9] = r1
            r3[r2] = r0
            goto L45
        L34:
            e41[] r0 = new defpackage.e41[r4]
            r0[r9] = r1
            r0[r2] = r1
            r0[r3] = r1
            r3 = r0
            goto L45
        L3e:
            e41[] r3 = new defpackage.e41[r2]
            r3[r9] = r1
            goto L45
        L43:
            e41[] r3 = defpackage.g61.g
        L45:
            r5.<init>(r6, r7, r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g61.<init>(v51, e41, e41, byte):void");
    }

    public abstract g61 a(g61 g61Var);

    public final void b() {
        if (j()) {
            return;
        }
        zy.i("point not in normal form");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.g61 r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L75
        L5:
            v51 r1 = r9.a
            r2 = 1
            v51 r3 = r8.a
            if (r3 != 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r0
        Lf:
            if (r1 != 0) goto L13
            r5 = r2
            goto L14
        L13:
            r5 = r0
        L14:
            boolean r6 = r8.i()
            boolean r7 = r9.i()
            if (r6 != 0) goto L66
            if (r7 == 0) goto L21
            goto L66
        L21:
            if (r4 == 0) goto L26
            if (r5 == 0) goto L26
            goto L4d
        L26:
            if (r4 == 0) goto L2d
            g61 r9 = r9.l()
            goto L4d
        L2d:
            if (r5 == 0) goto L34
            g61 r8 = r8.l()
            goto L4d
        L34:
            boolean r1 = r3.g(r1)
            if (r1 != 0) goto L3b
            goto L75
        L3b:
            g61 r9 = r3.l(r9)
            r1 = 2
            g61[] r1 = new defpackage.g61[r1]
            r1[r0] = r8
            r1[r2] = r9
            r3.m(r1)
            r8 = r1[r0]
            r9 = r1[r2]
        L4d:
            e41 r1 = r8.b
            e41 r3 = r9.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
            e41 r8 = r8.f()
            e41 r9 = r9.f()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L75
            goto L74
        L66:
            if (r6 == 0) goto L75
            if (r7 == 0) goto L75
            if (r4 != 0) goto L74
            if (r5 != 0) goto L74
            boolean r8 = r3.g(r1)
            if (r8 == 0) goto L75
        L74:
            return r2
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g61.c(g61):boolean");
    }

    public final int d() {
        v51 v51Var = this.a;
        if (v51Var == null) {
            return 0;
        }
        return v51Var.f;
    }

    public final byte[] e() {
        int H;
        if (i()) {
            return new byte[1];
        }
        if (i()) {
            H = 1;
        } else {
            H = f().H() + this.b.H() + 1;
        }
        byte[] bArr = new byte[H];
        if (i()) {
            bArr[0] = 0;
            return bArr;
        }
        g61 l = l();
        e41 e41Var = l.b;
        e41 f = l.f();
        bArr[0] = 4;
        e41Var.C(1, bArr);
        f.C(e41Var.H() + 1, bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g61) {
            return c((g61) obj);
        }
        return false;
    }

    public e41 f() {
        return this.c;
    }

    public e41 g() {
        e41[] e41VarArr = this.d;
        if (e41VarArr.length <= 0) {
            return null;
        }
        return e41VarArr[0];
    }

    public final boolean h(boolean z, boolean z2) {
        if (i()) {
            return true;
        }
        return !((bh5) this.a.n(this, "bc_validity", new f61(this, z, z2))).a;
    }

    public final int hashCode() {
        v51 v51Var = this.a;
        int i = v51Var == null ? 0 : ~v51Var.hashCode();
        if (i()) {
            return i;
        }
        g61 l = l();
        return (l.f().hashCode() * TsExtractor.TS_STREAM_TYPE_AIT) ^ (i ^ (l.b.hashCode() * 17));
    }

    public final boolean i() {
        if (this.b == null || this.c == null) {
            return true;
        }
        e41[] e41VarArr = this.d;
        return e41VarArr.length > 0 && e41VarArr[0].T();
    }

    public final boolean j() {
        int d = d();
        return d == 0 || d == 5 || i() || this.d[0].S();
    }

    public abstract g61 k();

    public final g61 l() {
        int d;
        if (i() || (d = d()) == 0 || d == 5) {
            return this;
        }
        e41 g2 = g();
        if (g2.S()) {
            return this;
        }
        v51 v51Var = this.a;
        if (v51Var != null) {
            e41 o = v51Var.o(jm0.a());
            return m(g2.X(o).P().X(o));
        }
        zy.i("Detached points must be in affine coordinates");
        return null;
    }

    public final g61 m(e41 e41Var) {
        int d = d();
        e41 e41Var2 = this.c;
        e41 e41Var3 = this.b;
        v51 v51Var = this.a;
        if (d != 1) {
            if (d == 2 || d == 3 || d == 4) {
                e41 q0 = e41Var.q0();
                return v51Var.d(e41Var3.X(q0), e41Var2.X(q0.X(e41Var)));
            }
            if (d != 6) {
                zy.i("not a projective coordinate system");
                return null;
            }
        }
        return v51Var.d(e41Var3.X(e41Var), e41Var2.X(e41Var));
    }

    public final boolean n() {
        BigInteger bigInteger;
        BigInteger bigInteger2 = n51.b;
        v51 v51Var = this.a;
        if (!bigInteger2.equals(v51Var.e) && (bigInteger = v51Var.d) != null) {
            BigInteger abs = bigInteger.abs();
            g61 k = v51Var.k();
            int bitLength = abs.bitLength();
            if (bitLength > 0) {
                if (abs.testBit(0)) {
                    k = this;
                }
                for (int i = 1; i < bitLength; i++) {
                    this = this.p();
                    if (abs.testBit(i)) {
                        k = k.a(this);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                k = k.k();
            }
            if (!k.i()) {
                return false;
            }
        }
        return true;
    }

    public g61 o(int i) {
        if (i < 0) {
            s83.t("'e' cannot be negative");
            return null;
        }
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            this = this.p();
        }
    }

    public abstract g61 p();

    public abstract g61 q(g61 g61Var);

    public final String toString() {
        if (i()) {
            return "INF";
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        int i = 0;
        while (true) {
            e41[] e41VarArr = this.d;
            if (i >= e41VarArr.length) {
                sb.append(')');
                return sb.toString();
            }
            sb.append(',');
            sb.append(e41VarArr[i]);
            i++;
        }
    }

    public g61(v51 v51Var, e41 e41Var, e41 e41Var2, e41[] e41VarArr) {
        this.e = null;
        this.a = v51Var;
        this.b = e41Var;
        this.c = e41Var2;
        this.d = e41VarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g61(v51 v51Var, e41 e41Var, e41 e41Var2, e41[] e41VarArr, byte b) {
        this(v51Var, e41Var, e41Var2, e41VarArr);
        this.f = b;
    }
}
