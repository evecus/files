package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class b55 extends q13 {
    public final m65 a;

    public b55(m65 m65Var) {
        this.a = m65Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new c55(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        return j42.c(this.a, ((b55) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "textFieldMinSize";
        z12Var.c.b(this.a, "style");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        c55 c55Var = (c55) k13Var;
        m65 z = ad4.z(this.a, ut0.U(c55Var).h0);
        c55Var.j0(z, (kj1) j42.r(c55Var, hf0.k));
        a55 a55Var = c55Var.K;
        if (a55Var == null) {
            throw hf1.q("Min size state is not set.");
        }
        a55.a(a55Var, null, null, z, 23);
        ut0.U(c55Var).H();
    }
}
