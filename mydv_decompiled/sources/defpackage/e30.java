package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e30 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ e30(String str, t43 t43Var, byte b) {
        this.I = b;
        this.J = str;
        this.K = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        String str = this.J;
        switch (b) {
            case 0:
                if (j42.c(obj, str)) {
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                if (j42.c(obj, str)) {
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
