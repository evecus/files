package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ml1 extends FrameLayout {
    public final ArrayList I;
    public final ArrayList J;
    public View.OnApplyWindowInsetsListener K;
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(Context context, AttributeSet attributeSet, tl1 tl1Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.L = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oz3.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        tl1Var.g();
        if (classAttribute == null) {
            Iterator it = tl1Var.c.n().iterator();
            if (it.hasNext()) {
                r7.K(it.next());
                throw null;
            }
            return;
        }
        if (id == -1) {
            zy.i(r7.C("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            throw null;
        }
        rl1 rl1Var = tl1Var.t;
        context.getClassLoader();
        rl1Var.a(classAttribute);
        throw null;
    }

    public final void a(View view) {
        if (this.J.contains(view)) {
            this.I.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        view.getTag(R.id.fragment_container_view_tag);
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        yv5 yv5Var;
        windowInsets.getClass();
        yv5 c = yv5.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.K;
        if (onApplyWindowInsetsListener != null) {
            yv5Var = yv5.c(c21.E(onApplyWindowInsetsListener, this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = dr5.a;
            WindowInsets b = c.b();
            if (b != null && !b.equals(b)) {
                c = yv5.c(b, this);
            }
            yv5Var = c;
        }
        if (!yv5Var.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                dr5.b(getChildAt(i), yv5Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.L) {
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.L) {
            ArrayList arrayList = this.I;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.J.remove(view);
        if (this.I.remove(view)) {
            this.L = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends jl1> F getFragment() {
        nk nkVar;
        View view = this;
        while (view != null) {
            view.getTag(R.id.fragment_container_view_tag);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                nkVar = null;
                break;
            }
            if (context instanceof nk) {
                nkVar = (nk) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (nkVar == null) {
            zy.l(this, " is not within a subclass of FragmentActivity.", "View ");
            return null;
        }
        tl1 tl1Var = ((ll1) nkVar.c0.J).K;
        getId();
        tl1Var.g();
        return null;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.L = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.K = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.J.add(view);
        }
        super.startViewTransition(view);
    }
}
