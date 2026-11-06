package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lh5 extends mh5 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public lh5(lh5 lh5Var, yp ypVar) {
        jh5 jh5Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = lh5Var.c;
        this.d = lh5Var.d;
        this.e = lh5Var.e;
        this.f = lh5Var.f;
        this.g = lh5Var.g;
        this.h = lh5Var.h;
        this.i = lh5Var.i;
        String str = lh5Var.k;
        this.k = str;
        if (str != null) {
            ypVar.put(str, this);
        }
        matrix.set(lh5Var.j);
        ArrayList arrayList = lh5Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof lh5) {
                this.b.add(new lh5((lh5) obj, ypVar));
            } else {
                if (obj instanceof kh5) {
                    kh5 kh5Var = (kh5) obj;
                    kh5 kh5Var2 = new kh5(kh5Var);
                    kh5Var2.e = 0.0f;
                    kh5Var2.g = 1.0f;
                    kh5Var2.h = 1.0f;
                    kh5Var2.i = 0.0f;
                    kh5Var2.j = 1.0f;
                    kh5Var2.k = 0.0f;
                    kh5Var2.l = Paint.Cap.BUTT;
                    kh5Var2.m = Paint.Join.MITER;
                    kh5Var2.n = 4.0f;
                    kh5Var2.d = kh5Var.d;
                    kh5Var2.e = kh5Var.e;
                    kh5Var2.g = kh5Var.g;
                    kh5Var2.f = kh5Var.f;
                    kh5Var2.c = kh5Var.c;
                    kh5Var2.h = kh5Var.h;
                    kh5Var2.i = kh5Var.i;
                    kh5Var2.j = kh5Var.j;
                    kh5Var2.k = kh5Var.k;
                    kh5Var2.l = kh5Var.l;
                    kh5Var2.m = kh5Var.m;
                    kh5Var2.n = kh5Var.n;
                    jh5Var = kh5Var2;
                } else {
                    if (!(obj instanceof jh5)) {
                        zy.i("Unknown object in the tree!");
                        throw null;
                    }
                    jh5Var = new jh5((jh5) obj);
                }
                this.b.add(jh5Var);
                Object obj2 = jh5Var.b;
                if (obj2 != null) {
                    ypVar.put(obj2, jh5Var);
                }
            }
        }
    }

    @Override // defpackage.mh5
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((mh5) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.mh5
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((mh5) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a0 = hc4.a0(resources, theme, attributeSet, j16.b);
        float f = this.c;
        if (hc4.R(xmlPullParser, "rotation")) {
            f = a0.getFloat(5, f);
        }
        this.c = f;
        this.d = a0.getFloat(1, this.d);
        this.e = a0.getFloat(2, this.e);
        float f2 = this.f;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
            f2 = a0.getFloat(3, f2);
        }
        this.f = f2;
        float f3 = this.g;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
            f3 = a0.getFloat(4, f3);
        }
        this.g = f3;
        float f4 = this.h;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
            f4 = a0.getFloat(6, f4);
        }
        this.h = f4;
        float f5 = this.i;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
            f5 = a0.getFloat(7, f5);
        }
        this.i = f5;
        String string = a0.getString(0);
        if (string != null) {
            this.k = string;
        }
        d();
        a0.recycle();
    }

    public final void d() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            d();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            d();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            d();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            d();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            d();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            d();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            d();
        }
    }

    public lh5() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
