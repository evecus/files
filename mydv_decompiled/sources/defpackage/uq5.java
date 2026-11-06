package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uq5 implements View.OnApplyWindowInsetsListener {
    public yv5 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ yd3 c;

    public uq5(View view, yd3 yd3Var) {
        this.b = view;
        this.c = yd3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        yv5 c = yv5.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        yd3 yd3Var = this.c;
        if (i < 30) {
            vq5.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return yd3Var.j(view, c).b();
            }
        }
        this.a = c;
        yv5 j = yd3Var.j(view, c);
        if (i >= 30) {
            return j.b();
        }
        WeakHashMap weakHashMap = dr5.a;
        view.requestApplyInsets();
        return j.b();
    }
}
