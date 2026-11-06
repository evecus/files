package defpackage;

/* loaded from: classes2.dex */
public class dn0 extends a0 {
    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        byte[] bArr = this.I;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            uu2Var.P(bArr, 3, z);
            return;
        }
        uu2Var.U(3, z);
        uu2Var.N(length);
        uu2Var.L(bArr, 0, i2);
        uu2Var.K(b2);
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    @Override // defpackage.a0, defpackage.u0
    public final u0 t() {
        return this;
    }

    @Override // defpackage.a0, defpackage.u0
    public final u0 u() {
        return this;
    }
}
