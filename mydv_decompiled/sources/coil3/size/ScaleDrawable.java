package coil3.size;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import coil3.decode.DecodeUtils;
import defpackage.er0;
import defpackage.mw2;
import defpackage.r7;
import defpackage.su0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ScaleDrawable extends Drawable implements Drawable.Callback, Animatable {
    private final Drawable child;
    private float childDx;
    private float childDy;
    private float childScale;
    private final Scale scale;

    public ScaleDrawable(Drawable drawable, Scale scale) {
        this.child = drawable;
        this.scale = scale;
        this.childScale = 1.0f;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.childDx, this.childDy);
            float f = this.childScale;
            canvas.scale(f, f);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.child.getAlpha();
    }

    public final Drawable getChild() {
        return this.child;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.child.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.child.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.child.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @su0
    public int getOpacity() {
        return this.child.getOpacity();
    }

    public final Scale getScale() {
        return this.scale;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isFilterBitmap() {
        return this.child.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.child.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int intrinsicWidth = this.child.getIntrinsicWidth();
        int intrinsicHeight = this.child.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.child.setBounds(rect);
            this.childDx = 0.0f;
            this.childDy = 0.0f;
            this.childScale = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, width, height, this.scale, Size.ORIGINAL);
        int O = mw2.O(r7.p(computeSizeMultiplier, intrinsicWidth, width, 2.0d));
        int O2 = mw2.O(r7.p(computeSizeMultiplier, intrinsicHeight, height, 2.0d));
        this.child.setBounds(O, O2, intrinsicWidth + O, intrinsicHeight + O2);
        this.childDx = rect.left;
        this.childDy = rect.top;
        this.childScale = (float) computeSizeMultiplier;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.child.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.child.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.child.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.child.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.child.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.child.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.child.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.child.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleDrawable(Drawable drawable) {
        this(drawable, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ScaleDrawable(Drawable drawable, Scale scale, int i, er0 er0Var) {
        this(drawable, (i & 2) != 0 ? Scale.FIT : scale);
    }
}
