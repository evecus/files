package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t implements vz3 {
    public static final t I = new t();
    public static final double J = ((Math.log(65504.0d) / lg0.a) + 9.72d) / 17.52d;

    @Override // defpackage.vz3
    public final float e(float f) {
        double d = f;
        return (float) (d <= -0.3013698630136986d ? (e21.Q(2.0d, (d * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d : d < J ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d);
    }

    @Override // defpackage.vz3
    public final float h(float f) {
        double log;
        double d = f;
        if (d < 3.0517578125E-5d) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            log = Math.log((f / 2.0d) + 1.52587890625E-5d) / lg0.a;
        } else {
            log = (float) (Math.log(d) / lg0.a);
        }
        return (float) ((log + 9.72d) / 17.52d);
    }
}
