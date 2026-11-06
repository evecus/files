package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t53 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ Context K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t53(Context context, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = context;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Context context = this.K;
        switch (b) {
            case 0:
                return new t53(context, fj0Var, (byte) 0);
            case 1:
                return new t53(context, fj0Var, (byte) 1);
            default:
                t53 t53Var = new t53(context, fj0Var, (byte) 2);
                t53Var.J = ((Boolean) obj).booleanValue();
                return t53Var;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((t53) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((t53) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((t53) create(bool, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        Context context = this.K;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    yp1 yp1Var = new yp1(context);
                    this.J = true;
                    if (yp1Var.a(this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    boolean z3 = lf5.a;
                    this.J = true;
                    if (lf5.a(context, false, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            default:
                mu0.V(obj);
                ai3.a(context, RescheduleReceiver.class, this.J);
                break;
        }
        return wd5Var;
    }
}
