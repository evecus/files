package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u40 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ x40 L;
    public final /* synthetic */ ag1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(x40 x40Var, ag1 ag1Var, Object obj, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = x40Var;
        this.M = ag1Var;
        this.K = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        ag1 ag1Var = this.M;
        x40 x40Var = this.L;
        switch (b) {
            case 0:
                return new u40(x40Var, ag1Var, this.K, fj0Var);
            default:
                u40 u40Var = new u40(x40Var, ag1Var, fj0Var);
                u40Var.K = obj;
                return u40Var;
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
        return ((u40) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ag1 ag1Var = this.M;
        x40 x40Var = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    in1 in1Var = x40Var.M;
                    Object obj2 = this.K;
                    this.J = true;
                    if (in1Var.invoke(ag1Var, obj2, this) == el0Var) {
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
                dl0 dl0Var = (dl0) this.K;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    r24 r24Var = new r24();
                    zf1 zf1Var = x40Var.L;
                    w40 w40Var = new w40(r24Var, dl0Var, x40Var, ag1Var);
                    this.K = null;
                    this.J = true;
                    if (zf1Var.collect(w40Var, this) == el0Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(x40 x40Var, ag1 ag1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = x40Var;
        this.M = ag1Var;
    }
}
