package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b83 {
    public final String a;
    public final ab4 b;
    public final hx1 c;
    public final hx1 d;

    public b83(String str, ab4 ab4Var, hx1 hx1Var, hx1 hx1Var2) {
        this.a = str;
        this.b = ab4Var;
        this.c = hx1Var;
        this.d = hx1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b83)) {
            return false;
        }
        b83 b83Var = (b83) obj;
        return this.a.equals(b83Var.a) && this.b == b83Var.b && this.c.equals(b83Var.c) && this.d.equals(b83Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ab4 ab4Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (ab4Var == null ? 0 : ab4Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "NavItem(label=" + this.a + ", screen=" + this.b + ", selectedIcon=" + this.c + ", unselectedIcon=" + this.d + ")";
    }
}
