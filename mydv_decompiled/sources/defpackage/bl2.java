package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bl2 implements View.OnTouchListener {
    public final /* synthetic */ cl2 I;

    public bl2(cl2 cl2Var) {
        this.I = cl2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cl2 cl2Var = this.I;
        yk2 yk2Var = cl2Var.Y;
        Handler handler = cl2Var.c0;
        wl wlVar = cl2Var.g0;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && wlVar != null && wlVar.isShowing() && x >= 0 && x < wlVar.getWidth() && y >= 0 && y < wlVar.getHeight()) {
            handler.postDelayed(yk2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(yk2Var);
        return false;
    }
}
