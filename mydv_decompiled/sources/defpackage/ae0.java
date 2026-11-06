package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ae0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ be0 I;

    public ae0(be0 be0Var) {
        this.I = be0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.I.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        be0 be0Var = this.I;
        be0Var.g.a.clear();
        w44 w44Var = be0Var.h;
        synchronized (w44Var) {
            w44Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        be0 be0Var = this.I;
        be0Var.g.a.clear();
        w44 w44Var = be0Var.h;
        synchronized (w44Var) {
            w44Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.I.t.c.setValue(Boolean.valueOf(z));
    }
}
