package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w12 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public w12(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w12)) {
            return false;
        }
        w12 w12Var = (w12) obj;
        return this.a == w12Var.a && this.b == w12Var.b && this.c == w12Var.c && this.d == w12Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder D = hf1.D("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        D.append(this.c);
        D.append(", bottom=");
        D.append(this.d);
        D.append(")");
        return D.toString();
    }
}
