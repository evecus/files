package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class pf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    public final int[] r;

    public pf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP256K1FieldElement");
            throw null;
        }
        int[] C = jl2.C(bigInteger);
        if (C[7] == -1) {
            int[] iArr = wx5.j0;
            if (jl2.K(C, iArr)) {
                jl2.n0(iArr, C);
            }
        }
        this.r = C;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[8];
        jl2.n(wx5.j0, ((pf4) e41Var).r, iArr);
        int[] iArr2 = new int[16];
        jl2.a0(iArr, this.r, iArr2);
        wx5.A(iArr2, iArr);
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 7; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((7 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 32;
    }

    @Override // defpackage.e41
    public final int J() {
        return 256;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[8];
        jl2.n(wx5.j0, this.r, iArr);
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return jl2.Q(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return jl2.T(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        jl2.a0(this.r, ((pf4) e41Var).r, iArr2);
        wx5.A(iArr2, iArr);
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[8];
        int[] iArr2 = wx5.j0;
        int[] iArr3 = this.r;
        if (dq2.D(8, iArr3) != 0) {
            jl2.m0(iArr2, iArr2, iArr);
        } else {
            jl2.m0(iArr2, iArr3, iArr);
        }
        return new pf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pf4) {
            return jl2.x(this.r, ((pf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(8, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[8];
        if (jl2.f(this.r, ((pf4) e41Var).r, iArr) != 0 || (iArr[7] == -1 && jl2.K(iArr, wx5.j0))) {
            dq2.c(8, 977, iArr);
        }
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[8];
        if (dq2.W(8, this.r, iArr) != 0 || (iArr[7] == -1 && jl2.K(iArr, wx5.j0))) {
            dq2.c(8, 977, iArr);
        }
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (jl2.T(iArr) || jl2.Q(iArr)) {
            return this;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[8];
        jl2.j0(iArr, iArr2);
        wx5.A(iArr2, iArr3);
        jl2.a0(iArr3, iArr, iArr2);
        wx5.A(iArr2, iArr3);
        int[] iArr4 = new int[8];
        jl2.j0(iArr3, iArr2);
        wx5.A(iArr2, iArr4);
        jl2.a0(iArr4, iArr, iArr2);
        wx5.A(iArr2, iArr4);
        int[] iArr5 = new int[8];
        wx5.L(3, iArr4, iArr5, iArr2);
        jl2.a0(iArr5, iArr4, iArr2);
        wx5.A(iArr2, iArr5);
        wx5.L(3, iArr5, iArr5, iArr2);
        jl2.a0(iArr5, iArr4, iArr2);
        wx5.A(iArr2, iArr5);
        wx5.L(2, iArr5, iArr5, iArr2);
        jl2.a0(iArr5, iArr3, iArr2);
        wx5.A(iArr2, iArr5);
        int[] iArr6 = new int[8];
        wx5.L(11, iArr5, iArr6, iArr2);
        jl2.a0(iArr6, iArr5, iArr2);
        wx5.A(iArr2, iArr6);
        wx5.L(22, iArr6, iArr5, iArr2);
        jl2.a0(iArr5, iArr6, iArr2);
        wx5.A(iArr2, iArr5);
        int[] iArr7 = new int[8];
        wx5.L(44, iArr5, iArr7, iArr2);
        jl2.a0(iArr7, iArr5, iArr2);
        wx5.A(iArr2, iArr7);
        int[] iArr8 = new int[8];
        wx5.L(88, iArr7, iArr8, iArr2);
        jl2.a0(iArr8, iArr7, iArr2);
        wx5.A(iArr2, iArr8);
        wx5.L(44, iArr8, iArr7, iArr2);
        jl2.a0(iArr7, iArr5, iArr2);
        wx5.A(iArr2, iArr7);
        wx5.L(3, iArr7, iArr5, iArr2);
        jl2.a0(iArr5, iArr4, iArr2);
        wx5.A(iArr2, iArr5);
        wx5.L(23, iArr5, iArr5, iArr2);
        jl2.a0(iArr5, iArr6, iArr2);
        wx5.A(iArr2, iArr5);
        wx5.L(6, iArr5, iArr5, iArr2);
        jl2.a0(iArr5, iArr3, iArr2);
        wx5.A(iArr2, iArr5);
        wx5.L(2, iArr5, iArr5, iArr2);
        jl2.j0(iArr5, iArr2);
        wx5.A(iArr2, iArr3);
        if (jl2.x(iArr, iArr3)) {
            return new pf4(iArr5);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        jl2.j0(this.r, iArr2);
        wx5.A(iArr2, iArr);
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[8];
        wx5.S(this.r, ((pf4) e41Var).r, iArr);
        return new pf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return (this.r[0] & 1) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return jl2.o0(this.r);
    }

    public pf4(int[] iArr) {
        this.r = iArr;
    }
}
