package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ox5 implements qx5 {
    public final tn5 a;
    public final int b;

    public ox5(tn5 tn5Var, int i) {
        this.a = tn5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox5)) {
            return false;
        }
        ox5 ox5Var = (ox5) obj;
        return this.a.equals(ox5Var.a) && this.b == ox5Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Month(month=" + this.a + ", count=" + this.b + ")";
    }
}
