package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aa implements o10 {
    public Canvas a = ba.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.o10
    public final void a(long j, long j2, qj3 qj3Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, qj3 qj3Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.o10
    public final void d(yd ydVar, qj3 qj3Var) {
        Canvas canvas = this.a;
        if (ydVar instanceof yd) {
            canvas.drawPath(ydVar.a, i42.s0(qj3Var));
        } else {
            zy.p("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.o10
    public final void e(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.o10
    public final void f() {
        this.a.save();
    }

    @Override // defpackage.o10
    public final void g() {
        g4.y(this.a, false);
    }

    @Override // defpackage.o10
    public final void h(tw1 tw1Var, long j, long j2, long j3, long j4, qj3 qj3Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = ed.a(tw1Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(a, rect, rect2, i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final void i(float[] fArr) {
        if (sp0.X(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        o7.O(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.o10
    public final void j(m14 m14Var, qj3 qj3Var) {
        this.a.saveLayer(m14Var.a, m14Var.b, m14Var.c, m14Var.d, i42.s0(qj3Var), 31);
    }

    @Override // defpackage.o10
    public final void k(yd ydVar) {
        Canvas canvas = this.a;
        if (ydVar instanceof yd) {
            canvas.clipPath(ydVar.a, Region.Op.INTERSECT);
        } else {
            zy.p("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.o10
    public final void l(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.o10
    public final void m(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.o10
    public final void n() {
        this.a.restore();
    }

    @Override // defpackage.o10
    public final void o(float f, long j, qj3 qj3Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final void p(tw1 tw1Var, long j, qj3 qj3Var) {
        this.a.drawBitmap(ed.a(tw1Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final /* synthetic */ void q(m14 m14Var) {
        pt1.d(this, m14Var);
    }

    @Override // defpackage.o10
    public final void r(float f, float f2, float f3, float f4, qj3 qj3Var) {
        this.a.drawRect(f, f2, f3, f4, i42.s0(qj3Var));
    }

    @Override // defpackage.o10
    public final void s() {
        g4.y(this.a, true);
    }
}
