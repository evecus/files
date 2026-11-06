package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class if2 extends q13 {
    public final rm1 a;
    public final ff2 b;
    public final pg3 c;
    public final boolean d;

    public if2(rm1 rm1Var, ff2 ff2Var, pg3 pg3Var, boolean z) {
        this.a = rm1Var;
        this.b = ff2Var;
        this.c = pg3Var;
        this.d = z;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new lf2(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return this.a == if2Var.a && j42.c(this.b, if2Var.b) && this.c == if2Var.c && this.d == if2Var.d;
    }

    public final int hashCode() {
        return ((pt1.o(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31) + 1237;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        lf2 lf2Var = (lf2) k13Var;
        lf2Var.I = this.a;
        lf2Var.J = this.b;
        pg3 pg3Var = lf2Var.K;
        pg3 pg3Var2 = this.c;
        if (pg3Var != pg3Var2) {
            lf2Var.K = pg3Var2;
            ut0.U(lf2Var).I();
        }
        boolean z = lf2Var.L;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        lf2Var.L = z2;
        lf2Var.j0();
        ut0.U(lf2Var).I();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}
