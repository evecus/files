package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class og4 extends x51 {
    public final long[] r;

    public og4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            s83.t("x value invalid for SecT283FieldElement");
            throw null;
        }
        this.r = dq2.M(283, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[9];
        long[] jArr2 = this.r;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4]};
        for (int i = 1; i < 283; i += 2) {
            qg5.Y(jArr3, jArr);
            qg5.u0(jArr, jArr3);
            qg5.Y(jArr3, jArr);
            qg5.u0(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
        }
        return new og4(jArr3);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        long[] jArr = this.r;
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 283;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[5];
        for (int i = 0; i < 5; i++) {
            long[] jArr2 = this.r;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                qg5.F0(jArr2, jArr3);
                qg5.f0(jArr3, jArr2, jArr3);
                qg5.K0(2, jArr3, jArr4);
                qg5.f0(jArr4, jArr3, jArr4);
                qg5.K0(4, jArr4, jArr3);
                qg5.f0(jArr3, jArr4, jArr3);
                qg5.K0(8, jArr3, jArr4);
                qg5.f0(jArr4, jArr3, jArr4);
                qg5.F0(jArr4, jArr4);
                qg5.f0(jArr4, jArr2, jArr4);
                qg5.K0(17, jArr4, jArr3);
                qg5.f0(jArr3, jArr4, jArr3);
                qg5.F0(jArr3, jArr3);
                qg5.f0(jArr3, jArr2, jArr3);
                qg5.K0(35, jArr3, jArr4);
                qg5.f0(jArr4, jArr3, jArr4);
                qg5.K0(70, jArr4, jArr3);
                qg5.f0(jArr3, jArr4, jArr3);
                qg5.F0(jArr3, jArr3);
                qg5.f0(jArr3, jArr2, jArr3);
                qg5.K0(141, jArr3, jArr4);
                qg5.f0(jArr4, jArr3, jArr4);
                qg5.F0(jArr4, jArr);
                return new og4(jArr);
            }
        }
        s83.r();
        return null;
    }

    @Override // defpackage.e41
    public final boolean S() {
        long[] jArr = this.r;
        if (jArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e41
    public final boolean T() {
        for (int i = 0; i < 5; i++) {
            if (this.r[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[5];
        qg5.f0(this.r, ((og4) e41Var).r, jArr);
        return new og4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((og4) e41Var).r;
        long[] jArr2 = ((og4) e41Var2).r;
        long[] jArr3 = ((og4) e41Var3).r;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        qg5.W(this.r, jArr, jArr5);
        qg5.E(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        qg5.W(jArr2, jArr3, jArr6);
        qg5.E(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        qg5.u0(jArr4, jArr7);
        return new og4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof og4)) {
            return false;
        }
        long[] jArr = ((og4) obj).r;
        for (int i = 4; i >= 0; i--) {
            if (this.r[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.O(this.r, 5) ^ 2831275;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((og4) e41Var).r;
        long[] jArr2 = this.r;
        return new og4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new og4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = new long[5];
        long[] jArr2 = this.r;
        long y0 = e41.y0(jArr2[0]);
        long y02 = e41.y0(jArr2[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long y03 = e41.y0(jArr2[2]);
        long y04 = e41.y0(jArr2[3]);
        long j2 = (y03 & 4294967295L) | (y04 << 32);
        long y05 = e41.y0(jArr2[4]);
        qg5.f0(new long[]{(y0 >>> 32) | (y02 & (-4294967296L)), (y03 >>> 32) | (y04 & (-4294967296L)), y05 >>> 32, 0, 0}, qg5.F, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j2;
        jArr[2] = jArr[2] ^ (4294967295L & y05);
        return new og4(jArr);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[5];
        qg5.F0(this.r, jArr);
        return new og4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((og4) e41Var).r;
        long[] jArr2 = ((og4) e41Var2).r;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        qg5.Y(this.r, jArr4);
        qg5.E(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        qg5.W(jArr, jArr2, jArr5);
        qg5.E(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        qg5.u0(jArr3, jArr6);
        return new og4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        qg5.K0(i, this.r, jArr);
        return new og4(jArr);
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
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = this.r[i];
            if (j != 0) {
                dq2.n0(bArr, (4 - i) << 3, j);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public og4(long[] jArr) {
        this.r = jArr;
    }
}
