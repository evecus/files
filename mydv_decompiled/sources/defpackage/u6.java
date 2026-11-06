package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u6 implements vy2 {
    public final Context I;
    public Context J;
    public sx2 K;
    public final LayoutInflater L;
    public uy2 M;
    public yy2 P;
    public t6 Q;
    public Drawable R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public r6 a0;
    public r6 b0;
    public wn1 c0;
    public s6 d0;
    public final int N = R.layout.abc_action_menu_layout;
    public final int O = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray Z = new SparseBooleanArray();
    public final uu2 e0 = new uu2(this);

    public u6(Context context) {
        this.I = context;
        this.L = LayoutInflater.from(context);
    }

    @Override // defpackage.vy2
    public final void a(sx2 sx2Var, boolean z) {
        g();
        r6 r6Var = this.b0;
        if (r6Var != null && r6Var.b()) {
            r6Var.i.dismiss();
        }
        uy2 uy2Var = this.M;
        if (uy2Var != null) {
            uy2Var.a(sx2Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xy2] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(ky2 ky2Var, View view, ViewGroup viewGroup) {
        View actionView = ky2Var.getActionView();
        if (actionView == null || ky2Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof xy2 ? (xy2) view : (xy2) this.L.inflate(this.O, viewGroup, false);
            actionMenuItemView.a(ky2Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.P);
            s6 s6Var = this.d0;
            if (s6Var == null) {
                s6Var = new s6(this);
                this.d0 = s6Var;
            }
            actionMenuItemView2.setPopupCallback(s6Var);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(ky2Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof w6)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vy2
    public final boolean c(oy4 oy4Var) {
        boolean z;
        if (oy4Var.hasVisibleItems()) {
            oy4 oy4Var2 = oy4Var;
            while (true) {
                sx2 sx2Var = oy4Var2.z;
                if (sx2Var == this.K) {
                    break;
                }
                oy4Var2 = (oy4) sx2Var;
            }
            ky2 ky2Var = oy4Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.P;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof xy2) && ((xy2) childAt).getItemData() == ky2Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = oy4Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = oy4Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                r6 r6Var = new r6(this, this.J, oy4Var, view);
                this.b0 = r6Var;
                r6Var.g = z;
                py2 py2Var = r6Var.i;
                if (py2Var != null) {
                    py2Var.o(z);
                }
                r6 r6Var2 = this.b0;
                if (!r6Var2.b()) {
                    if (r6Var2.e == null) {
                        zy.i("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    r6Var2.d(0, 0, false, false);
                }
                uy2 uy2Var = this.M;
                if (uy2Var != null) {
                    uy2Var.k(oy4Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vy2
    public final boolean d() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        u6 u6Var = this;
        sx2 sx2Var = u6Var.K;
        if (sx2Var != null) {
            arrayList = sx2Var.m();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = u6Var.X;
        int i4 = u6Var.W;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) u6Var.P;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            ky2 ky2Var = (ky2) arrayList.get(i5);
            int i8 = ky2Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (u6Var.Y && ky2Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (u6Var.T && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = u6Var.Z;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            ky2 ky2Var2 = (ky2) arrayList.get(i10);
            int i12 = ky2Var2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = ky2Var2.b;
            if (z3) {
                View b = u6Var.b(ky2Var2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                ky2Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = u6Var.b(ky2Var2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        ky2 ky2Var3 = (ky2) arrayList.get(i14);
                        if (ky2Var3.b == i13) {
                            if ((ky2Var3.x & 32) == 32) {
                                i9++;
                            }
                            ky2Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                ky2Var2.f(z5);
            } else {
                ky2Var2.f(false);
                i10++;
                i2 = 2;
                u6Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            u6Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.vy2
    public final boolean e(ky2 ky2Var) {
        return false;
    }

    @Override // defpackage.vy2
    public final void f(uy2 uy2Var) {
        throw null;
    }

    public final boolean g() {
        Object obj;
        wn1 wn1Var = this.c0;
        if (wn1Var != null && (obj = this.P) != null) {
            ((View) obj).removeCallbacks(wn1Var);
            this.c0 = null;
            return true;
        }
        r6 r6Var = this.a0;
        if (r6Var == null) {
            return false;
        }
        if (r6Var.b()) {
            r6Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.vy2
    public final boolean h(ky2 ky2Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vy2
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.P;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            sx2 sx2Var = this.K;
            if (sx2Var != null) {
                sx2Var.j();
                ArrayList m = this.K.m();
                int size = m.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ky2 ky2Var = (ky2) m.get(i2);
                    if ((ky2Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        ky2 itemData = childAt instanceof xy2 ? ((xy2) childAt).getItemData() : null;
                        View b = b(ky2Var, childAt, viewGroup);
                        if (ky2Var != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.P).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.Q) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.P).requestLayout();
        sx2 sx2Var2 = this.K;
        if (sx2Var2 != null) {
            sx2Var2.j();
            ArrayList arrayList2 = sx2Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ly2 ly2Var = ((ky2) arrayList2.get(i3)).A;
            }
        }
        sx2 sx2Var3 = this.K;
        if (sx2Var3 != null) {
            sx2Var3.j();
            arrayList = sx2Var3.j;
        }
        if (this.T && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((ky2) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        t6 t6Var = this.Q;
        if (z) {
            if (t6Var == null) {
                t6Var = new t6(this, this.I);
                this.Q = t6Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) t6Var.getParent();
            if (viewGroup3 != this.P) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.Q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.P;
                t6 t6Var2 = this.Q;
                actionMenuView.getClass();
                w6 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(t6Var2, i4);
            }
        } else if (t6Var != null) {
            Object parent = t6Var.getParent();
            Object obj = this.P;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.Q);
            }
        }
        ((ActionMenuView) this.P).setOverflowReserved(this.T);
    }

    public final boolean j() {
        r6 r6Var = this.a0;
        return r6Var != null && r6Var.b();
    }

    @Override // defpackage.vy2
    public final void k(Context context, sx2 sx2Var) {
        this.J = context;
        LayoutInflater.from(context);
        this.K = sx2Var;
        Resources resources = context.getResources();
        if (!this.U) {
            this.T = true;
        }
        int i = 2;
        this.V = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.X = i;
        int i4 = this.V;
        if (this.T) {
            if (this.Q == null) {
                t6 t6Var = new t6(this, this.I);
                this.Q = t6Var;
                if (this.S) {
                    t6Var.setImageDrawable(this.R);
                    this.R = null;
                    this.S = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.Q.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.Q.getMeasuredWidth();
        } else {
            this.Q = null;
        }
        this.W = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        sx2 sx2Var;
        boolean z = false;
        if (this.T && !j() && (sx2Var = this.K) != null && this.P != null && this.c0 == null) {
            sx2Var.j();
            if (!sx2Var.j.isEmpty()) {
                wn1 wn1Var = new wn1((byte) 2, this, new r6(this, this.J, this.K, this.Q), z);
                this.c0 = wn1Var;
                ((View) this.P).post(wn1Var);
                return true;
            }
        }
        return false;
    }
}
