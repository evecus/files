package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f41 extends rj3 implements k34 {
    public final Drawable I;
    public final jk3 K;
    public final jk3 J = ad4.w(0);
    public final u05 L = new u05(new ce(this, 14));

    public f41(Drawable drawable) {
        this.I = drawable;
        this.K = ad4.w(new fq4(g41.a(drawable)));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.rj3
    public final boolean applyAlpha(float f) {
        this.I.setAlpha(ut0.r(mw2.P(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyColorFilter(c80 c80Var) {
        this.I.setColorFilter(c80Var != null ? c80Var.a : null);
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyLayoutDirection(da2 da2Var) {
        da2Var.getClass();
        int ordinal = da2Var.ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                s83.v();
                return false;
            }
            i = 1;
        }
        return this.I.setLayoutDirection(i);
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo43getIntrinsicSizeNHjbRc() {
        return ((fq4) this.K.getValue()).a;
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
        onForgotten();
    }

    @Override // defpackage.rj3
    public final void onDraw(y31 y31Var) {
        y31Var.getClass();
        o10 q = y31Var.S().q();
        ((Number) this.J.getValue()).intValue();
        try {
            q.f();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.I;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, mw2.P(Float.intBitsToFloat((int) (y31Var.c() >> 32))), mw2.P(Float.intBitsToFloat((int) (y31Var.c() & 4294967295L))));
            } else {
                q.c(Float.intBitsToFloat((int) (y31Var.c() >> 32)) / Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)) / Float.intBitsToFloat((int) (4294967295L & mo43getIntrinsicSizeNHjbRc())));
            }
            Canvas canvas = ba.a;
            drawable.draw(((aa) q).a);
            q.n();
        } catch (Throwable th) {
            q.n();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k34
    public final void onForgotten() {
        Drawable drawable = this.I;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k34
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.L.getValue();
        Drawable drawable = this.I;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
