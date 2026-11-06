package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class k92 extends jq {
    public static void a(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static void b(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = new byte[4];
        dq2.a0(bArr, i, 0);
        byteArrayOutputStream.write(bArr, 0, 4);
    }
}
