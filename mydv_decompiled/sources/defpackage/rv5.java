package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class rv5 extends qv5 {
    public static final yv5 w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = yv5.c(windowInsets, null);
    }

    public rv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public o12 i(int i) {
        return o12.c(this.c.getInsets(wv5.a(i)));
    }

    @Override // defpackage.nv5, defpackage.vv5
    public o12 j(int i) {
        return o12.c(this.c.getInsetsIgnoringVisibility(wv5.a(i)));
    }

    @Override // defpackage.nv5, defpackage.vv5
    public boolean u(int i) {
        return this.c.isVisible(wv5.a(i));
    }

    public rv5(yv5 yv5Var, rv5 rv5Var) {
        super(yv5Var, rv5Var);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public final void d(View view) {
    }
}
