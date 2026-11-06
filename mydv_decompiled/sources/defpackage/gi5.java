package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class gi5 extends q13 {
    public final ea5 a;
    public final y95 b;
    public final ta1 c;
    public final bc1 d;
    public final on4 e;

    public gi5(ea5 ea5Var, y95 y95Var, ta1 ta1Var, bc1 bc1Var, on4 on4Var) {
        this.a = ea5Var;
        this.b = y95Var;
        this.c = ta1Var;
        this.d = bc1Var;
        this.e = on4Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ii5 ii5Var = new ii5();
        ii5Var.I = this.b;
        ii5Var.J = this.c;
        ii5Var.K = this.d;
        ii5Var.L = this.e;
        return ii5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gi5) {
            gi5 gi5Var = (gi5) obj;
            return j42.c(this.a, gi5Var.a) && j42.c(this.b, gi5Var.b) && this.c.equals(gi5Var.c) && j42.c(this.d, gi5Var.d) && this.e == gi5Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "veil";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "transition");
        fqVar.b(this.b, "veilAnimation");
        fqVar.b(this.c, "enter");
        fqVar.b(this.d, "exit");
        fqVar.b(this.e, "mutableTransformState");
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ii5 ii5Var = (ii5) k13Var;
        ii5Var.I = this.b;
        ii5Var.J = this.c;
        ii5Var.K = this.d;
        ii5Var.L = this.e;
    }
}
