package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class mg4 extends x51 {
    public final long[] r;

    public mg4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            s83.t("x value invalid for SecT239FieldElement");
            throw null;
        }
        this.r = dq2.M(239, bigInteger);
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
        for (int i = 1; i < 239; i += 2) {
            e41.E(4, jArr, jArr2);
            eg5.N(jArr2, jArr);
            e41.E(4, jArr, jArr2);
            eg5.N(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new mg4(jArr);
    }

    @Override // defpackage.x51
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.x51
    public final int D0() {
        long[] jArr = this.r;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }

    @Override // defpackage.e41
    public final int J() {
        return 239;
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
        eg5.Q(jArr2, jArr3);
        eg5.A(jArr3, jArr2, jArr3);
        eg5.Q(jArr3, jArr3);
        eg5.A(jArr3, jArr2, jArr3);
        eg5.R(3, jArr3, jArr4);
        eg5.A(jArr4, jArr3, jArr4);
        eg5.Q(jArr4, jArr4);
        eg5.A(jArr4, jArr2, jArr4);
        eg5.R(7, jArr4, jArr3);
        eg5.A(jArr3, jArr4, jArr3);
        eg5.R(14, jArr3, jArr4);
        eg5.A(jArr4, jArr3, jArr4);
        eg5.Q(jArr4, jArr4);
        eg5.A(jArr4, jArr2, jArr4);
        eg5.R(29, jArr4, jArr3);
        eg5.A(jArr3, jArr4, jArr3);
        eg5.Q(jArr3, jArr3);
        eg5.A(jArr3, jArr2, jArr3);
        eg5.R(59, jArr3, jArr4);
        eg5.A(jArr4, jArr3, jArr4);
        eg5.Q(jArr4, jArr4);
        eg5.A(jArr4, jArr2, jArr4);
        eg5.R(119, jArr4, jArr3);
        eg5.A(jArr3, jArr4, jArr3);
        eg5.Q(jArr3, jArr);
        return new mg4(jArr);
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
        eg5.A(this.r, ((mg4) e41Var).r, jArr);
        return new mg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        long[] jArr = ((mg4) e41Var).r;
        long[] jArr2 = ((mg4) e41Var2).r;
        long[] jArr3 = ((mg4) e41Var3).r;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        eg5.r(this.r, jArr, jArr5);
        eg5.f(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        eg5.r(jArr2, jArr3, jArr6);
        eg5.f(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        eg5.N(jArr4, jArr7);
        return new mg4(jArr7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mg4) {
            return jl2.y(this.r, ((mg4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.O(this.r, 4) ^ 23900158;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        long[] jArr = ((mg4) e41Var).r;
        long[] jArr2 = this.r;
        return new mg4(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.e41
    public final e41 l() {
        long[] jArr = this.r;
        return new mg4(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.e41
    public final e41 p0() {
        char c = 4;
        long[] jArr = new long[4];
        long[] jArr2 = this.r;
        boolean z = false;
        long y0 = e41.y0(jArr2[0]);
        long y02 = e41.y0(jArr2[1]);
        long j = (y0 & 4294967295L) | (y02 << 32);
        long j2 = (y0 >>> 32) | (y02 & (-4294967296L));
        long y03 = e41.y0(jArr2[2]);
        long y04 = e41.y0(jArr2[3]);
        long j3 = (y03 & 4294967295L) | (y04 << 32);
        long j4 = (y03 >>> 32) | (y04 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            char c2 = c;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            boolean z2 = z;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
            z = z2;
            c = c2;
        }
        boolean z3 = z;
        eg5.N(jArr3, jArr);
        jArr[z3 ? 1 : 0] = jArr[z3 ? 1 : 0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new mg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 q0() {
        long[] jArr = new long[4];
        eg5.Q(this.r, jArr);
        return new mg4(jArr);
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        long[] jArr = ((mg4) e41Var).r;
        long[] jArr2 = ((mg4) e41Var2).r;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        e41.E(4, this.r, jArr4);
        eg5.f(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        eg5.r(jArr, jArr2, jArr5);
        eg5.f(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        eg5.N(jArr3, jArr6);
        return new mg4(jArr6);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        eg5.R(i, this.r, jArr);
        return new mg4(jArr);
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

    public mg4(long[] jArr) {
        this.r = jArr;
    }
}
