package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ tm1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu1(tm1 tm1Var, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.K = tm1Var;
        this.J = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        tm1 tm1Var = this.K;
        switch (b) {
            case 0:
                return new mu1(tm1Var, this.J, fj0Var);
            case 1:
                return new mu1((byte) 1, fj0Var, tm1Var);
            default:
                return new mu1((byte) 2, fj0Var, tm1Var);
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
                ((mu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return ((mu1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                mu0.V(obj);
                tm1Var.invoke(Boolean.valueOf(this.J));
                break;
            case 1:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.J = true;
                    if (tm1Var.invoke(this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    if (tm1Var.invoke(this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu1(byte b, fj0 fj0Var, tm1 tm1Var) {
        super(2, fj0Var);
        this.I = b;
        this.K = tm1Var;
    }
}
