package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class bu {
    public final /* synthetic */ byte a;
    public final byte[] b;
    public final byte[] c;

    public bu(byte b) {
        this.a = b;
        int i = 0;
        switch (b) {
            case 1:
                this.b = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.c = bArr;
                for (int i2 = 0; i2 < 128; i2++) {
                    bArr[i2] = -1;
                }
                while (true) {
                    byte[] bArr2 = this.b;
                    if (i >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                        break;
                    } else {
                        bArr[bArr2[i]] = (byte) i;
                        i++;
                    }
                }
            default:
                this.b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
                byte[] bArr3 = new byte[128];
                this.c = bArr3;
                for (int i3 = 0; i3 < 128; i3++) {
                    bArr3[i3] = -1;
                }
                while (true) {
                    byte[] bArr4 = this.b;
                    if (i >= bArr4.length) {
                        break;
                    } else {
                        bArr3[bArr4[i]] = (byte) i;
                        i++;
                    }
                }
        }
    }

    public static boolean c(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static boolean d(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static int e(int i, int i2, String str) {
        while (i < i2 && c(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public int a(String str, ByteArrayOutputStream byteArrayOutputStream) {
        byte b = this.a;
        byte[] bArr = this.c;
        switch (b) {
            case 0:
                byte[] bArr2 = new byte[54];
                int length = str.length();
                while (length > 0 && c(str.charAt(length - 1))) {
                    length--;
                }
                if (length == 0) {
                    return 0;
                }
                int i = 0;
                int i2 = length;
                while (i2 > 0 && i != 4) {
                    if (!c(str.charAt(i2 - 1))) {
                        i++;
                    }
                    i2--;
                }
                int e = e(0, i2, str);
                int i3 = 0;
                int i4 = 0;
                while (e < i2) {
                    int i5 = e + 1;
                    byte b2 = bArr[str.charAt(e)];
                    int e2 = e(i5, i2, str);
                    int i6 = e2 + 1;
                    byte b3 = bArr[str.charAt(e2)];
                    int e3 = e(i6, i2, str);
                    int i7 = e3 + 1;
                    byte b4 = bArr[str.charAt(e3)];
                    int e4 = e(i7, i2, str);
                    int i8 = e4 + 1;
                    byte b5 = bArr[str.charAt(e4)];
                    if ((b2 | b3 | b4 | b5) < 0) {
                        zl1.g("invalid characters encountered in base64 data");
                        return 0;
                    }
                    bArr2[i3] = (byte) ((b2 << 2) | (b3 >> 4));
                    int i9 = i3 + 2;
                    bArr2[i3 + 1] = (byte) ((b3 << 4) | (b4 >> 2));
                    i3 += 3;
                    bArr2[i9] = (byte) ((b4 << 6) | b5);
                    i4 += 3;
                    if (i3 == 54) {
                        byteArrayOutputStream.write(bArr2);
                        i3 = 0;
                    }
                    e = e(i8, i2, str);
                }
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i3);
                }
                int e5 = e(e, length, str);
                int e6 = e(e5 + 1, length, str);
                int e7 = e(e6 + 1, length, str);
                int e8 = e(e7 + 1, length, str);
                char charAt = str.charAt(e5);
                char charAt2 = str.charAt(e6);
                char charAt3 = str.charAt(e7);
                char charAt4 = str.charAt(e8);
                int i10 = 2;
                if (charAt3 == '=') {
                    if (charAt4 == '=') {
                        byte b6 = bArr[charAt];
                        byte b7 = bArr[charAt2];
                        if ((b6 | b7) >= 0) {
                            byteArrayOutputStream.write((b7 >> 4) | (b6 << 2));
                            i10 = 1;
                            return i4 + i10;
                        }
                    }
                    zl1.g("invalid characters encountered at end of base64 data");
                    return 0;
                }
                if (charAt4 == '=') {
                    byte b8 = bArr[charAt];
                    byte b9 = bArr[charAt2];
                    byte b10 = bArr[charAt3];
                    if ((b8 | b9 | b10) >= 0) {
                        byteArrayOutputStream.write((b8 << 2) | (b9 >> 4));
                        byteArrayOutputStream.write((b10 >> 2) | (b9 << 4));
                        return i4 + i10;
                    }
                    zl1.g("invalid characters encountered at end of base64 data");
                    return 0;
                }
                byte b11 = bArr[charAt];
                byte b12 = bArr[charAt2];
                byte b13 = bArr[charAt3];
                byte b14 = bArr[charAt4];
                if ((b11 | b12 | b13 | b14) >= 0) {
                    byteArrayOutputStream.write((b11 << 2) | (b12 >> 4));
                    byteArrayOutputStream.write((b12 << 4) | (b13 >> 2));
                    byteArrayOutputStream.write(b14 | (b13 << 6));
                    i10 = 3;
                    return i4 + i10;
                }
                zl1.g("invalid characters encountered at end of base64 data");
                return 0;
            default:
                byte[] bArr3 = new byte[36];
                int length2 = str.length();
                while (length2 > 0 && d(str.charAt(length2 - 1))) {
                    length2--;
                }
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < length2) {
                    while (i11 < length2 && d(str.charAt(i11))) {
                        i11++;
                    }
                    int i14 = i11 + 1;
                    byte b15 = bArr[str.charAt(i11)];
                    while (i14 < length2 && d(str.charAt(i14))) {
                        i14++;
                    }
                    int i15 = i14 + 1;
                    byte b16 = bArr[str.charAt(i14)];
                    if ((b15 | b16) < 0) {
                        zl1.g("invalid characters encountered in Hex string");
                        return 0;
                    }
                    int i16 = i12 + 1;
                    bArr3[i12] = (byte) ((b15 << 4) | b16);
                    if (i16 == 36) {
                        byteArrayOutputStream.write(bArr3);
                        i12 = 0;
                    } else {
                        i12 = i16;
                    }
                    i13++;
                    i11 = i15;
                }
                if (i12 > 0) {
                    byteArrayOutputStream.write(bArr3, 0, i12);
                }
                return i13;
        }
    }

    public byte[] b(int i, int i2, String str) {
        if (str == null) {
            zy.m("'str' cannot be null");
            return null;
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            zy.o("invalid offset and/or length specified");
            return null;
        }
        if ((i2 & 1) != 0) {
            zl1.g("a hexadecimal encoding must have an even number of characters");
            return null;
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            char charAt = str.charAt(i);
            byte[] bArr2 = this.c;
            i += 2;
            int i5 = bArr2[str.charAt(i + 1)] | (bArr2[charAt] << 4);
            if (i5 < 0) {
                zl1.g("invalid characters encountered in Hex string");
                return null;
            }
            bArr[i4] = (byte) i5;
        }
        return bArr;
    }

    public /* synthetic */ bu(byte[] bArr, byte[] bArr2, byte b) {
        this.a = b;
        this.b = bArr;
        this.c = bArr2;
    }
}
