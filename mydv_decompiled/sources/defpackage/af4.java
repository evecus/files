package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class af4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final int[] r;

    public af4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP128R1FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            s83.d();
            throw null;
        }
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            if (jl2.J(iArr, j16.i0)) {
                long j = (iArr[0] & 4294967295L) - (r0[0] & 4294967295L);
                iArr[0] = (int) j;
                long j2 = ((iArr[1] & 4294967295L) - (r0[1] & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((iArr[2] & 4294967295L) - (r0[2] & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((iArr[3] & 4294967295L) - (4294967295L & r0[3])) + (j3 >> 32));
            }
        }
        this.r = iArr;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[4];
        jl2.n(j16.i0, ((af4) e41Var).r, iArr);
        j16.L(iArr, this.r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 3; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((3 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 16;
    }

    @Override // defpackage.e41
    public final int J() {
        return 128;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[4];
        jl2.n(j16.i0, this.r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return jl2.P(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return jl2.S(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[4];
        j16.L(this.r, ((af4) e41Var).r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[4];
        int[] iArr2 = j16.i0;
        int[] iArr3 = this.r;
        if (dq2.D(4, iArr3) != 0) {
            jl2.k0(iArr2, iArr2, iArr);
        } else {
            jl2.k0(iArr2, iArr3, iArr);
        }
        return new af4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof af4)) {
            return false;
        }
        int[] iArr = ((af4) obj).r;
        for (int i = 3; i >= 0; i--) {
            if (this.r[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.M(4, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[4];
        j16.j(this.r, ((af4) e41Var).r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[4];
        if (dq2.W(4, this.r, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && jl2.J(iArr, j16.i0))) {
            j16.l(iArr);
        }
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (jl2.S(iArr) || jl2.P(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        j16.X(iArr, iArr2);
        j16.L(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        j16.Z(2, iArr2, iArr3);
        j16.L(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        j16.Z(4, iArr3, iArr4);
        j16.L(iArr4, iArr3, iArr4);
        j16.Z(2, iArr4, iArr3);
        j16.L(iArr3, iArr2, iArr3);
        j16.Z(10, iArr3, iArr2);
        j16.L(iArr2, iArr3, iArr2);
        j16.Z(10, iArr2, iArr4);
        j16.L(iArr4, iArr3, iArr4);
        j16.X(iArr4, iArr3);
        j16.L(iArr3, iArr, iArr3);
        j16.Z(95, iArr3, iArr3);
        j16.X(iArr3, iArr4);
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr4[i]) {
                return null;
            }
        }
        return new af4(iArr3);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[4];
        j16.X(this.r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[4];
        j16.d0(this.r, ((af4) e41Var).r, iArr);
        return new af4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return (this.r[0] & 1) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = this.r[i];
            if (i2 != 0) {
                dq2.a0(bArr, i2, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public af4(int[] iArr) {
        this.r = iArr;
    }
}
