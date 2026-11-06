package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hk implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rm1 rm1Var = (rm1) obj;
                if (rm1Var != null) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 1:
                ((kl) obj).C();
                break;
            default:
                ((p85) obj).run();
                break;
        }
    }
}
