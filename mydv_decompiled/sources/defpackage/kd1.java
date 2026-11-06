package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kd1 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ md1 b;

    public kd1(md1 md1Var) {
        this.b = md1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        md1 md1Var = this.b;
        if (((Float) md1Var.z.getAnimatedValue()).floatValue() == 0.0f) {
            md1Var.A = (byte) 0;
            md1Var.h(0);
        } else {
            md1Var.A = (byte) 2;
            md1Var.s.invalidate();
        }
    }
}
