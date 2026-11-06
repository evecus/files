package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ce3 extends n83 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public ce3(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: ae3
            public final void onBackInvoked() {
                ce3.this.a();
            }
        } : new be3(this);
    }

    @Override // defpackage.n83
    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
