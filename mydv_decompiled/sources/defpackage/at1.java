package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class at1 extends q13 {
    public final m65 a;
    public final boolean b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public at1(m65 m65Var, int i, int i2) {
        this.a = m65Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ct1 ct1Var = new ct1();
        ct1Var.I = this.a;
        ct1Var.J = this.b;
        ct1Var.K = this.c;
        ct1Var.M = -1;
        ct1Var.N = -1;
        return ct1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at1)) {
            return false;
        }
        at1 at1Var = (at1) obj;
        return j42.c(this.a, at1Var.a) && this.b == at1Var.b && this.c == at1Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + this.c;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "heightInLines";
        fq fqVar = z12Var.c;
        fqVar.b(Integer.valueOf(this.b ? 1 : 0), "minLines");
        fqVar.b(Integer.valueOf(this.c), "maxLines");
        fqVar.b(this.a, "textStyle");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ct1 ct1Var = (ct1) k13Var;
        m65 m65Var = ct1Var.I;
        m65 m65Var2 = this.a;
        boolean c = j42.c(m65Var, m65Var2);
        boolean z = this.b;
        int i = this.c;
        if (c && ct1Var.J == z && ct1Var.K == i) {
            return;
        }
        ct1Var.I = m65Var2;
        ct1Var.J = z;
        ct1Var.K = i;
        ct1Var.O = ad4.z(m65Var2, ut0.U(ct1Var).h0);
        ct1Var.L = true;
        ut0.U(ct1Var).H();
    }
}
