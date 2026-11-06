package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hg implements gr5 {
    public final ViewConfiguration a;

    public hg(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.gr5
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.gr5
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.gr5
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return z4.h(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.gr5
    public final long d() {
        return vt0.a(48.0f, 48.0f);
    }

    @Override // defpackage.gr5
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.gr5
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.gr5
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return z4.g(this.a);
        }
        return 16.0f;
    }
}
