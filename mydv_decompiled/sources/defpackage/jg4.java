package defpackage;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class jg4 extends x51 {
    public final long[] r;

    public jg4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            s83.t("x value invalid for SecT233FieldElement");
            throw null;
        }
        this.r = dq2.M(233, bigInteger);
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.x51
    public final e41 B0() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.r;
        jl2.s(jArr3, jArr);
        for (int i = 1; i < 233; i += 2) {
            e41.E(4, jArr, jArr2);
            hc4.d0(jArr2, jArr);
            e41.E(4, jArr, jArr2);
            hc4.d0(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new jg4(jArr);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        long[] jArr = this.r;
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 233;
    }

    @Override // defpackage.e41
    public final e41 P() {
        long[] jArr = new long[4];
        long[] jArr2 = this.r;
        if (jl2.U(jArr2)) {
            s83.r();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        hc4.e0(jArr2, jArr3);
        hc4.Z(jArr3, jArr2, jArr3);
        hc4.e0(jArr3, jArr3);
        hc4.Z(jArr3, jArr2, jArr3);
        hc4.f0(3, jArr3, jArr4);
        hc4.Z(jArr4, jArr3, jArr4);
        hc4.e0(jArr4, jArr4);
        hc4.Z(jArr4, jArr2, jArr4);
        hc4.f0(7, jArr4, jArr3);
        hc4.Z(jArr3, jArr4, jArr3);
        hc4.f0(14, jArr3, jArr4);
        hc4.Z(jArr4, jArr3, jArr4);
        hc4.e0(jArr4, jArr4);
        hc4.Z(jArr4, jArr2, jArr4);
        hc4.f0(29, jArr4, jArr3);
        hc4.Z(jArr3, jArr4, jArr3);
        hc4.f0(58, jArr3, jArr4);
        hc4.Z(jArr4, jArr3, jArr4);
        hc4.f0(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, jArr4, jArr3);
        hc4.Z(jArr3, jArr4, jArr3);
        hc4.e0(jArr3, jArr);
        return new jg4(jArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return jl2.R(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return jl2.U(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        long[] jArr = new long[4];
        hc4.Z(this.r, ((jg4) e41Var).r, jArr);
        return new jg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((jg4) e41Var).r;
        long[] jArr2 = ((jg4) e41Var2).r;
        long[] jArr3 = ((jg4) e41Var3).r;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        hc4.T(this.r, jArr, jArr5);
        hc4.c(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        hc4.T(jArr2, jArr3, jArr6);
        hc4.c(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        hc4.d0(jArr4, jArr7);
        return new jg4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jg4) {
            return jl2.y(this.r, ((jg4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.O(this.r, 4) ^ 2330074;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((jg4) e41Var).r;
        long[] jArr2 = this.r;
        return new jg4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new jg4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = new long[4];
        long[] jArr2 = this.r;
        long y0 = e41.y0(jArr2[0]);
        long y02 = e41.y0(jArr2[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long j2 = (y0 >>> 32) | (y02 & (-4294967296L));
        long y03 = e41.y0(jArr2[2]);
        int i = 3;
        long y04 = e41.y0(jArr2[3]);
        long j3 = (4294967295L & y03) | (y04 << 32);
        long j4 = (y03 >>> 32) | (y04 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = i;
            int i8 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i8));
            int i9 = i4 + 2;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i8));
            int i10 = i4 + 3;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i8);
            i2++;
            i = i7;
        }
        hc4.d0(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new jg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[4];
        hc4.e0(this.r, jArr);
        return new jg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((jg4) e41Var).r;
        long[] jArr2 = ((jg4) e41Var2).r;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        e41.E(4, this.r, jArr4);
        hc4.c(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        hc4.T(jArr, jArr2, jArr5);
        hc4.c(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        hc4.d0(jArr3, jArr6);
        return new jg4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        hc4.f0(i, this.r, jArr);
        return new jg4(jArr);
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
        return jl2.p0(this.r);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        return this;
    }

    public jg4(long[] jArr) {
        this.r = jArr;
    }
}
