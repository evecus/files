package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g9 implements rm1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ g9(hu2 hu2Var, boolean z) {
        this.K = hu2Var;
        this.J = z;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        boolean z = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                s33 s33Var = (s33) obj;
                if (z) {
                    qu4 qu4Var = qu4.a;
                    gk3 gk3Var = (gk3) s33Var;
                    qu4.c = gk3Var.h();
                    gk3 gk3Var2 = oo3.a;
                    oo3.a.i(gk3Var.h());
                    break;
                }
                break;
            default:
                fw4 fw4Var = ((hu2) obj).i.i;
                Boolean valueOf = Boolean.valueOf(z);
                fw4Var.getClass();
                fw4Var.i(null, valueOf);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ g9(boolean z, s33 s33Var) {
        this.J = z;
        this.K = s33Var;
    }
}
