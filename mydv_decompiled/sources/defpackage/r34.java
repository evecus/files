package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r34 {
    public final q34 a;
    public final p34 b;
    public final String c;

    public r34(q34 q34Var, p34 p34Var, String str) {
        q34Var.getClass();
        str.getClass();
        this.a = q34Var;
        this.b = p34Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34Var = (r34) obj;
        return j42.c(this.a, r34Var.a) && j42.c(this.b, r34Var.b) && j42.c(this.c, r34Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p34 p34Var = this.b;
        return this.c.hashCode() + ((hashCode + (p34Var == null ? 0 : p34Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfig(license=");
        sb.append(this.a);
        sb.append(", announcement=");
        sb.append(this.b);
        sb.append(", configUrl=");
        return hf1.z(sb, this.c, ")");
    }
}
