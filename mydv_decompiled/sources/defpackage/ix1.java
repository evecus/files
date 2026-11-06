package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ix1 {
    public final hx1 a;
    public final int b;

    public ix1(hx1 hx1Var, int i) {
        this.a = hx1Var;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final hx1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix1)) {
            return false;
        }
        ix1 ix1Var = (ix1) obj;
        return this.a.equals(ix1Var.a) && this.b == ix1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
