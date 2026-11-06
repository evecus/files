package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class je4 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ tm1 K;

    public /* synthetic */ je4(List list, tm1 tm1Var, int i, byte b) {
        this.I = b;
        this.J = list;
        this.K = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.K;
        List list = this.J;
        fe0 fe0Var = (fe0) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qe4.t(list, tm1Var, fe0Var, mu0.X(1));
                break;
            case 1:
                qe4.b(list, tm1Var, fe0Var, mu0.X(1));
                break;
            default:
                qe4.r(list, tm1Var, fe0Var, mu0.X(1));
                break;
        }
        return wd5Var;
    }
}
