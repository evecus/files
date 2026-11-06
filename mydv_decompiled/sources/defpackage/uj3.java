package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uj3 implements Serializable {
    public final Object I;
    public final Object J;

    public uj3(Object obj, Object obj2) {
        this.I = obj;
        this.J = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        uj3 uj3Var = (uj3) obj;
        return j42.c(this.I, uj3Var.I) && j42.c(this.J, uj3Var.J);
    }

    public final int hashCode() {
        Object obj = this.I;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.J;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.I + ", " + this.J + ')';
    }
}
