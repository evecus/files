package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gb5 implements Serializable {
    public final Object I;
    public final Object J;
    public final Object K;

    public gb5(Object obj, Object obj2, Object obj3) {
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb5)) {
            return false;
        }
        gb5 gb5Var = (gb5) obj;
        return j42.c(this.I, gb5Var.I) && j42.c(this.J, gb5Var.J) && j42.c(this.K, gb5Var.K);
    }

    public final int hashCode() {
        Object obj = this.I;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.J;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.K;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.I + ", " + this.J + ", " + this.K + ')';
    }
}
