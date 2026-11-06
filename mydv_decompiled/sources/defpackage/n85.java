package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n85 {
    public final b51 a;
    public final b51 b;
    public final double c;
    public final o85 d;
    public final boolean e;
    public final m85 f;

    public n85(b51 b51Var, b51 b51Var2, double d, o85 o85Var, boolean z, m85 m85Var, int i) {
        z = (i & 16) != 0 ? true : z;
        m85Var = (i & 32) != 0 ? m85.I : m85Var;
        b51Var.getClass();
        b51Var2.getClass();
        this.a = b51Var;
        this.b = b51Var2;
        this.c = d;
        this.d = o85Var;
        this.e = z;
        this.f = m85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85)) {
            return false;
        }
        n85 n85Var = (n85) obj;
        return j42.c(this.a, n85Var.a) && j42.c(this.b, n85Var.b) && Double.compare(this.c, n85Var.c) == 0 && this.d == n85Var.d && this.e == n85Var.e && this.f == n85Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((pt1.o(this.e) + ((this.d.hashCode() + ((nt3.i(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.a + ", roleB=" + this.b + ", delta=" + this.c + ", polarity=" + this.d + ", stayTogether=" + this.e + ", deltaConstraint=" + this.f + ")";
    }
}
