package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u03 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ zg2 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ hu2 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u03(t43 t43Var, zg2 zg2Var, int i, int i2, hu2 hu2Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = t43Var;
        this.K = zg2Var;
        this.L = i;
        this.M = i2;
        this.N = hu2Var;
        this.O = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new u03(this.J, this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((u03) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        wd5 wd5Var = wd5.a;
        if (z) {
            if (z) {
                mu0.V(obj);
                return wd5Var;
            }
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        k74 k74Var = w03.a;
        final t43 t43Var = this.J;
        if (!((List) t43Var.getValue()).isEmpty()) {
            final zg2 zg2Var = this.K;
            final int i = this.L;
            final int i2 = this.M;
            t03 t03Var = new t03(o7.p(wi4.w(new rm1() { // from class: q03
                @Override // defpackage.rm1
                public final Object invoke() {
                    Integer num;
                    Iterator it = zg2.this.g().m.iterator();
                    if (it.hasNext()) {
                        Integer valueOf = Integer.valueOf(((ug2) it.next()).a);
                        while (it.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((ug2) it.next()).a);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                        num = valueOf;
                    } else {
                        num = null;
                    }
                    int intValue = num != null ? num.intValue() : -1;
                    k74 k74Var2 = w03.a;
                    int X = p70.X((List) t43Var.getValue()) - i;
                    if (X < 0) {
                        X = 0;
                    }
                    return Boolean.valueOf(intValue >= X + i2);
                }
            })), (byte) 0);
            y30 y30Var = new y30(this.N, (Object) this.O, (byte) 9);
            this.I = true;
            Object collect = t03Var.collect(y30Var, this);
            el0 el0Var = el0.I;
            if (collect == el0Var) {
                return el0Var;
            }
        }
        return wd5Var;
    }
}
