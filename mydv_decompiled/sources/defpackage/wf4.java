package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class wf4 extends x51 {
    public final long[] r;

    public wf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            s83.t("x value invalid for SecT113FieldElement");
            throw null;
        }
        this.r = dq2.M(113, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[4];
        long[] jArr2 = this.r;
        long[] jArr3 = {jArr2[0], jArr2[1]};
        for (int i = 1; i < 113; i += 2) {
            e41.E(2, jArr3, jArr);
            fb4.Q(jArr, jArr3);
            e41.E(2, jArr3, jArr);
            fb4.Q(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
        }
        return new wf4(jArr3);
    }

    @Override // defpackage.x51
    public final int D0() {
        return ((int) this.r[0]) & 1;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            long[] jArr2 = this.r;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                e41.E(2, jArr2, jArr5);
                fb4.Q(jArr5, jArr3);
                fb4.K(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                e41.E(2, jArr3, jArr6);
                fb4.Q(jArr6, jArr3);
                fb4.K(jArr3, jArr2, jArr3);
                fb4.W(3, jArr3, jArr4);
                fb4.K(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                e41.E(2, jArr4, jArr7);
                fb4.Q(jArr7, jArr4);
                fb4.K(jArr4, jArr2, jArr4);
                fb4.W(7, jArr4, jArr3);
                fb4.K(jArr3, jArr4, jArr3);
                fb4.W(14, jArr3, jArr4);
                fb4.K(jArr4, jArr3, jArr4);
                fb4.W(28, jArr4, jArr3);
                fb4.K(jArr3, jArr4, jArr3);
                fb4.W(56, jArr3, jArr4);
                fb4.K(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                e41.E(2, jArr4, jArr8);
                fb4.Q(jArr8, jArr);
                return new wf4(jArr);
            }
        }
        s83.r();
        return null;
    }

    @Override // defpackage.e41
    public final boolean S() {
        long[] jArr = this.r;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // defpackage.e41
    public final boolean T() {
        for (int i = 0; i < 2; i++) {
            if (this.r[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[2];
        fb4.K(this.r, ((wf4) e41Var).r, jArr);
        return new wf4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((wf4) e41Var).r;
        long[] jArr2 = ((wf4) e41Var2).r;
        long[] jArr3 = ((wf4) e41Var3).r;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        fb4.B(this.r, jArr, jArr5);
        fb4.e(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        fb4.B(jArr2, jArr3, jArr6);
        fb4.e(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        fb4.Q(jArr4, jArr7);
        return new wf4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof wf4)) {
                return false;
            }
            long[] jArr = ((wf4) obj).r;
            for (int i = 1; i >= 0; i--) {
                if (this.r[i] != jArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.O(this.r, 2) ^ 113009;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((wf4) e41Var).r;
        long[] jArr2 = this.r;
        return new wf4(new long[]{jArr2[0] ^ jArr[0], jArr[1] ^ jArr2[1]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new wf4(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = this.r;
        long y0 = e41.y0(jArr[0]);
        long y02 = e41.y0(jArr[1]);
        long j = (4294967295L & y0) | (y02 << 32);
        long j2 = (y0 >>> 32) | (y02 & (-4294967296L));
        return new wf4(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        e41.E(2, this.r, jArr2);
        fb4.Q(jArr2, jArr);
        return new wf4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((wf4) e41Var).r;
        long[] jArr2 = ((wf4) e41Var2).r;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        e41.E(2, this.r, jArr4);
        fb4.e(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        fb4.B(jArr, jArr2, jArr5);
        fb4.e(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        fb4.Q(jArr3, jArr6);
        return new wf4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        fb4.W(i, this.r, jArr);
        return new wf4(jArr);
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
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = this.r[i];
            if (j != 0) {
                dq2.n0(bArr, (1 - i) << 3, j);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public wf4(long[] jArr) {
        this.r = jArr;
    }
}
