package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class we4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ ye4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we4(ye4 ye4Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = ye4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        ye4 ye4Var = this.K;
        switch (b) {
            case 0:
                return new we4(ye4Var, fj0Var, (byte) 0);
            case 1:
                return new we4(ye4Var, fj0Var, (byte) 1);
            case 2:
                return new we4(ye4Var, fj0Var, (byte) 2);
            default:
                return new we4(ye4Var, fj0Var, (byte) 3);
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
        return ((we4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object k;
        Object w;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ye4 ye4Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    kq5 kq5Var = ye4Var.b;
                    this.J = true;
                    k = kq5Var.k(this);
                    if (k == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    k = ((h54) obj).I;
                }
                if (!(k instanceof g54)) {
                    ye4Var.G.h((List) k);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    kq5 kq5Var2 = ye4Var.b;
                    this.J = true;
                    w = kq5Var2.w("", this);
                    if (w == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    w = ((h54) obj).I;
                }
                if (!(w instanceof g54)) {
                    ye4Var.K.h((List) w);
                    break;
                }
                break;
            case 2:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    this.J = true;
                    if (ye4Var.t(false, this) == el0Var) {
                        break;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    this.J = true;
                    if (ye4Var.t(false, this) == el0Var) {
                        break;
                    }
                } else if (!z4) {
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
