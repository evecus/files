package defpackage;

/* loaded from: classes2.dex */
public final class us extends a0 {
    public final a0[] M;

    public us(a0[] a0VarArr) {
        super(z(a0VarArr));
        this.M = a0VarArr;
    }

    public static byte[] z(a0[] a0VarArr) {
        int length = a0VarArr.length;
        if (length == 0) {
            return a0.K;
        }
        if (length == 1) {
            return a0VarArr[0].I;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = a0VarArr[i3].I;
            if (bArr[0] != 0) {
                s83.t("only the last nested bitstring can have padding");
                return null;
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = a0VarArr[i].I;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (a0 a0Var : a0VarArr) {
            byte[] bArr4 = a0Var.I;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        boolean o = o();
        byte[] bArr = this.I;
        if (!o) {
            int length = bArr.length;
            uu2Var.U(3, z);
            uu2Var.N(length);
            uu2Var.L(bArr, 0, length);
            return;
        }
        uu2Var.U(35, z);
        uu2Var.K(128);
        a0[] a0VarArr = this.M;
        if (a0VarArr != null) {
            uu2Var.W(a0VarArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            while (i > 999) {
                uu2Var.K(3);
                uu2Var.N(1000);
                uu2Var.K(0);
                uu2Var.L(bArr, length2 - i, 999);
                i -= 999;
            }
            uu2Var.K(3);
            uu2Var.N(i + 1);
            uu2Var.K(b);
            uu2Var.L(bArr, length2 - i, i);
        }
        uu2Var.K(0);
        uu2Var.K(0);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return this.M != null || this.I.length > 1000;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        boolean o = o();
        byte[] bArr = this.I;
        if (!o) {
            return uu2.z(bArr.length, z);
        }
        int i = z ? 4 : 3;
        a0[] a0VarArr = this.M;
        if (a0VarArr == null) {
            if (bArr.length < 2) {
                return i;
            }
            int length = (bArr.length - 2) / 999;
            return uu2.z(bArr.length - (999 * length), true) + (uu2.z(1000, true) * length) + i;
        }
        for (a0 a0Var : a0VarArr) {
            i += a0Var.q(true);
        }
        return i;
    }

    public us(byte[] bArr, int i) {
        super(bArr, i);
        this.M = null;
    }
}
