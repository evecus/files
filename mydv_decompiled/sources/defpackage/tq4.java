package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tq4 {
    public final nc2 a;
    public final nc2 b;

    public tq4(nc2 nc2Var, nc2 nc2Var2) {
        this.a = nc2Var;
        this.b = nc2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq4)) {
            return false;
        }
        tq4 tq4Var = (tq4) obj;
        return this.a == tq4Var.a && this.b == tq4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.a + ", height=" + this.b + ')';
    }
}
