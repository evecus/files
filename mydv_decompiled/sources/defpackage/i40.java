package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i40 implements tm1 {
    public final /* synthetic */ Aweme I;
    public final /* synthetic */ dl0 J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ fy O;

    public i40(Aweme aweme, dl0 dl0Var, tm1 tm1Var, int i, t43 t43Var, t43 t43Var2, fy fyVar) {
        this.I = aweme;
        this.J = dl0Var;
        this.K = tm1Var;
        this.L = i;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = fyVar;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        oi1 oi1Var = (oi1) obj;
        oi1Var.getClass();
        boolean b = oi1Var.b();
        t43 t43Var = this.N;
        Aweme aweme = this.I;
        t43 t43Var2 = this.M;
        if (b) {
            t43Var2.setValue(aweme);
            t43Var.setValue(Boolean.TRUE);
            p70.g0(this.J, null, null, new h40(this.O, (fj0) null, (byte) 0), 3);
            this.K.invoke(Integer.valueOf(this.L));
        } else {
            Aweme aweme2 = (Aweme) t43Var2.getValue();
            if (j42.c(aweme2 != null ? aweme2.getAwemeId() : null, aweme.getAwemeId())) {
                t43Var.setValue(Boolean.FALSE);
            }
        }
        return wd5.a;
    }
}
