package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j40 implements rm1 {
    public final /* synthetic */ Aweme I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ s33 R;
    public final /* synthetic */ s33 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ s33 U;
    public final /* synthetic */ t43 V;

    public j40(Aweme aweme, tm1 tm1Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, s33 s33Var, s33 s33Var2, t43 t43Var8, s33 s33Var3, t43 t43Var9) {
        this.I = aweme;
        this.J = tm1Var;
        this.K = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.N = t43Var4;
        this.O = t43Var5;
        this.P = t43Var6;
        this.Q = t43Var7;
        this.R = s33Var;
        this.S = s33Var2;
        this.T = t43Var8;
        this.U = s33Var3;
        this.V = t43Var9;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        String str = (String) this.K.getValue();
        Aweme aweme = this.I;
        if (str != null) {
            Aweme aweme2 = (Aweme) this.L.getValue();
            if (j42.c(aweme2 != null ? aweme2.getAwemeId() : null, aweme.getAwemeId())) {
                qg5.q(this.M, this.N, this.O, this.P, this.Q, this.K, this.R, this.S, this.T, this.U, this.V);
                return wd5.a;
            }
        }
        this.J.invoke(aweme);
        return wd5.a;
    }
}
