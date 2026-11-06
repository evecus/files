package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g40 extends k05 implements hn1 {
    public String I;
    public boolean J;
    public final /* synthetic */ String K;
    public final /* synthetic */ byte L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ s33 P;
    public final /* synthetic */ s33 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g40(String str, int i, t43 t43Var, t43 t43Var2, t43 t43Var3, s33 s33Var, s33 s33Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = str;
        this.L = i;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = s33Var;
        this.Q = s33Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new g40(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((g40) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = this.J;
        String str2 = this.K;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.N;
        t43 t43Var2 = this.M;
        if (!z) {
            mu0.V(obj);
            if (((Boolean) t43Var2.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                byte b = this.L;
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
        if (j42.c(str, str2) && ((Boolean) t43Var2.getValue()).booleanValue()) {
            t43 t43Var3 = this.O;
            if (!((Boolean) t43Var3.getValue()).booleanValue() && ((String) t43Var.getValue()) == null) {
                Boolean bool = Boolean.FALSE;
                t43Var2.setValue(bool);
                gk3 gk3Var = (gk3) this.P;
                if (gk3Var.h() < 3) {
                    gk3Var.i(gk3Var.h() + 1);
                    gk3 gk3Var2 = (gk3) this.Q;
                    gk3Var2.i(gk3Var2.h() + 1);
                    t43Var3.setValue(bool);
                    return wd5Var;
                }
                t43Var.setValue("加载超时");
            }
        }
        return wd5Var;
    }
}
