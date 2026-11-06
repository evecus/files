package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class di0 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ ei0 K;
    public final /* synthetic */ bf5 L;
    public final /* synthetic */ oy M;
    public final /* synthetic */ long N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(ei0 ei0Var, bf5 bf5Var, oy oyVar, long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = ei0Var;
        this.L = bf5Var;
        this.M = oyVar;
        this.N = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        di0 di0Var = new di0(this.K, this.L, this.M, this.N, fj0Var);
        di0Var.J = obj;
        return di0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((di0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        ei0 ei0Var = this.K;
        cy cyVar = ei0Var.N;
        boolean z = this.I;
        try {
            try {
                if (!z) {
                    mu0.V(obj);
                    v52 x = vt0.x(((dl0) this.J).getCoroutineContext());
                    ei0Var.Q = true;
                    oc4 oc4Var = ei0Var.J;
                    d53 d53Var = d53.I;
                    ci0 ci0Var = new ci0(this.L, ei0Var, this.M, this.N, x, null);
                    this.I = true;
                    Object g = oc4Var.g(d53Var, ci0Var, this);
                    el0 el0Var = el0.I;
                    if (g == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                cyVar.b();
                ei0Var.Q = false;
                cyVar.a(null);
                ei0Var.O = false;
                return wd5.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            ei0Var.Q = false;
            cyVar.a(null);
            ei0Var.O = false;
            throw th;
        }
    }
}
