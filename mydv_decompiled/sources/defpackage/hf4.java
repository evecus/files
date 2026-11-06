package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class hf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    public final int[] r;

    public hf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP192K1FieldElement");
            throw null;
        }
        int[] F = lq2.F(bigInteger);
        if (F[5] == -1) {
            int[] iArr = wx5.g0;
            if (lq2.M(F, iArr)) {
                lq2.k0(iArr, F);
            }
        }
        this.r = F;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[6];
        jl2.n(wx5.g0, ((hf4) e41Var).r, iArr);
        wx5.u(iArr, this.r, iArr);
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 5; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((5 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 24;
    }

    @Override // defpackage.e41
    public final int J() {
        return PsExtractor.AUDIO_STREAM;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[6];
        jl2.n(wx5.g0, this.r, iArr);
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return lq2.O(this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return lq2.Q(this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[6];
        wx5.u(this.r, ((hf4) e41Var).r, iArr);
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[6];
        int[] iArr2 = wx5.g0;
        int[] iArr3 = this.r;
        if (dq2.D(6, iArr3) != 0) {
            lq2.i0(iArr2, iArr2, iArr);
        } else {
            lq2.i0(iArr2, iArr3, iArr);
        }
        return new hf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hf4) {
            return lq2.A(this.r, ((hf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(6, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[6];
        if (lq2.o(this.r, ((hf4) e41Var).r, iArr) != 0 || (iArr[5] == -1 && lq2.M(iArr, wx5.g0))) {
            dq2.c(6, 4553, iArr);
        }
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[6];
        if (dq2.W(6, this.r, iArr) != 0 || (iArr[5] == -1 && lq2.M(iArr, wx5.g0))) {
            dq2.c(6, 4553, iArr);
        }
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (lq2.Q(iArr) || lq2.O(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        wx5.J(iArr, iArr2);
        wx5.u(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        wx5.J(iArr2, iArr3);
        wx5.u(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        wx5.N(3, iArr3, iArr4);
        wx5.u(iArr4, iArr3, iArr4);
        wx5.N(2, iArr4, iArr4);
        wx5.u(iArr4, iArr2, iArr4);
        wx5.N(8, iArr4, iArr2);
        wx5.u(iArr2, iArr4, iArr2);
        wx5.N(3, iArr2, iArr4);
        wx5.u(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        wx5.N(16, iArr4, iArr5);
        wx5.u(iArr5, iArr2, iArr5);
        wx5.N(35, iArr5, iArr2);
        wx5.u(iArr2, iArr5, iArr2);
        wx5.N(70, iArr2, iArr5);
        wx5.u(iArr5, iArr2, iArr5);
        wx5.N(19, iArr5, iArr2);
        wx5.u(iArr2, iArr4, iArr2);
        wx5.N(20, iArr2, iArr2);
        wx5.u(iArr2, iArr4, iArr2);
        wx5.N(4, iArr2, iArr2);
        wx5.u(iArr2, iArr3, iArr2);
        wx5.N(6, iArr2, iArr2);
        wx5.u(iArr2, iArr3, iArr2);
        wx5.J(iArr2, iArr2);
        wx5.J(iArr2, iArr3);
        if (lq2.A(iArr, iArr3)) {
            return new hf4(iArr2);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[6];
        wx5.J(this.r, iArr);
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[6];
        wx5.R(this.r, ((hf4) e41Var).r, iArr);
        return new hf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return lq2.H(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return lq2.m0(this.r);
    }

    public hf4(int[] iArr) {
        this.r = iArr;
    }
}
