package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class an5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ long J;
    public final /* synthetic */ n24 K;
    public final /* synthetic */ n24 L;
    public final /* synthetic */ n24 M;
    public final /* synthetic */ q24 N;
    public final /* synthetic */ q05 O;
    public final /* synthetic */ rm1 P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an5(long j, n24 n24Var, n24 n24Var2, n24 n24Var3, q24 q24Var, q05 q05Var, rm1 rm1Var, boolean z, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = j;
        this.K = n24Var;
        this.L = n24Var2;
        this.M = n24Var3;
        this.N = q24Var;
        this.O = q05Var;
        this.P = rm1Var;
        this.Q = z;
        this.R = t43Var;
        this.S = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new an5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((an5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        rm1 rm1Var;
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            this.I = true;
            Object n = rt0.n(this.J, this);
            el0 el0Var = el0.I;
            if (n == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        if (!this.K.I && !this.L.I) {
            this.M.I = true;
            if (Float.intBitsToFloat((int) (this.N.I >> 32)) >= ((int) (this.O.M.S >> 32)) / 3.0f || (rm1Var = this.P) == null) {
                on5.A0(this.Q, this.R, this.S);
            } else {
                rm1Var.invoke();
            }
        }
        return wd5.a;
    }
}
