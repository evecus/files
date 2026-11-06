package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class jw extends q13 {
    public final tm1 a;

    public jw(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new kw(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jw) {
            return this.a == ((jw) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("graphicsLayer");
        z12Var.b().b(this.a, "block");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        kw kwVar = (kw) k13Var;
        tm1 tm1Var = this.a;
        kwVar.I = tm1Var;
        sp0.r0(kwVar, tm1Var);
    }
}
