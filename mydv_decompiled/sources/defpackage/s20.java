package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s20 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ l13 K;

    public /* synthetic */ s20(String str, l13 l13Var, int i, byte b) {
        this.I = b;
        this.J = str;
        this.K = l13Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        l13 l13Var = this.K;
        String str = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qg5.d(str, l13Var, fe0Var, mu0.X(1));
                break;
            default:
                mw3.q(str, l13Var, fe0Var, mu0.X(7));
                break;
        }
        return wd5Var;
    }
}
