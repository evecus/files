package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wm5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ View P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ ki1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm5(boolean z, boolean z2, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, View view, t43 t43Var5, t43 t43Var6, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = z2;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
        this.P = view;
        this.Q = t43Var5;
        this.R = t43Var6;
        this.S = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new wm5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((wm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            if (!this.J && this.K) {
                ta1 ta1Var = on5.a;
                t43 t43Var = this.L;
                if (!((Boolean) t43Var.getValue()).booleanValue()) {
                    t43 t43Var2 = this.M;
                    if (!((Boolean) t43Var2.getValue()).booleanValue()) {
                        t43 t43Var3 = this.N;
                        if (!((Boolean) t43Var3.getValue()).booleanValue()) {
                            t43 t43Var4 = this.O;
                            if (!((Boolean) t43Var4.getValue()).booleanValue()) {
                                this.I = true;
                                Object y0 = on5.y0(this.P, t43Var, t43Var2, t43Var4, t43Var3, this.Q, this.R, this.S, this);
                                el0 el0Var = el0.I;
                                if (y0 == el0Var) {
                                    return el0Var;
                                }
                            }
                        }
                    }
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
