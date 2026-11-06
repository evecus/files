package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ph5 extends Drawable.ConstantState {
    public int a;
    public oh5 b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public ph5(ph5 ph5Var) {
        this.c = null;
        this.d = rh5.R;
        if (ph5Var != null) {
            this.a = ph5Var.a;
            oh5 oh5Var = new oh5(ph5Var.b);
            this.b = oh5Var;
            if (ph5Var.b.e != null) {
                oh5Var.e = new Paint(ph5Var.b.e);
            }
            if (ph5Var.b.d != null) {
                this.b.d = new Paint(ph5Var.b.d);
            }
            this.c = ph5Var.c;
            this.d = ph5Var.d;
            this.e = ph5Var.e;
        }
    }

    public final boolean a() {
        return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
    }

    public final void b(int i, int i2) {
        Bitmap bitmap = this.f;
        if (bitmap != null && i == bitmap.getWidth() && i2 == this.f.getHeight()) {
            return;
        }
        this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.k = true;
    }

    public final void c(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        Paint paint;
        if (this.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (this.l == null) {
                Paint paint2 = new Paint();
                this.l = paint2;
                paint2.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            paint = this.l;
        }
        canvas.drawBitmap(this.f, (Rect) null, rect, paint);
    }

    public final boolean d() {
        oh5 oh5Var = this.b;
        Boolean bool = oh5Var.n;
        if (bool == null) {
            bool = Boolean.valueOf(oh5Var.g.a());
            oh5Var.n = bool;
        }
        return bool.booleanValue();
    }

    public final boolean e(int[] iArr) {
        boolean b = this.b.g.b(iArr);
        this.k |= b;
        return b;
    }

    public final void f() {
        this.g = this.c;
        this.h = this.d;
        this.i = this.b.getRootAlpha();
        this.j = this.e;
        this.k = false;
    }

    public final void g(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        oh5 oh5Var = this.b;
        oh5Var.a(oh5Var.g, oh5.p, canvas, i, i2);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new rh5(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new rh5(this);
    }

    public ph5() {
        this.c = null;
        this.d = rh5.R;
        this.b = new oh5();
    }
}
