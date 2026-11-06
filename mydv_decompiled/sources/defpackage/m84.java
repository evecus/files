package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class m84 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public final int[] r;

    public m84(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SM2P256V1FieldElement");
            throw null;
        }
        int[] C = jl2.C(bigInteger);
        if ((C[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = qg5.u;
            if (jl2.K(C, iArr)) {
                jl2.n0(iArr, C);
            }
        }
        this.r = C;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[8];
        jl2.n(qg5.u, ((m84) e41Var).r, iArr);
        qg5.e0(iArr, this.r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final int J() {
        return s.bitLength();
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[8];
        jl2.n(qg5.u, this.r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return jl2.Q(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return jl2.T(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[8];
        qg5.e0(this.r, ((m84) e41Var).r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[8];
        int[] iArr2 = qg5.u;
        int[] iArr3 = this.r;
        if (dq2.D(8, iArr3) != 0) {
            jl2.m0(iArr2, iArr2, iArr);
        } else {
            jl2.m0(iArr2, iArr3, iArr);
        }
        return new m84(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m84) {
            return jl2.x(this.r, ((m84) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(8, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[8];
        qg5.D(this.r, ((m84) e41Var).r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[8];
        if (dq2.W(8, this.r, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && jl2.K(iArr, qg5.u))) {
            qg5.F(iArr);
        }
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (jl2.T(iArr) || jl2.Q(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        qg5.E0(iArr, iArr2);
        qg5.e0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        qg5.I0(2, iArr2, iArr3);
        qg5.e0(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        qg5.I0(2, iArr3, iArr4);
        qg5.e0(iArr4, iArr2, iArr4);
        qg5.I0(6, iArr4, iArr2);
        qg5.e0(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        qg5.I0(12, iArr2, iArr5);
        qg5.e0(iArr5, iArr2, iArr5);
        qg5.I0(6, iArr5, iArr2);
        qg5.e0(iArr2, iArr4, iArr2);
        qg5.E0(iArr2, iArr4);
        qg5.e0(iArr4, iArr, iArr4);
        qg5.I0(31, iArr4, iArr5);
        qg5.e0(iArr5, iArr4, iArr2);
        qg5.I0(32, iArr5, iArr5);
        qg5.e0(iArr5, iArr2, iArr5);
        qg5.I0(62, iArr5, iArr5);
        qg5.e0(iArr5, iArr2, iArr5);
        qg5.I0(4, iArr5, iArr5);
        qg5.e0(iArr5, iArr3, iArr5);
        qg5.I0(32, iArr5, iArr5);
        qg5.e0(iArr5, iArr, iArr5);
        qg5.I0(62, iArr5, iArr5);
        qg5.E0(iArr5, iArr3);
        if (jl2.x(iArr, iArr3)) {
            return new m84(iArr5);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[8];
        qg5.E0(this.r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[8];
        qg5.N0(this.r, ((m84) e41Var).r, iArr);
        return new m84(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return (this.r[0] & 1) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return jl2.o0(this.r);
    }

    public m84(int[] iArr) {
        this.r = iArr;
    }
}
