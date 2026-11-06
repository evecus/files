package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class id4 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ rm1 M;
    public final /* synthetic */ tm1 N;

    public /* synthetic */ id4(List list, boolean z, boolean z2, rm1 rm1Var, tm1 tm1Var, int i, byte b) {
        this.I = b;
        this.J = list;
        this.K = z;
        this.L = z2;
        this.M = rm1Var;
        this.N = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1);
                he4.q(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(1);
                he4.q(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(1);
                he4.c(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X3);
                break;
            default:
                ((Integer) obj2).getClass();
                int X4 = mu0.X(1);
                he4.c(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X4);
                break;
        }
        return wd5Var;
    }
}
