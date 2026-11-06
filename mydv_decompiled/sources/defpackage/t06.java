package defpackage;

/* loaded from: classes2.dex */
public final class t06 {
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;

    public t06(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = j;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
    }

    public static t06 a(int i, int i2, int i3, byte[] bArr) {
        String str;
        long j;
        if (bArr.length >= (i3 * 4) + i) {
            long j2 = bArr[0] & 255;
            int i4 = 1;
            while (true) {
                j = j2;
                if (i4 >= i) {
                    break;
                }
                j2 = (j << 8) | (bArr[i4] & 255);
                i4++;
            }
            if (h06.a(i2, j)) {
                int i5 = i + i3;
                byte[] x = g4.x(bArr, i, i5);
                int i6 = i5 + i3;
                byte[] x2 = g4.x(bArr, i5, i6);
                int i7 = i6 + i3;
                byte[] x3 = g4.x(bArr, i6, i7);
                int i8 = i7 + i3;
                return new t06(j, x, x2, x3, g4.x(bArr, i7, i8), g4.x(bArr, i8, bArr.length));
            }
            str = "index out of bounds";
        } else {
            str = "private key has wrong size";
        }
        s83.t(str);
        return null;
    }

    public static boolean b(s06 s06Var, s06 s06Var2) {
        return g4.w(s06Var.g, s06Var2.g) & s06Var.a.r(s06Var2.a) & (s06Var.b == s06Var2.b) & (s06Var.c == s06Var2.c) & g4.w(s06Var.d, s06Var2.d) & g4.w(s06Var.e, s06Var2.e) & g4.w(s06Var.f, s06Var2.f);
    }
}
