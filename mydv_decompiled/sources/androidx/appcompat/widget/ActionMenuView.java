package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.media3.common.util.Log;
import defpackage.fs5;
import defpackage.ky2;
import defpackage.n84;
import defpackage.q85;
import defpackage.r6;
import defpackage.rx2;
import defpackage.sx2;
import defpackage.t6;
import defpackage.tj2;
import defpackage.u6;
import defpackage.uj2;
import defpackage.uu2;
import defpackage.v6;
import defpackage.w6;
import defpackage.x6;
import defpackage.yy2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ActionMenuView extends uj2 implements rx2, yy2 {
    public sx2 a0;
    public Context b0;
    public int c0;
    public boolean d0;
    public u6 e0;
    public q85 f0;
    public boolean g0;
    public int h0;
    public final int i0;
    public final int j0;
    public x6 k0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.i0 = (int) (56.0f * f);
        this.j0 = (int) (f * 4.0f);
        this.b0 = context;
        this.c0 = 0;
    }

    public static w6 i() {
        w6 w6Var = new w6(-2, -2);
        w6Var.a = false;
        ((LinearLayout.LayoutParams) w6Var).gravity = 16;
        return w6Var;
    }

    public static w6 j(ViewGroup.LayoutParams layoutParams) {
        w6 w6Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof w6) {
            w6 w6Var2 = (w6) layoutParams;
            w6Var = new w6(w6Var2);
            w6Var.a = w6Var2.a;
        } else {
            w6Var = new w6(layoutParams);
        }
        if (((LinearLayout.LayoutParams) w6Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) w6Var).gravity = 16;
        }
        return w6Var;
    }

    @Override // defpackage.rx2
    public final boolean a(ky2 ky2Var) {
        return this.a0.r(ky2Var, null, 0);
    }

    @Override // defpackage.yy2
    public final void b(sx2 sx2Var) {
        this.a0 = sx2Var;
    }

    @Override // defpackage.uj2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w6;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.uj2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ tj2 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.uj2
    /* renamed from: f */
    public final tj2 generateLayoutParams(AttributeSet attributeSet) {
        return new w6(getContext(), attributeSet);
    }

    @Override // defpackage.uj2
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ tj2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.uj2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.uj2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new w6(getContext(), attributeSet);
    }

    public Menu getMenu() {
        sx2 sx2Var = this.a0;
        if (sx2Var != null) {
            return sx2Var;
        }
        Context context = getContext();
        sx2 sx2Var2 = new sx2(context);
        this.a0 = sx2Var2;
        sx2Var2.e = new uu2(this);
        u6 u6Var = new u6(context);
        this.e0 = u6Var;
        u6Var.T = true;
        u6Var.U = true;
        u6Var.M = new n84((byte) 13);
        this.a0.c(u6Var, this.b0);
        u6 u6Var2 = this.e0;
        u6Var2.P = this;
        sx2 sx2Var3 = u6Var2.K;
        this.a0 = sx2Var3;
        return sx2Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        u6 u6Var = this.e0;
        t6 t6Var = u6Var.Q;
        if (t6Var != null) {
            return t6Var.getDrawable();
        }
        if (u6Var.S) {
            return u6Var.R;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof v6)) {
            z = ((v6) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof v6)) ? z : ((v6) childAt2).c() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u6 u6Var = this.e0;
        if (u6Var != null) {
            u6Var.i();
            if (this.e0.j()) {
                this.e0.g();
                this.e0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u6 u6Var = this.e0;
        if (u6Var != null) {
            u6Var.g();
            r6 r6Var = u6Var.b0;
            if (r6Var == null || !r6Var.b()) {
                return;
            }
            r6Var.i.dismiss();
        }
    }

    @Override // defpackage.uj2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.g0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = fs5.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                w6 w6Var = (w6) childAt.getLayoutParams();
                if (w6Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) w6Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) w6Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) w6Var).leftMargin) + ((LinearLayout.LayoutParams) w6Var).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                w6 w6Var2 = (w6) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !w6Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) w6Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) w6Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            w6 w6Var3 = (w6) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !w6Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) w6Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) w6Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.uj2, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        sx2 sx2Var;
        boolean z = this.g0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.g0 = z2;
        if (z != z2) {
            this.h0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.g0 && (sx2Var = this.a0) != null && size != this.h0) {
            this.h0 = size;
            sx2Var.q(true);
        }
        int childCount = getChildCount();
        if (!this.g0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                w6 w6Var = (w6) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) w6Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) w6Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.i0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.j0;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                w6 w6Var2 = (w6) childAt.getLayoutParams();
                w6Var2.f = false;
                w6Var2.c = 0;
                w6Var2.b = 0;
                w6Var2.d = false;
                ((LinearLayout.LayoutParams) w6Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) w6Var2).rightMargin = 0;
                w6Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = w6Var2.a ? 1 : i10;
                w6 w6Var3 = (w6) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                w6Var3.d = !w6Var3.a && z6;
                w6Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (w6Var2.d) {
                    i17++;
                }
                if (w6Var2.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Log.LOG_LEVEL_OFF;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                w6 w6Var4 = (w6) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (w6Var4.d) {
                    int i30 = w6Var4.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                w6 w6Var5 = (w6) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && w6Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    w6Var5.b += r11;
                    w6Var5.f = r11;
                    i25--;
                } else if (w6Var5.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((w6) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((w6) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    w6 w6Var6 = (w6) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        w6Var6.c = i34;
                        w6Var6.f = true;
                        if (i35 == 0 && !w6Var6.e) {
                            ((LinearLayout.LayoutParams) w6Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (w6Var6.a) {
                        w6Var6.c = i34;
                        w6Var6.f = true;
                        ((LinearLayout.LayoutParams) w6Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) w6Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) w6Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                w6 w6Var7 = (w6) childAt4.getLayoutParams();
                if (w6Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((w6Var7.b * i24) + w6Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.e0.Y = z;
    }

    public void setOnMenuItemClickListener(x6 x6Var) {
        this.k0 = x6Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        u6 u6Var = this.e0;
        t6 t6Var = u6Var.Q;
        if (t6Var != null) {
            t6Var.setImageDrawable(drawable);
        } else {
            u6Var.S = true;
            u6Var.R = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.d0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            if (i == 0) {
                this.b0 = getContext();
            } else {
                this.b0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(u6 u6Var) {
        this.e0 = u6Var;
        u6Var.P = this;
        this.a0 = u6Var.K;
    }

    @Override // defpackage.uj2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
