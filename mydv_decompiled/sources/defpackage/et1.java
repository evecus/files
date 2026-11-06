package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class et1 {
    public static final bu a = new bu((byte) 1);

    public static void a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(str, byteArrayOutputStream);
            byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new vp0("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(String str) {
        try {
            return a.b(0, str.length(), str);
        } catch (Exception e) {
            throw new vp0("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] c(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bu buVar = a;
            buVar.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int min = Math.min(36, i);
                    int i3 = i2 + min;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = i4 + 1;
                        byte[] bArr3 = buVar.b;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t0 t0Var = new t0("exception encoding Hex string: " + e.getMessage(), (byte) 1);
            t0Var.J = e;
            throw t0Var;
        }
    }
}
