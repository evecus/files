package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b51 {
    public final String a;
    public final tm1 b;
    public final tm1 c;
    public final boolean d;
    public final tm1 e;
    public final tm1 f;
    public final tm1 g;
    public final tm1 h;
    public final tm1 i;
    public final tm1 j;
    public final HashMap k;

    public b51(String str, tm1 tm1Var, tm1 tm1Var2, boolean z, tm1 tm1Var3, tm1 tm1Var4, tm1 tm1Var5, tm1 tm1Var6, tm1 tm1Var7, tm1 tm1Var8) {
        str.getClass();
        tm1Var.getClass();
        this.a = str;
        this.b = tm1Var;
        this.c = tm1Var2;
        this.d = z;
        this.e = tm1Var3;
        this.f = tm1Var4;
        this.g = tm1Var5;
        this.h = tm1Var6;
        this.i = tm1Var7;
        this.j = tm1Var8;
        this.k = new HashMap();
    }

    public final double a(k51 k51Var) {
        k51Var.getClass();
        return (k51Var.l == a90.L ? mw2.c : mw2.b).k(this, k51Var);
    }

    public final a51 b() {
        a51 a51Var = new a51();
        String str = this.a;
        str.getClass();
        a51Var.a = str;
        tm1 tm1Var = this.b;
        tm1Var.getClass();
        a51Var.b = tm1Var;
        a51Var.c = this.c;
        a51Var.d = this.d;
        a51Var.e = this.e;
        a51Var.f = this.f;
        a51Var.g = this.g;
        a51Var.h = this.h;
        a51Var.i = this.i;
        a51Var.j = this.j;
        return a51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b51)) {
            return false;
        }
        b51 b51Var = (b51) obj;
        return j42.c(this.a, b51Var.a) && j42.c(this.b, b51Var.b) && this.c.equals(b51Var.c) && this.d == b51Var.d && j42.c(this.e, b51Var.e) && j42.c(this.f, b51Var.f) && j42.c(this.g, b51Var.g) && j42.c(this.h, b51Var.h) && j42.c(this.i, b51Var.i) && j42.c(this.j, b51Var.j);
    }

    public final int hashCode() {
        int o = (pt1.o(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        tm1 tm1Var = this.e;
        int hashCode = (o + (tm1Var == null ? 0 : tm1Var.hashCode())) * 31;
        tm1 tm1Var2 = this.f;
        int hashCode2 = (hashCode + (tm1Var2 == null ? 0 : tm1Var2.hashCode())) * 31;
        tm1 tm1Var3 = this.g;
        int hashCode3 = (hashCode2 + (tm1Var3 == null ? 0 : tm1Var3.hashCode())) * 31;
        tm1 tm1Var4 = this.h;
        int hashCode4 = (hashCode3 + (tm1Var4 == null ? 0 : tm1Var4.hashCode())) * 31;
        tm1 tm1Var5 = this.i;
        int hashCode5 = (hashCode4 + (tm1Var5 == null ? 0 : tm1Var5.hashCode())) * 31;
        tm1 tm1Var6 = this.j;
        return hashCode5 + (tm1Var6 != null ? tm1Var6.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.a + ", palette=" + this.b + ", tone=" + this.c + ", isBackground=" + this.d + ", chromaMultiplier=" + this.e + ", background=" + this.f + ", secondBackground=" + this.g + ", contrastCurve=" + this.h + ", toneDeltaPair=" + this.i + ", opacity=" + this.j + ")";
    }
}
