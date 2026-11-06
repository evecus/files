package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ki extends ih5 implements Animatable {
    public final Context K;
    public final hi L = new hi(this, (byte) 0);
    public final ii J = new ii();

    public ki(Context context) {
        this.K = context;
    }

    public static ki a(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        ki kiVar = new ki(context);
        kiVar.inflate(resources, xmlResourceParser, attributeSet, theme);
        return kiVar;
    }

    @Override // defpackage.ih5, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        ii iiVar = this.J;
        iiVar.a.draw(canvas);
        if (iiVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getAlpha() : this.J.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.J.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getColorFilter() : this.J.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.I == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new ji(this.I.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getIntrinsicHeight() : this.J.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getIntrinsicWidth() : this.J.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.getOpacity() : this.J.a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x017e, code lost:
    
        r0 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0180, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0182, code lost:
    
        r0 = new android.animation.AnimatorSet();
        r8.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0189, code lost:
    
        r0.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x018e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.isAutoMirrored() : this.J.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.I;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.J.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.I;
        return drawable != null ? drawable.isStateful() : this.J.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.J.a.setBounds(rect);
        }
    }

    @Override // defpackage.ih5, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.I;
        return drawable != null ? drawable.setLevel(i) : this.J.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.I;
        return drawable != null ? drawable.setState(iArr) : this.J.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.J.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.J.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.J.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.J.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.J.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.J.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.I;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.J.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.I;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        ii iiVar = this.J;
        if (iiVar.b.isStarted()) {
            return;
        }
        iiVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.I;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.J.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
