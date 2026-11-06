package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ov5 extends nv5 {
    public o12 s;

    public ov5(yv5 yv5Var, ov5 ov5Var) {
        super(yv5Var, ov5Var);
        this.s = null;
        this.s = ov5Var.s;
    }

    @Override // defpackage.vv5
    public yv5 b() {
        return yv5.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.vv5
    public yv5 c() {
        return yv5.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.vv5
    public final o12 l() {
        o12 o12Var = this.s;
        if (o12Var != null) {
            return o12Var;
        }
        WindowInsets windowInsets = this.c;
        o12 b = o12.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = b;
        return b;
    }

    @Override // defpackage.vv5
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.vv5
    public void z(o12 o12Var) {
        this.s = o12Var;
    }

    public ov5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
        this.s = null;
    }
}
