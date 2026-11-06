package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kh5 extends nh5 {
    public yv d;
    public yv f;
    public float e = 0.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public Paint.Cap l = Paint.Cap.BUTT;
    public Paint.Join m = Paint.Join.MITER;
    public float n = 4.0f;

    @Override // defpackage.mh5
    public final boolean a() {
        return this.f.j() || this.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.mh5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            yv r0 = r5.f
            boolean r1 = r0.j()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.a
            if (r1 == r4) goto L1e
            r0.a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            yv r5 = r5.d
            boolean r1 = r5.j()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.a
            if (r6 == r1) goto L3a
            r5.a = r6
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh5.b(int[]):boolean");
    }

    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a0 = hc4.a0(resources, theme, attributeSet, j16.c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = a0.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = a0.getString(2);
            if (string2 != null) {
                this.a = il2.r(string2);
            }
            this.f = hc4.I(a0, xmlPullParser, theme, "fillColor", 1);
            float f = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = a0.getFloat(12, f);
            }
            this.h = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? a0.getInt(8, -1) : -1;
            Paint.Cap cap = this.l;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.l = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? a0.getInt(9, -1) : -1;
            Paint.Join join = this.m;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.m = join;
            float f2 = this.n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = a0.getFloat(10, f2);
            }
            this.n = f2;
            this.d = hc4.I(a0, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = a0.getFloat(11, f3);
            }
            this.g = f3;
            float f4 = this.e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = a0.getFloat(4, f4);
            }
            this.e = f4;
            float f5 = this.j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = a0.getFloat(6, f5);
            }
            this.j = f5;
            float f6 = this.k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = a0.getFloat(7, f6);
            }
            this.k = f6;
            float f7 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = a0.getFloat(5, f7);
            }
            this.i = f7;
            int i3 = this.c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = a0.getInt(13, i3);
            }
            this.c = i3;
        }
        a0.recycle();
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.a;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.a;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.a = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.a = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
