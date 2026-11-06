package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z60 {
    public final float a;
    public final float b;

    public z60(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z60)) {
            return false;
        }
        if (a() && ((z60) obj).a()) {
            return true;
        }
        z60 z60Var = (z60) obj;
        return this.a == z60Var.a && this.b == z60Var.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
