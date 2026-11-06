package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class vs4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ tm1 K;

    public /* synthetic */ vs4(tm1 tm1Var, tm1 tm1Var2, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = tm1Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.K;
        tm1 tm1Var2 = this.J;
        switch (b) {
            case 0:
                tm1Var2.invoke(obj);
                tm1Var.invoke(obj);
                break;
            default:
                tm1Var2.invoke(obj);
                tm1Var.invoke(obj);
                break;
        }
        return wd5Var;
    }
}
