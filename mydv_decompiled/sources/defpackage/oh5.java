package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oh5 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final lh5 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final yp o;

    public oh5(oh5 oh5Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        yp ypVar = new yp(0);
        this.o = ypVar;
        this.g = new lh5(oh5Var.g, ypVar);
        this.a = new Path(oh5Var.a);
        this.b = new Path(oh5Var.b);
        this.h = oh5Var.h;
        this.i = oh5Var.i;
        this.j = oh5Var.j;
        this.k = oh5Var.k;
        this.l = oh5Var.l;
        this.m = oh5Var.m;
        String str = oh5Var.m;
        if (str != null) {
            ypVar.put(str, this);
        }
        this.n = oh5Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(lh5 lh5Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = lh5Var.a;
        ArrayList arrayList = lh5Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = lh5Var.a;
        matrix3.preConcat(lh5Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            mh5 mh5Var = (mh5) arrayList.get(i5);
            if (mh5Var instanceof lh5) {
                a((lh5) mh5Var, matrix3, canvas, i, i2);
            } else if (mh5Var instanceof nh5) {
                nh5 nh5Var = (nh5) mh5Var;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    kl3[] kl3VarArr = nh5Var.a;
                    if (kl3VarArr != null) {
                        il2.T(kl3VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (nh5Var instanceof jh5) {
                        path2.setFillType(nh5Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        kh5 kh5Var = (kh5) nh5Var;
                        float f6 = kh5Var.i;
                        if (f6 != 0.0f || kh5Var.j != 1.0f) {
                            float f7 = kh5Var.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (kh5Var.j + f7) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.f = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.f;
                            if (f10 > f11) {
                                pathMeasure4.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure4.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        yv yvVar = kh5Var.f;
                        if (((Shader) yvVar.b) == null && yvVar.a == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) yvVar.b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(kh5Var.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = yvVar.a;
                                float f12 = kh5Var.h;
                                PorterDuff.Mode mode = rh5.R;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(kh5Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        yv yvVar2 = kh5Var.d;
                        if (((Shader) yvVar2.b) != null || yvVar2.a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = kh5Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = kh5Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(kh5Var.n);
                            Shader shader2 = (Shader) yvVar2.b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(kh5Var.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = yvVar2.a;
                                float f13 = kh5Var.g;
                                PorterDuff.Mode mode2 = rh5.R;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(kh5Var.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public oh5() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new yp(0);
        this.g = new lh5();
        this.a = new Path();
        this.b = new Path();
    }
}
