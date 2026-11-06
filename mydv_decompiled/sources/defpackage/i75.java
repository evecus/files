package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i75 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ j75 K;
    public final /* synthetic */ float L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i75(j75 j75Var, float f, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = j75Var;
        this.L = f;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        float f = this.L;
        j75 j75Var = this.K;
        switch (b) {
            case 0:
                return new i75(j75Var, f, fj0Var, (byte) 0);
            default:
                return new i75(j75Var, f, fj0Var, (byte) 1);
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
        return ((i75) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        float f = this.L;
        el0 el0Var = el0.I;
        j75 j75Var = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    bh bhVar = j75Var.N;
                    if (bhVar != null) {
                        Float f2 = new Float(f);
                        bj bjVar = j75Var.L ? t05.b : j75Var.K;
                        this.J = true;
                        a = bh.a(bhVar, f2, bjVar, null, null, this, 12);
                        if (a == el0Var) {
                            break;
                        }
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    a = obj;
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    bh bhVar2 = j75Var.M;
                    if (bhVar2 != null) {
                        Float f3 = new Float(f);
                        bj bjVar2 = j75Var.L ? t05.b : j75Var.K;
                        this.J = true;
                        a2 = bh.a(bhVar2, f3, bjVar2, null, null, this, 12);
                        if (a2 == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    a2 = obj;
                }
                break;
        }
        return wd5Var;
    }
}
