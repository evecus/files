package defpackage;

import com.github.mytv.dv.model.HotWord;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class su3 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ su3(int i, HotWord hotWord, rm1 rm1Var, int i2) {
        this.J = i;
        this.L = hotWord;
        this.M = rm1Var;
        this.K = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj3 = this.M;
        Object obj4 = this.L;
        int i2 = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                mw3.r((hu2) obj4, (l13) obj3, i2, (fe0) obj, mu0.X(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                qe4.c(i2, (HotWord) obj4, (rm1) obj3, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ su3(hu2 hu2Var, l13 l13Var, int i, int i2) {
        this.L = hu2Var;
        this.M = l13Var;
        this.J = i;
        this.K = i2;
    }
}
