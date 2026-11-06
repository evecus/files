package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j30 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ long J;
    public final /* synthetic */ byte K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j30(int i, long j, hn1 hn1Var, rq4 rq4Var) {
        this.J = j;
        this.L = rq4Var;
        this.M = hn1Var;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                qg5.l((hx1) obj4, (String) obj3, this.J, (fe0) obj, X, this.K);
                break;
            default:
                fe0 fe0Var = (fe0) obj;
                ((Integer) obj2).getClass();
                int X2 = mu0.X(this.K | 1);
                long j = this.J;
                eg5.b(X2, j, fe0Var, (hn1) obj3, (rq4) obj4);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j30(hx1 hx1Var, String str, long j, int i, int i2) {
        this.L = hx1Var;
        this.M = str;
        this.J = j;
        this.K = i2;
    }
}
