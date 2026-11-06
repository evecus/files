package defpackage;

/* loaded from: classes2.dex */
public final class hn0 extends i0 {
    public final byte[] C() {
        byte[] bArr = this.I;
        if (bArr[bArr.length - 1] == 90) {
            if (!A(10) || !A(11)) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                String str = ix4.a;
                byte[] bArr3 = new byte[5];
                for (int i = 0; i != 5; i++) {
                    bArr3[i] = (byte) "0000Z".charAt(i);
                }
                System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!A(12) || !A(13)) {
                byte[] bArr4 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
                String str2 = ix4.a;
                byte[] bArr5 = new byte[3];
                for (int i2 = 0; i2 != 3; i2++) {
                    bArr5[i2] = (byte) "00Z".charAt(i2);
                }
                System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
                return bArr4;
            }
            if (z()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr6 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr6, 0, length);
                    bArr6[length] = 90;
                    return bArr6;
                }
                byte[] bArr7 = new byte[length + 2];
                int i3 = length + 1;
                System.arraycopy(bArr, 0, bArr7, 0, i3);
                bArr7[i3] = 90;
                return bArr7;
            }
        }
        return bArr;
    }

    @Override // defpackage.i0, defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(C(), 24, z);
    }

    @Override // defpackage.i0, defpackage.u0
    public final int q(boolean z) {
        return uu2.z(C().length, z);
    }

    @Override // defpackage.i0, defpackage.u0
    public final u0 t() {
        return this;
    }

    @Override // defpackage.u0
    public final u0 u() {
        return this;
    }
}
