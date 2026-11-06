package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kk0 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ mk0 J;

    public /* synthetic */ kk0(mk0 mk0Var, byte b) {
        this.I = b;
        this.J = mk0Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        mk0 mk0Var = this.J;
        switch (b) {
            case 0:
                wa2 U = ut0.U(mk0Var);
                if (!U.b0) {
                    za2.a(U).requestAutofill(U);
                }
                return wd5Var;
            case 1:
                mk0Var.P.e(true);
                break;
            case 2:
                mk0Var.P.a(true);
                break;
            case 3:
                mk0Var.P.c();
                break;
            case 4:
                wa2 U2 = ut0.U(mk0Var);
                if (!U2.b0) {
                    za2.a(U2).requestAutofill(U2);
                }
                return wd5Var;
            case 5:
                mk0Var.P.o();
                break;
            case 6:
                xj0 xj0Var = mk0Var.M.w;
                xj0Var.J.r.b(mk0Var.Q.e);
                break;
            default:
                oh2 oh2Var = mk0Var.M;
                ki1 ki1Var = mk0Var.R;
                if (oh2Var.b()) {
                    ot4 ot4Var = oh2Var.c;
                    if (ot4Var != null) {
                        ((yt0) ot4Var).b();
                    }
                } else {
                    ki1.a(ki1Var);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
