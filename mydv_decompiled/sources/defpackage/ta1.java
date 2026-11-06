package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ta1 {
    public static final ta1 b = new ta1(new da5((cd1) null, (xq4) null, (i20) null, (ga4) null, (LinkedHashMap) null, 127));
    public final da5 a;

    public ta1(da5 da5Var) {
        this.a = da5Var;
    }

    public final ta1 a(ta1 ta1Var) {
        cd1 cd1Var = ta1Var.a.a;
        if (cd1Var == null) {
            cd1Var = this.a.a;
        }
        da5 da5Var = ta1Var.a;
        xq4 xq4Var = da5Var.b;
        if (xq4Var == null) {
            xq4Var = this.a.b;
        }
        i20 i20Var = da5Var.c;
        if (i20Var == null) {
            i20Var = this.a.c;
        }
        ga4 ga4Var = da5Var.d;
        if (ga4Var == null) {
            ga4Var = this.a.d;
        }
        return new ta1(new da5(cd1Var, xq4Var, i20Var, ga4Var, sv2.P(this.a.f, da5Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ta1) && ((ta1) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        da5 da5Var = this.a;
        cd1 cd1Var = da5Var.a;
        String cd1Var2 = cd1Var != null ? cd1Var.toString() : null;
        xq4 xq4Var = da5Var.b;
        String xq4Var2 = xq4Var != null ? xq4Var.toString() : null;
        i20 i20Var = da5Var.c;
        String i20Var2 = i20Var != null ? i20Var.toString() : null;
        ga4 ga4Var = da5Var.d;
        String ga4Var2 = ga4Var != null ? ga4Var.toString() : null;
        StringBuilder F = r7.F("EnterTransition: Fade - ", cd1Var2, ", Slide - ", xq4Var2, ", Shrink - ");
        F.append(i20Var2);
        F.append(", Scale - ");
        F.append(ga4Var2);
        F.append(", Veil - null");
        return F.toString();
    }
}
