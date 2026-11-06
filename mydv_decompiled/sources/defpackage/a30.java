package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a30 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ s33 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;

    public /* synthetic */ a30(String str, s33 s33Var, t43 t43Var, t43 t43Var2, t43 t43Var3, byte b) {
        this.I = b;
        this.J = str;
        this.K = s33Var;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.N;
        t43 t43Var2 = this.M;
        t43 t43Var3 = this.L;
        s33 s33Var = this.K;
        String str = this.J;
        switch (b) {
            case 0:
                if (j42.c(obj, str)) {
                    gk3 gk3Var = (gk3) s33Var;
                    gk3Var.i(gk3Var.h() + 1);
                    t43Var3.setValue(Boolean.TRUE);
                    qg5.p(t43Var2, false);
                    t43Var.setValue(null);
                    break;
                }
                break;
            case 1:
                if (j42.c(obj, str)) {
                    gk3 gk3Var2 = (gk3) s33Var;
                    gk3Var2.i(gk3Var2.h() + 1);
                    t43Var3.setValue(Boolean.TRUE);
                    un2.d(t43Var2, false);
                    t43Var.setValue(null);
                    break;
                }
                break;
            default:
                if (j42.c(obj, str)) {
                    gk3 gk3Var3 = (gk3) s33Var;
                    gk3Var3.i(gk3Var3.h() + 1);
                    t43Var3.setValue(Boolean.TRUE);
                    on5.l0(t43Var2, false);
                    t43Var.setValue(null);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
