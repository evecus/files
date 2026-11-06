package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g04 implements mr3, Serializable {
    public static final g04 K = new g04(xm0.L, xm0.K);
    public final xm0 I;
    public final xm0 J;

    public g04(xm0 xm0Var, xm0 xm0Var2) {
        this.I = xm0Var;
        this.J = xm0Var2;
        if (xm0Var.b(xm0Var2) > 0 || xm0Var == xm0.K || xm0Var2 == xm0.L) {
            StringBuilder sb = new StringBuilder(16);
            xm0Var.c(sb);
            sb.append("..");
            xm0Var2.d(sb);
            s83.t("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.I.e(comparable) && !this.J.e(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g04)) {
            return false;
        }
        g04 g04Var = (g04) obj;
        return this.I.equals(g04Var.I) && this.J.equals(g04Var.J);
    }

    public final int hashCode() {
        return this.J.hashCode() + (this.I.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.I.c(sb);
        sb.append("..");
        this.J.d(sb);
        return sb.toString();
    }
}
