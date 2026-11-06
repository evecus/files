package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ko3 {
    public final fo3 a;
    public final vn3 b;

    public ko3(fo3 fo3Var, vn3 vn3Var) {
        this.a = fo3Var;
        this.b = vn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko3)) {
            return false;
        }
        ko3 ko3Var = (ko3) obj;
        return j42.c(this.b, ko3Var.b) && j42.c(this.a, ko3Var.a);
    }

    public final int hashCode() {
        fo3 fo3Var = this.a;
        int hashCode = (fo3Var != null ? fo3Var.hashCode() : 0) * 31;
        vn3 vn3Var = this.b;
        return hashCode + (vn3Var != null ? vn3Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
