package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k00 extends k13 implements kd3, pz, w31 {
    public final m00 I;
    public boolean J;
    public tm1 K;

    public k00(m00 m00Var, tm1 tm1Var) {
        this.I = m00Var;
        this.K = tm1Var;
        m00Var.I = this;
    }

    @Override // defpackage.kd3
    public final void U() {
        j0();
    }

    @Override // defpackage.pz
    public final long c() {
        return ut0.b0(ut0.S(this, 4).K);
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        boolean z = this.J;
        m00 m00Var = this.I;
        if (!z) {
            m00Var.J = null;
            mu0.P(this, new k9(this, m00Var, (byte) 3));
            if (m00Var.J == null) {
                throw r7.t("DrawResult not defined, did you forget to call onDraw?");
            }
            this.J = true;
        }
        ep epVar = m00Var.J;
        epVar.getClass();
        ((tm1) epVar.J).invoke(zh0Var);
    }

    @Override // defpackage.pz
    public final iu0 getDensity() {
        return ut0.U(this).g0;
    }

    @Override // defpackage.pz
    public final da2 getLayoutDirection() {
        return ut0.U(this).h0;
    }

    public final void j0() {
        this.J = false;
        this.I.J = null;
        mu0.I(this);
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        j0();
    }

    @Override // defpackage.k13
    public final void onLayoutDirectionChange() {
        j0();
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
        j0();
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        j0();
    }
}
