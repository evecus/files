package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc4 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ fc4 J;

    public /* synthetic */ bc4(fc4 fc4Var, byte b) {
        this.I = b;
        this.J = fc4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        fc4 fc4Var = this.J;
        switch (b) {
            case 0:
                return Boolean.valueOf(fc4Var.isAttached());
            default:
                tt0 tt0Var = fc4Var.n0;
                if (!((k13) tt0Var).getNode().isAttached()) {
                    return null;
                }
                oi1 o0 = ((ui1) tt0Var).o0();
                if (!o0.a()) {
                    return null;
                }
                if (o0.b()) {
                    return ((ui1) tt0Var).m0(null);
                }
                ui1 g = ((di1) ut0.V(tt0Var).getFocusOwner()).g();
                if (g != null) {
                    return g.m0(ut0.T(tt0Var));
                }
                return null;
        }
    }
}
