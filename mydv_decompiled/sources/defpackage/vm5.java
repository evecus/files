package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vm5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ View M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ ki1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm5(boolean z, int i, boolean z2, View view, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = i;
        this.L = z2;
        this.M = view;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = t43Var4;
        this.R = t43Var5;
        this.S = t43Var6;
        this.T = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new vm5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((vm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            if (!this.J && this.K > 0 && this.L) {
                this.I = true;
                Object y0 = on5.y0(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this);
                el0 el0Var = el0.I;
                if (y0 == el0Var) {
                    return el0Var;
                }
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5.a;
    }
}
