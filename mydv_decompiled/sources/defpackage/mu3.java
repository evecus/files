package defpackage;

import com.github.mytv.dv.model.Author;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mu3 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ hu2 K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ cw4 M;
    public final /* synthetic */ t43 N;

    public mu3(List list, ki1 ki1Var, hu2 hu2Var, rm1 rm1Var, cw4 cw4Var, t43 t43Var) {
        this.I = list;
        this.J = ki1Var;
        this.K = hu2Var;
        this.L = rm1Var;
        this.M = cw4Var;
        this.N = t43Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zd2 zd2Var = (zd2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((go1) fe0Var).g(zd2Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            dl4 dl4Var = (dl4) this.I.get(intValue);
            go1Var.d0(-2119072954);
            Author author = (Author) ((Map) this.M.getValue()).get(dl4Var.a);
            ki1 ki1Var = intValue == 0 ? this.J : null;
            boolean i2 = go1Var.i(dl4Var);
            hu2 hu2Var = this.K;
            boolean i3 = i2 | go1Var.i(hu2Var);
            rm1 rm1Var = this.L;
            boolean g = i3 | go1Var.g(rm1Var);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new lu3(dl4Var, hu2Var, rm1Var, this.N);
                go1Var.o0(Q);
            }
            j16.f(dl4Var, author, ki1Var, (rm1) Q, go1Var, Author.$stable << 3);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
