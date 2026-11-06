package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ev5 {
    public dv5 a;

    public ev5(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new cv5(r9.b(i, interpolator, j));
        } else {
            this.a = new zu5(i, interpolator, j);
        }
    }

    public static void a(View view, wu5 wu5Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            cv5.h(view, wu5Var);
        } else {
            zu5.k(view, wu5Var);
        }
    }
}
