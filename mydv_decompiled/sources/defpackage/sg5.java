package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sg5 {
    public static final long a = rf1.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;

    public static final long a(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > 0.0f) {
            return rf1.a(f / sqrt, f2 / sqrt);
        }
        s83.t("Required distance greater than zero");
        return 0L;
    }

    public static final float b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float c(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static long d(float f, float f2) {
        double d = f2;
        return sp0.c0(sp0.f0(rf1.a((float) Math.cos(d), (float) Math.sin(d)), f), a);
    }
}
