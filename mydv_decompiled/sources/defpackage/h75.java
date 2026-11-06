package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class h75 extends q13 {
    public final t33 a;
    public final boolean b;
    public final ve1 c;

    public h75(t33 t33Var, boolean z, ve1 ve1Var) {
        this.a = t33Var;
        this.b = z;
        this.c = ve1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        j75 j75Var = new j75();
        j75Var.I = this.a;
        j75Var.J = this.b;
        j75Var.K = this.c;
        j75Var.O = Float.NaN;
        j75Var.P = Float.NaN;
        return j75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h75)) {
            return false;
        }
        h75 h75Var = (h75) obj;
        return j42.c(this.a, h75Var.a) && this.b == h75Var.b && j42.c(this.c, h75Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "switchThumb";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "interactionSource");
        fqVar.b(Boolean.valueOf(this.b), "checked");
        fqVar.b(this.c, "animationSpec");
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        j75 j75Var = (j75) k13Var;
        j75Var.I = this.a;
        boolean z = j75Var.J;
        boolean z2 = this.b;
        if (z != z2) {
            ut0.U(j75Var).H();
        }
        j75Var.J = z2;
        j75Var.K = this.c;
        if (j75Var.N == null && !Float.isNaN(j75Var.P)) {
            j75Var.N = p70.a(j75Var.P);
        }
        if (j75Var.M != null || Float.isNaN(j75Var.O)) {
            return;
        }
        j75Var.M = p70.a(j75Var.O);
    }
}
