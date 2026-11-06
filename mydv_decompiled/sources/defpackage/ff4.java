package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ff4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public final int[] r;

    public ff4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP160R2FieldElement");
            throw null;
        }
        int[] L = dq2.L(bigInteger);
        if (L[4] == -1) {
            int[] iArr = eu5.E;
            if (dq2.V(L, iArr)) {
                dq2.G0(iArr, L);
            }
        }
        this.r = L;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[5];
        jl2.n(eu5.E, ((ff4) e41Var).r, iArr);
        eu5.N(iArr, this.r, iArr);
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 4; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((4 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 20;
    }

    @Override // defpackage.e41
    public final int J() {
        return 160;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[5];
        jl2.n(eu5.E, this.r, iArr);
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return dq2.d0(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return dq2.h0(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[5];
        eu5.N(this.r, ((ff4) e41Var).r, iArr);
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[5];
        int[] iArr2 = eu5.E;
        int[] iArr3 = this.r;
        if (dq2.D(5, iArr3) != 0) {
            dq2.C0(iArr2, iArr2, iArr);
        } else {
            dq2.C0(iArr2, iArr3, iArr);
        }
        return new ff4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ff4) {
            return dq2.C(this.r, ((ff4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(5, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[5];
        if (dq2.b(this.r, ((ff4) e41Var).r, iArr) != 0 || (iArr[4] == -1 && dq2.V(iArr, eu5.E))) {
            dq2.c(5, 21389, iArr);
        }
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[5];
        if (dq2.W(5, this.r, iArr) != 0 || (iArr[4] == -1 && dq2.V(iArr, eu5.E))) {
            dq2.c(5, 21389, iArr);
        }
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (dq2.h0(iArr) || dq2.d0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        eu5.k0(iArr, iArr2);
        eu5.N(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        eu5.k0(iArr2, iArr3);
        eu5.N(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        eu5.k0(iArr3, iArr4);
        eu5.N(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        eu5.n0(3, iArr4, iArr5);
        eu5.N(iArr5, iArr3, iArr5);
        eu5.n0(7, iArr5, iArr4);
        eu5.N(iArr4, iArr5, iArr4);
        eu5.n0(3, iArr4, iArr5);
        eu5.N(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        eu5.n0(14, iArr5, iArr6);
        eu5.N(iArr6, iArr4, iArr6);
        eu5.n0(31, iArr6, iArr4);
        eu5.N(iArr4, iArr6, iArr4);
        eu5.n0(62, iArr4, iArr6);
        eu5.N(iArr6, iArr4, iArr6);
        eu5.n0(3, iArr6, iArr4);
        eu5.N(iArr4, iArr3, iArr4);
        eu5.n0(18, iArr4, iArr4);
        eu5.N(iArr4, iArr5, iArr4);
        eu5.n0(2, iArr4, iArr4);
        eu5.N(iArr4, iArr, iArr4);
        eu5.n0(3, iArr4, iArr4);
        eu5.N(iArr4, iArr2, iArr4);
        eu5.n0(6, iArr4, iArr4);
        eu5.N(iArr4, iArr3, iArr4);
        eu5.n0(2, iArr4, iArr4);
        eu5.N(iArr4, iArr, iArr4);
        eu5.k0(iArr4, iArr2);
        if (dq2.C(iArr, iArr2)) {
            return new ff4(iArr4);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[5];
        eu5.k0(this.r, iArr);
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[5];
        eu5.p0(this.r, ((ff4) e41Var).r, iArr);
        return new ff4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return dq2.O(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return dq2.M0(this.r);
    }

    public ff4(int[] iArr) {
        this.r = iArr;
    }
}
