package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c30 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ c30(String str, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = str;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        t43 t43Var2 = this.K;
        String str = this.J;
        switch (b) {
            case 0:
                if (j42.c(obj, str)) {
                    t43Var2.setValue(Boolean.FALSE);
                    qg5.p(t43Var, true);
                    break;
                }
                break;
            case 1:
                if (j42.c(obj, str)) {
                    t43Var2.setValue(Boolean.FALSE);
                    un2.d(t43Var, true);
                    break;
                }
                break;
            default:
                if (j42.c(obj, str)) {
                    t43Var2.setValue(Boolean.FALSE);
                    on5.l0(t43Var, true);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
