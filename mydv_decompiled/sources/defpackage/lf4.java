package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class lf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public static final int[] t = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public final int[] r;

    public lf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP224K1FieldElement");
            throw null;
        }
        int[] A = il2.A(bigInteger);
        if (A[6] == -1 && il2.J(A, qg5.z)) {
            dq2.c(7, 6803, A);
        }
        this.r = A;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[7];
        jl2.n(qg5.z, ((lf4) e41Var).r, iArr);
        qg5.h0(iArr, this.r, iArr);
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 6; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((6 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 28;
    }

    @Override // defpackage.e41
    public final int J() {
        return 224;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[7];
        jl2.n(qg5.z, this.r, iArr);
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return il2.M(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return il2.N(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[7];
        qg5.h0(this.r, ((lf4) e41Var).r, iArr);
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[7];
        int[] iArr2 = qg5.z;
        int[] iArr3 = this.r;
        if (dq2.D(7, iArr3) != 0) {
            il2.e0(iArr2, iArr2, iArr);
        } else {
            il2.e0(iArr2, iArr3, iArr);
        }
        return new lf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lf4) {
            return il2.w(this.r, ((lf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(7, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[7];
        if (il2.f(this.r, ((lf4) e41Var).r, iArr) != 0 || (iArr[6] == -1 && il2.J(iArr, qg5.z))) {
            dq2.c(7, 6803, iArr);
        }
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[7];
        if (dq2.W(7, this.r, iArr) != 0 || (iArr[6] == -1 && il2.J(iArr, qg5.z))) {
            dq2.c(7, 6803, iArr);
        }
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (il2.N(iArr) || il2.M(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        qg5.H0(iArr, iArr2);
        qg5.h0(iArr2, iArr, iArr2);
        qg5.H0(iArr2, iArr2);
        qg5.h0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        qg5.H0(iArr2, iArr3);
        qg5.h0(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        qg5.M0(4, iArr3, iArr4);
        qg5.h0(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        qg5.M0(3, iArr4, iArr5);
        qg5.h0(iArr5, iArr2, iArr5);
        qg5.M0(8, iArr5, iArr5);
        qg5.h0(iArr5, iArr4, iArr5);
        qg5.M0(4, iArr5, iArr4);
        qg5.h0(iArr4, iArr3, iArr4);
        qg5.M0(19, iArr4, iArr3);
        qg5.h0(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        qg5.M0(42, iArr3, iArr6);
        qg5.h0(iArr6, iArr3, iArr6);
        qg5.M0(23, iArr6, iArr3);
        qg5.h0(iArr3, iArr4, iArr3);
        qg5.M0(84, iArr3, iArr4);
        qg5.h0(iArr4, iArr6, iArr4);
        qg5.M0(20, iArr4, iArr4);
        qg5.h0(iArr4, iArr5, iArr4);
        qg5.M0(3, iArr4, iArr4);
        qg5.h0(iArr4, iArr, iArr4);
        qg5.M0(2, iArr4, iArr4);
        qg5.h0(iArr4, iArr, iArr4);
        qg5.M0(4, iArr4, iArr4);
        qg5.h0(iArr4, iArr2, iArr4);
        qg5.H0(iArr4, iArr4);
        qg5.H0(iArr4, iArr6);
        if (il2.w(iArr, iArr6)) {
            return new lf4(iArr4);
        }
        qg5.h0(iArr4, t, iArr4);
        qg5.H0(iArr4, iArr6);
        if (il2.w(iArr, iArr6)) {
            return new lf4(iArr4);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[7];
        qg5.H0(this.r, iArr);
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[7];
        qg5.P0(this.r, ((lf4) e41Var).r, iArr);
        return new lf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return il2.D(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return il2.f0(this.r);
    }

    public lf4(int[] iArr) {
        this.r = iArr;
    }
}
