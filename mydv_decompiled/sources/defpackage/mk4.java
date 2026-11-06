package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mk4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ vo L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk4(vo voVar, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = voVar;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        vo voVar = this.L;
        switch (b) {
            case 0:
                mk4 mk4Var = new mk4(voVar, fj0Var, (byte) 0);
                mk4Var.K = obj;
                return mk4Var;
            default:
                mk4 mk4Var2 = new mk4(voVar, fj0Var, (byte) 1);
                mk4Var2.K = obj;
                return mk4Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hk4 hk4Var = (hk4) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((mk4) create(hk4Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        vo voVar = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
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
                hk4 hk4Var = (hk4) this.K;
                this.J = true;
                Object b2 = hk4Var.b(voVar, this);
                return b2 == el0Var ? el0Var : b2;
            default:
                boolean z2 = this.J;
                wd5 wd5Var = wd5.a;
                if (!z2) {
                    mu0.V(obj);
                    hk4 hk4Var2 = (hk4) this.K;
                    String str = voVar.a;
                    this.J = true;
                    vo voVar2 = (vo) hk4Var2.a.remove(str);
                    if (voVar2 != null) {
                        voVar2.d.c(null);
                        voVar2.b.set(false);
                        voVar2.k.e(null);
                    }
                    if (wd5Var == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
        }
    }
}
