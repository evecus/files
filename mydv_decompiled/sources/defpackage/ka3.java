package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ na3 J;

    public /* synthetic */ ka3(na3 na3Var, byte b) {
        this.I = b;
        this.J = na3Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        na3 na3Var = this.J;
        switch (b) {
            case 0:
                o10 o10Var = na3Var.x0;
                o10Var.getClass();
                na3Var.E0(o10Var, na3Var.w0);
                break;
            default:
                na3 na3Var2 = na3Var.e0;
                if (na3Var2 != null) {
                    na3Var2.S0();
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
