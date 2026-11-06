package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class mz1 extends q13 {
    public final t33 a;
    public final oz1 b;

    public mz1(t33 t33Var, oz1 oz1Var) {
        this.a = t33Var;
        this.b = oz1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        tt0 a = this.b.a(this.a);
        nz1 nz1Var = new nz1();
        nz1Var.K = a;
        nz1Var.j0(a);
        return nz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        return j42.c(this.a, mz1Var.a) && j42.c(this.b, mz1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "indication";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "interactionSource");
        fqVar.b(this.b, "indication");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        nz1 nz1Var = (nz1) k13Var;
        tt0 a = this.b.a(this.a);
        nz1Var.k0(nz1Var.K);
        nz1Var.K = a;
        nz1Var.j0(a);
    }
}
