package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b65 {
    public static final b65 c = new b65(2, false);
    public static final b65 d = new b65(1, true);
    public final int a;
    public final boolean b;

    public b65(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b65)) {
            return false;
        }
        b65 b65Var = (b65) obj;
        return this.a == b65Var.a && this.b == b65Var.b;
    }

    public final int hashCode() {
        return pt1.o(this.b) + (this.a * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
