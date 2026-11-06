package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ long J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ac(hx1 hx1Var, long j, cw4 cw4Var, int i) {
        this.K = hx1Var;
        this.J = j;
        this.L = cw4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                ec.a((vd3) obj4, (l13) obj3, this.J, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(7);
                mw3.h((hx1) obj4, this.J, (cw4) obj3, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ac(vd3 vd3Var, l13 l13Var, long j, int i) {
        this.K = vd3Var;
        this.L = l13Var;
        this.J = j;
    }
}
