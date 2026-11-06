package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ug4 extends x51 {
    public long[] r;

    public ug4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            s83.t("x value invalid for SecT571FieldElement");
            throw null;
        }
        this.r = dq2.M(571, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[9];
        long[] jArr2 = this.r;
        long[] jArr3 = new long[18];
        jArr[0] = jArr2[0];
        jArr[1] = jArr2[1];
        jArr[2] = jArr2[2];
        jArr[3] = jArr2[3];
        jArr[4] = jArr2[4];
        jArr[5] = jArr2[5];
        jArr[6] = jArr2[6];
        jArr[7] = jArr2[7];
        jArr[8] = jArr2[8];
        for (int i = 1; i < 571; i += 2) {
            eu5.I(jArr, jArr3);
            eu5.e0(jArr3, jArr);
            eu5.I(jArr, jArr3);
            eu5.e0(jArr3, jArr);
            for (int i2 = 0; i2 < 9; i2++) {
                jArr[i2] = jArr[i2] ^ jArr2[i2];
            }
        }
        return new ug4(jArr);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        long[] jArr = this.r;
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 571;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[9];
        long[] jArr2 = this.r;
        if (jl2.V(jArr2)) {
            s83.r();
            return null;
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        eu5.l0(jArr2, jArr5);
        eu5.l0(jArr5, jArr3);
        eu5.l0(jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(2, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.O(jArr3, jArr5, jArr3);
        eu5.o0(5, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(5, jArr4, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(15, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr5);
        eu5.o0(30, jArr5, jArr3);
        eu5.o0(30, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(60, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(60, jArr4, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(180, jArr3, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.o0(180, jArr4, jArr4);
        eu5.O(jArr3, jArr4, jArr3);
        eu5.O(jArr3, jArr5, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        long[] jArr = this.r;
        if (jArr[0] == 1) {
            for (int i = 1; i < 9; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e41
    public final boolean T() {
        return jl2.V(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[9];
        eu5.O(this.r, ((ug4) e41Var).r, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = this.r;
        long[] jArr2 = ((ug4) e41Var).r;
        long[] jArr3 = ((ug4) e41Var2).r;
        long[] jArr4 = ((ug4) e41Var3).r;
        long[] jArr5 = new long[18];
        eu5.R(jArr, jArr2, jArr5);
        eu5.R(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        eu5.e0(jArr5, jArr6);
        return new ug4(jArr6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ug4)) {
            return false;
        }
        long[] jArr = this.r;
        long[] jArr2 = ((ug4) obj).r;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.O(this.r, 9) ^ 5711052;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = new long[9];
        eu5.s(this.r, ((ug4) e41Var).r, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = new long[9];
        long[] jArr2 = this.r;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = new long[9];
        long[] jArr2 = this.r;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long y0 = e41.y0(jArr2[i]);
            i += 2;
            long y02 = e41.y0(jArr2[i3]);
            jArr3[i2] = (4294967295L & y0) | (y02 << 32);
            jArr4[i2] = (y0 >>> 32) | ((-4294967296L) & y02);
        }
        long y03 = e41.y0(jArr2[i]);
        jArr3[4] = 4294967295L & y03;
        jArr4[4] = y03 >>> 32;
        eu5.O(jArr4, eu5.L, jArr);
        eu5.s(jArr, jArr3, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[9];
        eu5.l0(this.r, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = this.r;
        long[] jArr2 = ((ug4) e41Var).r;
        long[] jArr3 = ((ug4) e41Var2).r;
        long[] jArr4 = new long[18];
        long[] jArr5 = new long[18];
        eu5.I(jArr, jArr5);
        eu5.w(jArr4, jArr5, jArr4);
        eu5.R(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[9];
        eu5.e0(jArr4, jArr6);
        return new ug4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        eu5.o0(i, this.r, jArr);
        return new ug4(jArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        return k(e41Var);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return (this.r[0] & 1) != 0;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        long[] jArr = this.r;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                dq2.n0(bArr, (8 - i) << 3, j);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public ug4(long[] jArr) {
        this.r = jArr;
    }
}
