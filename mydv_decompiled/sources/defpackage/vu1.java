package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ bh K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu1(bh bhVar, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = bhVar;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new vu1(this.K, fj0Var, (byte) 0);
            default:
                return new vu1(this.K, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((vu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    Float f = new Float(1.0f);
                    qb5 k0 = qb.k0(200, 6, null);
                    this.J = true;
                    if (bh.a(this.K, f, k0, null, null, this, 12) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    Float f2 = new Float(0.0f);
                    qb5 k02 = qb.k0(200, 6, null);
                    this.J = true;
                    if (bh.a(this.K, f2, k02, null, null, this, 12) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
        }
        return el0Var;
    }
}
