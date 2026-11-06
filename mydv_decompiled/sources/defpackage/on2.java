package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class on2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ pq5 K;
    public final /* synthetic */ t43 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on2(pq5 pq5Var, t43 t43Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = pq5Var;
        this.L = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        t43 t43Var = this.L;
        pq5 pq5Var = this.K;
        switch (b) {
            case 0:
                return new on2(pq5Var, t43Var, fj0Var, (byte) 0);
            default:
                return new on2(pq5Var, t43Var, fj0Var, (byte) 1);
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
        return ((on2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        pq5 pq5Var = this.K;
        el0 el0Var = el0.I;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    zf1 p = o7.p(wi4.w(new mn2(pq5Var, (byte) 0)));
                    nn2 nn2Var = new nn2(t43Var, (byte) 0);
                    this.J = true;
                    if (p.collect(nn2Var, this) == el0Var) {
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
                    zf1 p2 = o7.p(wi4.w(new mn2(pq5Var, (byte) 2)));
                    nn2 nn2Var2 = new nn2(t43Var, b2);
                    this.J = true;
                    if (p2.collect(nn2Var2, this) == el0Var) {
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
