package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mytv.dv.R;
import defpackage.dr5;
import defpackage.f6;
import defpackage.fs5;
import defpackage.g1;
import defpackage.j42;
import defpackage.qz3;
import defpackage.r6;
import defpackage.sx2;
import defpackage.u6;
import defpackage.y6;
import defpackage.yy2;
import defpackage.zr5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionBarContextView extends ViewGroup {
    public final g1 I;
    public final Context J;
    public ActionMenuView K;
    public u6 L;
    public int M;
    public zr5 N;
    public boolean O;
    public boolean P;
    public CharSequence Q;
    public CharSequence R;
    public View S;
    public View T;
    public View U;
    public LinearLayout V;
    public TextView W;
    public TextView a0;
    public final int b0;
    public final int c0;
    public boolean d0;
    public final int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.I = new g1(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.J = context;
        } else {
            this.J = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : j42.C(context, resourceId));
        this.b0 = obtainStyledAttributes.getResourceId(5, 0);
        this.c0 = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.e0 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
        this.i0 = getPaddingLeft();
        this.j0 = getPaddingTop();
        this.k0 = getPaddingRight();
        this.l0 = getPaddingBottom();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(y6 y6Var) {
        View view = this.S;
        byte b = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.e0, (ViewGroup) this, false);
            this.S = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.S);
        }
        View findViewById = this.S.findViewById(R.id.action_mode_close_button);
        this.T = findViewById;
        findViewById.setOnClickListener(new f6(y6Var, b));
        sx2 d = y6Var.d();
        u6 u6Var = this.L;
        if (u6Var != null) {
            u6Var.g();
            r6 r6Var = u6Var.b0;
            if (r6Var != null && r6Var.b()) {
                r6Var.i.dismiss();
            }
        }
        u6 u6Var2 = new u6(getContext());
        this.L = u6Var2;
        u6Var2.T = true;
        u6Var2.U = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d.c(this.L, this.J);
        u6 u6Var3 = this.L;
        yy2 yy2Var = u6Var3.P;
        if (yy2Var == null) {
            yy2 yy2Var2 = (yy2) u6Var3.L.inflate(u6Var3.N, (ViewGroup) this, false);
            u6Var3.P = yy2Var2;
            yy2Var2.b(u6Var3.K);
            u6Var3.i();
        }
        yy2 yy2Var3 = u6Var3.P;
        if (yy2Var != yy2Var3) {
            ((ActionMenuView) yy2Var3).setPresenter(u6Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) yy2Var3;
        this.K = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.K, layoutParams);
    }

    public final void d() {
        if (this.V == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.V = linearLayout;
            this.W = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.a0 = (TextView) this.V.findViewById(R.id.action_bar_subtitle);
            int i = this.b0;
            if (i != 0) {
                this.W.setTextAppearance(getContext(), i);
            }
            int i2 = this.c0;
            if (i2 != 0) {
                this.a0.setTextAppearance(getContext(), i2);
            }
        }
        this.W.setText(this.Q);
        this.a0.setText(this.R);
        boolean isEmpty = TextUtils.isEmpty(this.Q);
        boolean isEmpty2 = TextUtils.isEmpty(this.R);
        this.a0.setVisibility(!isEmpty2 ? 0 : 8);
        this.V.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.V.getParent() == null) {
            addView(this.V);
        }
    }

    public final void e() {
        removeAllViews();
        this.U = null;
        this.K = null;
        this.L = null;
        View view = this.T;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, qz3.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        u6 u6Var = this.L;
        if (u6Var != null) {
            Configuration configuration2 = u6Var.J.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            u6Var.X = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            sx2 sx2Var = u6Var.K;
            if (sx2Var != null) {
                sx2Var.q(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.N != null ? this.I.b : getVisibility();
    }

    public int getContentHeight() {
        return this.M;
    }

    public CharSequence getSubtitle() {
        return this.R;
    }

    public CharSequence getTitle() {
        return this.Q;
    }

    public final void i(int i, int i2, int i3) {
        this.f0 = i;
        this.g0 = i2;
        this.h0 = i3;
        l();
    }

    @Override // android.view.View
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            zr5 zr5Var = this.N;
            if (zr5Var != null) {
                zr5Var.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zr5 k(int i, long j) {
        zr5 zr5Var = this.N;
        if (zr5Var != null) {
            zr5Var.b();
        }
        g1 g1Var = this.I;
        if (i != 0) {
            zr5 a = dr5.a(this);
            a.a(0.0f);
            a.c(j);
            g1Var.c.N = a;
            g1Var.b = i;
            a.d(g1Var);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        zr5 a2 = dr5.a(this);
        a2.a(1.0f);
        a2.c(j);
        g1Var.c.N = a2;
        g1Var.b = i;
        a2.d(g1Var);
        return a2;
    }

    public final void l() {
        super.setPadding(this.f0 + this.i0, this.g0 + this.j0, this.h0 + this.k0, this.l0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, qz3.d, R.attr.actionModeStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u6 u6Var = this.L;
        if (u6Var != null) {
            u6Var.g();
            r6 r6Var = this.L.b0;
            if (r6Var == null || !r6Var.b()) {
                return;
            }
            r6Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.P = false;
        }
        if (!this.P) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.P = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.P = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = fs5.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.S;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.S.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int h = h(this.S, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? h - i6 : h + i6;
        }
        LinearLayout linearLayout = this.V;
        if (linearLayout != null && this.U == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(this.V, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.U;
        if (view2 != null) {
            h(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.K;
        if (actionMenuView != null) {
            h(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            zy.i(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            zy.i(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.M;
        int size2 = i3 > 0 ? i3 + this.g0 : View.MeasureSpec.getSize(i2);
        int i4 = size2 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.S;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.S.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.K;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.K, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.V;
        if (linearLayout != null && this.U == null) {
            if (this.d0) {
                this.V.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.V.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.V.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.U;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.U.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.M > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O = false;
        }
        if (!this.O) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.O = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.O = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.M = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.U;
        if (view2 != null) {
            removeView(view2);
        }
        this.U = view;
        if (view != null && (linearLayout = this.V) != null) {
            removeView(linearLayout);
            this.V = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.i0 = i;
        this.j0 = i2;
        this.k0 = i3;
        this.l0 = i4;
        l();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.i0 = i;
            this.k0 = i3;
        } else {
            this.i0 = i3;
            this.k0 = i;
        }
        this.j0 = i2;
        this.l0 = i4;
        l();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.R = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.Q = charSequence;
        d();
        dr5.i(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.d0) {
            requestLayout();
        }
        this.d0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
