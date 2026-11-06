package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov3 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ gu3 J;
    public final /* synthetic */ rm1 K;

    public /* synthetic */ ov3(gu3 gu3Var, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = gu3Var;
        this.K = rm1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.K;
        gu3 gu3Var = this.J;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((mg2) obj).getClass();
        int i = intValue & 17;
        switch (b) {
            case 0:
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, i != 16)) {
                    go1Var.W();
                    break;
                } else {
                    mw3.g(gu3Var.b, rm1Var, go1Var, 0);
                    break;
                }
            default:
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, i != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    mw3.g(gu3Var.b, rm1Var, go1Var2, 0);
                    break;
                }
        }
        return wd5Var;
    }
}
