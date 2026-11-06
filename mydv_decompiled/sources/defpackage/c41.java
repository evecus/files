package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class c41 extends q13 {
    public final tm1 a;

    public c41(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        d41 d41Var = new d41();
        d41Var.I = this.a;
        return d41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c41) {
            return this.a == ((c41) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("drawWithContent");
        z12Var.b().b(this.a, "onDraw");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((d41) k13Var).I = this.a;
    }
}
