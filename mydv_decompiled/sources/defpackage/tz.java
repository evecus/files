package defpackage;

import com.materialkolor.DynamicMaterialThemeKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tz implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    public /* synthetic */ tz(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, int i2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = z;
        this.N = obj4;
        this.O = obj5;
        this.P = i;
        this.Q = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        int i = this.Q;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                a5.b((String) obj7, (d6) obj6, (lq1) obj5, this.M, (l65) obj4, (rz) obj3, this.P, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                a5.c((String) obj7, (d6) obj6, (lq1) obj5, this.M, (l65) obj4, (rz) obj3, this.P, (fe0) obj, X2);
                break;
            default:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(this.P | 1);
                DynamicMaterialThemeKt.DynamicMaterialTheme((h51) obj7, (hn4) obj6, (lc5) obj5, this.M, (ve1) obj4, (hn1) obj3, (fe0) obj, X3, this.Q);
                break;
        }
        return wd5Var;
    }
}
