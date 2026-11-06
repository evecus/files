package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ce4 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ float K;

    public ce4(List list, tm1 tm1Var, float f) {
        this.I = list;
        this.J = tm1Var;
        this.K = f;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        zd2 zd2Var = (zd2) obj;
        int intValue = ((Number) obj2).intValue();
        fe0 fe0Var = (fe0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        int i = (intValue2 & 6) == 0 ? (((go1) fe0Var).g(zd2Var) ? 4 : 2) | intValue2 : intValue2;
        if ((intValue2 & 48) == 0) {
            i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 147) != 146)) {
            List<cd4> list = (List) this.I.get(intValue);
            go1Var.d0(1518687202);
            i13 i13Var = i13.a;
            l13 j = wx5.j(nq4.e(i13Var, 1.0f));
            k74 k74Var = he4.a;
            u74 a = t74.a(new kp(12.0f, true, new y9()), q8.S, go1Var, 6);
            long j2 = go1Var.T;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, j);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            go1Var.d0(-1624078293);
            for (cd4 cd4Var : list) {
                go1Var.a0(226404736, cd4Var.a);
                Aweme aweme = cd4Var.b;
                float r = he4.r(aweme);
                tm1 tm1Var = this.J;
                boolean g = go1Var.g(tm1Var) | go1Var.i(aweme);
                Object Q = go1Var.Q();
                if (g || Q == de0.a) {
                    Q = new yd4(tm1Var, aweme, (byte) 1);
                    go1Var.o0(Q);
                }
                rm1 rm1Var = (rm1) Q;
                float f = (132.0f * r) + 16.0f;
                float f2 = this.K;
                if (f > f2) {
                    f = f2;
                }
                eu5.c(aweme, rm1Var, nq4.b(nq4.n(i13Var, f), 1.0f), r, null, false, false, false, 0L, 0L, go1Var, Aweme.$stable, 2032);
                go1Var.q(false);
            }
            r7.J(go1Var, false, true, false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
