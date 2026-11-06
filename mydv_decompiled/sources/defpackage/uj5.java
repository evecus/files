package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uj5 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ dl0 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ ki1 M;

    public /* synthetic */ uj5(tm1 tm1Var, dl0 dl0Var, t43 t43Var, ki1 ki1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = dl0Var;
        this.L = t43Var;
        this.M = ki1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.M;
        t43 t43Var = this.L;
        dl0 dl0Var = this.K;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                on5.J(tm1Var, dl0Var, t43Var, ki1Var);
                break;
            default:
                on5.L(tm1Var, dl0Var, t43Var, ki1Var, true);
                break;
        }
        return wd5Var;
    }
}
