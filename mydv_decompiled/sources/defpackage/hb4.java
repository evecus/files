package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hb4 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ float K;
    public final /* synthetic */ bj L;
    public final /* synthetic */ o24 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb4(float f, bj bjVar, o24 o24Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = f;
        this.L = bjVar;
        this.M = o24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        hb4 hb4Var = new hb4(this.K, this.L, this.M, fj0Var);
        hb4Var.J = obj;
        return hb4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((hb4) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            bj1 bj1Var = new bj1(this.M, (rb4) this.J, (byte) 17);
            this.I = true;
            Object b = ad4.b(0.0f, this.K, this.L, bj1Var, this, 4);
            el0 el0Var = el0.I;
            if (b == el0Var) {
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
