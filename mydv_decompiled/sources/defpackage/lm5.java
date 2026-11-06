package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lm5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ ag2 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Boolean M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ rm1 O;
    public final /* synthetic */ rm1 P;
    public final /* synthetic */ rm1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm5(ag2 ag2Var, boolean z, boolean z2, Boolean bool, t43 t43Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = ag2Var;
        this.K = z;
        this.L = z2;
        this.M = bool;
        this.N = t43Var;
        this.O = rm1Var;
        this.P = rm1Var2;
        this.Q = rm1Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new lm5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((lm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            zf1 p = o7.p(wi4.w(new sh2(this.J, this.K, this.L, this.M, this.N)));
            kh1 kh1Var = new kh1(this.O, this.P, this.Q, (byte) 3);
            this.I = true;
            Object collect = p.collect(kh1Var, this);
            el0 el0Var = el0.I;
            if (collect == el0Var) {
                return el0Var;
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
