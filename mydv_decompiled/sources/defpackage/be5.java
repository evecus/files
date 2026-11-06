package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class be5 {
    public static zd5 a(Object obj) {
        ap1 ap1Var = (ap1) obj;
        zd5 zd5Var = ap1Var.unknownFields;
        if (zd5Var != zd5.f) {
            return zd5Var;
        }
        zd5 c = zd5.c();
        ap1Var.unknownFields = c;
        return c;
    }

    public static boolean b(int i, h60 h60Var, Object obj) {
        int i2 = h60Var.b;
        d70 d70Var = (d70) h60Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            h60Var.n0(0);
            ((zd5) obj).d(i3 << 3, Long.valueOf(d70Var.o()));
            return true;
        }
        if (i4 == 1) {
            h60Var.n0(1);
            ((zd5) obj).d((i3 << 3) | 1, Long.valueOf(d70Var.l()));
            return true;
        }
        if (i4 == 2) {
            ((zd5) obj).d((i3 << 3) | 2, h60Var.l());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw x42.c();
            }
            h60Var.n0(5);
            ((zd5) obj).d(5 | (i3 << 3), Integer.valueOf(d70Var.k()));
            return true;
        }
        zd5 c = zd5.c();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new x42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (h60Var.d() != Integer.MAX_VALUE && b(i7, h60Var, c)) {
        }
        if (i6 != h60Var.b) {
            throw new x42("Protocol message end-group tag did not match expected tag.");
        }
        if (c.e) {
            c.e = false;
        }
        ((zd5) obj).d(i5 | 3, c);
        return true;
    }
}
