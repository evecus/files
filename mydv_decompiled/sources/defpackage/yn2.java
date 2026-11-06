package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yn2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ yn2(rm1 rm1Var, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = rm1Var;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        t43 t43Var2 = this.K;
        rm1 rm1Var = this.J;
        switch (b) {
            case 0:
                if (!((Boolean) t43Var2.getValue()).booleanValue()) {
                    rm1Var.invoke();
                    break;
                } else {
                    t43Var.setValue(Boolean.TRUE);
                    t43Var2.setValue(Boolean.FALSE);
                    break;
                }
            case 1:
                if (!((Boolean) t43Var2.getValue()).booleanValue()) {
                    rm1Var.invoke();
                    break;
                } else {
                    t43Var.setValue(Boolean.TRUE);
                    t43Var2.setValue(Boolean.FALSE);
                    break;
                }
            case 2:
                if (!on5.E(t43Var2)) {
                    rm1Var.invoke();
                    break;
                } else {
                    t43Var.setValue(Boolean.TRUE);
                    t43Var2.setValue(Boolean.FALSE);
                    break;
                }
            default:
                if (!((Boolean) t43Var2.getValue()).booleanValue()) {
                    rm1Var.invoke();
                    break;
                } else {
                    t43Var.setValue(Boolean.TRUE);
                    t43Var2.setValue(Boolean.FALSE);
                    break;
                }
        }
        return wd5Var;
    }
}
