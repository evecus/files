package defpackage;

import com.github.mytv.dv.widget.SearchSnapshot;
import com.github.mytv.dv.widget.SearchWidget;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g30 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ g30(hx1 hx1Var, String str, boolean z, rm1 rm1Var, int i) {
        this.I = (byte) 6;
        this.M = hx1Var;
        this.K = str;
        this.J = z;
        this.L = rm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$0$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.M;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                qg5.f(this.J, (rm1) obj3, (rm1) obj5, (l13) obj4, (fe0) obj, mu0.X(433));
                break;
            case 1:
                ((Integer) obj2).getClass();
                il2.c((sb4) obj3, this.J, (String) obj5, (l13) obj4, (fe0) obj, mu0.X(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                sp0.c((hu2) obj3, this.J, (nd5) obj5, (tc0) obj4, (fe0) obj, mu0.X(3081));
                break;
            case 3:
                t33 t33Var = (t33) obj3;
                t35 t35Var = (t35) obj5;
                dn4 dn4Var = (dn4) obj4;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(1 & intValue, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    k04.r0.j(this.J, t33Var, null, t35Var, dn4Var, 0.0f, 0.0f, go1Var, 100663296, 200);
                    break;
                }
            case 4:
                provideGlance$lambda$0$0 = SearchWidget.provideGlance$lambda$0$0((fl4) obj3, this.J, (SearchSnapshot) obj5, (List) obj4, (fe0) obj, ((Integer) obj2).intValue());
                break;
            case 5:
                ((Integer) obj2).getClass();
                qm4.e((String) obj5, this.J, (rm1) obj3, (ki1) obj4, (fe0) obj, mu0.X(1));
                break;
            default:
                ((Integer) obj2).getClass();
                on5.d((hx1) obj5, (String) obj4, this.J, (rm1) obj3, (fe0) obj, mu0.X(49));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ g30(fl4 fl4Var, boolean z, SearchSnapshot searchSnapshot, List list) {
        this.I = (byte) 4;
        this.L = fl4Var;
        this.J = z;
        this.M = searchSnapshot;
        this.K = list;
    }

    public /* synthetic */ g30(Object obj, boolean z, Object obj2, Object obj3, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.J = z;
        this.M = obj2;
        this.K = obj3;
    }

    public /* synthetic */ g30(String str, boolean z, rm1 rm1Var, ki1 ki1Var, int i) {
        this.I = (byte) 5;
        this.M = str;
        this.J = z;
        this.L = rm1Var;
        this.K = ki1Var;
    }

    public /* synthetic */ g30(boolean z, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, int i) {
        this.I = (byte) 0;
        this.J = z;
        this.L = rm1Var;
        this.M = rm1Var2;
        this.K = l13Var;
    }

    public /* synthetic */ g30(boolean z, t33 t33Var, t35 t35Var, dn4 dn4Var) {
        this.I = (byte) 3;
        this.J = z;
        this.L = t33Var;
        this.M = t35Var;
        this.K = dn4Var;
    }
}
