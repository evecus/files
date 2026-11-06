package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o31 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ long K;
    public /* synthetic */ Object L;
    public final /* synthetic */ k13 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(hq4 hq4Var, long j, jq4 jq4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = hq4Var;
        this.K = j;
        this.M = jq4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        k13 k13Var = this.M;
        switch (b) {
            case 0:
                o31 o31Var = new o31((p31) k13Var, this.K, fj0Var);
                o31Var.L = obj;
                return o31Var;
            default:
                return new o31((hq4) this.L, this.K, (jq4) k13Var, fj0Var);
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
        return ((o31) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object a;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        long j = this.K;
        el0 el0Var = el0.I;
        k13 k13Var = this.M;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                dl0 dl0Var = (dl0) this.L;
                in1 in1Var = ((p31) k13Var).f0;
                pd3 pd3Var = new pd3(j);
                this.J = true;
                return in1Var.invoke(dl0Var, pd3Var, this) == el0Var ? el0Var : wd5Var;
            default:
                jq4 jq4Var = (jq4) k13Var;
                hq4 hq4Var = (hq4) this.L;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    bh bhVar = hq4Var.a;
                    z22 z22Var = new z22(j);
                    qb5 qb5Var = jq4Var.I;
                    this.J = true;
                    a = bh.a(bhVar, z22Var, qb5Var, null, null, this, 12);
                    if (a == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    a = obj;
                }
                xi xiVar = ((zi) a).b;
                return wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(p31 p31Var, long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = p31Var;
        this.K = j;
    }
}
