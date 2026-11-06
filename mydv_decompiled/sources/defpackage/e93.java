package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class e93 extends q13 {
    public final a93 a;
    public final d93 b;

    public e93(a93 a93Var, d93 d93Var) {
        this.a = a93Var;
        this.b = d93Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new h93(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e93)) {
            return false;
        }
        e93 e93Var = (e93) obj;
        return j42.c(e93Var.a, this.a) && j42.c(e93Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d93 d93Var = this.b;
        return hashCode + (d93Var != null ? d93Var.hashCode() : 0);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("nestedScroll");
        z12Var.b().b(this.a, "connection");
        z12Var.b().b(this.b, "dispatcher");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        h93 h93Var = (h93) k13Var;
        h93Var.I = this.a;
        d93 d93Var = h93Var.J;
        if (d93Var.a == h93Var) {
            d93Var.a = null;
            d93Var.d = null;
            d93Var.c = mw2.h;
        }
        d93 d93Var2 = this.b;
        if (d93Var2 == null) {
            h93Var.J = new d93();
        } else if (d93Var2 != d93Var) {
            h93Var.J = d93Var2;
        }
        if (h93Var.isAttached()) {
            d93 d93Var3 = h93Var.J;
            d93Var3.a = h93Var;
            d93Var3.b = null;
            h93Var.K = null;
            d93Var3.c = new eq(h93Var, (byte) 22);
            d93Var3.d = h93Var.getCoroutineScope();
        }
    }
}
