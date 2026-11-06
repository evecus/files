package defpackage;

import com.github.mytv.dv.model.Author;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj0 implements hn1 {
    public final /* synthetic */ byte I = 2;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ bj0(rm1 rm1Var, boolean z, String str, String str2, tm1 tm1Var, tc0 tc0Var, int i) {
        this.K = rm1Var;
        this.J = z;
        this.M = str;
        this.N = str2;
        this.O = tm1Var;
        this.P = tc0Var;
        this.L = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        Object obj7 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                cj0.c((String) obj6, this.J, (xi0) obj5, (l13) obj4, (in1) obj3, (rm1) obj7, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int X2 = mu0.X(i | 1);
                a5.g(this.J, (List) obj6, (tm1) obj5, (tm1) obj4, (tm1) obj3, (rm1) obj7, (fe0) obj, X2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(i | 1);
                i42.W((Author) obj6, this.J, (ki1) obj5, (hu2) obj4, (rm1) obj7, (rm1) obj3, (fe0) obj, X3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int X4 = mu0.X(i | 1);
                qm4.a((String) obj6, (String) obj5, (String) obj3, (cy3) obj7, this.J, (l13) obj4, (fe0) obj, X4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int X5 = mu0.X(i | 1);
                or4.d((l13) obj4, (qr4) obj6, this.J, (t33) obj5, (tc0) obj3, (tc0) obj7, (fe0) obj, X5);
                break;
            default:
                ((Integer) obj2).getClass();
                int X6 = mu0.X(i | 1);
                on5.i((rm1) obj7, this.J, (String) obj6, (String) obj5, (tm1) obj4, (tc0) obj3, (fe0) obj, X6);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ bj0(l13 l13Var, qr4 qr4Var, boolean z, t33 t33Var, tc0 tc0Var, tc0 tc0Var2, int i) {
        this.O = l13Var;
        this.M = qr4Var;
        this.J = z;
        this.N = t33Var;
        this.P = tc0Var;
        this.K = tc0Var2;
        this.L = i;
    }

    public /* synthetic */ bj0(Author author, boolean z, ki1 ki1Var, hu2 hu2Var, rm1 rm1Var, rm1 rm1Var2, int i) {
        this.M = author;
        this.J = z;
        this.N = ki1Var;
        this.O = hu2Var;
        this.K = rm1Var;
        this.P = rm1Var2;
        this.L = i;
    }

    public /* synthetic */ bj0(String str, String str2, String str3, cy3 cy3Var, boolean z, l13 l13Var, int i) {
        this.M = str;
        this.N = str2;
        this.P = str3;
        this.K = cy3Var;
        this.J = z;
        this.O = l13Var;
        this.L = i;
    }

    public /* synthetic */ bj0(String str, boolean z, xi0 xi0Var, l13 l13Var, in1 in1Var, rm1 rm1Var, int i) {
        this.M = str;
        this.J = z;
        this.N = xi0Var;
        this.O = l13Var;
        this.P = in1Var;
        this.K = rm1Var;
        this.L = i;
    }

    public /* synthetic */ bj0(boolean z, List list, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, rm1 rm1Var, int i) {
        this.J = z;
        this.M = list;
        this.N = tm1Var;
        this.O = tm1Var2;
        this.P = tm1Var3;
        this.K = rm1Var;
        this.L = i;
    }
}
