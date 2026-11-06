package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class tf4 extends y51 {
    public static final BigInteger s = new BigInteger(1, et1.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    public final int[] r;

    public tf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(s) >= 0) {
            s83.t("x value invalid for SecP384R1FieldElement");
            throw null;
        }
        int[] K = dq2.K(RendererCapabilities.DECODER_SUPPORT_MASK, bigInteger);
        if (K[11] == -1) {
            int[] iArr = qg5.C;
            if (dq2.U(12, K, iArr)) {
                dq2.F0(12, iArr, K);
            }
        }
        this.r = K;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        int[] iArr = new int[12];
        jl2.n(qg5.C, ((tf4) e41Var).r, iArr);
        int[] iArr2 = new int[24];
        lq2.W(iArr, this.r, iArr2);
        qg5.x0(iArr2, iArr);
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final void C(int i, byte[] bArr) {
        for (int i2 = 11; i2 >= 0; i2--) {
            dq2.a0(bArr, this.r[i2], ((11 - i2) << 2) + i);
        }
    }

    @Override // defpackage.e41
    public final int H() {
        return 48;
    }

    @Override // defpackage.e41
    public final int J() {
        return RendererCapabilities.DECODER_SUPPORT_MASK;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int[] iArr = new int[12];
        jl2.n(qg5.C, this.r, iArr);
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return dq2.c0(12, this.r);
    }

    @Override // defpackage.e41
    public final boolean T() {
        return dq2.g0(12, this.r);
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        lq2.W(this.r, ((tf4) e41Var).r, iArr2);
        qg5.x0(iArr2, iArr);
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 a0() {
        int[] iArr = new int[12];
        int[] iArr2 = qg5.C;
        int[] iArr3 = this.r;
        if (dq2.D(12, iArr3) != 0) {
            dq2.B0(12, iArr2, iArr2, iArr);
        } else {
            dq2.B0(12, iArr2, iArr3, iArr);
        }
        return new tf4(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tf4) {
            return dq2.B(12, this.r, ((tf4) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return g4.M(12, this.r) ^ s.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        int[] iArr = new int[12];
        if (dq2.a(12, this.r, ((tf4) e41Var).r, iArr) != 0 || (iArr[11] == -1 && dq2.U(12, iArr, qg5.C))) {
            qg5.G(iArr);
        }
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 l() {
        int[] iArr = new int[12];
        if (dq2.W(12, this.r, iArr) != 0 || (iArr[11] == -1 && dq2.U(12, iArr, qg5.C))) {
            qg5.G(iArr);
        }
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        int[] iArr = this.r;
        if (dq2.g0(12, iArr) || dq2.c0(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[24];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[12];
        lq2.h0(iArr, iArr2);
        qg5.x0(iArr2, iArr3);
        lq2.W(iArr3, iArr, iArr2);
        qg5.x0(iArr2, iArr3);
        qg5.J0(2, iArr3, iArr4, iArr2);
        lq2.W(iArr4, iArr3, iArr2);
        qg5.x0(iArr2, iArr4);
        lq2.h0(iArr4, iArr2);
        qg5.x0(iArr2, iArr4);
        lq2.W(iArr4, iArr, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(5, iArr4, iArr5, iArr2);
        lq2.W(iArr5, iArr4, iArr2);
        qg5.x0(iArr2, iArr5);
        qg5.J0(5, iArr5, iArr6, iArr2);
        lq2.W(iArr6, iArr4, iArr2);
        qg5.x0(iArr2, iArr6);
        qg5.J0(15, iArr6, iArr4, iArr2);
        lq2.W(iArr4, iArr6, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(2, iArr4, iArr5, iArr2);
        lq2.W(iArr3, iArr5, iArr2);
        qg5.x0(iArr2, iArr3);
        qg5.J0(28, iArr5, iArr5, iArr2);
        lq2.W(iArr4, iArr5, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(60, iArr4, iArr5, iArr2);
        lq2.W(iArr5, iArr4, iArr2);
        qg5.x0(iArr2, iArr5);
        qg5.J0(120, iArr5, iArr4, iArr2);
        lq2.W(iArr4, iArr5, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(15, iArr4, iArr4, iArr2);
        lq2.W(iArr4, iArr6, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(33, iArr4, iArr4, iArr2);
        lq2.W(iArr4, iArr3, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(64, iArr4, iArr4, iArr2);
        lq2.W(iArr4, iArr, iArr2);
        qg5.x0(iArr2, iArr4);
        qg5.J0(30, iArr4, iArr3, iArr2);
        lq2.h0(iArr3, iArr2);
        qg5.x0(iArr2, iArr4);
        if (dq2.B(12, iArr, iArr4)) {
            return new tf4(iArr3);
        }
        return null;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        lq2.h0(this.r, iArr2);
        qg5.x0(iArr2, iArr);
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        int[] iArr = new int[12];
        qg5.Q0(this.r, ((tf4) e41Var).r, iArr);
        return new tf4(iArr);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        return dq2.P(this.r) == 1;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return dq2.L0(12, this.r);
    }

    public tf4(int[] iArr) {
        this.r = iArr;
    }
}
