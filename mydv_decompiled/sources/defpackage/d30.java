package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d30 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ d30(t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = t43Var;
        this.K = t43Var2;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                t43Var2.setValue(null);
                t43Var.setValue(Boolean.TRUE);
                break;
            case 1:
                tm1 tm1Var = (tm1) t43Var2.getValue();
                if (tm1Var != null) {
                    tm1Var.invoke(Boolean.valueOf(((String) t43Var.getValue()) != null));
                    break;
                }
                break;
            case 2:
                t43Var2.setValue(Boolean.TRUE);
                t43Var.setValue(Boolean.FALSE);
                break;
            case 3:
                t43Var2.setValue(null);
                t43Var.setValue(Boolean.TRUE);
                break;
            case 4:
                t43Var2.setValue(Boolean.FALSE);
                t43Var.setValue(Boolean.TRUE);
                break;
            case 5:
                t43Var2.setValue(bl4.L);
                t43Var.setValue(Boolean.FALSE);
                break;
            default:
                t43Var2.setValue(Boolean.TRUE);
                t43Var.setValue(Boolean.FALSE);
                break;
        }
        return wd5Var;
    }
}
