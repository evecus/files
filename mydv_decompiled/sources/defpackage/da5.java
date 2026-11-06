package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class da5 {
    public final cd1 a;
    public final xq4 b;
    public final i20 c;
    public final ga4 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ da5(cd1 cd1Var, xq4 xq4Var, i20 i20Var, ga4 ga4Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : cd1Var, (i & 2) != 0 ? null : xq4Var, (i & 4) != 0 ? null : i20Var, (i & 8) != 0 ? null : ga4Var, (i & 32) == 0, (i & 64) != 0 ? p91.I : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da5)) {
            return false;
        }
        da5 da5Var = (da5) obj;
        return j42.c(this.a, da5Var.a) && j42.c(this.b, da5Var.b) && j42.c(this.c, da5Var.c) && j42.c(this.d, da5Var.d) && this.e == da5Var.e && j42.c(this.f, da5Var.f);
    }

    public final int hashCode() {
        cd1 cd1Var = this.a;
        int hashCode = (cd1Var == null ? 0 : cd1Var.hashCode()) * 31;
        xq4 xq4Var = this.b;
        int hashCode2 = (hashCode + (xq4Var == null ? 0 : xq4Var.hashCode())) * 31;
        i20 i20Var = this.c;
        int hashCode3 = (hashCode2 + (i20Var == null ? 0 : i20Var.hashCode())) * 31;
        ga4 ga4Var = this.d;
        return this.f.hashCode() + ((pt1.o(this.e) + ((hashCode3 + (ga4Var != null ? ga4Var.hashCode() : 0)) * 961)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public da5(cd1 cd1Var, xq4 xq4Var, i20 i20Var, ga4 ga4Var, boolean z, Map map) {
        this.a = cd1Var;
        this.b = xq4Var;
        this.c = i20Var;
        this.d = ga4Var;
        this.e = z;
        this.f = map;
    }
}
