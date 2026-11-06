package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cu1 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ cu1(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.J = z;
        this.M = obj2;
        this.N = obj3;
        this.O = obj4;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                i42.V((b83) obj6, this.J, (ki1) obj5, (rm1) obj4, (rm1) obj3, (fe0) obj, X);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int X2 = mu0.X(i | 1);
                t05.b((l13) obj6, this.J, (s05) obj5, (t33) obj4, (dn4) obj3, (fe0) obj, X2);
                break;
            default:
                ((Integer) obj2).getClass();
                int X3 = mu0.X(i | 1);
                on5.z((Aweme) obj6, this.J, (Integer) obj5, (rm1) obj4, (l13) obj3, (fe0) obj, X3);
                break;
        }
        return wd5Var;
    }
}
