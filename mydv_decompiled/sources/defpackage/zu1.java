package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zu1 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ ab4 J;
    public final /* synthetic */ List K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ rm1 M;

    public zu1(List list, ab4 ab4Var, List list2, tm1 tm1Var, rm1 rm1Var) {
        this.I = list;
        this.J = ab4Var;
        this.K = list2;
        this.L = tm1Var;
        this.M = rm1Var;
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
            b83 b83Var = (b83) this.I.get(intValue);
            go1Var.d0(2087798782);
            ab4 ab4Var = b83Var.b;
            int i2 = ab4Var == null ? -1 : av1.a[ab4Var.ordinal()];
            ab4 ab4Var2 = this.J;
            boolean z = i2 != 1 ? ab4Var2 == b83Var.b : ab4Var2 == ab4.N || ab4Var2 == ab4.O;
            ki1 ki1Var = (ki1) this.K.get(intValue);
            Object obj5 = this.L;
            boolean g = go1Var.g(obj5) | go1Var.g(b83Var);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new yu1(obj5, b83Var, (byte) 0);
                go1Var.o0(Q);
            }
            i42.V(b83Var, z, ki1Var, (rm1) Q, this.M, go1Var, 0);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
