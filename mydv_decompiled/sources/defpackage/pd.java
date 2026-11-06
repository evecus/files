package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pd implements qj3 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public c80 d;

    public pd(Paint paint) {
        this.a = paint;
    }

    public final long a() {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        return i >= 29 ? lz5.a.a(paint) : qb.i(paint.getColor());
    }

    public final int b() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : qd.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int c() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : qd.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void d(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            lz5.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(z9.j(i)));
        }
    }

    public final void f(long j) {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i >= 29) {
            lz5.a.c(paint, j);
        } else {
            paint.setColor(qb.i0(j));
        }
    }

    public final void g(c80 c80Var) {
        this.d = c80Var;
        this.a.setColorFilter(c80Var != null ? c80Var.a : null);
    }

    public final void h(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void i(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void j(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void k(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void l(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void m(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
