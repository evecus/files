package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r85 implements vy2 {
    public sx2 I;
    public ky2 J;
    public final /* synthetic */ Toolbar K;

    public r85(Toolbar toolbar) {
        this.K = toolbar;
    }

    @Override // defpackage.vy2
    public final boolean c(oy4 oy4Var) {
        return false;
    }

    @Override // defpackage.vy2
    public final boolean d() {
        return false;
    }

    @Override // defpackage.vy2
    public final boolean e(ky2 ky2Var) {
        Toolbar toolbar = this.K;
        KeyEvent.Callback callback = toolbar.Q;
        if (callback instanceof k70) {
            ((my2) ((k70) callback)).I.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.Q);
        toolbar.removeView(toolbar.P);
        toolbar.Q = null;
        ArrayList arrayList = toolbar.p0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.J = null;
        toolbar.requestLayout();
        ky2Var.C = false;
        ky2Var.n.q(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.vy2
    public final boolean h(ky2 ky2Var) {
        Toolbar toolbar = this.K;
        toolbar.c();
        ViewParent parent = toolbar.P.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.P);
            }
            toolbar.addView(toolbar.P);
        }
        View actionView = ky2Var.getActionView();
        toolbar.Q = actionView;
        this.J = ky2Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.Q);
            }
            s85 h = Toolbar.h();
            h.a = (toolbar.V & 112) | 8388611;
            h.b = (byte) 2;
            toolbar.Q.setLayoutParams(h);
            toolbar.addView(toolbar.Q);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((s85) childAt.getLayoutParams()).b != 2 && childAt != toolbar.I) {
                toolbar.removeViewAt(childCount);
                toolbar.p0.add(childAt);
            }
        }
        toolbar.requestLayout();
        ky2Var.C = true;
        ky2Var.n.q(false);
        KeyEvent.Callback callback = toolbar.Q;
        if (callback instanceof k70) {
            ((my2) ((k70) callback)).I.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.vy2
    public final void i() {
        if (this.J != null) {
            sx2 sx2Var = this.I;
            if (sx2Var != null) {
                int size = sx2Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.I.getItem(i) == this.J) {
                        return;
                    }
                }
            }
            e(this.J);
        }
    }

    @Override // defpackage.vy2
    public final void k(Context context, sx2 sx2Var) {
        ky2 ky2Var;
        sx2 sx2Var2 = this.I;
        if (sx2Var2 != null && (ky2Var = this.J) != null) {
            sx2Var2.e(ky2Var);
        }
        this.I = sx2Var;
    }

    @Override // defpackage.vy2
    public final void a(sx2 sx2Var, boolean z) {
    }
}
