package defpackage;

import com.github.mytv.dv.widget.MixSnapshot;
import com.github.mytv.dv.widget.MixWidget;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yl2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ yl2(fl4 fl4Var, boolean z, MixSnapshot mixSnapshot, List list, boolean z2, List list2) {
        this.I = (byte) 1;
        this.L = fl4Var;
        this.J = z;
        this.M = mixSnapshot;
        this.N = list;
        this.K = z2;
        this.O = list2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wd5 provideGlance$lambda$1$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(385);
                eu5.j((go2) obj6, this.J, this.K, (ki1) obj5, (rm1) obj4, (rm1) obj3, (fe0) obj, X);
                return wd5Var;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                provideGlance$lambda$1$0 = MixWidget.provideGlance$lambda$1$0((fl4) obj6, this.J, (MixSnapshot) obj5, (List) obj4, this.K, (List) obj3, (fe0) obj, intValue);
                return provideGlance$lambda$1$0;
            default:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(1);
                he4.e((List) obj6, this.J, this.K, (ag2) obj5, (rm1) obj4, (tm1) obj3, (fe0) obj, X2);
                return wd5Var;
        }
    }

    public /* synthetic */ yl2(Object obj, boolean z, boolean z2, Object obj2, rm1 rm1Var, dn1 dn1Var, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.J = z;
        this.K = z2;
        this.M = obj2;
        this.N = rm1Var;
        this.O = dn1Var;
    }
}
