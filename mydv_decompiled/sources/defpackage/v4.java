package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v4 {
    public final String a;
    public final dn1 b;

    public v4(String str, dn1 dn1Var) {
        this.a = str;
        this.b = dn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return j42.c(this.a, v4Var.a) && j42.c(this.b, v4Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        dn1 dn1Var = this.b;
        return hashCode + (dn1Var != null ? dn1Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
