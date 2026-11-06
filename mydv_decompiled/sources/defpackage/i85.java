package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i85 {
    public static k85 a(double d, double d2) {
        zs1 zs1Var;
        j85 j85Var = new j85(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                zs1Var = new zs1(o7.Q(j85Var.a, j85Var.b, i2));
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = j85Var.a(i3) < j85Var.a(i4);
            if (j85Var.a(i3) >= j85Var.b - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        zs1Var = new zs1(o7.Q(j85Var.a, j85Var.b, i2));
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new k85(d, d2, zs1Var);
    }
}
