package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wo2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ l13 J;

    public /* synthetic */ wo2(l13 l13Var) {
        this.I = (byte) 0;
        this.J = l13Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        l13 l13Var = this.J;
        fe0 fe0Var = (fe0) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int intValue = num.intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    p70.o("正在加载直播...", l13Var, go1Var, 6, 0);
                    break;
                }
            case 1:
                num.getClass();
                qg5.s(l13Var, fe0Var, mu0.X(7));
                break;
            case 2:
                num.getClass();
                sp0.g(l13Var, fe0Var, mu0.X(1));
                break;
            default:
                num.getClass();
                sp0.g(l13Var, fe0Var, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ wo2(l13 l13Var, int i, byte b) {
        this.I = b;
        this.J = l13Var;
    }
}
