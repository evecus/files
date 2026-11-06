package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.github.mytv.dv.R;
import defpackage.bl;
import defpackage.dr5;
import defpackage.eg5;
import defpackage.f6;
import defpackage.fs5;
import defpackage.hk;
import defpackage.j42;
import defpackage.ky2;
import defpackage.l5;
import defpackage.mz4;
import defpackage.p85;
import defpackage.pn;
import defpackage.q85;
import defpackage.qz3;
import defpackage.r85;
import defpackage.s85;
import defpackage.sl;
import defpackage.sx2;
import defpackage.t85;
import defpackage.u6;
import defpackage.u85;
import defpackage.ul;
import defpackage.um;
import defpackage.w85;
import defpackage.wp0;
import defpackage.y85;
import defpackage.z74;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    public boolean A0;
    public final bl B0;
    public ActionMenuView I;
    public um J;
    public um K;
    public sl L;
    public ul M;
    public final Drawable N;
    public final CharSequence O;
    public sl P;
    public View Q;
    public Context R;
    public int S;
    public int T;
    public int U;
    public final int V;
    public final int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public z74 e0;
    public int f0;
    public int g0;
    public final int h0;
    public CharSequence i0;
    public CharSequence j0;
    public ColorStateList k0;
    public ColorStateList l0;
    public boolean m0;
    public boolean n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final int[] q0;
    public final pn r0;
    public ArrayList s0;
    public final q85 t0;
    public y85 u0;
    public u6 v0;
    public r85 w0;
    public boolean x0;
    public hk y0;
    public OnBackInvokedDispatcher z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.h0 = 8388627;
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new int[2];
        this.r0 = new pn((Runnable) new p85(this, (byte) 1));
        this.s0 = new ArrayList();
        this.t0 = new q85(this);
        this.B0 = new bl(this, (byte) 8);
        Context context2 = getContext();
        int[] iArr = qz3.w;
        pn N = pn.N(context2, attributeSet, iArr, R.attr.toolbarStyle);
        dr5.g(this, context, iArr, attributeSet, (TypedArray) N.b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) N.b;
        this.T = typedArray.getResourceId(28, 0);
        this.U = typedArray.getResourceId(19, 0);
        this.h0 = typedArray.getInteger(0, 8388627);
        this.V = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.d0 = dimensionPixelOffset;
        this.c0 = dimensionPixelOffset;
        this.b0 = dimensionPixelOffset;
        this.a0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.a0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.b0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.c0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.d0 = dimensionPixelOffset5;
        }
        this.W = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        z74 z74Var = this.e0;
        z74Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            z74Var.e = dimensionPixelSize;
            z74Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            z74Var.f = dimensionPixelSize2;
            z74Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            z74Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.g0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.N = N.v(4);
        this.O = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.R = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable v = N.v(16);
        if (v != null) {
            setNavigationIcon(v);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable v2 = N.v(11);
        if (v2 != null) {
            setLogo(v2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(N.t(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(N.t(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        N.T();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new mz4(getContext());
    }

    public static s85 h() {
        s85 s85Var = new s85(-2, -2);
        s85Var.b = (byte) 0;
        s85Var.a = 8388627;
        return s85Var;
    }

    public static s85 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof s85;
        if (z) {
            s85 s85Var = (s85) layoutParams;
            s85 s85Var2 = new s85(s85Var);
            s85Var2.b = (byte) 0;
            s85Var2.b = s85Var.b;
            return s85Var2;
        }
        if (z) {
            s85 s85Var3 = new s85((s85) layoutParams);
            s85Var3.b = (byte) 0;
            return s85Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            s85 s85Var4 = new s85(layoutParams);
            s85Var4.b = (byte) 0;
            return s85Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        s85 s85Var5 = new s85(marginLayoutParams);
        s85Var5.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) s85Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) s85Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) s85Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) s85Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return s85Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                s85 s85Var = (s85) childAt.getLayoutParams();
                if (s85Var.b == 0 && s(childAt)) {
                    int i3 = s85Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            s85 s85Var2 = (s85) childAt2.getLayoutParams();
            if (s85Var2.b == 0 && s(childAt2)) {
                int i5 = s85Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        s85 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (s85) layoutParams;
        h.b = (byte) 1;
        if (!z || this.Q == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.p0.add(view);
        }
    }

    public final void c() {
        if (this.P == null) {
            sl slVar = new sl(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.P = slVar;
            slVar.setImageDrawable(this.N);
            this.P.setContentDescription(this.O);
            s85 h = h();
            h.a = (this.V & 112) | 8388611;
            h.b = (byte) 2;
            this.P.setLayoutParams(h);
            this.P.setOnClickListener(new f6(this, (byte) 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof s85);
    }

    public final void d() {
        if (this.e0 == null) {
            z74 z74Var = new z74();
            z74Var.a = 0;
            z74Var.b = 0;
            z74Var.c = Integer.MIN_VALUE;
            z74Var.d = Integer.MIN_VALUE;
            z74Var.e = 0;
            z74Var.f = 0;
            z74Var.g = false;
            z74Var.h = false;
            this.e0 = z74Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.I;
        if (actionMenuView.a0 == null) {
            sx2 sx2Var = (sx2) actionMenuView.getMenu();
            if (this.w0 == null) {
                this.w0 = new r85(this);
            }
            this.I.setExpandedActionViewsExclusive(true);
            sx2Var.c(this.w0, this.R);
            t();
        }
    }

    public final void f() {
        if (this.I == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.I = actionMenuView;
            actionMenuView.setPopupTheme(this.S);
            this.I.setOnMenuItemClickListener(this.t0);
            ActionMenuView actionMenuView2 = this.I;
            q85 q85Var = new q85(this);
            actionMenuView2.getClass();
            actionMenuView2.f0 = q85Var;
            s85 h = h();
            h.a = (this.V & 112) | 8388613;
            this.I.setLayoutParams(h);
            b(this.I, false);
        }
    }

    public final void g() {
        if (this.L == null) {
            this.L = new sl(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            s85 h = h();
            h.a = (this.V & 112) | 8388611;
            this.L.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        s85 s85Var = new s85(context, attributeSet);
        s85Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.b);
        s85Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        s85Var.b = (byte) 0;
        return s85Var;
    }

    public CharSequence getCollapseContentDescription() {
        sl slVar = this.P;
        if (slVar != null) {
            return slVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        sl slVar = this.P;
        if (slVar != null) {
            return slVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        z74 z74Var = this.e0;
        if (z74Var != null) {
            return z74Var.g ? z74Var.a : z74Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.g0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        z74 z74Var = this.e0;
        if (z74Var != null) {
            return z74Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        z74 z74Var = this.e0;
        if (z74Var != null) {
            return z74Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        z74 z74Var = this.e0;
        if (z74Var != null) {
            return z74Var.g ? z74Var.b : z74Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        sx2 sx2Var;
        ActionMenuView actionMenuView = this.I;
        return (actionMenuView == null || (sx2Var = actionMenuView.a0) == null || !sx2Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.g0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ul ulVar = this.M;
        if (ulVar != null) {
            return ulVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ul ulVar = this.M;
        if (ulVar != null) {
            return ulVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.I.getMenu();
    }

    public View getNavButtonView() {
        return this.L;
    }

    public CharSequence getNavigationContentDescription() {
        sl slVar = this.L;
        if (slVar != null) {
            return slVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        sl slVar = this.L;
        if (slVar != null) {
            return slVar.getDrawable();
        }
        return null;
    }

    public u6 getOuterActionMenuPresenter() {
        return this.v0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.I.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.R;
    }

    public int getPopupTheme() {
        return this.S;
    }

    public CharSequence getSubtitle() {
        return this.j0;
    }

    public final TextView getSubtitleTextView() {
        return this.K;
    }

    public CharSequence getTitle() {
        return this.i0;
    }

    public int getTitleMarginBottom() {
        return this.d0;
    }

    public int getTitleMarginEnd() {
        return this.b0;
    }

    public int getTitleMarginStart() {
        return this.a0;
    }

    public int getTitleMarginTop() {
        return this.c0;
    }

    public final TextView getTitleTextView() {
        return this.J;
    }

    public wp0 getWrapper() {
        Drawable drawable;
        y85 y85Var = this.u0;
        if (y85Var == null) {
            y85Var = new y85();
            y85Var.n = 0;
            y85Var.a = this;
            y85Var.h = getTitle();
            y85Var.i = getSubtitle();
            y85Var.g = y85Var.h != null;
            y85Var.f = getNavigationIcon();
            pn N = pn.N(getContext(), null, qz3.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) N.b;
            y85Var.o = N.v(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                y85Var.g = true;
                y85Var.h = text;
                if ((y85Var.b & 8) != 0) {
                    setTitle(text);
                    if (y85Var.g) {
                        dr5.i(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                y85Var.i = text2;
                if ((y85Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable v = N.v(20);
            if (v != null) {
                y85Var.e = v;
                y85Var.c();
            }
            Drawable v2 = N.v(17);
            if (v2 != null) {
                y85Var.d = v2;
                y85Var.c();
            }
            if (y85Var.f == null && (drawable = y85Var.o) != null) {
                y85Var.f = drawable;
                if ((y85Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            y85Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = y85Var.c;
                if (view != null && (y85Var.b & 16) != 0) {
                    removeView(view);
                }
                y85Var.c = inflate;
                if (inflate != null && (y85Var.b & 16) != 0) {
                    addView(inflate);
                }
                y85Var.a(y85Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.e0.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.T = resourceId2;
                um umVar = this.J;
                if (umVar != null) {
                    umVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.U = resourceId3;
                um umVar2 = this.K;
                if (umVar2 != null) {
                    umVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            N.T();
            if (R.string.abc_action_bar_up_description != y85Var.n) {
                y85Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = y85Var.n;
                    y85Var.j = i != 0 ? getContext().getString(i) : null;
                    y85Var.b();
                }
            }
            y85Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new w85(y85Var));
            this.u0 = y85Var;
        }
        return y85Var;
    }

    public final int j(int i, View view) {
        s85 s85Var = (s85) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = s85Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.h0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) s85Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) s85Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) s85Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        ArrayList arrayList = this.s0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.r0.O();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.s0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.p0.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        s85 s85Var = (s85) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) s85Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) s85Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.B0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.n0 = false;
        }
        if (!this.n0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.n0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.n0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z = fs5.a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.L)) {
            r(this.L, i, 0, i2, this.W);
            i3 = k(this.L) + this.L.getMeasuredWidth();
            i4 = Math.max(0, l(this.L) + this.L.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.L.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (s(this.P)) {
            r(this.P, i, 0, i2, this.W);
            i3 = k(this.P) + this.P.getMeasuredWidth();
            i4 = Math.max(i4, l(this.P) + this.P.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.P.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.q0;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.I)) {
            r(this.I, i, max, i2, this.W);
            i6 = k(this.I) + this.I.getMeasuredWidth();
            i4 = Math.max(i4, l(this.I) + this.I.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.I.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.Q)) {
            max3 += q(this.Q, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.Q) + this.Q.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.Q.getMeasuredState());
        }
        if (s(this.M)) {
            max3 += q(this.M, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.M) + this.M.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.M.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((s85) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i13 = max3;
        int i14 = this.c0 + this.d0;
        int i15 = this.a0 + this.b0;
        if (s(this.J)) {
            q(this.J, i, i13 + i15, i2, i14, iArr);
            i7 = i14;
            int k = k(this.J) + this.J.getMeasuredWidth();
            i8 = l(this.J) + this.J.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i5, this.J.getMeasuredState());
            i10 = k;
        } else {
            i7 = i14;
            i8 = 0;
            i9 = i5;
            i10 = 0;
        }
        if (s(this.K)) {
            i10 = Math.max(i10, q(this.K, i, i13 + i15, i2, i8 + i7, iArr));
            i8 += l(this.K) + this.K.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.K.getMeasuredState());
        }
        if (s(this.J) || s(this.K)) {
            i8 += i7;
        }
        int max5 = Math.max(i4, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13 + i10;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.x0) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i11);
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof u85)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u85 u85Var = (u85) parcelable;
        super.onRestoreInstanceState(u85Var.I);
        ActionMenuView actionMenuView = this.I;
        sx2 sx2Var = actionMenuView != null ? actionMenuView.a0 : null;
        int i = u85Var.K;
        if (i != 0 && this.w0 != null && sx2Var != null && (findItem = sx2Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (u85Var.L) {
            bl blVar = this.B0;
            removeCallbacks(blVar);
            post(blVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        z74 z74Var = this.e0;
        boolean z = i == 1;
        if (z == z74Var.g) {
            return;
        }
        z74Var.g = z;
        if (!z74Var.h) {
            z74Var.a = z74Var.e;
            z74Var.b = z74Var.f;
            return;
        }
        if (z) {
            int i2 = z74Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = z74Var.e;
            }
            z74Var.a = i2;
            int i3 = z74Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = z74Var.f;
            }
            z74Var.b = i3;
            return;
        }
        int i4 = z74Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = z74Var.e;
        }
        z74Var.a = i4;
        int i5 = z74Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = z74Var.f;
        }
        z74Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        u6 u6Var;
        ky2 ky2Var;
        u85 u85Var = new u85(super.onSaveInstanceState());
        r85 r85Var = this.w0;
        if (r85Var != null && (ky2Var = r85Var.J) != null) {
            u85Var.K = ky2Var.a;
        }
        ActionMenuView actionMenuView = this.I;
        u85Var.L = (actionMenuView == null || (u6Var = actionMenuView.e0) == null || !u6Var.j()) ? false : true;
        return u85Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.m0 = false;
        }
        if (!this.m0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.m0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.m0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        s85 s85Var = (s85) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) s85Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) s85Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        sl slVar = this.P;
        if (slVar != null) {
            slVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.P.setImageDrawable(drawable);
        } else {
            sl slVar = this.P;
            if (slVar != null) {
                slVar.setImageDrawable(this.N);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.x0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.g0) {
            this.g0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f0) {
            this.f0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        ul ulVar = this.M;
        if (drawable != null) {
            if (ulVar == null) {
                ulVar = new ul(getContext(), null, 0);
                this.M = ulVar;
            }
            if (!n(ulVar)) {
                b(this.M, true);
            }
        } else if (ulVar != null && n(ulVar)) {
            removeView(this.M);
            this.p0.remove(this.M);
        }
        ul ulVar2 = this.M;
        if (ulVar2 != null) {
            ulVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.M == null) {
            this.M = new ul(getContext(), null, 0);
        }
        ul ulVar = this.M;
        if (ulVar != null) {
            ulVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        sl slVar = this.L;
        if (slVar != null) {
            slVar.setContentDescription(charSequence);
            eg5.P(this.L, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.L)) {
                b(this.L, true);
            }
        } else {
            sl slVar = this.L;
            if (slVar != null && n(slVar)) {
                removeView(this.L);
                this.p0.remove(this.L);
            }
        }
        sl slVar2 = this.L;
        if (slVar2 != null) {
            slVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.L.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.I.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.S != i) {
            this.S = i;
            if (i == 0) {
                this.R = getContext();
            } else {
                this.R = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        um umVar = this.K;
        if (!isEmpty) {
            if (umVar == null) {
                Context context = getContext();
                um umVar2 = new um(context, null);
                this.K = umVar2;
                umVar2.setSingleLine();
                this.K.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.U;
                if (i != 0) {
                    this.K.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.l0;
                if (colorStateList != null) {
                    this.K.setTextColor(colorStateList);
                }
            }
            if (!n(this.K)) {
                b(this.K, true);
            }
        } else if (umVar != null && n(umVar)) {
            removeView(this.K);
            this.p0.remove(this.K);
        }
        um umVar3 = this.K;
        if (umVar3 != null) {
            umVar3.setText(charSequence);
        }
        this.j0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        um umVar = this.K;
        if (umVar != null) {
            umVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        um umVar = this.J;
        if (!isEmpty) {
            if (umVar == null) {
                Context context = getContext();
                um umVar2 = new um(context, null);
                this.J = umVar2;
                umVar2.setSingleLine();
                this.J.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.T;
                if (i != 0) {
                    this.J.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.k0;
                if (colorStateList != null) {
                    this.J.setTextColor(colorStateList);
                }
            }
            if (!n(this.J)) {
                b(this.J, true);
            }
        } else if (umVar != null && n(umVar)) {
            removeView(this.J);
            this.p0.remove(this.J);
        }
        um umVar3 = this.J;
        if (umVar3 != null) {
            umVar3.setText(charSequence);
        }
        this.i0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.d0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.b0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.a0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        um umVar = this.J;
        if (umVar != null) {
            umVar.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = l5.a(this);
            r85 r85Var = this.w0;
            byte b = 0;
            boolean z = (r85Var == null || r85Var.J == null || a == null || !isAttachedToWindow() || !this.A0) ? false : true;
            if (!z || this.z0 != null) {
                if (z || (onBackInvokedDispatcher = this.z0) == null) {
                    return;
                }
                l5.p(onBackInvokedDispatcher, this.y0);
                this.z0 = null;
                return;
            }
            hk hkVar = this.y0;
            if (hkVar == null) {
                hk hkVar2 = new hk(new p85(this, b), (byte) 2);
                this.y0 = hkVar2;
                hkVar = hkVar2;
            }
            l5.o(a, hkVar);
            this.z0 = a;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(j42.C(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(t85 t85Var) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(j42.C(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(j42.C(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
