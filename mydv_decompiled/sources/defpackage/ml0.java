package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ml0 {
    public static final ll0 Companion = new ll0();
    public static final ml0 c = new ml0("最近看过", k21.I());
    public final String a;
    public final hx1 b;

    public ml0(String str, hx1 hx1Var) {
        this.a = str;
        this.b = hx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return this.a.equals(ml0Var.a) && j42.c(this.b, ml0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hx1 hx1Var = this.b;
        return hashCode + (hx1Var == null ? 0 : hx1Var.hashCode());
    }

    public final String toString() {
        return "CoverBadge(text=" + this.a + ", icon=" + this.b + ")";
    }
}
