package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class s12 extends q13 {
    public final vu5 a;

    public s12(vu5 vu5Var) {
        this.a = vu5Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new u12(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s12) {
            return j42.c(((s12) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        u12 u12Var = (u12) k13Var;
        vu5 vu5Var = u12Var.K;
        vu5 vu5Var2 = this.a;
        if (j42.c(vu5Var2, vu5Var)) {
            return;
        }
        u12Var.K = vu5Var2;
        u12Var.j0();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
