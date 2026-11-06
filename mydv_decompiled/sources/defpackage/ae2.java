package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ae2 {
    public final int a;
    public final int b;

    public ae2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            t02.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        t02.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae2)) {
            return false;
        }
        ae2 ae2Var = (ae2) obj;
        return this.a == ae2Var.a && this.b == ae2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("Interval(start=", this.a, ", end=", this.b, ")");
    }
}
