package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ie implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ vq3 J;

    public /* synthetic */ ie(vq3 vq3Var, byte b) {
        this.I = b;
        this.J = vq3Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        vq3 vq3Var = this.J;
        switch (b) {
            case 0:
                ca2 C = ((ca2) obj).C();
                C.getClass();
                vq3Var.q(C);
                break;
            case 1:
                vq3Var.m370setPopupContentSizefhxjrPA((z22) obj);
                vq3Var.r();
                break;
            default:
                rm1 rm1Var = (rm1) obj;
                Handler handler = vq3Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = vq3Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new kf(rm1Var, (byte) 2));
                        break;
                    }
                } else {
                    rm1Var.invoke();
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
