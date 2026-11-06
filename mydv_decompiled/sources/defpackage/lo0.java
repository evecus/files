package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo0 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ Object M;

    public /* synthetic */ lo0(boolean z, tm1 tm1Var, Object obj, t43 t43Var, byte b) {
        this.I = b;
        this.J = z;
        this.K = tm1Var;
        this.M = obj;
        this.L = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        Object obj = this.M;
        tm1 tm1Var = this.K;
        boolean z = this.J;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (z && ((Boolean) tm1Var.invoke(str)).booleanValue()) {
                    t43Var.setValue("");
                    break;
                }
                break;
            default:
                dl4 dl4Var = (dl4) obj;
                if (!z) {
                    tm1Var.invoke(dl4Var.a);
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
