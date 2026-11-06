package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class zt {
    public static final bu a = new bu((byte) 0);

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new vp0("unable to decode base64 string: " + e.getMessage(), e);
        }
    }
}
