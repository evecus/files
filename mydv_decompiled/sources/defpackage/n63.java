package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n63 {
    public final f83 a;
    public final boolean b = false;

    public n63(f83 f83Var) {
        this.a = f83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n63.class != obj.getClass()) {
            return false;
        }
        n63 n63Var = (n63) obj;
        return this.b == n63Var.b && this.a.equals(n63Var.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + (this.b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(s24.a(n63.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.b) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
