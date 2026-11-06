package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o9 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public final /* synthetic */ boolean K;
    public t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(boolean z, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                s33 s33Var = (s33) this.M;
                return new o9(this.K, (String) obj3, (Context) obj2, s33Var, fj0Var);
            default:
                return new o9(this.K, this.L, this.M, (t43) obj3, (t43) obj2, fj0Var);
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
        return ((o9) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        s33 s33Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        boolean z = this.K;
        el0 el0Var = el0.I;
        t43 t43Var = this.M;
        Object obj2 = this.N;
        Object obj3 = this.O;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (z && (str = (String) obj2) != null) {
                        s33 s33Var2 = (s33) t43Var;
                        ri0 ri0Var = ri0.a;
                        ImageLoader imageLoader = SingletonImageLoader.get(context);
                        this.L = s33Var2;
                        this.J = true;
                        Object b2 = ri0Var.b(imageLoader, context, str, this);
                        if (b2 == el0Var) {
                            break;
                        } else {
                            obj = b2;
                            s33Var = s33Var2;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    s33Var = (s33) this.L;
                    mu0.V(obj);
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    int intValue = num.intValue();
                    f80 f80Var = p9.a;
                    ((gk3) s33Var).i(intValue);
                    break;
                }
                break;
            default:
                t43 t43Var2 = (t43) obj3;
                t43 t43Var3 = (t43) obj2;
                t43 t43Var4 = this.L;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    ta1 ta1Var = on5.a;
                    if (((Boolean) t43Var4.getValue()).booleanValue() && ((Boolean) t43Var.getValue()).booleanValue() && !z && !((Boolean) t43Var3.getValue()).booleanValue() && !((Boolean) t43Var2.getValue()).booleanValue()) {
                        this.J = true;
                        if (rt0.n(5000L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ta1 ta1Var2 = on5.a;
                if (((Boolean) t43Var4.getValue()).booleanValue() && !((Boolean) t43Var3.getValue()).booleanValue() && !((Boolean) t43Var2.getValue()).booleanValue()) {
                    t43Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(boolean z, String str, Context context, s33 s33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.N = str;
        this.O = context;
        this.M = s33Var;
    }
}
