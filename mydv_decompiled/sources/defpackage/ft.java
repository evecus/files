package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ft implements vz3 {
    public static final ft I = new ft();
    public static final double J = (e21.Q(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // defpackage.vz3
    public final float e(float f) {
        double d = f;
        return (d < J ? Float.valueOf(f / 4.5f) : Double.valueOf(e21.Q((d + 0.099d) / 1.099d, 2.2222222222222223d))).floatValue();
    }

    @Override // defpackage.vz3
    public final float h(float f) {
        double d = f;
        return (float) (d < 0.018d ? d * 4.5d : (e21.Q(d, 0.45d) * 1.099d) - 0.099d);
    }
}
