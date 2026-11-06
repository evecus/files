package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cv5 extends dv5 {
    public final WindowInsetsAnimation e;

    public cv5(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static o12 f(WindowInsetsAnimation.Bounds bounds) {
        return o12.c(bounds.getUpperBound());
    }

    public static o12 g(WindowInsetsAnimation.Bounds bounds) {
        return o12.c(bounds.getLowerBound());
    }

    public static void h(View view, wu5 wu5Var) {
        view.setWindowInsetsAnimationCallback(wu5Var != null ? new bv5(wu5Var) : null);
    }

    @Override // defpackage.dv5
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.dv5
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.dv5
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.dv5
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.dv5
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
