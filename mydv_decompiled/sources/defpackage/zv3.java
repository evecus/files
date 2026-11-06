package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zv3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ hu2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv3(t43 t43Var, Context context, hu2 hu2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = t43Var;
        this.K = context;
        this.L = hu2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new zv3(this.J, this.K, this.L, fj0Var, (byte) 0);
            default:
                return new zv3(this.J, this.K, this.L, fj0Var, (byte) 1);
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
                ((zv3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((zv3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.L;
        Context context = this.K;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                ml0 ml0Var = mw3.a;
                String str = (String) t43Var.getValue();
                if (str != null) {
                    Toast.makeText(context, str, 0).show();
                    hu2Var.p.S0.h(null);
                    break;
                }
                break;
            default:
                mu0.V(obj);
                ml0 ml0Var2 = mw3.a;
                String str2 = (String) t43Var.getValue();
                if (str2 != null) {
                    Toast.makeText(context, str2, 0).show();
                    hu2Var.p.U0.h(null);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
