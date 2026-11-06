package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sv4 extends py2 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context J;
    public final sx2 K;
    public final px2 L;
    public final boolean M;
    public final int N;
    public final int O;
    public final ty2 P;
    public PopupWindow.OnDismissListener S;
    public View T;
    public View U;
    public uy2 V;
    public ViewTreeObserver W;
    public boolean X;
    public boolean Y;
    public int Z;
    public boolean b0;
    public final cm Q = new cm(this, 3);
    public final y10 R = new y10(this, 1);
    public int a0 = 0;

    public sv4(Context context, sx2 sx2Var, View view, int i, boolean z) {
        this.J = context;
        this.K = sx2Var;
        this.M = z;
        this.L = new px2(sx2Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.O = i;
        Resources resources = context.getResources();
        this.N = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.T = view;
        this.P = new ty2(context, null, i);
        sx2Var.c(this, context);
    }

    @Override // defpackage.vy2
    public final void a(sx2 sx2Var, boolean z) {
        if (sx2Var != this.K) {
            return;
        }
        dismiss();
        uy2 uy2Var = this.V;
        if (uy2Var != null) {
            uy2Var.a(sx2Var, z);
        }
    }

    @Override // defpackage.xn4
    public final boolean b() {
        return !this.X && this.P.g0.isShowing();
    }

    @Override // defpackage.vy2
    public final boolean c(oy4 oy4Var) {
        boolean z;
        if (oy4Var.hasVisibleItems()) {
            ry2 ry2Var = new ry2(this.J, oy4Var, this.U, this.M, this.O, 0);
            uy2 uy2Var = this.V;
            ry2Var.h = uy2Var;
            py2 py2Var = ry2Var.i;
            if (py2Var != null) {
                py2Var.f(uy2Var);
            }
            int size = oy4Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = oy4Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ry2Var.g = z;
            py2 py2Var2 = ry2Var.i;
            if (py2Var2 != null) {
                py2Var2.o(z);
            }
            ry2Var.j = this.S;
            this.S = null;
            this.K.d(false);
            ty2 ty2Var = this.P;
            int i2 = ty2Var.N;
            int p = ty2Var.p();
            if ((Gravity.getAbsoluteGravity(this.a0, this.T.getLayoutDirection()) & 7) == 5) {
                i2 += this.T.getWidth();
            }
            if (!ry2Var.b()) {
                if (ry2Var.e != null) {
                    ry2Var.d(i2, p, true, true);
                }
            }
            uy2 uy2Var2 = this.V;
            if (uy2Var2 != null) {
                uy2Var2.k(oy4Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vy2
    public final boolean d() {
        return false;
    }

    @Override // defpackage.xn4
    public final void dismiss() {
        if (b()) {
            this.P.dismiss();
        }
    }

    @Override // defpackage.vy2
    public final void f(uy2 uy2Var) {
        this.V = uy2Var;
    }

    @Override // defpackage.xn4
    public final void g() {
        View view;
        if (b()) {
            return;
        }
        if (this.X || (view = this.T) == null) {
            zy.i("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.U = view;
        ty2 ty2Var = this.P;
        wl wlVar = ty2Var.g0;
        wl wlVar2 = ty2Var.g0;
        wlVar.setOnDismissListener(this);
        ty2Var.X = this;
        ty2Var.f0 = true;
        wlVar2.setFocusable(true);
        View view2 = this.U;
        boolean z = this.W == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.W = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.Q);
        }
        view2.addOnAttachStateChangeListener(this.R);
        ty2Var.W = view2;
        ty2Var.T = this.a0;
        boolean z2 = this.Y;
        Context context = this.J;
        px2 px2Var = this.L;
        if (!z2) {
            this.Z = py2.m(px2Var, context, this.N);
            this.Y = true;
        }
        ty2Var.r(this.Z);
        wlVar2.setInputMethodMode(2);
        Rect rect = this.I;
        ty2Var.e0 = rect != null ? new Rect(rect) : null;
        ty2Var.g();
        m41 m41Var = ty2Var.K;
        m41Var.setOnKeyListener(this);
        if (this.b0) {
            sx2 sx2Var = this.K;
            if (sx2Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m41Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(sx2Var.m);
                }
                frameLayout.setEnabled(false);
                m41Var.addHeaderView(frameLayout, null, false);
            }
        }
        ty2Var.q(px2Var);
        ty2Var.g();
    }

    @Override // defpackage.vy2
    public final void i() {
        this.Y = false;
        px2 px2Var = this.L;
        if (px2Var != null) {
            px2Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.xn4
    public final m41 j() {
        return this.P.K;
    }

    @Override // defpackage.py2
    public final void n(View view) {
        this.T = view;
    }

    @Override // defpackage.py2
    public final void o(boolean z) {
        this.L.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.X = true;
        this.K.d(true);
        ViewTreeObserver viewTreeObserver = this.W;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.W = this.U.getViewTreeObserver();
            }
            this.W.removeGlobalOnLayoutListener(this.Q);
            this.W = null;
        }
        this.U.removeOnAttachStateChangeListener(this.R);
        PopupWindow.OnDismissListener onDismissListener = this.S;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.py2
    public final void p(int i) {
        this.a0 = i;
    }

    @Override // defpackage.py2
    public final void q(int i) {
        this.P.N = i;
    }

    @Override // defpackage.py2
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.S = onDismissListener;
    }

    @Override // defpackage.py2
    public final void s(boolean z) {
        this.b0 = z;
    }

    @Override // defpackage.py2
    public final void t(int i) {
        this.P.m(i);
    }
}
