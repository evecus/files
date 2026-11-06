package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wh0 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public final /* synthetic */ Context M;
    public final /* synthetic */ s33 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(boolean z, boolean z2, String str, Context context, s33 s33Var, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = z2;
        this.L = str;
        this.M = context;
        this.N = s33Var;
        this.O = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new wh0(this.J, this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((wh0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = this.I;
        wd5 wd5Var = wd5.a;
        if (!z) {
            mu0.V(obj);
            if (this.J && this.K && (str = this.L) != null && !jx4.L(str)) {
                ri0 ri0Var = ri0.a;
                Context context = this.M;
                ImageLoader imageLoader = SingletonImageLoader.get(context);
                this.I = true;
                obj = ri0Var.b(imageLoader, context, str, this);
                el0 el0Var = el0.I;
                if (obj == el0Var) {
                    return el0Var;
                }
            }
            return wd5Var;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        Integer num = (Integer) obj;
        if (num != null) {
            int intValue = num.intValue();
            i51 i51Var = xh0.b;
            gk3 gk3Var = (gk3) this.N;
            if (intValue != gk3Var.h()) {
                gk3Var.i(intValue);
                ((tm1) this.O.getValue()).invoke(new Integer(intValue));
            }
        }
        return wd5Var;
    }
}
