package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fp2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ is0 K;
    public final /* synthetic */ hu2 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp2(is0 is0Var, hu2 hu2Var, t43 t43Var, t43 t43Var2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = is0Var;
        this.L = hu2Var;
        this.M = t43Var;
        this.N = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new fp2(this.K, this.L, this.M, this.N, fj0Var, (byte) 0);
            default:
                return new fp2(this.K, this.L, this.M, this.N, fj0Var, (byte) 1);
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
        return ((fp2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.L;
        t43 t43Var = this.N;
        t43 t43Var2 = this.M;
        el0 el0Var = el0.I;
        is0 is0Var = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    if (((Boolean) t43Var2.getValue()).booleanValue()) {
                        int h = is0Var.d.b.h() + 1;
                        if (h < is0Var.l()) {
                            this.J = true;
                            if (jj3.t(is0Var, h, this) == el0Var) {
                                break;
                            }
                        }
                        fw4 fw4Var = hu2Var.R;
                        Boolean bool = Boolean.FALSE;
                        fw4Var.getClass();
                        fw4Var.i(null, bool);
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                t43Var.setValue(Boolean.FALSE);
                fw4 fw4Var2 = hu2Var.R;
                Boolean bool2 = Boolean.FALSE;
                fw4Var2.getClass();
                fw4Var2.i(null, bool2);
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (((Boolean) t43Var2.getValue()).booleanValue()) {
                        int h2 = is0Var.d.b.h() + 1;
                        if (h2 < is0Var.l()) {
                            this.J = true;
                            if (jj3.t(is0Var, h2, this) == el0Var) {
                                break;
                            }
                        }
                        fw4 fw4Var3 = hu2Var.R;
                        Boolean bool3 = Boolean.FALSE;
                        fw4Var3.getClass();
                        fw4Var3.i(null, bool3);
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                t43Var.setValue(Boolean.FALSE);
                fw4 fw4Var32 = hu2Var.R;
                Boolean bool32 = Boolean.FALSE;
                fw4Var32.getClass();
                fw4Var32.i(null, bool32);
                break;
        }
        return wd5Var;
    }
}
