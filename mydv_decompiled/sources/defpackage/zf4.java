package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class zf4 extends x51 {
    public final long[] r;

    public zf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            s83.t("x value invalid for SecT131FieldElement");
            throw null;
        }
        this.r = dq2.M(131, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[5];
        long[] jArr2 = this.r;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2]};
        for (int i = 1; i < 131; i += 2) {
            wx5.m(jArr3, jArr);
            wx5.y(jArr, jArr3);
            wx5.m(jArr3, jArr);
            wx5.y(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
        }
        return new zf4(jArr3);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        long[] jArr = this.r;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 131;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[3];
        long[] jArr2 = this.r;
        if (lq2.R(jArr2)) {
            s83.r();
            return null;
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[5];
        wx5.m(jArr2, jArr5);
        wx5.y(jArr5, jArr3);
        wx5.t(jArr3, jArr2, jArr3);
        wx5.M(2, jArr3, jArr4);
        wx5.t(jArr4, jArr3, jArr4);
        wx5.M(4, jArr4, jArr3);
        wx5.t(jArr3, jArr4, jArr3);
        wx5.M(8, jArr3, jArr4);
        wx5.t(jArr4, jArr3, jArr4);
        wx5.M(16, jArr4, jArr3);
        wx5.t(jArr3, jArr4, jArr3);
        wx5.M(32, jArr3, jArr4);
        wx5.t(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        wx5.m(jArr4, jArr6);
        wx5.y(jArr6, jArr4);
        wx5.t(jArr4, jArr2, jArr4);
        wx5.M(65, jArr4, jArr3);
        wx5.t(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        wx5.m(jArr3, jArr7);
        wx5.y(jArr7, jArr);
        return new zf4(jArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        long[] jArr = this.r;
        if (jArr[0] == 1) {
            for (int i = 1; i < 3; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e41
    public final boolean T() {
        return lq2.R(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[3];
        wx5.t(this.r, ((zf4) e41Var).r, jArr);
        return new zf4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((zf4) e41Var).r;
        long[] jArr2 = ((zf4) e41Var2).r;
        long[] jArr3 = ((zf4) e41Var3).r;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[8];
        wx5.k(this.r, jArr, jArr5);
        wx5.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        wx5.k(jArr2, jArr3, jArr6);
        wx5.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        wx5.y(jArr4, jArr7);
        return new zf4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zf4)) {
            return false;
        }
        long[] jArr = ((zf4) obj).r;
        for (int i = 2; i >= 0; i--) {
            if (this.r[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.O(this.r, 3) ^ 131832;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((zf4) e41Var).r;
        long[] jArr2 = this.r;
        return new zf4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new zf4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = new long[3];
        long[] jArr2 = this.r;
        long y0 = e41.y0(jArr2[0]);
        long y02 = e41.y0(jArr2[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long y03 = e41.y0(jArr2[2]);
        wx5.t(new long[]{(y0 >>> 32) | (y02 & (-4294967296L)), y03 >>> 32, 0}, wx5.m0, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (y03 & 4294967295L);
        return new zf4(jArr);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        wx5.m(this.r, jArr2);
        wx5.y(jArr2, jArr);
        return new zf4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((zf4) e41Var).r;
        long[] jArr2 = ((zf4) e41Var2).r;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        wx5.m(this.r, jArr4);
        wx5.d(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        wx5.k(jArr, jArr2, jArr5);
        wx5.d(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        wx5.y(jArr3, jArr6);
        return new zf4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        wx5.M(i, this.r, jArr);
        return new zf4(jArr);
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
        return lq2.n0(this.r);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public zf4(long[] jArr) {
        this.r = jArr;
    }
}
