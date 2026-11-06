package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class tv5 extends sv5 {
    public static final yv5 x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        x = yv5.c(windowInsets, null);
    }

    public tv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
    }

    @Override // defpackage.rv5, defpackage.nv5, defpackage.vv5
    public o12 i(int i) {
        return o12.c(this.c.getInsets(xv5.a(i)));
    }

    @Override // defpackage.rv5, defpackage.nv5, defpackage.vv5
    public o12 j(int i) {
        return o12.c(this.c.getInsetsIgnoringVisibility(xv5.a(i)));
    }

    @Override // defpackage.rv5, defpackage.nv5, defpackage.vv5
    public boolean u(int i) {
        return this.c.isVisible(xv5.a(i));
    }

    public tv5(yv5 yv5Var, tv5 tv5Var) {
        super(yv5Var, tv5Var);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public void p(View view) {
    }
}
