package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hy0 {
    public final float a;
    public final lx3 b;
    public final lx3 c;

    public hy0(float f, lx3 lx3Var, lx3 lx3Var2) {
        this.a = f;
        this.b = lx3Var;
        this.c = lx3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy0)) {
            return false;
        }
        hy0 hy0Var = (hy0) obj;
        return Float.compare(this.a, hy0Var.a) == 0 && this.b.equals(hy0Var.b) && this.c.equals(hy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
