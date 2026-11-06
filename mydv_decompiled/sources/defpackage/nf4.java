package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes2.dex */
public final class nf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public final int[] r;

    public nf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP224R1FieldElement");
            throw null;
        }
        int[] A = il2.A(bigInteger);
        if (A[6] == -1) {
            if (il2.J(A, eu5.H)) {
                long j = (A[0] & 4294967295L) - (r1[0] & 4294967295L);
                A[0] = (int) j;
                long j2 = ((A[1] & 4294967295L) - (r1[1] & 4294967295L)) + (j >> 32);
                A[1] = (int) j2;
                long j3 = ((A[2] & 4294967295L) - (r1[2] & 4294967295L)) + (j2 >> 32);
                A[2] = (int) j3;
                long j4 = ((A[3] & 4294967295L) - (r1[3] & 4294967295L)) + (j3 >> 32);
                A[3] = (int) j4;
                long j5 = ((A[4] & 4294967295L) - (r1[4] & 4294967295L)) + (j4 >> 32);
                A[4] = (int) j5;
                long j6 = ((A[5] & 4294967295L) - (r1[5] & 4294967295L)) + (j5 >> 32);
                A[5] = (int) j6;
                A[6] = (int) (((A[6] & 4294967295L) - (4294967295L & r1[6])) + (j6 >> 32));
            }
        }
        this.r = A;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[7];
        jl2.n(eu5.H, ((nf4) e41Var).r, iArr);
        eu5.P(iArr, this.r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 6; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((6 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 28;
    }

    @Override // defpackage.e41
    public final int J() {
        return 224;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[7];
        jl2.n(eu5.H, this.r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return il2.M(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return il2.N(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[7];
        eu5.P(this.r, ((nf4) e41Var).r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[7];
        eu5.U(this.r, iArr);
        return new nf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nf4) {
            return il2.w(this.r, ((nf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(7, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[7];
        eu5.r(this.r, ((nf4) e41Var).r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[7];
        if (dq2.W(7, this.r, iArr) != 0 || (iArr[6] == -1 && il2.J(iArr, eu5.H))) {
            eu5.x(iArr);
        }
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int i;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = eu5.H;
        int[] iArr4 = this.r;
        if (il2.N(iArr4) || il2.M(iArr4)) {
            return this;
        }
        int[] iArr5 = new int[7];
        eu5.U(iArr4, iArr5);
        Random random = new Random();
        int[] iArr6 = new int[7];
        int i2 = iArr3[6];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = (i6 >>> 16) | i6;
        do {
            i = 0;
            for (int i8 = 0; i8 != 7; i8++) {
                iArr6[i8] = random.nextInt();
            }
            iArr6[6] = iArr6[6] & i7;
        } while (dq2.U(7, iArr6, iArr3));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        il2.o(iArr4, iArr8);
        for (int i9 = 0; i9 < 7; i9++) {
            il2.o(iArr8, iArr9);
            int i10 = 1 << i9;
            int[] iArr10 = new int[14];
            do {
                il2.d0(iArr8, iArr10);
                eu5.f0(iArr10, iArr8);
                i10--;
            } while (i10 > 0);
            eu5.P(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        il2.d0(iArr8, iArr11);
        eu5.f0(iArr11, iArr8);
        int i11 = 95;
        while (true) {
            i11--;
            if (i11 <= 0) {
                break;
            }
            il2.d0(iArr8, iArr11);
            eu5.f0(iArr11, iArr8);
        }
        if (!il2.M(iArr8)) {
            return null;
        }
        loop5: while (true) {
            int[] iArr12 = new int[7];
            il2.o(iArr6, iArr12);
            int[] iArr13 = new int[7];
            iArr13[i] = 1;
            int[] iArr14 = new int[7];
            il2.o(iArr5, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            for (int i12 = i; i12 < 7; i12++) {
                il2.o(iArr12, iArr15);
                il2.o(iArr13, iArr16);
                int i13 = 1 << i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        eu5.P(iArr13, iArr12, iArr13);
                        eu5.w0(iArr13, iArr13);
                        eu5.m0(iArr12, iArr7);
                        eu5.r(iArr14, iArr7, iArr12);
                        eu5.P(iArr14, iArr7, iArr14);
                        eu5.j0(dq2.y0(7, iArr14), iArr14);
                    }
                }
                eu5.P(iArr13, iArr16, iArr7);
                eu5.P(iArr7, iArr5, iArr7);
                eu5.P(iArr12, iArr15, iArr14);
                eu5.r(iArr14, iArr7, iArr14);
                eu5.P(iArr12, iArr16, iArr7);
                il2.o(iArr14, iArr12);
                eu5.P(iArr13, iArr15, iArr13);
                eu5.r(iArr13, iArr7, iArr13);
                eu5.m0(iArr13, iArr14);
                eu5.P(iArr14, iArr5, iArr14);
            }
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i14 = 1; i14 < 96; i14++) {
                il2.o(iArr12, iArr);
                il2.o(iArr13, iArr2);
                eu5.P(iArr13, iArr12, iArr13);
                eu5.w0(iArr13, iArr13);
                eu5.m0(iArr12, iArr7);
                eu5.r(iArr14, iArr7, iArr12);
                eu5.P(iArr14, iArr7, iArr14);
                eu5.j0(dq2.y0(7, iArr14), iArr14);
                if (il2.N(iArr12)) {
                    break loop5;
                }
            }
            if (dq2.W(7, iArr6, iArr6) != 0 || (iArr6[6] == -1 && il2.J(iArr6, iArr3))) {
                eu5.x(iArr6);
            }
            i = 0;
        }
        jl2.n(iArr3, iArr2, iArr7);
        eu5.P(iArr7, iArr, iArr7);
        eu5.m0(iArr7, iArr6);
        if (il2.w(iArr4, iArr6)) {
            return new nf4(iArr7);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[7];
        eu5.m0(this.r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[7];
        eu5.q0(this.r, ((nf4) e41Var).r, iArr);
        return new nf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return il2.D(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return il2.f0(this.r);
    }

    public nf4(int[] iArr) {
        this.r = iArr;
    }
}
