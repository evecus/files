package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ad implements ComponentCallbacks2 {
    public final /* synthetic */ cd I;

    public ad(cd cdVar) {
        this.I = cdVar;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            cd cdVar = this.I;
            g12 g12Var = cdVar.e;
            if (g12Var != null) {
                g12Var.n();
            }
            cdVar.e = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
