package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class fz5 extends q13 {
    public final jx0 a;
    public final hn1 b;
    public final Object c;
    public final String d;

    public fz5(jx0 jx0Var, hn1 hn1Var, Object obj, String str) {
        this.a = jx0Var;
        this.b = hn1Var;
        this.c = obj;
        this.d = str;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new hz5(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz5.class != obj.getClass()) {
            return false;
        }
        fz5 fz5Var = (fz5) obj;
        return this.a == fz5Var.a && this.c.equals(fz5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + 1237) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d(this.d);
        z12Var.b().b(this.c, "align");
        z12Var.b().b(Boolean.FALSE, "unbounded");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        hz5 hz5Var = (hz5) k13Var;
        hz5Var.k0(this.a);
        hz5Var.j0(this.b);
    }
}
