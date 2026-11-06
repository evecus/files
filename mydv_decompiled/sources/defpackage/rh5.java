package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rh5 extends ih5 {
    public static final PorterDuff.Mode R = PorterDuff.Mode.SRC_IN;
    public ph5 J;
    public PorterDuffColorFilter K;
    public ColorFilter L;
    public boolean M;
    public boolean N;
    public final float[] O;
    public final Matrix P;
    public final Rect Q;

    public rh5(ph5 ph5Var) {
        this.N = true;
        this.O = new float[9];
        this.P = new Matrix();
        this.Q = new Rect();
        this.J = ph5Var;
        this.K = a(ph5Var.c, ph5Var.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.I;
        if (drawable == null) {
            return false;
        }
        e41.u(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.Q;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.L;
        if (colorFilter == null) {
            colorFilter = this.K;
        }
        Matrix matrix = this.P;
        canvas.getMatrix(matrix);
        float[] fArr = this.O;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && e41.N(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.J.b(min, min2);
        boolean z = this.N;
        ph5 ph5Var = this.J;
        if (!z) {
            ph5Var.g(min, min2);
        } else if (!ph5Var.a()) {
            this.J.g(min, min2);
            this.J.f();
        }
        this.J.c(canvas, colorFilter, rect);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.I;
        return drawable != null ? e41.F(drawable) : this.J.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.J.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.I;
        return drawable != null ? e41.G(drawable) : this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.I != null && Build.VERSION.SDK_INT >= 24) {
            return new qh5(this.I.getConstantState());
        }
        this.J.a = getChangingConfigurations();
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.J.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.J.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.I;
        if (drawable != null) {
            e41.O(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        ph5 ph5Var = this.J;
        ph5Var.b = new oh5();
        TypedArray a0 = hc4.a0(resources, theme, attributeSet, j16.a);
        ph5 ph5Var2 = this.J;
        oh5 oh5Var = ph5Var2.b;
        int K = hc4.K(a0, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (K == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (K != 5) {
            if (K != 9) {
                switch (K) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        ph5Var2.d = mode;
        ColorStateList H = hc4.H(a0, xmlPullParser, theme);
        if (H != null) {
            ph5Var2.c = H;
        }
        ph5Var2.e = hc4.G(a0, xmlPullParser, ph5Var2.e);
        oh5Var.j = hc4.J(a0, xmlPullParser, "viewportWidth", 7, oh5Var.j);
        float J = hc4.J(a0, xmlPullParser, "viewportHeight", 8, oh5Var.k);
        oh5Var.k = J;
        if (oh5Var.j <= 0.0f) {
            throw new XmlPullParserException(a0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (J <= 0.0f) {
            throw new XmlPullParserException(a0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        oh5Var.h = a0.getDimension(3, oh5Var.h);
        int i = 2;
        float dimension = a0.getDimension(2, oh5Var.i);
        oh5Var.i = dimension;
        if (oh5Var.h <= 0.0f) {
            throw new XmlPullParserException(a0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(a0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        oh5Var.setAlpha(hc4.J(a0, xmlPullParser, "alpha", 4, oh5Var.getAlpha()));
        String string = a0.getString(0);
        if (string != null) {
            oh5Var.m = string;
            oh5Var.o.put(string, oh5Var);
        }
        a0.recycle();
        ph5Var.a = getChangingConfigurations();
        int i2 = 1;
        ph5Var.k = true;
        ph5 ph5Var3 = this.J;
        oh5 oh5Var2 = ph5Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        lh5 lh5Var = oh5Var2.g;
        yp ypVar = oh5Var2.o;
        arrayDeque.push(lh5Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == i) {
                String name = xmlPullParser.getName();
                lh5 lh5Var2 = (lh5) arrayDeque.peek();
                if ("path".equals(name)) {
                    kh5 kh5Var = new kh5();
                    kh5Var.c(resources, xmlPullParser, attributeSet, theme);
                    lh5Var2.b.add(kh5Var);
                    if (kh5Var.getPathName() != null) {
                        ypVar.put(kh5Var.getPathName(), kh5Var);
                    }
                    ph5Var3.a = ph5Var3.a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    jh5 jh5Var = new jh5();
                    jh5Var.c(resources, xmlPullParser, attributeSet, theme);
                    lh5Var2.b.add(jh5Var);
                    if (jh5Var.getPathName() != null) {
                        ypVar.put(jh5Var.getPathName(), jh5Var);
                    }
                    ph5Var3.a = ph5Var3.a;
                } else if ("group".equals(name)) {
                    lh5 lh5Var3 = new lh5();
                    lh5Var3.c(resources, xmlPullParser, attributeSet, theme);
                    lh5Var2.b.add(lh5Var3);
                    arrayDeque.push(lh5Var3);
                    if (lh5Var3.getGroupName() != null) {
                        ypVar.put(lh5Var3.getGroupName(), lh5Var3);
                    }
                    ph5Var3.a = ph5Var3.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
            i2 = 1;
            i = 2;
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
        this.K = a(ph5Var.c, ph5Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.I;
        return drawable != null ? e41.Q(drawable) : this.J.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        ph5 ph5Var = this.J;
        if (ph5Var == null) {
            return false;
        }
        if (ph5Var.d()) {
            return true;
        }
        ColorStateList colorStateList = this.J.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.M && super.mutate() == this) {
            this.J = new ph5(this.J);
            this.M = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        ph5 ph5Var = this.J;
        ColorStateList colorStateList = ph5Var.c;
        if (colorStateList == null || (mode = ph5Var.d) == null) {
            z = false;
        } else {
            this.K = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!ph5Var.d() || !ph5Var.e(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.J.b.getRootAlpha() != i) {
            this.J.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.I;
        if (drawable != null) {
            e41.g0(drawable, z);
        } else {
            this.J.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.L = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.I;
        if (drawable != null) {
            e41.j0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.I;
        if (drawable != null) {
            e41.k0(drawable, colorStateList);
            return;
        }
        ph5 ph5Var = this.J;
        if (ph5Var.c != colorStateList) {
            ph5Var.c = colorStateList;
            this.K = a(colorStateList, ph5Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.I;
        if (drawable != null) {
            e41.l0(drawable, mode);
            return;
        }
        ph5 ph5Var = this.J;
        if (ph5Var.d != mode) {
            ph5Var.d = mode;
            this.K = a(ph5Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.I;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public rh5() {
        this.N = true;
        this.O = new float[9];
        this.P = new Matrix();
        this.Q = new Rect();
        this.J = new ph5();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
