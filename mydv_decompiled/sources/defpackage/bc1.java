package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bc1 {
    public static final bc1 b;
    public static final bc1 c;
    public final da5 a;

    static {
        LinkedHashMap linkedHashMap = null;
        cd1 cd1Var = null;
        xq4 xq4Var = null;
        i20 i20Var = null;
        ga4 ga4Var = null;
        b = new bc1(new da5(cd1Var, xq4Var, i20Var, ga4Var, linkedHashMap, 127));
        c = new bc1(new da5(cd1Var, xq4Var, i20Var, ga4Var, linkedHashMap, 95));
    }

    public bc1(da5 da5Var) {
        this.a = da5Var;
    }

    public final bc1 a(bc1 bc1Var) {
        cd1 cd1Var = bc1Var.a.a;
        if (cd1Var == null) {
            cd1Var = this.a.a;
        }
        da5 da5Var = bc1Var.a;
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
        boolean z = da5Var.e;
        da5 da5Var2 = this.a;
        return new bc1(new da5(cd1Var, xq4Var, i20Var, ga4Var, z || da5Var2.e, sv2.P(da5Var2.f, da5Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bc1) && ((bc1) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        boolean z = da5Var.e;
        StringBuilder F = r7.F("ExitTransition:  Fade - ", cd1Var2, ",  Slide - ", xq4Var2, ",  Shrink - ");
        r7.N(F, i20Var2, ",  Scale - ", ga4Var2, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        F.append(z);
        return F.toString();
    }
}
