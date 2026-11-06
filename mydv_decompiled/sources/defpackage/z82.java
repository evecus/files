package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class z82 {
    public static final byte[][] c = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
    public final xw0 a;
    public final int b;

    static {
        int i = 0;
        while (true) {
            byte[][] bArr = c;
            if (i == bArr.length) {
                return;
            }
            bArr[i][63] = (byte) i;
            i++;
        }
    }

    public z82(q0 q0Var, int i) {
        this.a = zw0.a(q0Var);
        this.b = i;
    }

    public final void a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        byte[] bArr4 = c[i];
        int i3 = this.b;
        xw0 xw0Var = this.a;
        xw0Var.update(bArr4, 64 - i3, i3);
        xw0Var.update(bArr, 0, bArr.length);
        xw0Var.update(bArr2, 0, bArr2.length);
        if (xw0Var instanceof i84) {
            i84 i84Var = (i84) xw0Var;
            i84Var.k(bArr3, i2, i3);
            i84Var.i(i84Var.e);
        } else {
            if (i3 >= xw0Var.d()) {
                xw0Var.a(i2, bArr3);
                return;
            }
            byte[] bArr5 = new byte[xw0Var.d()];
            xw0Var.a(0, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i2, i3);
        }
    }
}
