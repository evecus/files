package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yx0 implements k34 {
    public final tm1 I;
    public zx0 J;

    public yx0(tm1 tm1Var) {
        this.I = tm1Var;
    }

    @Override // defpackage.k34
    public final void onForgotten() {
        zx0 zx0Var = this.J;
        if (zx0Var != null) {
            zx0Var.dispose();
        }
        this.J = null;
    }

    @Override // defpackage.k34
    public final void onRemembered() {
        this.J = (zx0) this.I.invoke(mw2.f);
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
    }
}
