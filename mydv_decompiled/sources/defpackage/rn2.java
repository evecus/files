package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rn2 extends k05 implements hn1 {
    public String I;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public final /* synthetic */ byte M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ s33 Q;
    public final /* synthetic */ s33 R;
    public final /* synthetic */ List S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ s33 U;
    public final /* synthetic */ t43 V;
    public final /* synthetic */ t43 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rn2(boolean z, String str, int i, t43 t43Var, t43 t43Var2, t43 t43Var3, s33 s33Var, s33 s33Var2, List list, t43 t43Var4, s33 s33Var3, t43 t43Var5, t43 t43Var6, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = str;
        this.M = i;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = s33Var;
        this.R = s33Var2;
        this.S = list;
        this.T = t43Var4;
        this.U = s33Var3;
        this.V = t43Var5;
        this.W = t43Var6;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new rn2(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((rn2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = this.J;
        String str2 = this.L;
        t43 t43Var = this.O;
        boolean z2 = this.K;
        wd5 wd5Var = wd5.a;
        t43 t43Var2 = this.N;
        if (!z) {
            mu0.V(obj);
            if (!z2 && ((Boolean) t43Var2.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                byte b = this.M;
                if (b < 1) {
                    b = 1;
                }
                this.I = str2;
                this.J = true;
                Object n = rt0.n(b * 1000, this);
                el0 el0Var = el0.I;
                if (n == el0Var) {
                    return el0Var;
                }
                str = str2;
            }
            return wd5Var;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.I;
        mu0.V(obj);
        if (j42.c(str, str2) && !z2 && ((Boolean) t43Var2.getValue()).booleanValue()) {
            t43 t43Var3 = this.P;
            if (!((Boolean) t43Var3.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                Boolean bool = Boolean.FALSE;
                t43Var2.setValue(bool);
                gk3 gk3Var = (gk3) this.Q;
                if (gk3Var.h() < 3) {
                    gk3Var.i(gk3Var.h() + 1);
                    gk3 gk3Var2 = (gk3) this.R;
                    gk3Var2.i(gk3Var2.h() + 1);
                    t43Var3.setValue(bool);
                    return wd5Var;
                }
                un2.g(this.S, this.T, this.U, t43Var2, this.P, this.V, t43Var, this.W, ho2.J, "加载超时");
            }
        }
        return wd5Var;
    }
}
