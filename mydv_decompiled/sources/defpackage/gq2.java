package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gq2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ l13 J;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ dn4 M;
    public final /* synthetic */ List N;
    public final /* synthetic */ int O;

    public /* synthetic */ gq2(l13 l13Var, long j, long j2, dn4 dn4Var, List list, int i, byte b) {
        this.I = b;
        this.J = l13Var;
        this.K = j;
        this.L = j2;
        this.M = dn4Var;
        this.N = list;
        this.O = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.O;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                qb.l(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).intValue();
                int X2 = mu0.X(i | 1);
                qb.q(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }
}
