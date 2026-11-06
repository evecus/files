package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bl1 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ cl1 J;

    public /* synthetic */ bl1(cl1 cl1Var, byte b) {
        this.I = b;
        this.J = cl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        cl1 cl1Var = this.J;
        switch (b) {
            case 0:
                ViewParent parent = cl1Var.L.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                cl1Var.a();
                View view = cl1Var.L;
                if (view.isEnabled() && !view.isLongClickable() && cl1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    cl1Var.O = true;
                    break;
                }
                break;
        }
    }
}
