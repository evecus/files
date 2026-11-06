package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class be2 extends q13 {
    public final fe2 a;
    public final cy b;
    public final pg3 c;

    public be2(fe2 fe2Var, cy cyVar, pg3 pg3Var) {
        this.a = fe2Var;
        this.b = cyVar;
        this.c = pg3Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ee2 ee2Var = new ee2();
        ee2Var.I = this.a;
        ee2Var.J = this.b;
        ee2Var.K = this.c;
        return ee2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be2)) {
            return false;
        }
        be2 be2Var = (be2) obj;
        return j42.c(this.a, be2Var.a) && j42.c(this.b, be2Var.b) && this.c == be2Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ee2 ee2Var = (ee2) k13Var;
        ee2Var.I = this.a;
        ee2Var.J = this.b;
        ee2Var.K = this.c;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
