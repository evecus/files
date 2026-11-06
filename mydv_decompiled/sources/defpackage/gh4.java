package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gh4 extends k05 implements tm1 {
    public boolean I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ jh4 L;
    public final /* synthetic */ ea5 M;
    public final /* synthetic */ float N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh4(Object obj, Object obj2, jh4 jh4Var, ea5 ea5Var, float f, fj0 fj0Var) {
        super(1, fj0Var);
        this.J = obj;
        this.K = obj2;
        this.L = jh4Var;
        this.M = ea5Var;
        this.N = f;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new gh4(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        return ((gh4) create((fj0) obj)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            fh4 fh4Var = new fh4(this.J, this.K, this.L, this.M, this.N, null);
            this.I = true;
            Object o0 = i42.o0(fh4Var, this);
            el0 el0Var = el0.I;
            if (o0 == el0Var) {
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
