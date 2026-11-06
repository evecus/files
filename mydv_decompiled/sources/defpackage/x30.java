package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x30 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ s33 L;

    public x30(List list, boolean z, tm1 tm1Var, s33 s33Var) {
        this.I = list;
        this.J = z;
        this.K = tm1Var;
        this.L = s33Var;
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
        boolean z = true;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            b50 b50Var = (b50) this.I.get(intValue);
            go1Var.d0(-1485149736);
            boolean z2 = this.J;
            jp jpVar = de0.a;
            s33 s33Var = this.L;
            tm1 tm1Var = this.K;
            if (z2) {
                go1Var.d0(-1485144932);
                String str = b50Var.a;
                boolean z3 = intValue == ((gk3) s33Var).h();
                boolean g = ((((i & 112) ^ 48) > 32 && go1Var.e(intValue)) || (i & 48) == 32) | go1Var.g(tm1Var);
                Object Q = go1Var.Q();
                if (g || Q == jpVar) {
                    Q = new u30(tm1Var, intValue, (byte) 1);
                    go1Var.o0(Q);
                }
                qg5.k(str, z3, (rm1) Q, go1Var, 0);
                go1Var.q(false);
            } else {
                go1Var.d0(-1484896033);
                String str2 = b50Var.a;
                boolean z4 = intValue == ((gk3) s33Var).h();
                boolean g2 = go1Var.g(tm1Var);
                if ((((i & 112) ^ 48) <= 32 || !go1Var.e(intValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z5 = g2 | z;
                Object Q2 = go1Var.Q();
                if (z5 || Q2 == jpVar) {
                    Q2 = new u30(tm1Var, intValue, (byte) 2);
                    go1Var.o0(Q2);
                }
                qg5.h(str2, z4, (rm1) Q2, go1Var, 0);
                go1Var.q(false);
            }
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
