package defpackage;

import com.github.mytv.dv.model.MixInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class lk5 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;

    public /* synthetic */ lk5(Object obj, int i, byte b) {
        this.I = b;
        this.J = obj;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                on5.m((MixInfo) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                on5.m((MixInfo) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            default:
                wi3 wi3Var = (wi3) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    x32 c = wi3Var.b.z().c(i);
                    ((ri3) c.c).b.c(aj3.a, Integer.valueOf(i - c.a), go1Var, 0);
                    break;
                }
        }
        return wd5Var;
    }
}
