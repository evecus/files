package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class do1 implements k34 {
    public final eo1 I;

    public do1(eo1 eo1Var) {
        this.I = eo1Var;
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
        this.I.a();
    }

    @Override // defpackage.k34
    public final void onForgotten() {
        this.I.a();
    }

    @Override // defpackage.k34
    public final void onRemembered() {
    }
}
