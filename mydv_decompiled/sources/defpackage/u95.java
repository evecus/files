package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u95 {
    public final oj a;
    public final td3 b;

    public u95(oj ojVar, td3 td3Var) {
        this.a = ojVar;
        this.b = td3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u95)) {
            return false;
        }
        u95 u95Var = (u95) obj;
        return j42.c(this.a, u95Var.a) && this.b.equals(u95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
