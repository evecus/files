package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ bn3 J;
    public final /* synthetic */ int K;

    public /* synthetic */ u5(bn3 bn3Var, int i, byte b) {
        this.I = b;
        this.J = bn3Var;
        this.K = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        bn3 bn3Var = this.J;
        an3 an3Var = (an3) obj;
        switch (b) {
            case 0:
                an3.g(an3Var, bn3Var, -i, 0);
                break;
            case 1:
                an3.g(an3Var, bn3Var, 0, -i);
                break;
            default:
                an3Var.getClass();
                an3.g(an3Var, bn3Var, 0, i);
                break;
        }
        return wd5Var;
    }
}
