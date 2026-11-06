package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class gg4 extends x51 {
    public final long[] r;

    public gg4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            s83.t("x value invalid for SecT193FieldElement");
            throw null;
        }
        this.r = dq2.M(193, bigInteger);
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
        for (int i = 1; i < 193; i += 2) {
            kb4.M(jArr, jArr2);
            kb4.V(jArr2, jArr);
            kb4.M(jArr, jArr2);
            kb4.V(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new gg4(jArr);
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
        return 193;
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
        long[] jArr5 = new long[8];
        kb4.M(jArr2, jArr5);
        kb4.V(jArr5, jArr3);
        kb4.h0(1, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(1, jArr4, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(3, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(6, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(12, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(24, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(48, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr3);
        kb4.h0(96, jArr3, jArr4);
        kb4.T(jArr3, jArr4, jArr);
        return new gg4(jArr);
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
        kb4.T(this.r, ((gg4) e41Var).r, jArr);
        return new gg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((gg4) e41Var).r;
        long[] jArr2 = ((gg4) e41Var2).r;
        long[] jArr3 = ((gg4) e41Var3).r;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        kb4.K(this.r, jArr, jArr5);
        kb4.g(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        kb4.K(jArr2, jArr3, jArr6);
        kb4.g(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        kb4.V(jArr4, jArr7);
        return new gg4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gg4) {
            return jl2.y(this.r, ((gg4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.O(this.r, 4) ^ 1930015;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((gg4) e41Var).r;
        long[] jArr2 = this.r;
        return new gg4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new gg4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        long[] jArr = this.r;
        long y0 = e41.y0(jArr[0]);
        long y02 = e41.y0(jArr[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long j2 = (y0 >>> 32) | (y02 & (-4294967296L));
        long y03 = e41.y0(jArr[2]);
        long j3 = y03 >>> 32;
        return new gg4(new long[]{j ^ (j2 << 8), ((((4294967295L & y03) ^ (jArr[3] << 32)) ^ (j3 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ (j3 << 33), y03 >>> 63});
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        kb4.M(this.r, jArr2);
        kb4.V(jArr2, jArr);
        return new gg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((gg4) e41Var).r;
        long[] jArr2 = ((gg4) e41Var2).r;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        kb4.M(this.r, jArr4);
        kb4.g(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        kb4.K(jArr, jArr2, jArr5);
        kb4.g(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        kb4.V(jArr3, jArr6);
        return new gg4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        kb4.h0(i, this.r, jArr);
        return new gg4(jArr);
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

    public gg4(long[] jArr) {
        this.r = jArr;
    }
}
