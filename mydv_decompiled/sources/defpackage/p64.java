package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p64 {
    public final boolean a;
    public final float b;
    public final g80 c;
    public final o64 d;
    public final k64 e;
    public final m64 f;
    public final i64 g;

    public p64(boolean z, float f, au0 au0Var, o64 o64Var, k64 k64Var, m64 m64Var, i64 i64Var) {
        this.a = z;
        this.b = f;
        this.c = au0Var;
        this.d = o64Var;
        this.e = k64Var;
        this.f = m64Var;
        this.g = i64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p64)) {
            return false;
        }
        p64 p64Var = (p64) obj;
        return this.a == p64Var.a && r11.c(this.b, p64Var.b) && j42.c(this.c, p64Var.c) && this.d.equals(p64Var.d) && this.e.equals(p64Var.e) && this.f.equals(p64Var.f) && this.g.equals(p64Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + jp0.o(this.b, pt1.o(this.a) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }
}
