package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t20 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ rm1 L;

    public /* synthetic */ t20(String str, boolean z, rm1 rm1Var, int i, byte b) {
        this.I = b;
        this.J = str;
        this.K = z;
        this.L = rm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.L;
        boolean z = this.K;
        String str = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qg5.k(str, z, rm1Var, fe0Var, mu0.X(1));
                break;
            case 1:
                qg5.j(str, z, rm1Var, fe0Var, mu0.X(1));
                break;
            case 2:
                qg5.h(str, z, rm1Var, fe0Var, mu0.X(1));
                break;
            case 3:
                ou2.a(str, z, rm1Var, fe0Var, mu0.X(1));
                break;
            default:
                he4.k(str, z, rm1Var, fe0Var, mu0.X(1));
                break;
        }
        return wd5Var;
    }
}
