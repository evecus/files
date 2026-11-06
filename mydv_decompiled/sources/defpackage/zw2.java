package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zw2 {
    public final km0 a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ ax2 e;

    public zw2(ax2 ax2Var, km0 km0Var, float f, float f2) {
        km0Var.getClass();
        this.e = ax2Var;
        this.a = km0Var;
        if (f2 < f) {
            s83.t("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        ax2Var.I.getClass();
        this.b = Float.intBitsToFloat((int) (jp.c(km0Var, Float.POSITIVE_INFINITY) & 4294967295L));
        this.c = f;
        this.d = f2;
    }

    public final uj3 a(float f) {
        float q = ut0.q(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (q - f3) / (f2 - f3);
        ax2 ax2Var = this.e;
        jp jpVar = ax2Var.I;
        float f5 = f4 * this.b;
        jpVar.getClass();
        km0 km0Var = this.a;
        km0Var.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (jp.c(km0Var, f5) >> 32));
        if (0.0f > intBitsToFloat || intBitsToFloat > 1.0f) {
            s83.t("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        uj3 d = km0Var.d(intBitsToFloat);
        return new uj3(new zw2(ax2Var, (km0) d.I, this.c, q), new zw2(ax2Var, (km0) d.J, q, this.d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
