package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ku0 implements ju0, nw5 {
    public static final ku0 I = new ku0();
    public static final ku0 J = new ku0();

    @Override // defpackage.nw5
    public jw5 c(Activity activity, ju0 ju0Var) {
        hx.a.getClass();
        return new jw5(new fx(gx.a().d(activity)), ju0Var.i(activity));
    }

    @Override // defpackage.nw5
    public jw5 f(Context context, ju0 ju0Var) {
        context.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new jw5(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.ju0
    public float i(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
