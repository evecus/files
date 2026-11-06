package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m40 implements jn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ List K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ dl0 M;
    public final /* synthetic */ fy N;
    public final /* synthetic */ int O;
    public final /* synthetic */ tm1 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ t43 U;
    public final /* synthetic */ t43 V;
    public final /* synthetic */ t43 W;
    public final /* synthetic */ t43 X;
    public final /* synthetic */ s33 Y;
    public final /* synthetic */ s33 Z;
    public final /* synthetic */ t43 a0;
    public final /* synthetic */ s33 b0;
    public final /* synthetic */ t43 c0;

    public m40(List list, ki1 ki1Var, List list2, tm1 tm1Var, dl0 dl0Var, fy fyVar, int i, tm1 tm1Var2, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, s33 s33Var, s33 s33Var2, t43 t43Var9, s33 s33Var3, t43 t43Var10) {
        this.I = list;
        this.J = ki1Var;
        this.K = list2;
        this.L = tm1Var;
        this.M = dl0Var;
        this.N = fyVar;
        this.O = i;
        this.P = tm1Var2;
        this.Q = t43Var;
        this.R = t43Var2;
        this.S = t43Var3;
        this.T = t43Var4;
        this.U = t43Var5;
        this.V = t43Var6;
        this.W = t43Var7;
        this.X = t43Var8;
        this.Y = s33Var;
        this.Z = s33Var2;
        this.a0 = t43Var9;
        this.b0 = s33Var3;
        this.c0 = t43Var10;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ki1 ki1Var;
        t43 t43Var;
        l13 l13Var;
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
            Aweme aweme = (Aweme) this.I.get(intValue);
            go1Var.d0(838500440);
            if (intValue != 0 || (ki1Var = this.J) == null) {
                ki1Var = (ki1) o70.V0(intValue, this.K);
            }
            long j = x70.f;
            l13 l13Var2 = i13.a;
            l13 n = nq4.n(l13Var2, 200.0f);
            if (ki1Var != null) {
                l13Var2 = j42.x(l13Var2, ki1Var);
            }
            l13 then = n.then(l13Var2);
            boolean i2 = go1Var.i(aweme) | go1Var.i(this.M) | go1Var.i(this.N) | go1Var.g(this.L) | go1Var.e(this.O);
            Object Q = go1Var.Q();
            t43 t43Var2 = this.Q;
            jp jpVar = de0.a;
            if (i2 || Q == jpVar) {
                t43Var = t43Var2;
                Q = new i40(aweme, this.M, this.L, this.O, t43Var, this.R, this.N);
                go1Var.o0(Q);
            } else {
                t43Var = t43Var2;
            }
            l13 A0 = i42.A0(then, (tm1) Q);
            boolean i3 = go1Var.i(aweme) | go1Var.g(this.P);
            Object Q2 = go1Var.Q();
            if (i3 || Q2 == jpVar) {
                l13Var = A0;
                Q2 = new j40(aweme, this.P, this.S, t43Var, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0);
                go1Var.o0(Q2);
            } else {
                l13Var = A0;
            }
            eu5.c(aweme, (rm1) Q2, l13Var, 1.7692307f, null, false, false, false, 0L, j, go1Var, Aweme.$stable | 805506048, 1488);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
