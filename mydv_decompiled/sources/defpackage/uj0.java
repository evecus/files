package defpackage;

import android.app.Activity;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uj0 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ uj0(tm1 tm1Var, boolean z) {
        this.I = (byte) 1;
        this.K = tm1Var;
        this.J = z;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        r43 i;
        mu5 mu5Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.K;
        boolean z = this.J;
        switch (b) {
            case 0:
                md mdVar = (md) obj;
                if (z && (i = mdVar.i()) != null) {
                    ((mn4) i).b(wd5Var);
                    break;
                }
                break;
            case 1:
                ((tm1) obj).invoke(Boolean.valueOf(!z));
                break;
            default:
                r41 r41Var = (r41) obj;
                if (!z) {
                    if (r41Var != null && !r41Var.a() && j42.c((bu5) r41Var.b.getValue(), bu5.e) && (mu5Var = r41Var.e) != null) {
                        k04 k04Var = fu5.b;
                        fu5 fu5Var = (fu5) fu5.c.getValue();
                        k04Var.getClass();
                        fu5Var.getClass();
                        Binder binder = mu5Var.b;
                        Activity activity = r41Var.a;
                        Executor o = Build.VERSION.SDK_INT >= 28 ? ck.o(activity) : new ob1(new Handler(activity.getMainLooper()), (byte) 0);
                        o.getClass();
                        fu5Var.b(binder, activity, o, r41Var);
                        break;
                    }
                } else if (r41Var != null) {
                    r41Var.d();
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ uj0(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = z;
        this.K = obj;
    }
}
