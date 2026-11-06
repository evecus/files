package defpackage;

/* loaded from: classes2.dex */
public final class xs extends r0 {
    public final short L;
    public final r0[] M;

    static {
        new xs(r0.K, null);
    }

    public xs(byte[] bArr, r0[] r0VarArr) {
        super(bArr);
        this.M = r0VarArr;
        this.L = (short) 1000;
    }

    public static byte[] w(r0[] r0VarArr) {
        int length = r0VarArr.length;
        if (length == 0) {
            return r0.K;
        }
        if (length == 1) {
            return r0VarArr[0].I;
        }
        int i = 0;
        for (r0 r0Var : r0VarArr) {
            i += r0Var.I.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (r0 r0Var2 : r0VarArr) {
            byte[] bArr2 = r0Var2.I;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.U(36, z);
        uu2Var.K(128);
        r0[] r0VarArr = this.M;
        if (r0VarArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.I;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, (int) this.L);
                int i2 = mn0.L;
                uu2Var.U(4, true);
                uu2Var.N(min);
                uu2Var.L(bArr, i, min);
                i += min;
            }
        } else {
            uu2Var.W(r0VarArr);
        }
        uu2Var.K(0);
        uu2Var.K(0);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        int i = z ? 4 : 3;
        r0[] r0VarArr = this.M;
        if (r0VarArr != null) {
            for (r0 r0Var : r0VarArr) {
                i += r0Var.q(true);
            }
            return i;
        }
        byte[] bArr = this.I;
        int length = bArr.length;
        short s = this.L;
        int i2 = length / s;
        int i3 = mn0.L;
        int z2 = (uu2.z(s, true) * i2) + i;
        int length2 = bArr.length - (i2 * s);
        return length2 > 0 ? uu2.z(length2, true) + z2 : z2;
    }
}
