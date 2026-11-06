package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class r32 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw z42.f();
        } catch (z42 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        zy.m(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static bp1 c(Object obj, Object obj2) {
        bp1 bp1Var = (bp1) ((s3) obj);
        xo1 xo1Var = (xo1) bp1Var.d(5);
        xo1Var.c();
        xo1.d(xo1Var.J, bp1Var);
        s3 s3Var = (s3) obj2;
        if (!xo1Var.I.getClass().isInstance(s3Var)) {
            s83.t("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        xo1Var.c();
        xo1.d(xo1Var.J, (bp1) s3Var);
        return xo1Var.b();
    }
}
