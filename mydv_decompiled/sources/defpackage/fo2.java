package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fo2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ List K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ cw4 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo2(is0 is0Var, List list, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, boolean z, hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = is0Var;
        this.K = list;
        this.P = tm1Var;
        this.Q = tm1Var2;
        this.R = tm1Var3;
        this.L = z;
        this.S = hu2Var;
        this.M = t43Var;
        this.N = t43Var2;
        this.T = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.S;
        Object obj3 = this.R;
        Object obj4 = this.Q;
        Object obj5 = this.P;
        switch (b) {
            case 0:
                fo2 fo2Var = new fo2(this.L, this.K, this.M, (ki1) obj5, this.N, (ki1) obj4, this.T, (ki1) obj3, (ki1) obj2, fj0Var);
                fo2Var.O = obj;
                return fo2Var;
            default:
                t43 t43Var = (t43) this.T;
                return new fo2((is0) this.O, this.K, (tm1) obj5, (tm1) obj4, (tm1) obj3, this.L, (hu2) obj2, this.M, this.N, t43Var, fj0Var);
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
        return ((fo2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        tm1 tm1Var;
        tm1 tm1Var2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        boolean z = this.L;
        Object obj2 = this.R;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        cw4 cw4Var = this.T;
        t43 t43Var = this.N;
        t43 t43Var2 = this.M;
        el0 el0Var = el0.I;
        List list = this.K;
        Object obj5 = this.S;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.O;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (z) {
                        this.O = dl0Var;
                        this.J = true;
                        if (rt0.n(80L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                try {
                    if (((Boolean) t43Var2.getValue()).booleanValue()) {
                        ki1.a((ki1) obj4);
                    } else if (((Boolean) t43Var.getValue()).booleanValue()) {
                        ki1.a((ki1) obj3);
                    } else if (list.contains((lq5) cw4Var.getValue())) {
                        ki1.a((ki1) obj2);
                    } else {
                        ki1.a((ki1) obj5);
                    }
                    break;
                } catch (Throwable unused) {
                    return wd5Var;
                }
                break;
            default:
                hu2 hu2Var = (hu2) obj5;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    int o = ((is0) this.O).o();
                    Boolean bool = Boolean.FALSE;
                    t43Var2.setValue(bool);
                    t43Var.setValue(bool);
                    ((t43) cw4Var).setValue(bool);
                    Aweme aweme = (Aweme) o70.V0(o, list);
                    if (aweme != null) {
                        hu2Var.C(aweme);
                    }
                    if (o <= 2 && (tm1Var2 = (tm1) obj4) != null) {
                        tm1Var2.invoke(new Integer(o));
                    }
                    if (o >= list.size() - 3 && (tm1Var = (tm1) obj3) != null) {
                        tm1Var.invoke(new Integer(o));
                    }
                    tm1 tm1Var3 = (tm1) obj2;
                    if (tm1Var3 != null) {
                        tm1Var3.invoke(new Integer(o));
                    }
                    if (!z) {
                        this.J = true;
                        if (rt0.n(80L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                hu2Var.i.p();
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo2(boolean z, List list, t43 t43Var, ki1 ki1Var, t43 t43Var2, ki1 ki1Var2, cw4 cw4Var, ki1 ki1Var3, ki1 ki1Var4, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = z;
        this.K = list;
        this.M = t43Var;
        this.P = ki1Var;
        this.N = t43Var2;
        this.Q = ki1Var2;
        this.T = cw4Var;
        this.R = ki1Var3;
        this.S = ki1Var4;
    }
}
