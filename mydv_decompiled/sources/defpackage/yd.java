package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yd {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public yd(Path path) {
        this.a = path;
    }

    public final m14 a() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new m14(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void b(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean c(yd ydVar, yd ydVar2, int i) {
        Path.Op op = lq2.B(i, 0) ? Path.Op.DIFFERENCE : lq2.B(i, 1) ? Path.Op.INTERSECT : lq2.B(i, 4) ? Path.Op.REVERSE_DIFFERENCE : lq2.B(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(ydVar instanceof yd)) {
            zy.p("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ydVar.a;
        if (ydVar2 instanceof yd) {
            return this.a.op(path, ydVar2.a, op);
        }
        zy.p("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void d() {
        this.a.reset();
    }

    public final void e() {
        this.a.rewind();
    }

    public final void f(float[] fArr) {
        Matrix matrix = this.d;
        if (matrix == null) {
            matrix = new Matrix();
            this.d = matrix;
        }
        o7.O(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void g(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
