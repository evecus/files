package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ix implements hx, nw5 {
    public static final ix I = new ix();
    public static final ix J = new ix();

    @Override // defpackage.nw5
    public jw5 c(Activity activity, ju0 ju0Var) {
        hx.a.getClass();
        return new jw5(new fx(gx.a().d(activity)), ju0Var.i(activity));
    }

    @Override // defpackage.hx
    public Rect d(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.nw5
    public jw5 f(Context context, ju0 ju0Var) {
        context.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new jw5(bounds, f);
    }
}
