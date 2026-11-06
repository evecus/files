package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qa0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;

    public /* synthetic */ qa0(rm1 rm1Var, int i, byte b) {
        this.I = b;
        this.J = rm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cb0.f(rm1Var, fe0Var, mu0.X(1));
                break;
            default:
                j16.a(rm1Var, fe0Var, mu0.X(7));
                break;
        }
        return wd5Var;
    }
}
