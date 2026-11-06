package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ks extends q13 {
    public js a;
    public qb0 b;

    @Override // defpackage.q13
    public final k13 create() {
        return new js(this);
    }

    public final Object d(gj0 gj0Var) {
        qb0 qb0Var = this.b;
        if (qb0Var == null) {
            qb0Var = g4.c();
            this.b = qb0Var;
            js jsVar = this.a;
            if (jsVar != null && jsVar.isAttached()) {
                jsVar.I = lq2.e0(jsVar, new be(jsVar, jsVar.J, (byte) 3));
            }
        }
        Object M = qb0Var.M(gj0Var);
        return M == el0.I ? M : wd5.a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("AwaitFirstLayoutModifier");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
    }
}
