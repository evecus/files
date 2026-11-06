package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class qv5 extends pv5 {
    public o12 t;
    public o12 u;
    public o12 v;

    public qv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.vv5
    public o12 k() {
        o12 o12Var = this.u;
        if (o12Var != null) {
            return o12Var;
        }
        o12 c = o12.c(this.c.getMandatorySystemGestureInsets());
        this.u = c;
        return c;
    }

    @Override // defpackage.vv5
    public o12 m() {
        o12 o12Var = this.t;
        if (o12Var != null) {
            return o12Var;
        }
        o12 c = o12.c(this.c.getSystemGestureInsets());
        this.t = c;
        return c;
    }

    @Override // defpackage.vv5
    public o12 o() {
        o12 o12Var = this.v;
        if (o12Var != null) {
            return o12Var;
        }
        o12 c = o12.c(this.c.getTappableElementInsets());
        this.v = c;
        return c;
    }

    @Override // defpackage.nv5, defpackage.vv5
    public yv5 r(int i, int i2, int i3, int i4) {
        return yv5.c(this.c.inset(i, i2, i3, i4), null);
    }

    public qv5(yv5 yv5Var, qv5 qv5Var) {
        super(yv5Var, qv5Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.ov5, defpackage.vv5
    public void z(o12 o12Var) {
    }
}
