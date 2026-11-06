package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tn5 {
    public final int a;
    public final int b;

    public tn5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return (this.a * 100) + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn5)) {
            return false;
        }
        tn5 tn5Var = (tn5) obj;
        return this.a == tn5Var.a && this.b == tn5Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("VideoMonth(year=", this.a, ", month=", this.b, ")");
    }
}
