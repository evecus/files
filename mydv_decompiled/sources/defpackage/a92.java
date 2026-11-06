package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a92 {
    public final Float a;
    public l61 b;

    public a92(Float f, l61 l61Var) {
        this.a = f;
        this.b = l61Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a92)) {
            return false;
        }
        a92 a92Var = (a92) obj;
        return a92Var.a.equals(this.a) && j42.c(a92Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
