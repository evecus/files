package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class gv5 extends mv5 {
    public final WindowInsets.Builder e;

    public gv5(yv5 yv5Var) {
        super(yv5Var);
        WindowInsets b = yv5Var.b();
        this.e = b != null ? er1.i(b) : iw.c();
    }

    @Override // defpackage.mv5
    public yv5 b() {
        a();
        yv5 c = yv5.c(this.e.build(), null);
        o12[] o12VarArr = this.b;
        vv5 vv5Var = c.a;
        vv5Var.w(o12VarArr);
        vv5Var.v(null);
        vv5Var.B(this.c);
        vv5Var.C(this.d);
        return c;
    }

    @Override // defpackage.mv5
    public void e(o12 o12Var) {
        this.e.setMandatorySystemGestureInsets(o12Var.d());
    }

    @Override // defpackage.mv5
    public void f(o12 o12Var) {
        this.e.setStableInsets(o12Var.d());
    }

    @Override // defpackage.mv5
    public void g(o12 o12Var) {
        this.e.setSystemGestureInsets(o12Var.d());
    }

    @Override // defpackage.mv5
    public void h(o12 o12Var) {
        this.e.setSystemWindowInsets(o12Var.d());
    }

    @Override // defpackage.mv5
    public void i(o12 o12Var) {
        this.e.setTappableElementInsets(o12Var.d());
    }

    public gv5() {
        this.e = iw.c();
    }
}
