package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jf1 {
    public final float a;
    public final float b;

    public jf1(float f, iu0 iu0Var) {
        this.a = f;
        float density = iu0Var.getDensity();
        float f2 = kf1.a;
        this.b = density * 386.0878f * 160.0f * 0.84f;
    }

    public final if1 a(float f) {
        float[] fArr = xc.a;
        double a = xc.a(f, this.a * this.b);
        double d = kf1.a;
        double d2 = d - 1.0d;
        return new if1(f, (float) (Math.exp((d / d2) * a) * r0 * r10), (long) (Math.exp(a / d2) * 1000.0d));
    }
}
