package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class wq5 {
    public static yv5 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        yv5 c = yv5.c(rootWindowInsets, null);
        vv5 vv5Var = c.a;
        vv5Var.y(c);
        View rootView = view.getRootView();
        vv5Var.d(rootView);
        vv5Var.p(rootView);
        vv5Var.q();
        return c;
    }
}
