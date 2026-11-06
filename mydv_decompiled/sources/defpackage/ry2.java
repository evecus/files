package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ry2 {
    public final Context a;
    public final sx2 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public uy2 h;
    public py2 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final qy2 k = new qy2(this);

    public ry2(Context context, sx2 sx2Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = sx2Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final py2 a() {
        py2 py2Var = this.i;
        if (py2Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                py2Var = new b20(context2, this.e, this.d, this.c);
            } else {
                py2Var = new sv4(context2, this.b, this.e, this.d, this.c);
            }
            py2Var.l(this.b);
            py2Var.r(this.k);
            py2Var.n(this.e);
            py2Var.f(this.h);
            py2Var.o(this.g);
            py2Var.p(this.f);
            this.i = py2Var;
        }
        return py2Var;
    }

    public final boolean b() {
        py2 py2Var = this.i;
        return py2Var != null && py2Var.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        py2 a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.I = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.g();
    }
}
