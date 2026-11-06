package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m03 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ dn1 P;
    public final /* synthetic */ dn1 Q;

    public /* synthetic */ m03(int i, List list, Set set, Integer num, boolean z, String str, rm1 rm1Var, tm1 tm1Var, int i2) {
        this.K = i;
        this.L = list;
        this.M = set;
        this.N = num;
        this.J = z;
        this.O = str;
        this.P = rm1Var;
        this.Q = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dn1 dn1Var = this.Q;
        dn1 dn1Var2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(1572865);
                w03.b(this.K, (List) obj6, (Set) obj5, (Integer) obj4, this.J, (String) obj3, (rm1) dn1Var2, (tm1) dn1Var, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(this.K | 1);
                or4.c((qr4) obj6, (l13) obj5, this.J, (yq4) obj4, (t33) obj3, (tc0) dn1Var2, (tc0) dn1Var, (fe0) obj, X2);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ m03(qr4 qr4Var, l13 l13Var, boolean z, yq4 yq4Var, t33 t33Var, tc0 tc0Var, tc0 tc0Var2, int i) {
        this.L = qr4Var;
        this.M = l13Var;
        this.J = z;
        this.N = yq4Var;
        this.O = t33Var;
        this.P = tc0Var;
        this.Q = tc0Var2;
        this.K = i;
    }
}
