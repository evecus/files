package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fr0 extends k13 implements w31 {
    public final t33 I;
    public boolean J;
    public boolean K;
    public boolean L;

    public fr0(t33 t33Var) {
        this.I = t33Var;
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        ya2 ya2Var = (ya2) zh0Var;
        ya2Var.a();
        pn pnVar = ya2Var.I.J;
        if (this.J) {
            r7.m(ya2Var, x70.c(x70.b, 0.3f), 0L, pnVar.H(), 0.0f, 122);
        } else if (this.K || this.L) {
            r7.m(ya2Var, x70.c(x70.b, 0.1f), 0L, pnVar.H(), 0.0f, 122);
        }
    }

    @Override // defpackage.k13
    public final void onAttach() {
        p70.g0(getCoroutineScope(), null, null, new h40((Object) this, (fj0) null, (byte) 3), 3);
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
