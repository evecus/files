package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class kw2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ lc5 J;
    public final /* synthetic */ hn1 K;

    public /* synthetic */ kw2(lc5 lc5Var, hn1 hn1Var, byte b) {
        this.I = b;
        this.J = lc5Var;
        this.K = hn1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hn1 hn1Var = this.K;
        lc5 lc5Var = this.J;
        byte b2 = 1;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    gr3.a(p70.u0(-241536773, new kw2(lc5Var, hn1Var, b2), go1Var), go1Var, 6);
                    break;
                }
            default:
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    r55.a(lc5Var.j, hn1Var, go1Var2, 0);
                    break;
                }
        }
        return wd5Var;
    }
}
