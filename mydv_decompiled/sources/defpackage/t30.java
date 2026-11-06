package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t30 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ jj3 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t30(jj3 jj3Var, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = jj3Var;
        this.L = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new t30(this.K, this.L, fj0Var, (byte) 0);
            default:
                return new t30(this.K, this.L, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((t30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((t30) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object f;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.L;
        el0 el0Var = el0.I;
        jj3 jj3Var = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    f = jj3Var.f(i, qb.g0(0.0f, 0.0f, null, 7), this);
                    return f == el0Var ? el0Var : wd5Var;
                }
                if (z) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    if (jj3Var.i(this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                jj3Var.u(jj3Var.j(i), 0.0f, true);
                return wd5Var;
        }
    }
}
