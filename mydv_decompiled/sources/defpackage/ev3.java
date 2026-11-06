package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev3 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ rm1 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ dn1 O;
    public final /* synthetic */ tm1 P;

    public /* synthetic */ ev3(String str, List list, List list2, tm1 tm1Var, rm1 rm1Var, tm1 tm1Var2, l13 l13Var, int i) {
        this.I = (byte) 2;
        this.K = str;
        this.J = list;
        this.L = list2;
        this.P = tm1Var;
        this.M = rm1Var;
        this.O = tm1Var2;
        this.N = l13Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        dn1 dn1Var = this.O;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(49);
                mw3.i(this.J, (ki1) obj5, (ki1) obj4, this.M, (gu3) obj3, (rm1) dn1Var, this.P, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(49);
                mw3.i(this.J, (ki1) obj5, (ki1) obj4, this.M, (gu3) obj3, (rm1) dn1Var, this.P, (fe0) obj, X2);
                break;
            default:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(1);
                he4.d((String) obj5, this.J, (List) obj4, this.P, this.M, (tm1) dn1Var, (l13) obj3, (fe0) obj, X3);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ev3(List list, ki1 ki1Var, ki1 ki1Var2, rm1 rm1Var, gu3 gu3Var, rm1 rm1Var2, tm1 tm1Var, int i, byte b) {
        this.I = b;
        this.J = list;
        this.K = ki1Var;
        this.L = ki1Var2;
        this.M = rm1Var;
        this.N = gu3Var;
        this.O = rm1Var2;
        this.P = tm1Var;
    }
}
