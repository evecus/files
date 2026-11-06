package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class y61 extends x61 {
    @Override // defpackage.w61, defpackage.b71
    public void b(x05 x05Var, x05 x05Var2, Window window, View view, boolean z, boolean z2) {
        x05Var.getClass();
        x05Var2.getClass();
        window.getClass();
        view.getClass();
        li4.m(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ep epVar = new ep(view);
        int i = Build.VERSION.SDK_INT;
        ui4 cw5Var = i >= 35 ? new cw5(window, epVar) : i >= 30 ? new bw5(window, epVar) : i >= 26 ? new aw5(window, epVar) : new zv5(window, epVar);
        cw5Var.p(!z);
        cw5Var.o(true ^ z2);
    }
}
