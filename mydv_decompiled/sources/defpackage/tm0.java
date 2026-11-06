package defpackage;

import androidx.media3.common.C;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class tm0 extends g61 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm0(v51 v51Var, e41 e41Var, e41 e41Var2, byte b) {
        super(v51Var, e41Var, e41Var2, (byte) 1);
        this.h = b;
    }

    private final g61 r(g61 g61Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (i()) {
            return g61Var;
        }
        if (g61Var.i()) {
            return this;
        }
        if (this == g61Var) {
            return p();
        }
        nf4 nf4Var = (nf4) this.b;
        nf4 nf4Var2 = (nf4) this.c;
        nf4 nf4Var3 = (nf4) g61Var.b;
        nf4 nf4Var4 = (nf4) g61Var.f();
        nf4 nf4Var5 = (nf4) this.d[0];
        nf4 nf4Var6 = (nf4) g61Var.g();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = nf4Var5.r;
        boolean M = il2.M(iArr9);
        if (M) {
            iArr = nf4Var3.r;
            iArr2 = nf4Var4.r;
        } else {
            eu5.m0(iArr9, iArr7);
            eu5.P(iArr7, nf4Var3.r, iArr6);
            eu5.P(iArr7, iArr9, iArr7);
            eu5.P(iArr7, nf4Var4.r, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = nf4Var6.r;
        boolean M2 = il2.M(iArr10);
        if (M2) {
            iArr3 = nf4Var.r;
            iArr4 = nf4Var2.r;
        } else {
            eu5.m0(iArr10, iArr8);
            eu5.P(iArr8, nf4Var.r, iArr5);
            eu5.P(iArr8, iArr10, iArr8);
            eu5.P(iArr8, nf4Var2.r, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        eu5.q0(iArr3, iArr, iArr11);
        eu5.q0(iArr4, iArr2, iArr6);
        boolean N = il2.N(iArr11);
        v51 v51Var = this.a;
        if (N) {
            return il2.N(iArr6) ? p() : v51Var.k();
        }
        eu5.m0(iArr11, iArr7);
        int[] iArr12 = new int[7];
        eu5.P(iArr7, iArr11, iArr12);
        eu5.P(iArr7, iArr3, iArr7);
        eu5.U(iArr12, iArr12);
        il2.Q(iArr4, iArr12, iArr5);
        eu5.j0(il2.g(iArr7, iArr7, iArr12), iArr12);
        nf4 nf4Var7 = new nf4(iArr8);
        eu5.m0(iArr6, iArr8);
        eu5.q0(iArr8, iArr12, iArr8);
        nf4 nf4Var8 = new nf4(iArr12);
        eu5.q0(iArr7, iArr8, iArr12);
        if ((il2.R(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && dq2.U(14, iArr5, eu5.I))) && dq2.g(11, eu5.J, iArr5) != 0) {
            dq2.Y(14, 11, iArr5);
        }
        eu5.f0(iArr5, iArr12);
        nf4 nf4Var9 = new nf4(iArr11);
        if (!M) {
            eu5.P(iArr11, iArr9, iArr11);
        }
        if (!M2) {
            eu5.P(iArr11, iArr10, iArr11);
        }
        return new tm0(v51Var, nf4Var7, nf4Var8, new e41[]{nf4Var9}, (byte) 10);
    }

    private final g61 s(g61 g61Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (i()) {
            return g61Var;
        }
        if (g61Var.i()) {
            return this;
        }
        if (this == g61Var) {
            return p();
        }
        pf4 pf4Var = (pf4) this.b;
        pf4 pf4Var2 = (pf4) this.c;
        pf4 pf4Var3 = (pf4) g61Var.b;
        pf4 pf4Var4 = (pf4) g61Var.f();
        pf4 pf4Var5 = (pf4) this.d[0];
        pf4 pf4Var6 = (pf4) g61Var.g();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = pf4Var5.r;
        boolean Q = jl2.Q(iArr10);
        if (Q) {
            iArr = pf4Var3.r;
            iArr2 = pf4Var4.r;
        } else {
            jl2.j0(iArr10, iArr5);
            wx5.A(iArr5, iArr8);
            jl2.a0(iArr8, pf4Var3.r, iArr5);
            wx5.A(iArr5, iArr7);
            jl2.a0(iArr8, iArr10, iArr5);
            wx5.A(iArr5, iArr8);
            jl2.a0(iArr8, pf4Var4.r, iArr5);
            wx5.A(iArr5, iArr8);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = pf4Var6.r;
        boolean Q2 = jl2.Q(iArr11);
        if (Q2) {
            iArr3 = pf4Var.r;
            iArr4 = pf4Var2.r;
        } else {
            jl2.j0(iArr11, iArr5);
            wx5.A(iArr5, iArr9);
            jl2.a0(iArr9, pf4Var.r, iArr5);
            wx5.A(iArr5, iArr6);
            jl2.a0(iArr9, iArr11, iArr5);
            wx5.A(iArr5, iArr9);
            jl2.a0(iArr9, pf4Var2.r, iArr5);
            wx5.A(iArr5, iArr9);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        wx5.S(iArr3, iArr, iArr12);
        wx5.S(iArr4, iArr2, iArr7);
        boolean T = jl2.T(iArr12);
        v51 v51Var = this.a;
        if (T) {
            return jl2.T(iArr7) ? p() : v51Var.k();
        }
        jl2.j0(iArr12, iArr5);
        wx5.A(iArr5, iArr8);
        int[] iArr13 = new int[8];
        jl2.a0(iArr8, iArr12, iArr5);
        wx5.A(iArr5, iArr13);
        jl2.a0(iArr8, iArr3, iArr5);
        wx5.A(iArr5, iArr8);
        int[] iArr14 = wx5.j0;
        if (dq2.D(8, iArr13) != 0) {
            jl2.m0(iArr14, iArr14, iArr13);
        } else {
            jl2.m0(iArr14, iArr13, iArr13);
        }
        jl2.a0(iArr4, iArr13, iArr6);
        wx5.D(jl2.h(iArr8, iArr8, iArr13), iArr13);
        pf4 pf4Var7 = new pf4(iArr9);
        jl2.j0(iArr7, iArr5);
        wx5.A(iArr5, iArr9);
        wx5.S(iArr9, iArr13, iArr9);
        pf4 pf4Var8 = new pf4(iArr13);
        wx5.S(iArr8, iArr9, iArr13);
        if ((jl2.b0(iArr13, iArr7, iArr6) != 0 || (iArr6[15] == -1 && dq2.U(16, iArr6, wx5.k0))) && dq2.g(10, wx5.l0, iArr6) != 0) {
            dq2.Y(16, 10, iArr6);
        }
        wx5.A(iArr6, iArr13);
        pf4 pf4Var9 = new pf4(iArr12);
        if (!Q) {
            jl2.a0(iArr12, iArr10, iArr5);
            wx5.A(iArr5, iArr12);
        }
        if (!Q2) {
            jl2.a0(iArr12, iArr11, iArr5);
            wx5.A(iArr5, iArr12);
        }
        return new tm0(v51Var, pf4Var7, pf4Var8, new e41[]{pf4Var9}, (byte) 11);
    }

    private final g61 t(g61 g61Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (i()) {
            return g61Var;
        }
        if (g61Var.i()) {
            return this;
        }
        if (this == g61Var) {
            return p();
        }
        rf4 rf4Var = (rf4) this.b;
        rf4 rf4Var2 = (rf4) this.c;
        rf4 rf4Var3 = (rf4) g61Var.b;
        rf4 rf4Var4 = (rf4) g61Var.f();
        rf4 rf4Var5 = (rf4) this.d[0];
        rf4 rf4Var6 = (rf4) g61Var.g();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = rf4Var5.r;
        boolean Q = jl2.Q(iArr10);
        if (Q) {
            iArr = rf4Var3.r;
            iArr2 = rf4Var4.r;
        } else {
            jl2.j0(iArr10, iArr5);
            j16.R(iArr5, iArr8);
            jl2.a0(iArr8, rf4Var3.r, iArr5);
            j16.R(iArr5, iArr7);
            jl2.a0(iArr8, iArr10, iArr5);
            j16.R(iArr5, iArr8);
            jl2.a0(iArr8, rf4Var4.r, iArr5);
            j16.R(iArr5, iArr8);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = rf4Var6.r;
        boolean Q2 = jl2.Q(iArr11);
        if (Q2) {
            iArr3 = rf4Var.r;
            iArr4 = rf4Var2.r;
        } else {
            jl2.j0(iArr11, iArr5);
            j16.R(iArr5, iArr9);
            jl2.a0(iArr9, rf4Var.r, iArr5);
            j16.R(iArr5, iArr6);
            jl2.a0(iArr9, iArr11, iArr5);
            j16.R(iArr5, iArr9);
            jl2.a0(iArr9, rf4Var2.r, iArr5);
            j16.R(iArr5, iArr9);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        j16.f0(iArr3, iArr, iArr12);
        j16.f0(iArr4, iArr2, iArr7);
        boolean T = jl2.T(iArr12);
        v51 v51Var = this.a;
        if (T) {
            return jl2.T(iArr7) ? p() : v51Var.k();
        }
        jl2.j0(iArr12, iArr5);
        j16.R(iArr5, iArr8);
        int[] iArr13 = new int[8];
        jl2.a0(iArr8, iArr12, iArr5);
        j16.R(iArr5, iArr13);
        jl2.a0(iArr8, iArr3, iArr5);
        j16.R(iArr5, iArr8);
        int[] iArr14 = j16.o0;
        if (dq2.D(8, iArr13) != 0) {
            jl2.m0(iArr14, iArr14, iArr13);
        } else {
            jl2.m0(iArr14, iArr13, iArr13);
        }
        jl2.a0(iArr4, iArr13, iArr6);
        j16.U(jl2.h(iArr8, iArr8, iArr13), iArr13);
        rf4 rf4Var7 = new rf4(iArr9);
        jl2.j0(iArr7, iArr5);
        j16.R(iArr5, iArr9);
        j16.f0(iArr9, iArr13, iArr9);
        rf4 rf4Var8 = new rf4(iArr13);
        j16.f0(iArr8, iArr9, iArr13);
        int[] iArr15 = j16.p0;
        if (jl2.b0(iArr13, iArr7, iArr6) != 0 || ((iArr6[15] >>> 1) >= Integer.MAX_VALUE && dq2.U(16, iArr6, iArr15))) {
            dq2.F0(16, iArr15, iArr6);
        }
        j16.R(iArr6, iArr13);
        rf4 rf4Var9 = new rf4(iArr12);
        if (!Q) {
            jl2.a0(iArr12, iArr10, iArr5);
            j16.R(iArr5, iArr12);
        }
        if (!Q2) {
            jl2.a0(iArr12, iArr11, iArr5);
            j16.R(iArr5, iArr12);
        }
        return new tm0(v51Var, rf4Var7, rf4Var8, new e41[]{rf4Var9}, (byte) 12);
    }

    private final g61 u(g61 g61Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (i()) {
            return g61Var;
        }
        if (g61Var.i()) {
            return this;
        }
        if (this == g61Var) {
            return p();
        }
        tf4 tf4Var = (tf4) this.b;
        tf4 tf4Var2 = (tf4) this.c;
        tf4 tf4Var3 = (tf4) g61Var.b;
        tf4 tf4Var4 = (tf4) g61Var.f();
        tf4 tf4Var5 = (tf4) this.d[0];
        tf4 tf4Var6 = (tf4) g61Var.g();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[24];
        int[] iArr8 = new int[12];
        int[] iArr9 = new int[12];
        boolean S = tf4Var5.S();
        int[] iArr10 = tf4Var5.r;
        if (S) {
            iArr = tf4Var3.r;
            iArr2 = tf4Var4.r;
        } else {
            lq2.h0(iArr10, iArr5);
            qg5.x0(iArr5, iArr8);
            lq2.W(iArr8, tf4Var3.r, iArr5);
            qg5.x0(iArr5, iArr7);
            lq2.W(iArr8, iArr10, iArr5);
            qg5.x0(iArr5, iArr8);
            lq2.W(iArr8, tf4Var4.r, iArr5);
            qg5.x0(iArr5, iArr8);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        boolean S2 = tf4Var6.S();
        int[] iArr11 = tf4Var6.r;
        if (S2) {
            iArr3 = tf4Var.r;
            iArr4 = tf4Var2.r;
        } else {
            lq2.h0(iArr11, iArr5);
            qg5.x0(iArr5, iArr9);
            lq2.W(iArr9, tf4Var.r, iArr5);
            qg5.x0(iArr5, iArr6);
            lq2.W(iArr9, iArr11, iArr5);
            qg5.x0(iArr5, iArr9);
            lq2.W(iArr9, tf4Var2.r, iArr5);
            qg5.x0(iArr5, iArr9);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[12];
        qg5.Q0(iArr3, iArr, iArr12);
        int[] iArr13 = new int[12];
        qg5.Q0(iArr4, iArr2, iArr13);
        boolean g0 = dq2.g0(12, iArr12);
        v51 v51Var = this.a;
        if (g0) {
            return dq2.g0(12, iArr13) ? p() : v51Var.k();
        }
        lq2.h0(iArr12, iArr5);
        qg5.x0(iArr5, iArr8);
        int[] iArr14 = new int[12];
        lq2.W(iArr8, iArr12, iArr5);
        qg5.x0(iArr5, iArr14);
        lq2.W(iArr8, iArr3, iArr5);
        qg5.x0(iArr5, iArr8);
        int[] iArr15 = qg5.C;
        if (dq2.D(12, iArr14) != 0) {
            dq2.B0(12, iArr15, iArr15, iArr14);
        } else {
            dq2.B0(12, iArr15, iArr14, iArr14);
        }
        lq2.W(iArr4, iArr14, iArr6);
        qg5.B0(dq2.d(12, iArr8, iArr8, iArr14), iArr14);
        tf4 tf4Var7 = new tf4(iArr9);
        lq2.h0(iArr13, iArr5);
        qg5.x0(iArr5, iArr9);
        qg5.Q0(iArr9, iArr14, iArr9);
        tf4 tf4Var8 = new tf4(iArr14);
        qg5.Q0(iArr8, iArr9, iArr14);
        lq2.W(iArr14, iArr13, iArr7);
        if ((dq2.a(24, iArr6, iArr7, iArr6) != 0 || (iArr6[23] == -1 && dq2.U(24, iArr6, qg5.D))) && dq2.g(17, qg5.E, iArr6) != 0) {
            dq2.Y(24, 17, iArr6);
        }
        qg5.x0(iArr6, iArr14);
        tf4 tf4Var9 = new tf4(iArr12);
        if (!S) {
            lq2.W(iArr12, iArr10, iArr5);
            qg5.x0(iArr5, iArr12);
        }
        if (!S2) {
            lq2.W(iArr12, iArr11, iArr5);
            qg5.x0(iArr5, iArr12);
        }
        return new tm0(v51Var, tf4Var7, tf4Var8, new e41[]{tf4Var9}, (byte) 13);
    }

    public tm0 A(boolean z) {
        e41 e41Var;
        e41 e41Var2 = this.d[0];
        e41 x = x();
        e41 e41Var3 = this.b;
        e41 q0 = e41Var3.q0();
        e41 k = q0.k(q0).k(q0).k(x);
        e41 e41Var4 = this.c;
        e41 k2 = e41Var4.k(e41Var4);
        e41 X = k2.X(e41Var4);
        e41 X2 = e41Var3.X(X);
        e41 k3 = X2.k(X2);
        e41 t0 = k.q0().t0(k3.k(k3));
        e41 q02 = X.q0();
        e41 k4 = q02.k(q02);
        e41 t02 = k.X(k3.t0(t0)).t0(k4);
        if (z) {
            e41 X3 = k4.X(x);
            e41Var = X3.k(X3);
        } else {
            e41Var = null;
        }
        if (!e41Var2.S()) {
            k2 = k2.X(e41Var2);
        }
        return new tm0(this.a, t0, t02, new e41[]{k2, e41Var}, (byte) 1);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.g61
    public final defpackage.g61 a(defpackage.g61 r40) {
        /*
            Method dump skipped, instructions count: 3622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.a(g61):g61");
    }

    @Override // defpackage.g61
    public final g61 k() {
        byte b = this.h;
        e41 e41Var = this.c;
        switch (b) {
            case 0:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 0);
            case 1:
                if (i()) {
                    return this;
                }
                v51 v51Var = this.a;
                byte b2 = v51Var.f;
                e41 e41Var2 = this.b;
                return b2 != 0 ? new tm0(v51Var, e41Var2, e41Var.a0(), this.d, (byte) 1) : new tm0(v51Var, e41Var2, e41Var.a0(), (byte) 1);
            case 2:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 2);
            case 3:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 3);
            case 4:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 4);
            case 5:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 5);
            case 6:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 6);
            case 7:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 7);
            case 8:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 8);
            case 9:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 9);
            case 10:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 10);
            case 11:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 11);
            case 12:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 12);
            case 13:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 13);
            default:
                if (i()) {
                    return this;
                }
                return new tm0(this.a, this.b, e41Var.a0(), this.d, (byte) 14);
        }
    }

    @Override // defpackage.g61
    public g61 o(int i) {
        tm0 tm0Var;
        switch (this.h) {
            case 1:
                tm0 tm0Var2 = null;
                if (i >= 0) {
                    if (i == 0 || i()) {
                        return this;
                    }
                    byte b = 1;
                    if (i == 1) {
                        return p();
                    }
                    e41 e41Var = this.c;
                    boolean T = e41Var.T();
                    v51 v51Var = this.a;
                    if (!T) {
                        byte b2 = v51Var.f;
                        e41 e41Var2 = v51Var.b;
                        e41[] e41VarArr = this.d;
                        boolean z = false;
                        e41 h = e41VarArr.length < 1 ? v51Var.h(n51.b) : e41VarArr[0];
                        boolean S = h.S();
                        e41 e41Var3 = this.b;
                        if (!S && b2 != 0) {
                            if (b2 == 1) {
                                e41 q0 = h.q0();
                                e41Var3 = e41Var3.X(h);
                                e41Var = e41Var.X(q0);
                                e41Var2 = w(h, q0);
                            } else if (b2 == 2) {
                                e41Var2 = w(h, null);
                            } else {
                                if (b2 != 4) {
                                    zy.i("unsupported coordinate system");
                                    return tm0Var2;
                                }
                                e41Var2 = x();
                            }
                        }
                        e41 e41Var4 = e41Var;
                        int i2 = 0;
                        while (i2 < i) {
                            if (!e41Var4.T()) {
                                e41 q02 = e41Var3.q0();
                                e41 k = q02.k(q02).k(q02);
                                e41 k2 = e41Var4.k(e41Var4);
                                e41 X = k2.X(e41Var4);
                                e41 X2 = e41Var3.X(X);
                                e41 k3 = X2.k(X2);
                                e41 q03 = X.q0();
                                e41 k4 = q03.k(q03);
                                if (!e41Var2.T()) {
                                    k = k.k(e41Var2);
                                    e41 X3 = k4.X(e41Var2);
                                    e41Var2 = X3.k(X3);
                                }
                                boolean z2 = z;
                                e41 t0 = k.q0().t0(k3.k(k3));
                                e41Var4 = k.X(k3.t0(t0)).t0(k4);
                                h = h.S() ? k2 : k2.X(h);
                                i2++;
                                e41Var3 = t0;
                                z = z2;
                            }
                        }
                        boolean z3 = z;
                        if (b2 == 0) {
                            e41 P = h.P();
                            e41 q04 = P.q0();
                            tm0Var2 = new tm0(v51Var, e41Var3.X(q04), e41Var4.X(q04.X(P)), b);
                            return tm0Var2;
                        }
                        if (b2 == 1) {
                            e41 e41Var5 = h;
                            e41 X4 = e41Var3.X(e41Var5);
                            e41[] e41VarArr2 = new e41[1];
                            e41VarArr2[z3 ? 1 : 0] = e41Var5.X(e41Var5.q0());
                            tm0Var = new tm0(v51Var, X4, e41Var4, e41VarArr2, (byte) 1);
                        } else if (b2 == 2) {
                            e41[] e41VarArr3 = new e41[1];
                            e41VarArr3[z3 ? 1 : 0] = h;
                            tm0Var = new tm0(v51Var, e41Var3, e41Var4, e41VarArr3, (byte) 1);
                        } else if (b2 == 4) {
                            e41[] e41VarArr4 = new e41[2];
                            e41VarArr4[z3 ? 1 : 0] = h;
                            e41VarArr4[1] = e41Var2;
                            tm0Var = new tm0(v51Var, e41Var3, e41Var4, e41VarArr4, (byte) 1);
                        } else {
                            zy.i("unsupported coordinate system");
                        }
                        return tm0Var;
                    }
                    return v51Var.k();
                }
                s83.t("'e' cannot be negative");
                return null;
            default:
                return super.o(i);
        }
    }

    @Override // defpackage.g61
    public final g61 p() {
        tm0 tm0Var;
        e41 e41Var;
        e41 X;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        byte b = this.h;
        e41[] e41VarArr = this.d;
        e41 e41Var2 = this.b;
        e41 e41Var3 = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                return i() ? this : e41Var3.T() ? this.a.k() : z(true);
            case 1:
                if (i()) {
                    return this;
                }
                boolean T = e41Var3.T();
                v51 v51Var = this.a;
                if (T) {
                    return v51Var.k();
                }
                byte b3 = v51Var.f;
                if (b3 == 0) {
                    e41 q0 = e41Var2.q0();
                    e41 B = q0.k(q0).k(q0).k(v51Var.b).B(e41Var3.k(e41Var3));
                    e41 t0 = B.q0().t0(e41Var2.k(e41Var2));
                    tm0Var = new tm0(v51Var, t0, B.X(e41Var2.t0(t0)).t0(e41Var3), b2);
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 == 4) {
                                return A(true);
                            }
                            zy.i("unsupported coordinate system");
                            return null;
                        }
                        e41 e41Var4 = e41VarArr[0];
                        boolean S = e41Var4.S();
                        e41 q02 = e41Var3.q0();
                        e41 q03 = q02.q0();
                        e41 e41Var5 = v51Var.b;
                        e41 a0 = e41Var5.a0();
                        if (a0.w0().equals(BigInteger.valueOf(3L))) {
                            e41 q04 = S ? e41Var4 : e41Var4.q0();
                            e41 X2 = e41Var2.k(q04).X(e41Var2.t0(q04));
                            e41Var = X2.k(X2).k(X2);
                            X = q02.X(e41Var2);
                        } else {
                            e41 q05 = e41Var2.q0();
                            e41 k = q05.k(q05).k(q05);
                            if (!S) {
                                if (e41Var5.T()) {
                                    e41Var = k;
                                } else {
                                    e41 q06 = e41Var4.q0().q0();
                                    if (a0.r() < e41Var5.r()) {
                                        e41Var = k.t0(q06.X(a0));
                                    } else {
                                        e41Var5 = q06.X(e41Var5);
                                    }
                                }
                                X = e41Var2.X(q02);
                            }
                            e41Var = k.k(e41Var5);
                            X = e41Var2.X(q02);
                        }
                        e41 k2 = X.k(X);
                        e41 k3 = k2.k(k2);
                        e41 t02 = e41Var.q0().t0(k3.k(k3));
                        e41 X3 = k3.t0(t02).X(e41Var);
                        e41 k4 = q03.k(q03);
                        e41 k5 = k4.k(k4);
                        e41 t03 = X3.t0(k5.k(k5));
                        e41 k6 = e41Var3.k(e41Var3);
                        if (!S) {
                            k6 = k6.X(e41Var4);
                        }
                        return new tm0(v51Var, t02, t03, new e41[]{k6}, (byte) 1);
                    }
                    e41 e41Var6 = e41VarArr[0];
                    boolean S2 = e41Var6.S();
                    e41 e41Var7 = v51Var.b;
                    if (!e41Var7.T() && !S2) {
                        e41Var7 = e41Var7.X(e41Var6.q0());
                    }
                    e41 q07 = e41Var2.q0();
                    e41 k7 = e41Var7.k(q07.k(q07).k(q07));
                    e41 X4 = S2 ? e41Var3 : e41Var3.X(e41Var6);
                    e41 q08 = S2 ? e41Var3.q0() : X4.X(e41Var3);
                    e41 X5 = e41Var2.X(q08);
                    e41 k8 = X5.k(X5);
                    e41 k9 = k8.k(k8);
                    e41 t04 = k7.q0().t0(k9.k(k9));
                    e41 k10 = X4.k(X4);
                    e41 X6 = t04.X(k10);
                    e41 k11 = q08.k(q08);
                    e41 X7 = k9.t0(t04).X(k7);
                    e41 q09 = k11.q0();
                    e41 t05 = X7.t0(q09.k(q09));
                    e41 k12 = S2 ? k11.k(k11) : k10.q0();
                    tm0Var = new tm0(v51Var, X6, t05, new e41[]{k12.k(k12).X(X4)}, (byte) 1);
                }
                return tm0Var;
            case 2:
                if (i()) {
                    return this;
                }
                int[] iArr10 = ((m84) e41Var3).r;
                boolean T2 = jl2.T(iArr10);
                v51 v51Var2 = this.a;
                if (T2) {
                    return v51Var2.k();
                }
                m84 m84Var = (m84) e41Var2;
                m84 m84Var2 = (m84) e41VarArr[0];
                int[] iArr11 = new int[8];
                int[] iArr12 = new int[8];
                int[] iArr13 = new int[8];
                qg5.E0(iArr10, iArr13);
                int[] iArr14 = new int[8];
                qg5.E0(iArr13, iArr14);
                int[] iArr15 = m84Var2.r;
                boolean Q = jl2.Q(iArr15);
                if (Q) {
                    iArr = iArr15;
                } else {
                    qg5.E0(iArr15, iArr12);
                    iArr = iArr12;
                }
                int[] iArr16 = m84Var.r;
                qg5.N0(iArr16, iArr, iArr11);
                qg5.D(iArr16, iArr, iArr12);
                qg5.e0(iArr12, iArr11, iArr12);
                qg5.y0(jl2.h(iArr12, iArr12, iArr12), iArr12);
                qg5.e0(iArr13, iArr16, iArr13);
                qg5.y0(dq2.y0(8, iArr13), iArr13);
                qg5.y0(dq2.z0(8, iArr14, iArr11), iArr11);
                m84 m84Var3 = new m84(iArr14);
                qg5.E0(iArr12, iArr14);
                qg5.N0(iArr14, iArr13, iArr14);
                qg5.N0(iArr14, iArr13, iArr14);
                m84 m84Var4 = new m84(iArr13);
                qg5.N0(iArr13, iArr14, iArr13);
                qg5.e0(iArr13, iArr12, iArr13);
                qg5.N0(iArr13, iArr11, iArr13);
                m84 m84Var5 = new m84(iArr12);
                if (dq2.x0(8, 0, iArr10, iArr12) != 0 || ((iArr12[7] >>> 1) >= Integer.MAX_VALUE && jl2.K(iArr12, qg5.u))) {
                    qg5.F(iArr12);
                }
                if (!Q) {
                    qg5.e0(iArr12, iArr15, iArr12);
                }
                return new tm0(v51Var2, m84Var3, m84Var4, new e41[]{m84Var5}, (byte) 2);
            case 3:
                if (i()) {
                    return this;
                }
                int[] iArr17 = ((af4) e41Var3).r;
                boolean S3 = jl2.S(iArr17);
                v51 v51Var3 = this.a;
                if (S3) {
                    return v51Var3.k();
                }
                af4 af4Var = (af4) e41Var2;
                af4 af4Var2 = (af4) e41VarArr[0];
                int[] iArr18 = new int[4];
                int[] iArr19 = new int[4];
                int[] iArr20 = new int[4];
                j16.X(iArr17, iArr20);
                int[] iArr21 = new int[4];
                j16.X(iArr20, iArr21);
                int[] iArr22 = af4Var2.r;
                boolean P = jl2.P(iArr22);
                if (P) {
                    iArr2 = iArr22;
                } else {
                    j16.X(iArr22, iArr19);
                    iArr2 = iArr19;
                }
                int[] iArr23 = af4Var.r;
                j16.d0(iArr23, iArr2, iArr18);
                j16.j(iArr23, iArr2, iArr19);
                j16.L(iArr19, iArr18, iArr19);
                j16.S(jl2.g(iArr19, iArr19, iArr19), iArr19);
                j16.L(iArr20, iArr23, iArr20);
                j16.S(dq2.y0(4, iArr20), iArr20);
                j16.S(dq2.z0(4, iArr21, iArr18), iArr18);
                af4 af4Var3 = new af4(iArr21);
                j16.X(iArr19, iArr21);
                j16.d0(iArr21, iArr20, iArr21);
                j16.d0(iArr21, iArr20, iArr21);
                af4 af4Var4 = new af4(iArr20);
                j16.d0(iArr20, iArr21, iArr20);
                j16.L(iArr20, iArr19, iArr20);
                j16.d0(iArr20, iArr18, iArr20);
                af4 af4Var5 = new af4(iArr19);
                if (dq2.x0(4, 0, iArr17, iArr19) != 0 || ((iArr19[3] >>> 1) >= 2147483646 && jl2.J(iArr19, j16.i0))) {
                    j16.l(iArr19);
                }
                if (!P) {
                    j16.L(iArr19, iArr22, iArr19);
                }
                return new tm0(v51Var3, af4Var3, af4Var4, new e41[]{af4Var5}, (byte) 3);
            case 4:
                if (i()) {
                    return this;
                }
                int[] iArr24 = ((ff4) e41Var3).r;
                boolean h0 = dq2.h0(iArr24);
                v51 v51Var4 = this.a;
                if (h0) {
                    return v51Var4.k();
                }
                ff4 ff4Var = (ff4) e41Var2;
                ff4 ff4Var2 = (ff4) e41VarArr[0];
                int[] iArr25 = new int[5];
                eu5.k0(iArr24, iArr25);
                int[] iArr26 = new int[5];
                eu5.k0(iArr25, iArr26);
                int[] iArr27 = new int[5];
                eu5.k0(ff4Var.r, iArr27);
                eu5.i0(dq2.e(iArr27, iArr27, iArr27), iArr27);
                eu5.N(iArr25, ff4Var.r, iArr25);
                eu5.i0(dq2.y0(5, iArr25), iArr25);
                int[] iArr28 = new int[5];
                eu5.i0(dq2.z0(5, iArr26, iArr28), iArr28);
                ff4 ff4Var3 = new ff4(iArr26);
                eu5.k0(iArr27, iArr26);
                eu5.p0(iArr26, iArr25, iArr26);
                eu5.p0(iArr26, iArr25, iArr26);
                ff4 ff4Var4 = new ff4(iArr25);
                eu5.p0(iArr25, iArr26, iArr25);
                eu5.N(iArr25, iArr27, iArr25);
                eu5.p0(iArr25, iArr28, iArr25);
                ff4 ff4Var5 = new ff4(iArr27);
                eu5.v0(iArr24, iArr27);
                if (!dq2.d0(ff4Var2.r)) {
                    eu5.N(iArr27, ff4Var2.r, iArr27);
                }
                return new tm0(v51Var4, ff4Var3, ff4Var4, new e41[]{ff4Var5}, (byte) 4);
            case 5:
                int[] iArr29 = qg5.w;
                if (i()) {
                    return this;
                }
                int[] iArr30 = ((df4) e41Var3).r;
                boolean h02 = dq2.h0(iArr30);
                v51 v51Var5 = this.a;
                if (h02) {
                    return v51Var5.k();
                }
                df4 df4Var = (df4) e41Var2;
                df4 df4Var2 = (df4) e41VarArr[0];
                int[] iArr31 = new int[5];
                int[] iArr32 = new int[5];
                int[] iArr33 = new int[5];
                qg5.G0(iArr30, iArr33);
                int[] iArr34 = new int[5];
                qg5.G0(iArr33, iArr34);
                int[] iArr35 = df4Var2.r;
                boolean d0 = dq2.d0(iArr35);
                if (d0) {
                    iArr3 = iArr35;
                } else {
                    qg5.G0(iArr35, iArr32);
                    iArr3 = iArr32;
                }
                int[] iArr36 = df4Var.r;
                qg5.O0(iArr36, iArr3, iArr31);
                if (dq2.b(iArr36, iArr3, iArr32) != 0 || (iArr32[4] == -1 && dq2.V(iArr32, iArr29))) {
                    dq2.i(5, C.RATE_UNSET_INT, iArr32);
                }
                qg5.g0(iArr32, iArr31, iArr32);
                qg5.z0(dq2.e(iArr32, iArr32, iArr32), iArr32);
                qg5.g0(iArr33, iArr36, iArr33);
                qg5.z0(dq2.y0(5, iArr33), iArr33);
                qg5.z0(dq2.z0(5, iArr34, iArr31), iArr31);
                df4 df4Var3 = new df4(iArr34);
                qg5.G0(iArr32, iArr34);
                qg5.O0(iArr34, iArr33, iArr34);
                qg5.O0(iArr34, iArr33, iArr34);
                df4 df4Var4 = new df4(iArr33);
                qg5.O0(iArr33, iArr34, iArr33);
                qg5.g0(iArr33, iArr32, iArr33);
                qg5.O0(iArr33, iArr31, iArr33);
                df4 df4Var5 = new df4(iArr32);
                if (dq2.x0(5, 0, iArr30, iArr32) != 0 || (iArr32[4] == -1 && dq2.V(iArr32, iArr29))) {
                    dq2.i(5, C.RATE_UNSET_INT, iArr32);
                }
                if (!d0) {
                    qg5.g0(iArr32, iArr35, iArr32);
                }
                return new tm0(v51Var5, df4Var3, df4Var4, new e41[]{df4Var5}, (byte) 5);
            case 6:
                if (i()) {
                    return this;
                }
                int[] iArr37 = ((ff4) e41Var3).r;
                boolean h03 = dq2.h0(iArr37);
                v51 v51Var6 = this.a;
                if (h03) {
                    return v51Var6.k();
                }
                ff4 ff4Var6 = (ff4) e41Var2;
                ff4 ff4Var7 = (ff4) e41VarArr[0];
                int[] iArr38 = new int[5];
                int[] iArr39 = new int[5];
                int[] iArr40 = new int[5];
                eu5.k0(iArr37, iArr40);
                int[] iArr41 = new int[5];
                eu5.k0(iArr40, iArr41);
                int[] iArr42 = ff4Var7.r;
                boolean d02 = dq2.d0(iArr42);
                if (d02) {
                    iArr4 = iArr42;
                } else {
                    eu5.k0(iArr42, iArr39);
                    iArr4 = iArr39;
                }
                int[] iArr43 = ff4Var6.r;
                eu5.p0(iArr43, iArr4, iArr38);
                if (dq2.b(iArr43, iArr4, iArr39) != 0 || (iArr39[4] == -1 && dq2.V(iArr39, eu5.E))) {
                    dq2.c(5, 21389, iArr39);
                }
                eu5.N(iArr39, iArr38, iArr39);
                eu5.i0(dq2.e(iArr39, iArr39, iArr39), iArr39);
                eu5.N(iArr40, iArr43, iArr40);
                eu5.i0(dq2.y0(5, iArr40), iArr40);
                eu5.i0(dq2.z0(5, iArr41, iArr38), iArr38);
                ff4 ff4Var8 = new ff4(iArr41);
                eu5.k0(iArr39, iArr41);
                eu5.p0(iArr41, iArr40, iArr41);
                eu5.p0(iArr41, iArr40, iArr41);
                ff4 ff4Var9 = new ff4(iArr40);
                eu5.p0(iArr40, iArr41, iArr40);
                eu5.N(iArr40, iArr39, iArr40);
                eu5.p0(iArr40, iArr38, iArr40);
                ff4 ff4Var10 = new ff4(iArr39);
                eu5.v0(iArr37, iArr39);
                if (!d02) {
                    eu5.N(iArr39, iArr42, iArr39);
                }
                return new tm0(v51Var6, ff4Var8, ff4Var9, new e41[]{ff4Var10}, (byte) 6);
            case 7:
                if (i()) {
                    return this;
                }
                int[] iArr44 = ((hf4) e41Var3).r;
                boolean Q2 = lq2.Q(iArr44);
                v51 v51Var7 = this.a;
                if (Q2) {
                    return v51Var7.k();
                }
                hf4 hf4Var = (hf4) e41Var2;
                hf4 hf4Var2 = (hf4) e41VarArr[0];
                int[] iArr45 = new int[6];
                wx5.J(iArr44, iArr45);
                int[] iArr46 = new int[6];
                wx5.J(iArr45, iArr46);
                int[] iArr47 = new int[6];
                wx5.J(hf4Var.r, iArr47);
                wx5.C(lq2.p(iArr47, iArr47, iArr47), iArr47);
                wx5.u(iArr45, hf4Var.r, iArr45);
                wx5.C(dq2.y0(6, iArr45), iArr45);
                int[] iArr48 = new int[6];
                wx5.C(dq2.z0(6, iArr46, iArr48), iArr48);
                hf4 hf4Var3 = new hf4(iArr46);
                wx5.J(iArr47, iArr46);
                wx5.R(iArr46, iArr45, iArr46);
                wx5.R(iArr46, iArr45, iArr46);
                hf4 hf4Var4 = new hf4(iArr45);
                wx5.R(iArr45, iArr46, iArr45);
                wx5.u(iArr45, iArr47, iArr45);
                wx5.R(iArr45, iArr48, iArr45);
                hf4 hf4Var5 = new hf4(iArr47);
                if (dq2.x0(6, 0, iArr44, iArr47) != 0 || (iArr47[5] == -1 && lq2.M(iArr47, wx5.g0))) {
                    dq2.c(6, 4553, iArr47);
                }
                if (!lq2.O(hf4Var2.r)) {
                    wx5.u(iArr47, hf4Var2.r, iArr47);
                }
                return new tm0(v51Var7, hf4Var3, hf4Var4, new e41[]{hf4Var5}, (byte) 7);
            case 8:
                int[] iArr49 = j16.l0;
                if (i()) {
                    return this;
                }
                int[] iArr50 = ((jf4) e41Var3).r;
                boolean Q3 = lq2.Q(iArr50);
                v51 v51Var8 = this.a;
                if (Q3) {
                    return v51Var8.k();
                }
                jf4 jf4Var = (jf4) e41Var2;
                jf4 jf4Var2 = (jf4) e41VarArr[0];
                int[] iArr51 = new int[6];
                int[] iArr52 = new int[6];
                int[] iArr53 = new int[6];
                j16.Y(iArr50, iArr53);
                int[] iArr54 = new int[6];
                j16.Y(iArr53, iArr54);
                int[] iArr55 = jf4Var2.r;
                boolean O = lq2.O(iArr55);
                if (O) {
                    iArr5 = iArr55;
                } else {
                    j16.Y(iArr55, iArr52);
                    iArr5 = iArr52;
                }
                int[] iArr56 = jf4Var.r;
                j16.e0(iArr56, iArr5, iArr51);
                if (lq2.o(iArr56, iArr5, iArr52) != 0 || (iArr52[5] == -1 && lq2.M(iArr52, iArr49))) {
                    j16.m(iArr52);
                }
                j16.N(iArr52, iArr51, iArr52);
                j16.T(lq2.p(iArr52, iArr52, iArr52), iArr52);
                j16.N(iArr53, iArr56, iArr53);
                j16.T(dq2.y0(6, iArr53), iArr53);
                j16.T(dq2.z0(6, iArr54, iArr51), iArr51);
                jf4 jf4Var3 = new jf4(iArr54);
                j16.Y(iArr52, iArr54);
                j16.e0(iArr54, iArr53, iArr54);
                j16.e0(iArr54, iArr53, iArr54);
                jf4 jf4Var4 = new jf4(iArr53);
                j16.e0(iArr53, iArr54, iArr53);
                j16.N(iArr53, iArr52, iArr53);
                j16.e0(iArr53, iArr51, iArr53);
                jf4 jf4Var5 = new jf4(iArr52);
                if (dq2.x0(6, 0, iArr50, iArr52) != 0 || (iArr52[5] == -1 && lq2.M(iArr52, iArr49))) {
                    j16.m(iArr52);
                }
                if (!O) {
                    j16.N(iArr52, iArr55, iArr52);
                }
                return new tm0(v51Var8, jf4Var3, jf4Var4, new e41[]{jf4Var5}, (byte) 8);
            case 9:
                if (i()) {
                    return this;
                }
                int[] iArr57 = ((lf4) e41Var3).r;
                boolean N = il2.N(iArr57);
                v51 v51Var9 = this.a;
                if (N) {
                    return v51Var9.k();
                }
                lf4 lf4Var = (lf4) e41Var2;
                lf4 lf4Var2 = (lf4) e41VarArr[0];
                int[] iArr58 = new int[7];
                qg5.H0(iArr57, iArr58);
                int[] iArr59 = new int[7];
                qg5.H0(iArr58, iArr59);
                int[] iArr60 = new int[7];
                qg5.H0(lf4Var.r, iArr60);
                qg5.A0(il2.g(iArr60, iArr60, iArr60), iArr60);
                qg5.h0(iArr58, lf4Var.r, iArr58);
                qg5.A0(dq2.y0(7, iArr58), iArr58);
                int[] iArr61 = new int[7];
                qg5.A0(dq2.z0(7, iArr59, iArr61), iArr61);
                lf4 lf4Var3 = new lf4(iArr59);
                qg5.H0(iArr60, iArr59);
                qg5.P0(iArr59, iArr58, iArr59);
                qg5.P0(iArr59, iArr58, iArr59);
                lf4 lf4Var4 = new lf4(iArr58);
                qg5.P0(iArr58, iArr59, iArr58);
                qg5.h0(iArr58, iArr60, iArr58);
                qg5.P0(iArr58, iArr61, iArr58);
                lf4 lf4Var5 = new lf4(iArr60);
                if (dq2.x0(7, 0, iArr57, iArr60) != 0 || (iArr60[6] == -1 && il2.J(iArr60, qg5.z))) {
                    dq2.c(7, 6803, iArr60);
                }
                if (!il2.M(lf4Var2.r)) {
                    qg5.h0(iArr60, lf4Var2.r, iArr60);
                }
                return new tm0(v51Var9, lf4Var3, lf4Var4, new e41[]{lf4Var5}, (byte) 9);
            case 10:
                if (i()) {
                    return this;
                }
                int[] iArr62 = ((nf4) e41Var3).r;
                boolean N2 = il2.N(iArr62);
                v51 v51Var10 = this.a;
                if (N2) {
                    return v51Var10.k();
                }
                nf4 nf4Var = (nf4) e41Var2;
                nf4 nf4Var2 = (nf4) e41VarArr[0];
                int[] iArr63 = new int[7];
                int[] iArr64 = new int[7];
                int[] iArr65 = new int[7];
                eu5.m0(iArr62, iArr65);
                int[] iArr66 = new int[7];
                eu5.m0(iArr65, iArr66);
                int[] iArr67 = nf4Var2.r;
                boolean M = il2.M(iArr67);
                if (M) {
                    iArr6 = iArr67;
                } else {
                    eu5.m0(iArr67, iArr64);
                    iArr6 = iArr64;
                }
                int[] iArr68 = nf4Var.r;
                eu5.q0(iArr68, iArr6, iArr63);
                eu5.r(iArr68, iArr6, iArr64);
                eu5.P(iArr64, iArr63, iArr64);
                eu5.j0(il2.g(iArr64, iArr64, iArr64), iArr64);
                eu5.P(iArr65, iArr68, iArr65);
                eu5.j0(dq2.y0(7, iArr65), iArr65);
                eu5.j0(dq2.z0(7, iArr66, iArr63), iArr63);
                nf4 nf4Var3 = new nf4(iArr66);
                eu5.m0(iArr64, iArr66);
                eu5.q0(iArr66, iArr65, iArr66);
                eu5.q0(iArr66, iArr65, iArr66);
                nf4 nf4Var4 = new nf4(iArr65);
                eu5.q0(iArr65, iArr66, iArr65);
                eu5.P(iArr65, iArr64, iArr65);
                eu5.q0(iArr65, iArr63, iArr65);
                nf4 nf4Var5 = new nf4(iArr64);
                eu5.w0(iArr62, iArr64);
                if (!M) {
                    eu5.P(iArr64, iArr67, iArr64);
                }
                return new tm0(v51Var10, nf4Var3, nf4Var4, new e41[]{nf4Var5}, (byte) 10);
            case 11:
                if (i()) {
                    return this;
                }
                int[] iArr69 = ((pf4) e41Var3).r;
                boolean T3 = jl2.T(iArr69);
                v51 v51Var11 = this.a;
                if (T3) {
                    return v51Var11.k();
                }
                pf4 pf4Var = (pf4) e41Var2;
                pf4 pf4Var2 = (pf4) e41VarArr[0];
                int[] iArr70 = new int[16];
                int[] iArr71 = new int[8];
                jl2.j0(iArr69, iArr70);
                wx5.A(iArr70, iArr71);
                int[] iArr72 = new int[8];
                jl2.j0(iArr71, iArr70);
                wx5.A(iArr70, iArr72);
                int[] iArr73 = new int[8];
                jl2.j0(pf4Var.r, iArr70);
                wx5.A(iArr70, iArr73);
                wx5.D(jl2.h(iArr73, iArr73, iArr73), iArr73);
                jl2.a0(iArr71, pf4Var.r, iArr70);
                wx5.A(iArr70, iArr71);
                wx5.D(dq2.y0(8, iArr71), iArr71);
                int[] iArr74 = new int[8];
                wx5.D(dq2.z0(8, iArr72, iArr74), iArr74);
                pf4 pf4Var3 = new pf4(iArr72);
                jl2.j0(iArr73, iArr70);
                wx5.A(iArr70, iArr72);
                wx5.S(iArr72, iArr71, iArr72);
                wx5.S(iArr72, iArr71, iArr72);
                pf4 pf4Var4 = new pf4(iArr71);
                wx5.S(iArr71, iArr72, iArr71);
                jl2.a0(iArr71, iArr73, iArr70);
                wx5.A(iArr70, iArr71);
                wx5.S(iArr71, iArr74, iArr71);
                pf4 pf4Var5 = new pf4(iArr73);
                if (dq2.x0(8, 0, iArr69, iArr73) != 0 || (iArr73[7] == -1 && jl2.K(iArr73, wx5.j0))) {
                    dq2.c(8, 977, iArr73);
                }
                if (!jl2.Q(pf4Var2.r)) {
                    jl2.a0(iArr73, pf4Var2.r, iArr70);
                    wx5.A(iArr70, iArr73);
                }
                return new tm0(v51Var11, pf4Var3, pf4Var4, new e41[]{pf4Var5}, (byte) 11);
            case 12:
                int[] iArr75 = j16.o0;
                if (i()) {
                    return this;
                }
                int[] iArr76 = ((rf4) e41Var3).r;
                boolean T4 = jl2.T(iArr76);
                v51 v51Var12 = this.a;
                if (T4) {
                    return v51Var12.k();
                }
                rf4 rf4Var = (rf4) e41Var2;
                rf4 rf4Var2 = (rf4) e41VarArr[0];
                int[] iArr77 = new int[16];
                int[] iArr78 = new int[8];
                int[] iArr79 = new int[8];
                int[] iArr80 = new int[8];
                jl2.j0(iArr76, iArr77);
                j16.R(iArr77, iArr80);
                int[] iArr81 = new int[8];
                jl2.j0(iArr80, iArr77);
                j16.R(iArr77, iArr81);
                int[] iArr82 = rf4Var2.r;
                boolean Q4 = jl2.Q(iArr82);
                if (Q4) {
                    iArr7 = iArr82;
                } else {
                    jl2.j0(iArr82, iArr77);
                    j16.R(iArr77, iArr79);
                    iArr7 = iArr79;
                }
                int[] iArr83 = rf4Var.r;
                j16.f0(iArr83, iArr7, iArr78);
                if (jl2.f(iArr83, iArr7, iArr79) != 0 || (iArr79[7] == -1 && jl2.K(iArr79, iArr75))) {
                    j16.n(iArr79);
                }
                jl2.a0(iArr79, iArr78, iArr77);
                j16.R(iArr77, iArr79);
                j16.U(jl2.h(iArr79, iArr79, iArr79), iArr79);
                jl2.a0(iArr80, iArr83, iArr77);
                j16.R(iArr77, iArr80);
                j16.U(dq2.y0(8, iArr80), iArr80);
                j16.U(dq2.z0(8, iArr81, iArr78), iArr78);
                rf4 rf4Var3 = new rf4(iArr81);
                jl2.j0(iArr79, iArr77);
                j16.R(iArr77, iArr81);
                j16.f0(iArr81, iArr80, iArr81);
                j16.f0(iArr81, iArr80, iArr81);
                rf4 rf4Var4 = new rf4(iArr80);
                j16.f0(iArr80, iArr81, iArr80);
                jl2.a0(iArr80, iArr79, iArr77);
                j16.R(iArr77, iArr80);
                j16.f0(iArr80, iArr78, iArr80);
                rf4 rf4Var5 = new rf4(iArr79);
                if (dq2.x0(8, 0, iArr76, iArr79) != 0 || (iArr79[7] == -1 && jl2.K(iArr79, iArr75))) {
                    j16.n(iArr79);
                }
                if (!Q4) {
                    jl2.a0(iArr79, iArr82, iArr77);
                    j16.R(iArr77, iArr79);
                }
                return new tm0(v51Var12, rf4Var3, rf4Var4, new e41[]{rf4Var5}, (byte) 12);
            case 13:
                int[] iArr84 = qg5.C;
                if (i()) {
                    return this;
                }
                tf4 tf4Var = (tf4) e41Var3;
                boolean T5 = tf4Var.T();
                int[] iArr85 = tf4Var.r;
                v51 v51Var13 = this.a;
                if (T5) {
                    return v51Var13.k();
                }
                tf4 tf4Var2 = (tf4) e41Var2;
                tf4 tf4Var3 = (tf4) e41VarArr[0];
                int[] iArr86 = new int[24];
                int[] iArr87 = new int[12];
                int[] iArr88 = new int[12];
                int[] iArr89 = new int[12];
                lq2.h0(iArr85, iArr86);
                qg5.x0(iArr86, iArr89);
                int[] iArr90 = new int[12];
                lq2.h0(iArr89, iArr86);
                qg5.x0(iArr86, iArr90);
                boolean S4 = tf4Var3.S();
                int[] iArr91 = tf4Var3.r;
                if (S4) {
                    iArr8 = iArr91;
                } else {
                    lq2.h0(iArr91, iArr86);
                    qg5.x0(iArr86, iArr88);
                    iArr8 = iArr88;
                }
                int[] iArr92 = tf4Var2.r;
                qg5.Q0(iArr92, iArr8, iArr87);
                if (dq2.a(12, iArr92, iArr8, iArr88) != 0 || (iArr88[11] == -1 && dq2.U(12, iArr88, iArr84))) {
                    qg5.G(iArr88);
                }
                lq2.W(iArr88, iArr87, iArr86);
                qg5.x0(iArr86, iArr88);
                qg5.B0(dq2.d(12, iArr88, iArr88, iArr88), iArr88);
                lq2.W(iArr89, iArr92, iArr86);
                qg5.x0(iArr86, iArr89);
                qg5.B0(dq2.y0(12, iArr89), iArr89);
                qg5.B0(dq2.z0(12, iArr90, iArr87), iArr87);
                tf4 tf4Var4 = new tf4(iArr90);
                lq2.h0(iArr88, iArr86);
                qg5.x0(iArr86, iArr90);
                qg5.Q0(iArr90, iArr89, iArr90);
                qg5.Q0(iArr90, iArr89, iArr90);
                tf4 tf4Var5 = new tf4(iArr89);
                qg5.Q0(iArr89, iArr90, iArr89);
                lq2.W(iArr89, iArr88, iArr86);
                qg5.x0(iArr86, iArr89);
                qg5.Q0(iArr89, iArr87, iArr89);
                tf4 tf4Var6 = new tf4(iArr88);
                if (dq2.x0(12, 0, iArr85, iArr88) != 0 || (iArr88[11] == -1 && dq2.U(12, iArr88, iArr84))) {
                    qg5.G(iArr88);
                }
                if (!S4) {
                    lq2.W(iArr88, iArr91, iArr86);
                    qg5.x0(iArr86, iArr88);
                }
                return new tm0(v51Var13, tf4Var4, tf4Var5, new e41[]{tf4Var6}, (byte) 13);
            default:
                if (i()) {
                    return this;
                }
                vf4 vf4Var = (vf4) e41Var3;
                boolean T6 = vf4Var.T();
                int[] iArr93 = vf4Var.r;
                v51 v51Var14 = this.a;
                if (T6) {
                    return v51Var14.k();
                }
                vf4 vf4Var2 = (vf4) e41Var2;
                vf4 vf4Var3 = (vf4) e41VarArr[0];
                int[] iArr94 = new int[33];
                int[] iArr95 = new int[17];
                int[] iArr96 = new int[17];
                int[] iArr97 = new int[17];
                eu5.H(iArr93, iArr94);
                eu5.g0(iArr94, iArr97);
                int[] iArr98 = new int[17];
                eu5.H(iArr97, iArr94);
                eu5.g0(iArr94, iArr98);
                boolean S5 = vf4Var3.S();
                int[] iArr99 = vf4Var3.r;
                if (S5) {
                    iArr9 = iArr99;
                } else {
                    eu5.H(iArr99, iArr94);
                    eu5.g0(iArr94, iArr96);
                    iArr9 = iArr96;
                }
                int[] iArr100 = vf4Var2.r;
                eu5.r0(iArr100, iArr9, iArr95);
                eu5.t(iArr100, iArr9, iArr96);
                eu5.D(iArr96, iArr95, iArr94);
                eu5.g0(iArr94, iArr96);
                dq2.d(17, iArr96, iArr96, iArr96);
                eu5.h0(iArr96);
                eu5.D(iArr97, iArr100, iArr94);
                eu5.g0(iArr94, iArr97);
                dq2.y0(17, iArr97);
                eu5.h0(iArr97);
                dq2.z0(17, iArr98, iArr95);
                eu5.h0(iArr95);
                vf4 vf4Var4 = new vf4(iArr98);
                eu5.H(iArr96, iArr94);
                eu5.g0(iArr94, iArr98);
                eu5.r0(iArr98, iArr97, iArr98);
                eu5.r0(iArr98, iArr97, iArr98);
                vf4 vf4Var5 = new vf4(iArr97);
                eu5.r0(iArr97, iArr98, iArr97);
                eu5.D(iArr97, iArr96, iArr94);
                eu5.g0(iArr94, iArr97);
                eu5.r0(iArr97, iArr95, iArr97);
                vf4 vf4Var6 = new vf4(iArr96);
                int i = iArr93[16];
                iArr96[16] = (dq2.x0(16, i << 23, iArr93, iArr96) | (i << 1)) & 511;
                if (!S5) {
                    eu5.D(iArr96, iArr99, iArr94);
                    eu5.g0(iArr94, iArr96);
                }
                return new tm0(v51Var14, vf4Var4, vf4Var5, new e41[]{vf4Var6}, (byte) 14);
        }
    }

    @Override // defpackage.g61
    public final g61 q(g61 g61Var) {
        byte b = this.h;
        e41 e41Var = this.c;
        switch (b) {
            case 0:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 1:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                v51 v51Var = this.a;
                                byte b2 = v51Var.f;
                                if (b2 == 0) {
                                    e41 e41Var2 = g61Var.b;
                                    e41 e41Var3 = g61Var.c;
                                    e41 e41Var4 = this.b;
                                    e41 t0 = e41Var2.t0(e41Var4);
                                    e41 t02 = e41Var3.t0(e41Var);
                                    if (!t0.T()) {
                                        e41 q0 = t0.q0();
                                        e41 t03 = q0.X(e41Var4.k(e41Var4).k(e41Var2)).t0(t02.q0());
                                        if (!t03.T()) {
                                            e41 P = t03.X(t0).P();
                                            e41 X = t03.X(P).X(t02);
                                            e41 t04 = e41Var.k(e41Var).X(q0).X(t0).X(P).t0(X);
                                            e41 k = t04.t0(X).X(X.k(t04)).k(e41Var2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else if (t02.T()) {
                                        break;
                                    }
                                } else if (b2 == 4) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 3:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 4:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 5:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 6:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 7:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 8:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 9:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 10:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 11:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 12:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            case 13:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
            default:
                if (this != g61Var) {
                    if (!i()) {
                        if (!g61Var.i()) {
                            if (!e41Var.T()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                } else if (!i() && !e41Var.T()) {
                    break;
                }
                break;
        }
        return p().a(g61Var);
    }

    public sm0 v(sm0 sm0Var, int[] iArr) {
        sm0 sm0Var2 = (sm0) this.a.b;
        if (jl2.Q(sm0Var.r)) {
            return sm0Var2;
        }
        sm0 sm0Var3 = new sm0();
        int[] iArr2 = new int[8];
        sm0Var3.r = iArr2;
        if (iArr == null) {
            wx5.I(sm0Var.r, iArr2);
            iArr = iArr2;
        }
        wx5.I(iArr, iArr2);
        wx5.s(iArr2, sm0Var2.r, iArr2);
        return sm0Var3;
    }

    public e41 w(e41 e41Var, e41 e41Var2) {
        e41 e41Var3 = this.a.b;
        if (e41Var3.T() || e41Var.S()) {
            return e41Var3;
        }
        if (e41Var2 == null) {
            e41Var2 = e41Var.q0();
        }
        e41 q0 = e41Var2.q0();
        e41 a0 = e41Var3.a0();
        return a0.r() < e41Var3.r() ? q0.X(a0).a0() : q0.X(e41Var3);
    }

    public e41 x() {
        e41[] e41VarArr = this.d;
        e41 e41Var = e41VarArr[1];
        if (e41Var != null) {
            return e41Var;
        }
        e41 w = w(e41VarArr[0], null);
        e41VarArr[1] = w;
        return w;
    }

    public g61 y() {
        if (!i()) {
            e41 e41Var = this.c;
            if (!e41Var.T()) {
                v51 v51Var = this.a;
                byte b = v51Var.f;
                if (b != 0) {
                    return b != 4 ? p().a(this) : A(false).a(this);
                }
                e41 k = e41Var.k(e41Var);
                e41 q0 = k.q0();
                e41 e41Var2 = this.b;
                e41 q02 = e41Var2.q0();
                e41 k2 = q02.k(q02).k(q02).k(v51Var.b);
                e41 t0 = e41Var2.k(e41Var2).k(e41Var2).X(q0).t0(k2.q0());
                if (t0.T()) {
                    return v51Var.k();
                }
                e41 P = t0.X(k).P();
                e41 X = t0.X(P).X(k2);
                e41 t02 = q0.q0().X(P).t0(X);
                e41 k3 = t02.t0(X).X(X.k(t02)).k(e41Var2);
                return new tm0(v51Var, k3, e41Var2.t0(k3).X(t02).t0(e41Var), (byte) 1);
            }
        }
        return this;
    }

    public tm0 z(boolean z) {
        sm0 sm0Var;
        sm0 sm0Var2 = (sm0) this.b;
        sm0 sm0Var3 = (sm0) this.c;
        e41[] e41VarArr = this.d;
        e41 e41Var = e41VarArr[0];
        sm0 sm0Var4 = (sm0) e41Var;
        sm0 sm0Var5 = (sm0) e41VarArr[1];
        if (sm0Var5 == null) {
            sm0Var5 = v((sm0) e41Var, null);
            e41VarArr[1] = sm0Var5;
        }
        int[] iArr = {(int) r12, (int) r12, (int) r12, (int) r12, (int) r12, (int) r12, (int) r12, (int) r12};
        wx5.I(sm0Var2.r, iArr);
        int h = jl2.h(iArr, iArr, iArr);
        int[] iArr2 = sm0Var5.r;
        long j = (iArr2[0] & 4294967295L) + (iArr[0] & 4294967295L);
        long j2 = (iArr2[1] & 4294967295L) + (iArr[1] & 4294967295L) + (j >>> 32);
        long j3 = (iArr2[2] & 4294967295L) + (iArr[2] & 4294967295L) + (j2 >>> 32);
        long j4 = (iArr2[3] & 4294967295L) + (iArr[3] & 4294967295L) + (j3 >>> 32);
        long j5 = (iArr2[4] & 4294967295L) + (iArr[4] & 4294967295L) + (j4 >>> 32);
        long j6 = (iArr2[5] & 4294967295L) + (iArr[5] & 4294967295L) + (j5 >>> 32);
        long j7 = (iArr2[6] & 4294967295L) + (iArr[6] & 4294967295L) + (j6 >>> 32);
        long j8 = (iArr2[7] & 4294967295L) + (iArr[7] & 4294967295L) + (j7 >>> 32);
        wx5.B(h + ((int) (j8 >>> 32)), iArr);
        int[] iArr3 = new int[8];
        wx5.T(sm0Var3.r, iArr3);
        int[] iArr4 = new int[8];
        wx5.s(iArr3, sm0Var3.r, iArr4);
        int[] iArr5 = new int[8];
        wx5.s(iArr4, sm0Var2.r, iArr5);
        wx5.T(iArr5, iArr5);
        int[] iArr6 = new int[8];
        wx5.I(iArr4, iArr6);
        wx5.T(iArr6, iArr6);
        sm0 sm0Var6 = new sm0(iArr4);
        wx5.I(iArr, iArr4);
        wx5.Q(iArr4, iArr5, iArr4);
        wx5.Q(iArr4, iArr5, iArr4);
        sm0 sm0Var7 = new sm0(iArr5);
        wx5.Q(iArr5, iArr4, iArr5);
        wx5.s(iArr5, iArr, iArr5);
        wx5.Q(iArr5, iArr6, iArr5);
        sm0 sm0Var8 = new sm0(iArr3);
        if (!jl2.Q(sm0Var4.r)) {
            wx5.s(iArr3, sm0Var4.r, iArr3);
        }
        if (z) {
            sm0Var = new sm0(iArr6);
            wx5.s(iArr6, sm0Var5.r, iArr6);
            wx5.T(iArr6, iArr6);
        } else {
            sm0Var = null;
        }
        return new tm0(this.a, sm0Var6, sm0Var7, new e41[]{sm0Var8, sm0Var}, (byte) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm0(v51 v51Var, e41 e41Var, e41 e41Var2, e41[] e41VarArr, byte b) {
        super(v51Var, e41Var, e41Var2, e41VarArr, (byte) 1);
        this.h = b;
    }
}
