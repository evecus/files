package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yo2 extends k05 implements hn1 {
    public final /* synthetic */ int I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ ki1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo2(int i, t43 t43Var, t43 t43Var2, dl0 dl0Var, t43 t43Var3, t43 t43Var4, t43 t43Var5, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = i;
        this.J = t43Var;
        this.K = t43Var2;
        this.L = dl0Var;
        this.M = t43Var3;
        this.N = t43Var4;
        this.O = t43Var5;
        this.P = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new yo2(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        yo2 yo2Var = (yo2) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        yo2Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        if (this.I > 0) {
            t43 t43Var = this.J;
            if (!((Boolean) t43Var.getValue()).booleanValue() && !((List) this.K.getValue()).isEmpty()) {
                qg5.y(this.L, this.M, this.N, t43Var, this.O, this.P);
            }
        }
        return wd5.a;
    }
}
