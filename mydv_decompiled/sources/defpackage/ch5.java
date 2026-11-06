package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ch5 {
    public final String a;
    public final Object b;

    public ch5(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch5)) {
            return false;
        }
        ch5 ch5Var = (ch5) obj;
        return j42.c(this.a, ch5Var.a) && j42.c(this.b, ch5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ")";
    }
}
