package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ri1 extends wt0 implements kd3, ye0 {
    public final ui1 K;
    public we2 L;

    public ri1() {
        ui1 ui1Var = new ui1(0, new qi1(2, this, ri1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 0), 9);
        j0(ui1Var);
        this.K = ui1Var;
    }

    @Override // defpackage.kd3
    public final void U() {
        r24 r24Var = new r24();
        mu0.P(this, new ka(r24Var, this, (byte) 16));
        we2 we2Var = (we2) r24Var.I;
        if (this.K.o0().b()) {
            we2 we2Var2 = this.L;
            if (we2Var2 != null) {
                we2Var2.b();
            }
            if (we2Var != null) {
                we2Var.a();
            } else {
                we2Var = null;
            }
            this.L = we2Var;
        }
    }
}
