package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ga4 {
    public final float a;
    public final long b;
    public final ve1 c;

    public ga4(float f, long j, ve1 ve1Var) {
        this.a = f;
        this.b = j;
        this.c = ve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga4)) {
            return false;
        }
        ga4 ga4Var = (ga4) obj;
        return Float.compare(this.a, ga4Var.a) == 0 && r95.a(this.b, ga4Var.b) && j42.c(this.c, ga4Var.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = r95.c;
        return this.c.hashCode() + ((i82.Q(this.b) + floatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + r95.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
