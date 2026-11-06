package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cd1 {
    public final float a;
    public final ve1 b;

    public cd1(float f, ve1 ve1Var) {
        this.a = f;
        this.b = ve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        return Float.compare(this.a, cd1Var.a) == 0 && j42.c(this.b, cd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
