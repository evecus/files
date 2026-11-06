package defpackage;

import androidx.media3.common.C;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class df4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public final int[] r;

    public df4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP160R1FieldElement");
            throw null;
        }
        int[] L = dq2.L(bigInteger);
        if (L[4] == -1) {
            int[] iArr = qg5.w;
            if (dq2.V(L, iArr)) {
                dq2.G0(iArr, L);
            }
        }
        this.r = L;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[5];
        jl2.n(qg5.w, ((df4) e41Var).r, iArr);
        qg5.g0(iArr, this.r, iArr);
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 4; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((4 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 20;
    }

    @Override // defpackage.e41
    public final int J() {
        return 160;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[5];
        jl2.n(qg5.w, this.r, iArr);
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return dq2.d0(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return dq2.h0(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[5];
        qg5.g0(this.r, ((df4) e41Var).r, iArr);
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[5];
        int[] iArr2 = qg5.w;
        int[] iArr3 = this.r;
        if (dq2.D(5, iArr3) != 0) {
            dq2.C0(iArr2, iArr2, iArr);
        } else {
            dq2.C0(iArr2, iArr3, iArr);
        }
        return new df4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof df4) {
            return dq2.C(this.r, ((df4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(5, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[5];
        if (dq2.b(this.r, ((df4) e41Var).r, iArr) != 0 || (iArr[4] == -1 && dq2.V(iArr, qg5.w))) {
            dq2.i(5, C.RATE_UNSET_INT, iArr);
        }
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[5];
        if (dq2.W(5, this.r, iArr) != 0 || (iArr[4] == -1 && dq2.V(iArr, qg5.w))) {
            dq2.i(5, C.RATE_UNSET_INT, iArr);
        }
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (dq2.h0(iArr) || dq2.d0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        qg5.G0(iArr, iArr2);
        qg5.g0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        qg5.L0(2, iArr2, iArr3);
        qg5.g0(iArr3, iArr2, iArr3);
        qg5.L0(4, iArr3, iArr2);
        qg5.g0(iArr2, iArr3, iArr2);
        qg5.L0(8, iArr2, iArr3);
        qg5.g0(iArr3, iArr2, iArr3);
        qg5.L0(16, iArr3, iArr2);
        qg5.g0(iArr2, iArr3, iArr2);
        qg5.L0(32, iArr2, iArr3);
        qg5.g0(iArr3, iArr2, iArr3);
        qg5.L0(64, iArr3, iArr2);
        qg5.g0(iArr2, iArr3, iArr2);
        qg5.G0(iArr2, iArr3);
        qg5.g0(iArr3, iArr, iArr3);
        qg5.L0(29, iArr3, iArr3);
        qg5.G0(iArr3, iArr2);
        if (dq2.C(iArr, iArr2)) {
            return new df4(iArr3);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[5];
        qg5.G0(this.r, iArr);
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[5];
        qg5.O0(this.r, ((df4) e41Var).r, iArr);
        return new df4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return dq2.O(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return dq2.M0(this.r);
    }

    public df4(int[] iArr) {
        this.r = iArr;
    }
}
