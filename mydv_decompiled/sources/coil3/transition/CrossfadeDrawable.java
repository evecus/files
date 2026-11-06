package coil3.transition;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import coil3.decode.DecodeUtils;
import coil3.size.Scale;
import coil3.size.Size;
import defpackage.ah;
import defpackage.er0;
import defpackage.hf1;
import defpackage.mw2;
import defpackage.r7;
import defpackage.s83;
import defpackage.su0;
import defpackage.ut0;
import defpackage.zl1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_DURATION = 200;
    private static final int STATE_DONE = 2;
    private static final int STATE_RUNNING = 1;
    private static final int STATE_START = 0;
    private final List<ah> callbacks;
    private final int durationMillis;
    private final Drawable end;
    private final boolean fadeStart;
    private final int intrinsicHeight;
    private final int intrinsicWidth;
    private int maxAlpha;
    private final boolean preferExactIntrinsicSize;
    private final Scale scale;
    private Drawable start;
    private long startTimeMillis;
    private int state;

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z, boolean z2) {
        this.scale = scale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.callbacks = new ArrayList();
        this.intrinsicWidth = computeIntrinsicDimension(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.intrinsicHeight = computeIntrinsicDimension(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.maxAlpha = 255;
        this.start = drawable != null ? drawable.mutate() : null;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.end = mutate;
        if (i <= 0) {
            s83.t("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable3 = this.start;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (mutate != null) {
            mutate.setCallback(this);
        }
    }

    private final int computeIntrinsicDimension(Integer num, Integer num2) {
        if (this.preferExactIntrinsicSize || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    private final void markDone() {
        this.state = 2;
        this.start = null;
        List<ah> list = this.callbacks;
        if (list.size() <= 0) {
            return;
        }
        list.get(0).getClass();
        zl1.c();
    }

    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                drawable2.setAlpha(this.maxAlpha);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            Drawable drawable3 = this.end;
            if (drawable3 != null) {
                drawable3.setAlpha(this.maxAlpha);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / this.durationMillis;
        double p = ut0.p(uptimeMillis, 0.0d, 1.0d);
        int i2 = this.maxAlpha;
        int i3 = (int) (p * i2);
        if (this.fadeStart) {
            i2 -= i3;
        }
        boolean z = uptimeMillis >= 1.0d;
        if (!z && (drawable = this.start) != null) {
            drawable.setAlpha(i2);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.end;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            save = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z) {
            markDone();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.maxAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.end) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.end;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.start;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Drawable getEnd() {
        return this.end;
    }

    public final boolean getFadeStart() {
        return this.fadeStart;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    @su0
    public int getOpacity() {
        Drawable drawable = this.start;
        Drawable drawable2 = this.end;
        int i = this.state;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Drawable getStart() {
        return this.start;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.state == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.start;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.end;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.start;
        if (drawable != null) {
            updateBounds$io_coil_kt_coil3_coil_core(drawable, rect);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            updateBounds$io_coil_kt_coil3_coil_core(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.start;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.end;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.start;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.end;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    public void registerAnimationCallback(ah ahVar) {
        this.callbacks.add(ahVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            s83.h(hf1.u(i, "Invalid alpha: "));
        } else {
            this.maxAlpha = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.start;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.end;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        this.startTimeMillis = SystemClock.uptimeMillis();
        List<ah> list = this.callbacks;
        if (list.size() <= 0) {
            invalidateSelf();
        } else {
            list.get(0).getClass();
            zl1.c();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.state != 2) {
            markDone();
        }
    }

    public boolean unregisterAnimationCallback(ah ahVar) {
        return this.callbacks.remove(ahVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void updateBounds$io_coil_kt_coil3_coil_core(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, width, height, this.scale, Size.ORIGINAL);
        int O = mw2.O(r7.p(computeSizeMultiplier, intrinsicWidth, width, 2.0d));
        int O2 = mw2.O(r7.p(computeSizeMultiplier, intrinsicHeight, height, 2.0d));
        drawable.setBounds(rect.left + O, rect.top + O2, rect.right - O, rect.bottom - O2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale) {
        this(drawable, drawable2, scale, 0, false, false, 56, null);
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i) {
        this(drawable, drawable2, scale, i, false, false, 48, null);
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z) {
        this(drawable, drawable2, scale, i, z, false, 32, null);
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    public /* synthetic */ CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z, boolean z2, int i2, er0 er0Var) {
        this(drawable, drawable2, (i2 & 4) != 0 ? Scale.FIT : scale, (i2 & 8) != 0 ? 200 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2);
    }
}
