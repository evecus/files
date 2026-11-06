package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ pi3 J;
    public final /* synthetic */ pn K;

    public /* synthetic */ n00(pi3 pi3Var, pn pnVar, byte b) {
        this.I = b;
        this.J = pi3Var;
        this.K = pnVar;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        pn pnVar = this.K;
        pi3 pi3Var = this.J;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                pi3Var.c(pnVar, intValue, intValue2);
                break;
            default:
                pi3Var.c(pnVar, intValue, intValue2);
                break;
        }
        return wd5Var;
    }
}
