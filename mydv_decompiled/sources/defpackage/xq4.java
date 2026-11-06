package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xq4 {
    public final tm1 a;
    public final ve1 b;

    public xq4(ve1 ve1Var, tm1 tm1Var) {
        this.a = tm1Var;
        this.b = ve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq4)) {
            return false;
        }
        xq4 xq4Var = (xq4) obj;
        return j42.c(this.a, xq4Var.a) && j42.c(this.b, xq4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
