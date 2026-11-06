package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hn4 {
    public final k74 a;
    public final k74 b;
    public final k74 c;
    public final k74 d;
    public final k74 e;
    public final k74 f;
    public final k74 g;
    public final k74 h;

    public hn4() {
        this(en4.a, en4.b, en4.c, en4.d, en4.f, en4.e, en4.g, en4.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn4)) {
            return false;
        }
        hn4 hn4Var = (hn4) obj;
        return j42.c(this.a, hn4Var.a) && j42.c(this.b, hn4Var.b) && j42.c(this.c, hn4Var.c) && j42.c(this.d, hn4Var.d) && j42.c(this.e, hn4Var.e) && j42.c(this.f, hn4Var.f) && j42.c(this.g, hn4Var.g) && j42.c(this.h, hn4Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }

    public hn4(k74 k74Var, k74 k74Var2, k74 k74Var3, k74 k74Var4, k74 k74Var5, k74 k74Var6, k74 k74Var7, k74 k74Var8) {
        this.a = k74Var;
        this.b = k74Var2;
        this.c = k74Var3;
        this.d = k74Var4;
        this.e = k74Var5;
        this.f = k74Var6;
        this.g = k74Var7;
        this.h = k74Var8;
    }
}
