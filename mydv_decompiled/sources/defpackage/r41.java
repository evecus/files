package defpackage;

import android.app.Activity;
import android.view.SurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r41 {
    public final Activity a;
    public final jk3 b;
    public final jk3 c;
    public final jk3 d;
    public mu5 e;
    public t04 f;
    public AspectRatioFrameLayout g;
    public float h;

    public r41(Activity activity) {
        activity.getClass();
        this.a = activity;
        this.b = ad4.w(bu5.c);
        this.c = ad4.w(Boolean.FALSE);
        this.d = ad4.w(null);
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final SurfaceView b() {
        return (SurfaceView) this.d.getValue();
    }

    public final void c() {
        this.c.setValue(Boolean.FALSE);
        this.f = null;
        this.d.setValue(null);
        this.g = null;
    }

    public final void d() {
        t04 t04Var = this.f;
        if (t04Var != null) {
            t04Var.a();
        }
    }
}
