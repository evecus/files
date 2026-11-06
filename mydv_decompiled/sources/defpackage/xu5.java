package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xu5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ev5 a;
    public final /* synthetic */ yv5 b;
    public final /* synthetic */ yv5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public xu5(ev5 ev5Var, yv5 yv5Var, yv5 yv5Var2, int i, View view) {
        this.a = ev5Var;
        this.b = yv5Var;
        this.c = yv5Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ev5 ev5Var = this.a;
        dv5 dv5Var = ev5Var.a;
        dv5Var.e(animatedFraction);
        float c = dv5Var.c();
        PathInterpolator pathInterpolator = zu5.e;
        int i = Build.VERSION.SDK_INT;
        yv5 yv5Var = this.b;
        mv5 lv5Var = i >= 36 ? new lv5(yv5Var) : i >= 35 ? new kv5(yv5Var) : i >= 34 ? new jv5(yv5Var) : i >= 31 ? new iv5(yv5Var) : i >= 30 ? new hv5(yv5Var) : i >= 29 ? new gv5(yv5Var) : new fv5(yv5Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            vv5 vv5Var = yv5Var.a;
            if (i3 == 0) {
                lv5Var.d(i2, vv5Var.i(i2));
            } else {
                o12 i4 = vv5Var.i(i2);
                o12 i5 = this.c.a.i(i2);
                float f = 1.0f - c;
                lv5Var.d(i2, yv5.a(i4, (int) (((i4.a - i5.a) * f) + 0.5d), (int) (((i4.b - i5.b) * f) + 0.5d), (int) (((i4.c - i5.c) * f) + 0.5d), (int) (((i4.d - i5.d) * f) + 0.5d)));
            }
        }
        zu5.h(this.e, lv5Var.b(), Collections.singletonList(ev5Var));
    }
}
