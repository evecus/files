package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ld1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ md1 a;

    public ld1(md1 md1Var) {
        this.a = md1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        md1 md1Var = this.a;
        md1Var.c.setAlpha(floatValue);
        md1Var.d.setAlpha(floatValue);
        md1Var.s.invalidate();
    }
}
