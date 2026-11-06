package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v22 {
    public static final v22 e = new v22(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public v22(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final long b() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int c() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v22)) {
            return false;
        }
        v22 v22Var = (v22) obj;
        return this.a == v22Var.a && this.b == v22Var.b && this.c == v22Var.c && this.d == v22Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder D = hf1.D("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        D.append(this.c);
        D.append(", ");
        D.append(this.d);
        D.append(")");
        return D.toString();
    }
}
