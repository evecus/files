package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ce5 {
    public static boolean a(Object obj, h60 h60Var) {
        int e = h60Var.e();
        int i = e >>> 3;
        int i2 = e & 7;
        if (i2 == 0) {
            ((ae5) obj).c(i << 3, Long.valueOf(h60Var.K()));
            return true;
        }
        if (i2 == 1) {
            ((ae5) obj).c((i << 3) | 1, Long.valueOf(h60Var.y()));
            return true;
        }
        if (i2 == 2) {
            ((ae5) obj).c((i << 3) | 2, h60Var.k());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw z42.b();
            }
            ((ae5) obj).c((i << 3) | 5, Integer.valueOf(h60Var.v()));
            return true;
        }
        ae5 b = ae5.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (h60Var.d() != Integer.MAX_VALUE && a(b, h60Var)) {
        }
        if (i4 != h60Var.e()) {
            throw new z42("Protocol message end-group tag did not match expected tag.");
        }
        b.e = false;
        ((ae5) obj).c(i3 | 3, b);
        return true;
    }
}
