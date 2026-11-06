package defpackage;

import android.webkit.ValueCallback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cz3 implements ValueCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yu1 b;

    public /* synthetic */ cz3(yu1 yu1Var, byte b) {
        this.a = b;
        this.b = yu1Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        byte b = this.a;
        yu1 yu1Var = this.b;
        switch (b) {
            case 0:
                yu1Var.invoke();
                break;
            default:
                yu1Var.invoke();
                break;
        }
    }
}
