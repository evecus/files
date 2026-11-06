package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b64 extends View {
    public static final int[] N = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] O = new int[0];
    public ke5 I;
    public Boolean J;
    public Long K;
    public h L;
    public ce M;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.L;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.K;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? N : O;
            ke5 ke5Var = this.I;
            if (ke5Var != null) {
                ke5Var.setState(iArr);
            }
        } else {
            h hVar = new h(this, (byte) 19);
            this.L = hVar;
            postDelayed(hVar, 50L);
        }
        this.K = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(b64 b64Var) {
        ke5 ke5Var = b64Var.I;
        if (ke5Var != null) {
            ke5Var.setState(O);
        }
        b64Var.L = null;
    }

    public final void b(vs3 vs3Var, boolean z, long j, int i, long j2, float f, ce ceVar) {
        long j3 = vs3Var.a;
        if (this.I == null || !Boolean.valueOf(z).equals(this.J)) {
            ke5 ke5Var = new ke5(z);
            setBackground(ke5Var);
            this.I = ke5Var;
            this.J = Boolean.valueOf(z);
        }
        ke5 ke5Var2 = this.I;
        ke5Var2.getClass();
        this.M = ceVar;
        e(j, i, j2, f);
        if (z) {
            ke5Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            ke5Var2.setHotspot(ke5Var2.getBounds().centerX(), ke5Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.M = null;
        h hVar = this.L;
        if (hVar != null) {
            removeCallbacks(hVar);
            h hVar2 = this.L;
            hVar2.getClass();
            hVar2.run();
        } else {
            ke5 ke5Var = this.I;
            if (ke5Var != null) {
                ke5Var.setState(O);
            }
        }
        ke5 ke5Var2 = this.I;
        if (ke5Var2 == null) {
            return;
        }
        ke5Var2.setVisible(false, false);
        unscheduleDrawable(ke5Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2, float f) {
        ke5 ke5Var = this.I;
        if (ke5Var == null) {
            return;
        }
        if (ke5Var.getRadius() != i) {
            ke5Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long c = x70.c(j2, f);
        x70 x70Var = ke5Var.J;
        if (!(x70Var == null ? false : zc5.a(x70Var.a, c))) {
            ke5Var.J = new x70(c);
            ke5Var.setColor(ColorStateList.valueOf(qb.i0(c)));
        }
        Rect rect = new Rect(0, 0, mw2.P(Float.intBitsToFloat((int) (j >> 32))), mw2.P(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ke5Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ce ceVar = this.M;
        if (ceVar != null) {
            ceVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
