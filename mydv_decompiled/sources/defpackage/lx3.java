package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lx3 {
    public final float a;
    public final pd1 b;

    public lx3(float f, pd1 pd1Var) {
        pd1Var.getClass();
        this.a = f;
        this.b = pd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx3)) {
            return false;
        }
        lx3 lx3Var = (lx3) obj;
        return Float.compare(this.a, lx3Var.a) == 0 && j42.c(this.b, lx3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
