package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fd0 extends View.DragShadowBuilder {
    public final lu0 a;
    public final long b;
    public final tm1 c;

    public fd0(lu0 lu0Var, long j, tm1 tm1Var) {
        this.a = lu0Var;
        this.b = j;
        this.c = tm1Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        r10 r10Var = new r10();
        Canvas canvas2 = ba.a;
        aa aaVar = new aa();
        aaVar.a = canvas;
        q10 q10Var = r10Var.I;
        iu0 iu0Var = q10Var.a;
        da2 da2Var = q10Var.b;
        o10 o10Var = q10Var.c;
        long j = q10Var.d;
        q10Var.a = this.a;
        q10Var.b = da2.I;
        q10Var.c = aaVar;
        q10Var.d = this.b;
        aaVar.f();
        this.c.invoke(r10Var);
        aaVar.n();
        q10Var.a = iu0Var;
        q10Var.b = da2Var;
        q10Var.c = o10Var;
        q10Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        lu0 lu0Var = this.a;
        point.set(r7.b(intBitsToFloat / lu0Var.getDensity(), lu0Var), r7.b(Float.intBitsToFloat((int) (j & 4294967295L)) / lu0Var.getDensity(), lu0Var));
        point2.set(point.x / 2, point.y / 2);
    }
}
