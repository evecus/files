package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s30 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(boolean z, boolean z2, boolean z3, t43 t43Var, s33 s33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = z2;
        this.L = z3;
        this.M = t43Var;
        this.N = s33Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                return new s30(this.J, this.K, this.L, (t43) obj3, (s33) obj2, fj0Var);
            default:
                return new s30(fj0Var, (tm1) obj2, (a74) obj3, this.K, this.L);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((s30) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
            default:
                return ((s30) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                s33 s33Var = (s33) obj2;
                t43 t43Var = (t43) obj3;
                mu0.V(obj);
                if (this.J && this.K && !this.L && !((Boolean) t43Var.getValue()).booleanValue()) {
                    t43Var.setValue(Boolean.TRUE);
                    gk3 gk3Var = (gk3) s33Var;
                    gk3Var.i(gk3Var.h() + 1);
                }
                return wd5.a;
            default:
                boolean z = this.J;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                a74 a74Var = (a74) obj3;
                boolean z2 = this.L;
                boolean z3 = this.K;
                zm0 zm0Var = new zm0(null, (tm1) obj2, a74Var, z2, z3);
                this.J = true;
                Object q = a74Var.q(z3, zm0Var, this);
                el0 el0Var = el0.I;
                return q == el0Var ? el0Var : q;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(fj0 fj0Var, tm1 tm1Var, a74 a74Var, boolean z, boolean z2) {
        super(2, fj0Var);
        this.M = a74Var;
        this.K = z;
        this.L = z2;
        this.N = tm1Var;
    }
}
