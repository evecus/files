package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v44 {
    public final int a;
    public final qk1 b;
    public final ok1 c;

    public v44(int i, qk1 qk1Var, ok1 ok1Var) {
        this.a = i;
        this.b = qk1Var;
        this.c = ok1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v44)) {
            return false;
        }
        v44 v44Var = (v44) obj;
        return this.a == v44Var.a && j42.c(this.b, v44Var.b) && this.c.equals(v44Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (((this.a * 31) + this.b.I) * 29791);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=Normal, loadingStrategy=Blocking)";
    }
}
