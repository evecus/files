package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.github.mytv.dv.R;
import defpackage.bs5;
import defpackage.dr5;
import defpackage.fv5;
import defpackage.g6;
import defpackage.gv5;
import defpackage.h6;
import defpackage.hv5;
import defpackage.i6;
import defpackage.iv5;
import defpackage.j42;
import defpackage.j6;
import defpackage.jv5;
import defpackage.k6;
import defpackage.kv5;
import defpackage.lv5;
import defpackage.m93;
import defpackage.mv5;
import defpackage.n93;
import defpackage.o12;
import defpackage.o93;
import defpackage.qu5;
import defpackage.r6;
import defpackage.r85;
import defpackage.sx2;
import defpackage.u6;
import defpackage.uy2;
import defpackage.vq5;
import defpackage.vv5;
import defpackage.wp0;
import defpackage.y85;
import defpackage.yv5;
import defpackage.zy;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements m93, n93 {
    public static final int[] q0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final yv5 r0;
    public static final Rect s0;
    public int I;
    public int J;
    public ContentFrameLayout K;
    public ActionBarContainer L;
    public wp0 M;
    public Drawable N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public final Rect U;
    public final Rect V;
    public final Rect W;
    public final Rect a0;
    public final Rect b0;
    public boolean c0;
    public boolean d0;
    public yv5 e0;
    public yv5 f0;
    public yv5 g0;
    public yv5 h0;
    public i6 i0;
    public OverScroller j0;
    public ViewPropertyAnimator k0;
    public final g6 l0;
    public final h6 m0;
    public final h6 n0;
    public final o93 o0;
    public final k6 p0;

    static {
        int i = Build.VERSION.SDK_INT;
        mv5 lv5Var = i >= 36 ? new lv5() : i >= 35 ? new kv5() : i >= 34 ? new jv5() : i >= 31 ? new iv5() : i >= 30 ? new hv5() : i >= 29 ? new gv5() : new fv5();
        lv5Var.h(o12.b(0, 1, 0, 1));
        r0 = lv5Var.b();
        s0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = 0;
        this.U = new Rect();
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = true;
        this.d0 = false;
        yv5 yv5Var = yv5.b;
        this.e0 = yv5Var;
        this.f0 = yv5Var;
        this.g0 = yv5Var;
        this.h0 = yv5Var;
        this.l0 = new g6(this);
        this.m0 = new h6(this, (byte) 0);
        this.n0 = new h6(this, (byte) 1);
        k(context);
        this.o0 = new o93();
        k6 k6Var = new k6(context);
        k6Var.setWillNotDraw(true);
        this.p0 = k6Var;
        addView(k6Var);
    }

    public static boolean p(View view, int i, int i2, int i3, int i4) {
        boolean z;
        j6 j6Var = (j6) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) j6Var).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) j6Var).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) j6Var).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) j6Var).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) j6Var).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) j6Var).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) j6Var).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) j6Var).bottomMargin = i4;
        return true;
    }

    @Override // defpackage.m93
    public final void a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(viewGroup, i, i2, i3, i4);
        }
    }

    public final boolean b() {
        ActionMenuView actionMenuView;
        o();
        Toolbar toolbar = ((y85) this.M).a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.I) != null && actionMenuView.d0;
    }

    @Override // defpackage.n93
    public final void c(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(viewGroup, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j6;
    }

    public final void d() {
        u6 u6Var;
        o();
        ActionMenuView actionMenuView = ((y85) this.M).a.I;
        if (actionMenuView == null || (u6Var = actionMenuView.e0) == null) {
            return;
        }
        u6Var.g();
        r6 r6Var = u6Var.b0;
        if (r6Var == null || !r6Var.b()) {
            return;
        }
        r6Var.i.dismiss();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.N != null) {
            if (this.L.getVisibility() == 0) {
                i = (int) (this.L.getTranslationY() + this.L.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.N.setBounds(0, i, getWidth(), this.N.getIntrinsicHeight() + i);
            this.N.draw(canvas);
        }
    }

    @Override // defpackage.m93
    public final void e(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.m93
    public final boolean g(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new j6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.L;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o93 o93Var = this.o0;
        return o93Var.b | o93Var.a;
    }

    public CharSequence getTitle() {
        o();
        return ((y85) this.M).a.getTitle();
    }

    @Override // defpackage.m93
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void i() {
        removeCallbacks(this.m0);
        removeCallbacks(this.n0);
        ViewPropertyAnimator viewPropertyAnimator = this.k0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean j() {
        u6 u6Var;
        o();
        ActionMenuView actionMenuView = ((y85) this.M).a.I;
        return (actionMenuView == null || (u6Var = actionMenuView.e0) == null || !u6Var.g()) ? false : true;
    }

    public final void k(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(q0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.N = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.j0 = new OverScroller(context);
    }

    public final void l(int i) {
        o();
        if (i == 2) {
            ((y85) this.M).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((y85) this.M).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final boolean m() {
        u6 u6Var;
        o();
        ActionMenuView actionMenuView = ((y85) this.M).a.I;
        if (actionMenuView == null || (u6Var = actionMenuView.e0) == null) {
            return false;
        }
        return u6Var.c0 != null || u6Var.j();
    }

    public final boolean n() {
        u6 u6Var;
        o();
        ActionMenuView actionMenuView = ((y85) this.M).a.I;
        return (actionMenuView == null || (u6Var = actionMenuView.e0) == null || !u6Var.j()) ? false : true;
    }

    public final void o() {
        wp0 wrapper;
        if (this.K == null) {
            this.K = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.L = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof wp0) {
                wrapper = (wp0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    zy.i("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.M = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean p;
        o();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = dr5.a;
        k6 k6Var = this.p0;
        yv5 yv5Var = r0;
        Rect rect = this.b0;
        vq5.b(k6Var, yv5Var, rect);
        boolean equals = rect.equals(s0);
        this.c0 = !equals;
        boolean z4 = equals || (z2 && z3);
        this.d0 = z4;
        i6 i6Var = this.i0;
        if (i6Var != null) {
            ((qu5) i6Var).o = (z2 || z4) ? false : true;
        }
        yv5 c = yv5.c(windowInsets, this);
        vv5 vv5Var = c.a;
        o12 n = vv5Var.n();
        int i = n.a;
        int i2 = n.a;
        int i3 = n.b;
        int i4 = n.c;
        this.a0.set(i, i3, i4, n.d);
        if (this.d0) {
            o12 i5 = vv5Var.i(2);
            int i6 = i5.a;
            int i7 = i5.c;
            this.L.setPadding(i2 - i6, i3, i4 - i7, 0);
            p = p(this.L, i5.a, 0, i7, 0);
        } else {
            this.L.setPadding(0, 0, 0, 0);
            p = p(this.L, i2, i3, i4, 0);
        }
        Rect rect2 = this.U;
        vq5.b(this, c, rect2);
        yv5 r = vv5Var.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.e0 = r;
        if (!this.f0.equals(r)) {
            this.f0 = this.e0;
            p = true;
        }
        Rect rect3 = this.V;
        if (rect3.equals(rect2)) {
            z = p;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return vv5Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k(getContext());
        WeakHashMap weakHashMap = dr5.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                j6 j6Var = (j6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) j6Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) j6Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        o();
        measureChildWithMargins(this.L, i, 0, i2, 0);
        j6 j6Var = (j6) this.L.getLayoutParams();
        int max = Math.max(0, this.L.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) j6Var).leftMargin + ((ViewGroup.MarginLayoutParams) j6Var).rightMargin);
        int max2 = Math.max(0, this.L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j6Var).topMargin + ((ViewGroup.MarginLayoutParams) j6Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.L.getMeasuredState());
        WeakHashMap weakHashMap = dr5.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.I;
            if (this.d0) {
                measuredHeight += this.a0.top;
            }
            if (this.P && this.L.getTabContainer() != null) {
                measuredHeight += this.I;
            }
        } else {
            measuredHeight = this.L.getVisibility() != 8 ? this.L.getMeasuredHeight() : 0;
        }
        Rect rect = this.U;
        Rect rect2 = this.W;
        rect2.set(rect);
        yv5 yv5Var = this.e0;
        this.g0 = yv5Var;
        if (this.O || z || !this.c0) {
            o12 b = this.d0 ? o12.b(yv5Var.a.n().a, Math.max(this.g0.a.n().b, measuredHeight), this.g0.a.n().c, Math.max(this.g0.a.n().d, 0)) : o12.b(yv5Var.a.n().a, this.g0.a.n().b + measuredHeight, this.g0.a.n().c, this.g0.a.n().d);
            yv5 yv5Var2 = this.g0;
            int i3 = Build.VERSION.SDK_INT;
            mv5 lv5Var = i3 >= 36 ? new lv5(yv5Var2) : i3 >= 35 ? new kv5(yv5Var2) : i3 >= 34 ? new jv5(yv5Var2) : i3 >= 31 ? new iv5(yv5Var2) : i3 >= 30 ? new hv5(yv5Var2) : i3 >= 29 ? new gv5(yv5Var2) : new fv5(yv5Var2);
            lv5Var.h(b);
            this.g0 = lv5Var.b();
        } else {
            boolean z2 = this.d0;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.g0 = this.g0.a.r(0, measuredHeight, 0, 0);
        }
        p(this.K, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.h0.equals(this.g0)) {
            yv5 yv5Var3 = this.g0;
            this.h0 = yv5Var3;
            dr5.b(this.K, yv5Var3);
        }
        measureChildWithMargins(this.K, i, 0, i2, 0);
        j6 j6Var2 = (j6) this.K.getLayoutParams();
        int max3 = Math.max(max, this.K.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) j6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) j6Var2).rightMargin);
        int max4 = Math.max(max2, this.K.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j6Var2).topMargin + ((ViewGroup.MarginLayoutParams) j6Var2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.K.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.Q || !z) {
            return false;
        }
        this.j0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        if (this.j0.getFinalY() > this.L.getHeight()) {
            i();
            this.n0.run();
        } else {
            i();
            this.m0.run();
        }
        this.R = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.S + i2;
        this.S = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        qu5 qu5Var;
        bs5 bs5Var;
        this.o0.a = i;
        this.S = getActionBarHideOffset();
        i();
        i6 i6Var = this.i0;
        if (i6Var == null || (bs5Var = (qu5Var = (qu5) i6Var).s) == null) {
            return;
        }
        bs5Var.a();
        qu5Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.L.getVisibility() != 0) {
            return false;
        }
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.Q || this.R) {
            return;
        }
        if (this.S <= this.L.getHeight()) {
            i();
            postDelayed(this.m0, 600L);
        } else {
            i();
            postDelayed(this.n0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        o();
        int i2 = this.T ^ i;
        this.T = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        i6 i6Var = this.i0;
        if (i6Var != null) {
            qu5 qu5Var = (qu5) i6Var;
            qu5Var.o = (z2 || this.d0) ? false : true;
            if (z || !z2) {
                if (qu5Var.p) {
                    qu5Var.p = false;
                    qu5Var.n(true);
                }
            } else if (!qu5Var.p) {
                qu5Var.p = true;
                qu5Var.n(true);
            }
        }
        if ((i2 & 256) == 0 || this.i0 == null) {
            return;
        }
        WeakHashMap weakHashMap = dr5.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.J = i;
        i6 i6Var = this.i0;
        if (i6Var != null) {
            ((qu5) i6Var).n = i;
        }
    }

    public final void q(sx2 sx2Var, uy2 uy2Var) {
        o();
        y85 y85Var = (y85) this.M;
        Toolbar toolbar = y85Var.a;
        u6 u6Var = y85Var.m;
        if (u6Var == null) {
            u6Var = new u6(toolbar.getContext());
            y85Var.m = u6Var;
        }
        u6Var.M = uy2Var;
        if (sx2Var == null && toolbar.I == null) {
            return;
        }
        toolbar.f();
        sx2 sx2Var2 = toolbar.I.a0;
        if (sx2Var2 == sx2Var) {
            return;
        }
        if (sx2Var2 != null) {
            sx2Var2.s(toolbar.v0);
            sx2Var2.s(toolbar.w0);
        }
        if (toolbar.w0 == null) {
            toolbar.w0 = new r85(toolbar);
        }
        u6Var.Y = true;
        Context context = toolbar.R;
        if (sx2Var != null) {
            sx2Var.c(u6Var, context);
            sx2Var.c(toolbar.w0, toolbar.R);
        } else {
            u6Var.k(context, null);
            toolbar.w0.k(toolbar.R, null);
            u6Var.i();
            toolbar.w0.i();
        }
        toolbar.I.setPopupTheme(toolbar.S);
        toolbar.I.setPresenter(u6Var);
        toolbar.v0 = u6Var;
        toolbar.t();
    }

    public final void r() {
        o();
        ((y85) this.M).l = true;
    }

    public final boolean s() {
        u6 u6Var;
        o();
        ActionMenuView actionMenuView = ((y85) this.M).a.I;
        return (actionMenuView == null || (u6Var = actionMenuView.e0) == null || !u6Var.l()) ? false : true;
    }

    public void setActionBarHideOffset(int i) {
        i();
        this.L.setTranslationY(-Math.max(0, Math.min(i, this.L.getHeight())));
    }

    public void setActionBarVisibilityCallback(i6 i6Var) {
        this.i0 = i6Var;
        if (getWindowToken() != null) {
            ((qu5) this.i0).n = this.J;
            int i = this.T;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = dr5.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.P = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.Q) {
            this.Q = z;
            if (z) {
                return;
            }
            i();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        o();
        y85 y85Var = (y85) this.M;
        y85Var.d = i != 0 ? j42.C(y85Var.a.getContext(), i) : null;
        y85Var.c();
    }

    public void setLogo(int i) {
        o();
        y85 y85Var = (y85) this.M;
        y85Var.e = i != 0 ? j42.C(y85Var.a.getContext(), i) : null;
        y85Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.O = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        o();
        ((y85) this.M).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        o();
        y85 y85Var = (y85) this.M;
        if (y85Var.g) {
            return;
        }
        Toolbar toolbar = y85Var.a;
        y85Var.h = charSequence;
        if ((y85Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (y85Var.g) {
                dr5.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new j6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        o();
        y85 y85Var = (y85) this.M;
        y85Var.d = drawable;
        y85Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.m93
    public final void f(int i, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
