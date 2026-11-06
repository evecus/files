package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yf5 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ is0 K;
    public final /* synthetic */ hu2 L;
    public final /* synthetic */ List M;
    public final /* synthetic */ s33 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf5(is0 is0Var, hu2 hu2Var, List list, s33 s33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = is0Var;
        this.L = hu2Var;
        this.M = list;
        this.N = s33Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new yf5(this.M, this.K, this.L, this.N, fj0Var);
            default:
                return new yf5(this.K, this.L, this.M, this.N, fj0Var);
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
        return ((yf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        List list = this.M;
        hu2 hu2Var = this.L;
        s33 s33Var = this.N;
        el0 el0Var = el0.I;
        is0 is0Var = this.K;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    if (!list.isEmpty()) {
                        int o = is0Var.o();
                        int size = list.size() - 1;
                        if (o > size) {
                            o = size;
                        }
                        if (((gk3) s33Var).h() == o) {
                            gx3 gx3Var = hu2Var.p;
                            this.J = true;
                            if (gx3Var.R(list, o, 3, this) == el0Var) {
                                break;
                            }
                        }
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
                    if (is0Var.o() == ((gk3) s33Var).h()) {
                        gx3 gx3Var2 = hu2Var.p;
                        int o2 = is0Var.o();
                        this.J = true;
                        if (gx3Var2.R(list, o2, 3, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf5(List list, is0 is0Var, hu2 hu2Var, s33 s33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = list;
        this.K = is0Var;
        this.L = hu2Var;
        this.N = s33Var;
    }
}
