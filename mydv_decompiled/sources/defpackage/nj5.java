package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nj5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ is0 J;
    public final /* synthetic */ zd1 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ hu2 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj5(is0 is0Var, zd1 zd1Var, boolean z, hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = is0Var;
        this.K = zd1Var;
        this.L = z;
        this.M = hu2Var;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = t43Var4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new nj5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((nj5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        hu2 hu2Var = this.M;
        if (!z) {
            mu0.V(obj);
            int o = this.J.o();
            Boolean bool = Boolean.FALSE;
            this.N.setValue(bool);
            this.O.setValue(bool);
            this.P.setValue(bool);
            zd1 zd1Var = this.K;
            zd1Var.i(o);
            zd1Var.d(o);
            Aweme aweme = (Aweme) o70.V0(o, (List) this.Q.getValue());
            if (aweme != null) {
                hu2Var.C(aweme);
            }
            if (!this.L) {
                this.I = true;
                Object n = rt0.n(80L, this);
                el0 el0Var = el0.I;
                if (n == el0Var) {
                    return el0Var;
                }
            }
            return wd5.a;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        hu2Var.i.p();
        return wd5.a;
    }
}
