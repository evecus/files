package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g0 extends u0 {
    public static final y J = new y(g0.class, (byte) 3);
    public static final g0[] K = new g0[16];
    public final byte[] I;

    public g0(byte[] bArr) {
        if (l0.B(bArr)) {
            s83.t("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            s83.t("enumerated must be non-negative");
            throw null;
        }
        this.I = bArr;
        int length = bArr.length - 1;
        while (i < length) {
            byte b = bArr[i];
            i++;
            if (b != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    public static g0 v(nt0 nt0Var) {
        int g = nt0Var.g();
        if (g > 1) {
            return new g0(nt0Var.t());
        }
        if (g == 0) {
            s83.t("ENUMERATED has zero length");
            return null;
        }
        int read = nt0Var.read();
        if (read >= 16) {
            return new g0(read);
        }
        g0[] g0VarArr = K;
        g0 g0Var = g0VarArr[read];
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(read);
        g0VarArr[read] = g0Var2;
        return g0Var2;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof g0) {
            return Arrays.equals(this.I, ((g0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 10, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    public g0(int i) {
        if (i >= 0) {
            this.I = BigInteger.valueOf(i).toByteArray();
        } else {
            s83.t("enumerated must be non-negative");
            throw null;
        }
    }
}
