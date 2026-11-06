package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cw3 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ dw4 J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ tn5 M;
    public final /* synthetic */ Context N;
    public final /* synthetic */ ow3 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw3(dw4 dw4Var, tm1 tm1Var, rm1 rm1Var, tn5 tn5Var, Context context, ow3 ow3Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = dw4Var;
        this.K = tm1Var;
        this.L = rm1Var;
        this.M = tn5Var;
        this.N = context;
        this.O = ow3Var;
        this.P = t43Var;
        this.Q = t43Var2;
        this.R = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new cw3(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((cw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        tn5 tn5Var = this.M;
        if (!z) {
            mu0.V(obj);
            this.I = true;
            obj = mw3.z(this.J, this.K, this.L, tn5Var, this);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ml0 ml0Var = mw3.a;
        this.P.setValue(null);
        this.Q.setValue(Boolean.FALSE);
        if (booleanValue) {
            this.R.setValue(tn5Var);
        } else {
            Toast.makeText(this.N, this.O == ow3.R ? "这个月份的观看记录还没有加载出来" : "这个月份的作品还没有加载出来", 0).show();
        }
        return wd5.a;
    }
}
