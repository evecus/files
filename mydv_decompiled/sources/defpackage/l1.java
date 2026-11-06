package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u1 J;

    public /* synthetic */ l1(u1 u1Var, byte b) {
        this.I = b;
        this.J = u1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        tt0 tt0Var;
        byte b = this.I;
        u1 u1Var = this.J;
        switch (b) {
            case 0:
                oz1 oz1Var = (oz1) j42.r(u1Var, kz1.a);
                if (oz1Var == null) {
                    t02.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + oz1Var);
                }
                oz1 oz1Var2 = u1Var.R;
                u1Var.R = oz1Var;
                if (oz1Var2 != null && !j42.c(oz1Var, oz1Var2) && ((tt0Var = u1Var.U) != null || !u1Var.b0)) {
                    if (tt0Var != null) {
                        u1Var.k0(tt0Var);
                    }
                    u1Var.U = null;
                    u1Var.t0();
                }
                return wd5.a;
            default:
                u1Var.x0();
                return Boolean.TRUE;
        }
    }
}
