package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class go extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(hu2 hu2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                return new go(hu2Var, fj0Var, (byte) 0);
            case 1:
                return new go(hu2Var, fj0Var, (byte) 1);
            case 2:
                return new go(hu2Var, fj0Var, (byte) 2);
            case 3:
                return new go(hu2Var, fj0Var, (byte) 3);
            case 4:
                return new go(hu2Var, fj0Var, (byte) 4);
            case 5:
                return new go(hu2Var, fj0Var, (byte) 5);
            default:
                return new go(hu2Var, fj0Var, (byte) 6);
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
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((go) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                ij1 ij1Var = hu2Var.l;
                if (((List) ij1Var.d.getValue()).isEmpty()) {
                    ij1Var.f();
                    break;
                }
                break;
            case 1:
                mu0.V(obj);
                yd1 yd1Var = hu2Var.k;
                if (((List) yd1Var.e.getValue()).isEmpty()) {
                    yd1Var.f();
                    break;
                }
                break;
            case 2:
                mu0.V(obj);
                op2 op2Var = hu2Var.n;
                if (!jx4.L(hu2Var.d.g()) && ((List) ((fw4) op2Var.u.I).getValue()).isEmpty()) {
                    op2Var.s();
                    break;
                }
                break;
            case 3:
                mu0.V(obj);
                hu2Var.m.r(false);
                break;
            case 4:
                mu0.V(obj);
                hu2Var.F(ab4.M);
                break;
            case 5:
                mu0.V(obj);
                ye4 ye4Var = hu2Var.o;
                ye4Var.q();
                if (ye4Var.e.v() && ((Collection) ye4Var.K.getValue()).isEmpty()) {
                    p70.g0(o7.B(ye4Var), null, null, new we4(ye4Var, null, (byte) 1), 3);
                    break;
                }
                break;
            default:
                mu0.V(obj);
                hu2Var.F(ab4.T);
                break;
        }
        return wd5Var;
    }
}
