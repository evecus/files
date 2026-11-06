package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class vf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final int[] r;

    public vf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP521R1FieldElement");
            throw null;
        }
        int[] K = dq2.K(521, bigInteger);
        if (dq2.B(17, K, eu5.K)) {
            for (int i = 0; i < 17; i++) {
                K[i] = 0;
            }
        }
        this.r = K;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[17];
        jl2.n(eu5.K, ((vf4) e41Var).r, iArr);
        int[] iArr2 = new int[33];
        eu5.D(iArr, this.r, iArr2);
        eu5.g0(iArr2, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        int[] iArr = this.r;
        int i2 = iArr[16] << 16;
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        int i3 = i + 2;
        for (int i4 = 15; i4 >= 0; i4--) {
            dq2.a0(bArr, iArr[i4], ((15 - i4) << 2) + i3);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 66;
    }

    @Override // defpackage.e41
    public final int J() {
        return 521;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[17];
        jl2.n(eu5.K, this.r, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return dq2.c0(17, this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return dq2.g0(17, this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        eu5.D(this.r, ((vf4) e41Var).r, iArr2);
        eu5.g0(iArr2, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[17];
        int[] iArr2 = eu5.K;
        int[] iArr3 = this.r;
        if (dq2.D(17, iArr3) != 0) {
            dq2.B0(17, iArr2, iArr2, iArr);
        } else {
            dq2.B0(17, iArr2, iArr3, iArr);
        }
        return new vf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vf4) {
            return dq2.B(17, this.r, ((vf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(17, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[17];
        eu5.t(this.r, ((vf4) e41Var).r, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[17];
        int[] iArr2 = this.r;
        int W = dq2.W(16, iArr2, iArr) + iArr2[16];
        if (W > 511 || (W == 511 && dq2.B(16, iArr, eu5.K))) {
            W = (dq2.X(iArr) + W) & 511;
        }
        iArr[16] = W;
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (dq2.g0(17, iArr) || dq2.c0(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[33];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[17];
        eu5.H(iArr, iArr2);
        eu5.g0(iArr2, iArr3);
        int i = 519;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            eu5.H(iArr3, iArr2);
            eu5.g0(iArr2, iArr3);
        }
        eu5.H(iArr3, iArr2);
        eu5.g0(iArr2, iArr4);
        if (dq2.B(17, iArr, iArr4)) {
            return new vf4(iArr3);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        eu5.H(this.r, iArr2);
        eu5.g0(iArr2, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[17];
        eu5.r0(this.r, ((vf4) e41Var).r, iArr);
        return new vf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return dq2.P(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return dq2.L0(17, this.r);
    }

    public vf4(int[] iArr) {
        this.r = iArr;
    }
}
