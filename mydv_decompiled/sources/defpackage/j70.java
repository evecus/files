package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class j70 {
    public static final Logger b = Logger.getLogger(j70.class.getName());
    public static final boolean c = ve5.e;
    public uu2 a;

    public static int a(int i, g00 g00Var) {
        int e = e(i);
        int size = g00Var.size();
        return f(size) + size + e;
    }

    public static int b(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int c(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int d(String str) {
        int length;
        try {
            length = lg5.a(str);
        } catch (ig5 unused) {
            length = str.getBytes(p32.a).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void h(String str, ig5 ig5Var) {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ig5Var);
        byte[] bytes = str.getBytes(p32.a);
        try {
            w(bytes.length);
            r(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new f70(e);
        }
    }

    public abstract void i(byte b2);

    public abstract void j(int i, boolean z);

    public abstract void k(int i, g00 g00Var);

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(int i, long j);

    public abstract void o(long j);

    public abstract void p(int i, int i2);

    public abstract void q(int i);

    public abstract void r(byte[] bArr, int i, int i2);

    public abstract void s(int i, r3 r3Var, qa4 qa4Var);

    public abstract void t(int i, String str);

    public abstract void u(int i, int i2);

    public abstract void v(int i, int i2);

    public abstract void w(int i);

    public abstract void x(int i, long j);

    public abstract void y(long j);
}
