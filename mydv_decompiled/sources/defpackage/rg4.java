package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class rg4 extends x51 {
    public final long[] r;

    public rg4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            s83.t("x value invalid for SecT409FieldElement");
            throw null;
        }
        this.r = dq2.M(409, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[13];
        long[] jArr2 = this.r;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4], jArr2[5], jArr2[6]};
        for (int i = 1; i < 409; i += 2) {
            fb4.F(jArr3, jArr);
            fb4.R(jArr, jArr3);
            fb4.F(jArr3, jArr);
            fb4.R(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
            jArr3[5] = jArr3[5] ^ jArr2[5];
            jArr3[6] = jArr3[6] ^ jArr2[6];
        }
        return new rg4(jArr3);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        return ((int) this.r[0]) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 409;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[7];
        for (int i = 0; i < 7; i++) {
            long[] jArr2 = this.r;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                fb4.F(jArr2, jArr6);
                fb4.R(jArr6, jArr3);
                fb4.X(1, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(1, jArr4, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(3, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(6, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(12, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr5);
                fb4.X(24, jArr5, jArr3);
                fb4.X(24, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(48, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(96, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.X(PsExtractor.AUDIO_STREAM, jArr3, jArr4);
                fb4.L(jArr3, jArr4, jArr3);
                fb4.L(jArr3, jArr5, jArr);
                return new rg4(jArr);
            }
        }
        s83.r();
        return null;
    }

    @Override // defpackage.e41
    public final boolean S() {
        long[] jArr = this.r;
        if (jArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e41
    public final boolean T() {
        for (int i = 0; i < 7; i++) {
            if (this.r[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[7];
        fb4.L(this.r, ((rg4) e41Var).r, jArr);
        return new rg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((rg4) e41Var).r;
        long[] jArr2 = ((rg4) e41Var2).r;
        long[] jArr3 = ((rg4) e41Var3).r;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        fb4.C(this.r, jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        fb4.C(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        fb4.R(jArr4, jArr7);
        return new rg4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rg4)) {
            return false;
        }
        long[] jArr = ((rg4) obj).r;
        for (int i = 6; i >= 0; i--) {
            if (this.r[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return g4.O(this.r, 7) ^ 4090087;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((rg4) e41Var).r;
        long[] jArr2 = this.r;
        return new rg4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new rg4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = this.r;
        long y0 = e41.y0(jArr[0]);
        long y02 = e41.y0(jArr[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long j2 = (y0 >>> 32) | (y02 & (-4294967296L));
        long y03 = e41.y0(jArr[2]);
        long y04 = e41.y0(jArr[3]);
        long j3 = (y03 & 4294967295L) | (y04 << 32);
        long j4 = (y03 >>> 32) | (y04 & (-4294967296L));
        long y05 = e41.y0(jArr[4]);
        long y06 = e41.y0(jArr[5]);
        long j5 = (y05 >>> 32) | (y06 & (-4294967296L));
        long y07 = e41.y0(jArr[6]);
        long j6 = y07 >>> 32;
        return new rg4(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((y05 & 4294967295L) | (y06 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((y07 & 4294967295L) ^ (j6 << 44)) ^ (j5 >>> 20)) ^ (j2 << 13), ((y07 >>> 52) ^ (j4 << 13)) ^ (j2 >>> 51), (j5 << 13) ^ (j4 >>> 51), (j6 << 13) ^ (j5 >>> 51)});
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        fb4.F(this.r, jArr2);
        fb4.R(jArr2, jArr);
        return new rg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((rg4) e41Var).r;
        long[] jArr2 = ((rg4) e41Var2).r;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        fb4.F(this.r, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        long[] jArr5 = new long[14];
        fb4.C(jArr, jArr2, jArr5);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr5[i2];
        }
        long[] jArr6 = new long[7];
        fb4.R(jArr3, jArr6);
        return new rg4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        fb4.X(i, this.r, jArr);
        return new rg4(jArr);
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
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = this.r[i];
            if (j != 0) {
                dq2.n0(bArr, (6 - i) << 3, j);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public rg4(long[] jArr) {
        this.r = jArr;
    }
}
