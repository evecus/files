package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u implements vz3 {
    public static final u I = new u();
    public static final double J = ((Math.log(65504.0d) / lg0.a) + 9.72d) / 17.52d;

    @Override // defpackage.vz3
    public final float e(float f) {
        double d = f;
        return (float) (d <= 0.155251141552511d ? (d - 0.0729055341958355d) / 10.5402377416545d : d < J ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d);
    }

    @Override // defpackage.vz3
    public final float h(float f) {
        double d = f;
        return (float) (d < 0.0078125d ? (d * 10.5402377416545d) + 0.0729055341958355d : (((float) (Math.log(d) / lg0.a)) + 9.72d) / 17.52d);
    }
}
