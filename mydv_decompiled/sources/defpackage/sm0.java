package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class sm0 extends y51 {
    public static final BigInteger s = jl2.o0(wx5.p);
    public static final int[] t = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] r;

    public sm0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for Curve25519FieldElement");
            throw null;
        }
        int[] C = jl2.C(bigInteger);
        while (true) {
            int[] iArr = wx5.p;
            if (!jl2.K(C, iArr)) {
                this.r = C;
                return;
            }
            jl2.n0(iArr, C);
        }
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[8];
        jl2.n(wx5.p, ((sm0) e41Var).r, iArr);
        wx5.s(iArr, this.r, iArr);
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final int J() {
        return s.bitLength();
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[8];
        jl2.n(wx5.p, this.r, iArr);
        return new sm0(iArr);
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
        wx5.s(this.r, ((sm0) e41Var).r, iArr);
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[8];
        int[] iArr2 = this.r;
        int[] iArr3 = wx5.p;
        if (dq2.D(8, iArr2) != 0) {
            jl2.m0(iArr3, iArr3, iArr);
        } else {
            jl2.m0(iArr3, iArr2, iArr);
        }
        return new sm0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sm0) {
            return jl2.x(this.r, ((sm0) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(8, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[8];
        jl2.f(this.r, ((sm0) e41Var).r, iArr);
        if (jl2.K(iArr, wx5.p)) {
            wx5.P(iArr);
        }
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[8];
        dq2.W(8, this.r, iArr);
        if (jl2.K(iArr, wx5.p)) {
            wx5.P(iArr);
        }
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (jl2.T(iArr) || jl2.Q(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        wx5.I(iArr, iArr2);
        wx5.s(iArr2, iArr, iArr2);
        wx5.I(iArr2, iArr2);
        wx5.s(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        wx5.I(iArr2, iArr3);
        wx5.s(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        wx5.K(3, iArr3, iArr4);
        wx5.s(iArr4, iArr2, iArr4);
        wx5.K(4, iArr4, iArr2);
        wx5.s(iArr2, iArr3, iArr2);
        wx5.K(4, iArr2, iArr4);
        wx5.s(iArr4, iArr3, iArr4);
        wx5.K(15, iArr4, iArr3);
        wx5.s(iArr3, iArr4, iArr3);
        wx5.K(30, iArr3, iArr4);
        wx5.s(iArr4, iArr3, iArr4);
        wx5.K(60, iArr4, iArr3);
        wx5.s(iArr3, iArr4, iArr3);
        wx5.K(11, iArr3, iArr4);
        wx5.s(iArr4, iArr2, iArr4);
        wx5.K(120, iArr4, iArr2);
        wx5.s(iArr2, iArr3, iArr2);
        wx5.I(iArr2, iArr2);
        wx5.I(iArr2, iArr3);
        if (jl2.x(iArr, iArr3)) {
            return new sm0(iArr2);
        }
        wx5.s(iArr2, t, iArr2);
        wx5.I(iArr2, iArr3);
        if (jl2.x(iArr, iArr3)) {
            return new sm0(iArr2);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[8];
        wx5.I(this.r, iArr);
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[8];
        wx5.Q(this.r, ((sm0) e41Var).r, iArr);
        return new sm0(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return (this.r[0] & 1) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return jl2.o0(this.r);
    }

    public sm0(int[] iArr) {
        this.r = iArr;
    }
}
