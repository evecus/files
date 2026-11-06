package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yj5 implements rm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ yj5(tm1 tm1Var, boolean z, t43 t43Var) {
        this.K = tm1Var;
        this.J = z;
        this.L = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        tm1 tm1Var = this.K;
        boolean z = this.J;
        switch (b) {
            case 0:
                if (tm1Var != null) {
                    tm1Var.invoke(Boolean.valueOf(!z));
                }
                t43Var.setValue(Boolean.TRUE);
                break;
            default:
                if (z && tm1Var != null) {
                    Boolean bool = (Boolean) t43Var.getValue();
                    bool.booleanValue();
                    tm1Var.invoke(bool);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ yj5(boolean z, tm1 tm1Var, t43 t43Var) {
        this.J = z;
        this.K = tm1Var;
        this.L = t43Var;
    }
}
