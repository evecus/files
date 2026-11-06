package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu1 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ String J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ eu1(t43 t43Var, String str, ki1 ki1Var, hu2 hu2Var, t43 t43Var2, t43 t43Var3) {
        this.K = t43Var;
        this.J = str;
        this.N = ki1Var;
        this.O = hu2Var;
        this.L = t43Var2;
        this.M = t43Var3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 wd5Var;
        long j;
        byte b = this.I;
        wd5 wd5Var2 = wd5.a;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (b) {
            case 0:
                t43 t43Var = (t43) obj7;
                ki1 ki1Var = (ki1) obj4;
                hu2 hu2Var = (hu2) obj3;
                t43 t43Var2 = (t43) obj6;
                t43 t43Var3 = (t43) obj5;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    k74 a = l74.a(16.0f);
                    i51 i51Var = lw2.b;
                    long j2 = ((fw2) go1Var.k(i51Var)).a.H;
                    long b2 = q80.b(j2, go1Var);
                    long j3 = x70.g;
                    long c = x70.c(b2, 0.38f);
                    k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
                    u10 u10Var = k80Var.W;
                    if (u10Var == null) {
                        l80 l80Var = j16.P;
                        wd5Var = wd5Var2;
                        j = j2;
                        u10Var = new u10(q80.d(k80Var, l80Var), q80.a(k80Var, q80.d(k80Var, l80Var)), qb.A(x70.c(q80.d(k80Var, j16.Q), j16.R), q80.d(k80Var, l80Var)), x70.c(q80.a(k80Var, q80.d(k80Var, l80Var)), 0.38f));
                        k80Var.W = u10Var;
                    } else {
                        wd5Var = wd5Var2;
                        j = j2;
                    }
                    long j4 = j != 16 ? j : u10Var.a;
                    if (b2 == 16) {
                        b2 = u10Var.b;
                    }
                    long j5 = b2;
                    if (j3 == 16) {
                        j3 = u10Var.c;
                    }
                    c5.c(nq4.n(i13.a, 180.0f), a, new u10(j4, j5, j3, c != 16 ? c : u10Var.d), new w10((62 & 1) != 0 ? 0.0f : 8.0f, j16.T, j16.S), p70.u0(1194183651, new fu1(t43Var, this.J, ki1Var, hu2Var, t43Var2, t43Var3), go1Var), go1Var, 196614);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                mw3.v((List) obj7, (Map) obj6, this.J, (tn5) obj5, (rm1) obj4, (tm1) obj3, (fe0) obj, mu0.X(24577));
                break;
        }
        return wd5Var2;
    }

    public /* synthetic */ eu1(List list, Map map, String str, tn5 tn5Var, rm1 rm1Var, tm1 tm1Var, int i) {
        this.K = list;
        this.L = map;
        this.J = str;
        this.M = tn5Var;
        this.N = rm1Var;
        this.O = tm1Var;
    }
}
