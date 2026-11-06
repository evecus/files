package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class te3 extends q13 {
    public final tm1 a;

    public te3(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ue3 ue3Var = new ue3();
        ue3Var.I = this.a;
        ue3Var.J = -9223372034707292160L;
        return ue3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof te3) {
            return this.a == ((te3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("onSizeChanged");
        z12Var.b().b(this.a, "onSizeChanged");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ue3 ue3Var = (ue3) k13Var;
        ue3Var.I = this.a;
        ue3Var.J = -9223372034707292160L;
    }
}
