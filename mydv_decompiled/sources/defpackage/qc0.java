package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ qc0(int i, me2 me2Var, Object obj) {
        this.I = (byte) 3;
        this.K = me2Var;
        this.J = i;
        this.L = obj;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ((tc0) obj4).f(obj3, (fe0) obj, mu0.X(i) | 1);
                break;
            case 1:
                ((Integer) obj2).intValue();
                mw2.b((ay3) obj4, (hn1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mw2.c((ay3[]) obj4, (hn1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 3:
                me2 me2Var = (me2) obj4;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    me2Var.b(i, obj3, go1Var, 0);
                    break;
                }
            case 4:
                ((Integer) obj2).getClass();
                ((wi3) obj4).b(i, obj3, (fe0) obj, mu0.X(1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((ea5) obj4).a(obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ qc0(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.J = i;
    }

    public /* synthetic */ qc0(wi3 wi3Var, int i, Object obj, int i2) {
        this.I = (byte) 4;
        this.K = wi3Var;
        this.J = i;
        this.L = obj;
    }
}
