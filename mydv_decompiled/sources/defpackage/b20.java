package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b20 extends py2 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context J;
    public final int K;
    public final int L;
    public final boolean M;
    public final Handler N;
    public View V;
    public View W;
    public int X;
    public boolean Y;
    public boolean Z;
    public int a0;
    public int b0;
    public boolean d0;
    public uy2 e0;
    public ViewTreeObserver f0;
    public PopupWindow.OnDismissListener g0;
    public boolean h0;
    public final ArrayList O = new ArrayList();
    public final ArrayList P = new ArrayList();
    public final cm Q = new cm(this, 2);
    public final y10 R = new y10(this, (byte) 0);
    public final uu2 S = new uu2(this);
    public int T = 0;
    public int U = 0;
    public boolean c0 = false;

    public b20(Context context, View view, int i, boolean z) {
        this.J = context;
        this.V = view;
        this.L = i;
        this.M = z;
        this.X = view.getLayoutDirection() != 1 ? (byte) 1 : (byte) 0;
        Resources resources = context.getResources();
        this.K = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.N = new Handler();
    }

    @Override // defpackage.vy2
    public final void a(sx2 sx2Var, boolean z) {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (sx2Var == ((a20) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((a20) arrayList.get(i2)).b.d(false);
        }
        a20 a20Var = (a20) arrayList.remove(i);
        sx2 sx2Var2 = a20Var.b;
        ty2 ty2Var = a20Var.a;
        wl wlVar = ty2Var.g0;
        sx2Var2.s(this);
        if (this.h0) {
            wlVar.setExitTransition(null);
            wlVar.setAnimationStyle(0);
        }
        ty2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.X = ((a20) arrayList.get(size2 - 1)).c;
        } else {
            this.X = this.V.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((a20) arrayList.get(0)).b.d(false);
                return;
            }
            return;
        }
        dismiss();
        uy2 uy2Var = this.e0;
        if (uy2Var != null) {
            uy2Var.a(sx2Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f0.removeGlobalOnLayoutListener(this.Q);
            }
            this.f0 = null;
        }
        this.W.removeOnAttachStateChangeListener(this.R);
        this.g0.onDismiss();
    }

    @Override // defpackage.xn4
    public final boolean b() {
        ArrayList arrayList = this.P;
        return arrayList.size() > 0 && ((a20) arrayList.get(0)).a.g0.isShowing();
    }

    @Override // defpackage.vy2
    public final boolean c(oy4 oy4Var) {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a20 a20Var = (a20) obj;
            if (oy4Var == a20Var.b) {
                a20Var.a.K.requestFocus();
                return true;
            }
        }
        if (!oy4Var.hasVisibleItems()) {
            return false;
        }
        l(oy4Var);
        uy2 uy2Var = this.e0;
        if (uy2Var != null) {
            uy2Var.k(oy4Var);
        }
        return true;
    }

    @Override // defpackage.vy2
    public final boolean d() {
        return false;
    }

    @Override // defpackage.xn4
    public final void dismiss() {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        if (size > 0) {
            a20[] a20VarArr = (a20[]) arrayList.toArray(new a20[size]);
            for (int i = size - 1; i >= 0; i--) {
                a20 a20Var = a20VarArr[i];
                if (a20Var.a.g0.isShowing()) {
                    a20Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.vy2
    public final void f(uy2 uy2Var) {
        this.e0 = uy2Var;
    }

    @Override // defpackage.xn4
    public final void g() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((sx2) obj);
        }
        arrayList.clear();
        View view = this.V;
        this.W = view;
        if (view != null) {
            boolean z = this.f0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.Q);
            }
            this.W.addOnAttachStateChangeListener(this.R);
        }
    }

    @Override // defpackage.vy2
    public final void i() {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((a20) obj).a.K.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((px2) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.xn4
    public final m41 j() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((a20) r7.w(arrayList, 1)).a.K;
    }

    @Override // defpackage.py2
    public final void l(sx2 sx2Var) {
        sx2Var.c(this, this.J);
        if (b()) {
            u(sx2Var);
        } else {
            this.O.add(sx2Var);
        }
    }

    @Override // defpackage.py2
    public final void n(View view) {
        if (this.V != view) {
            this.V = view;
            this.U = Gravity.getAbsoluteGravity(this.T, view.getLayoutDirection());
        }
    }

    @Override // defpackage.py2
    public final void o(boolean z) {
        this.c0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        a20 a20Var;
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                a20Var = null;
                break;
            }
            a20Var = (a20) arrayList.get(i);
            if (!a20Var.a.g0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (a20Var != null) {
            a20Var.b.d(false);
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
        if (this.T != i) {
            this.T = i;
            this.U = Gravity.getAbsoluteGravity(i, this.V.getLayoutDirection());
        }
    }

    @Override // defpackage.py2
    public final void q(int i) {
        this.Y = true;
        this.a0 = i;
    }

    @Override // defpackage.py2
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.g0 = onDismissListener;
    }

    @Override // defpackage.py2
    public final void s(boolean z) {
        this.d0 = z;
    }

    @Override // defpackage.py2
    public final void t(int i) {
        this.Z = true;
        this.b0 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x015b, code lost:
    
        if (((r2.getWidth() + r9[r16]) + r5) > r7.right) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015d, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if ((r9[r16] - r5) < 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.sx2 r19) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b20.u(sx2):void");
    }
}
