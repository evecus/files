package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h25 {
    public static double a(zs1 zs1Var) {
        zs1Var.getClass();
        double[] d0 = p70.d0(zs1Var.a);
        double atan2 = (Math.atan2(d0[2], d0[1]) * 57.29577951308232d) % 360.0d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        double pow = Math.pow(Math.hypot(d0[1], d0[2]), 1.07d) * 0.02d;
        double d = (atan2 - 50.0d) % 360.0d;
        if (d < 0.0d) {
            d += 360.0d;
        }
        return (Math.cos(d * 0.017453292519943295d) * pow) - 0.5d;
    }
}
