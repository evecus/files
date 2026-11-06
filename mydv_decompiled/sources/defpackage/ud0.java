package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ud0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rv4) obj).e(null);
                break;
            default:
                u45 u45Var = (u45) obj;
                if (u45Var != null) {
                    oh2 oh2Var = u45Var.d;
                    if (oh2Var != null) {
                        oh2Var.e(d65.b);
                    }
                    oh2 oh2Var2 = u45Var.d;
                    if (oh2Var2 != null) {
                        oh2Var2.f(d65.b);
                        break;
                    }
                }
                break;
        }
    }
}
