package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class a2 extends ViewGroup {
    public WeakReference I;
    public IBinder J;
    public jz5 K;
    public re0 L;
    public be0 M;
    public ls N;
    public boolean O;
    public boolean P;
    public boolean Q;

    public a2(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        bd bdVar = new bd(this, (byte) 1);
        addOnAttachStateChangeListener(bdVar);
        er5 er5Var = new er5(this);
        mu0.C(this).a.add(er5Var);
        this.N = new ls(this, bdVar, er5Var, (byte) 5);
    }

    private final void setParentContext(re0 re0Var) {
        if (this.L != re0Var) {
            this.L = re0Var;
            if (re0Var != null) {
                this.I = null;
            }
            jz5 jz5Var = this.K;
            if (jz5Var != null) {
                jz5Var.dispose();
                this.K = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.J != iBinder) {
            this.J = iBinder;
            this.I = null;
        }
    }

    public abstract void a(fe0 fe0Var, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.M == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(l(o7.t(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.P) {
            return;
        }
        zy.p(r7.C("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        be0 be0Var;
        if (this.L != null || isAttachedToWindow() || ((be0Var = this.M) != null && be0Var.a.isAttachedToWindow())) {
            f();
        } else {
            zy.i("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.removeConnectionToComposeViewContext();
        }
        jz5 jz5Var = this.K;
        if (jz5Var != null) {
            jz5Var.dispose();
        }
        this.K = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.K == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.P = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    be0 be0Var = this.M;
                    if (be0Var == null) {
                        be0Var = i();
                    }
                    this.K = nz5.a(this, be0Var, new tc0(1003123809, new y1(this, objArr == true ? 1 : 0), true));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.P = false;
            }
        }
    }

    public void g(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        vr vrVar = tag instanceof vr ? (vr) tag : null;
        if (vrVar != null) {
            return vrVar.b();
        }
        return 1;
    }

    public final be0 getComposeViewContext$ui() {
        return this.M;
    }

    public final boolean getHasComposition() {
        return this.K != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.O;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.be0 i() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L15
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            be0 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.o7.t(r9)
            be0 r2 = defpackage.o7.x(r4)
            if (r2 != 0) goto L87
            re0 r5 = r9.k()
            vi2 r9 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r4)
            if (r9 != 0) goto L3a
            if (r0 == 0) goto L37
            vi2 r9 = r0.d()
            goto L38
        L37:
            r9 = r1
        L38:
            if (r9 == 0) goto L3c
        L3a:
            r6 = r9
            goto L42
        L3c:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.zy.i(r9)
            return r1
        L42:
            w94 r9 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r4)
            if (r9 != 0) goto L56
            if (r0 == 0) goto L53
            r0.g()
            w94 r9 = r0.e
            r9.getClass()
            goto L54
        L53:
            r9 = r1
        L54:
            if (r9 == 0) goto L58
        L56:
            r7 = r9
            goto L5e
        L58:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.zy.i(r9)
            return r1
        L5e:
            wr5 r9 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r4)
            if (r9 != 0) goto L6d
            if (r0 == 0) goto L6b
            r0.g()
            wr5 r1 = r0.f
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r9
        L6e:
            be0 r2 = new be0
            android.view.View r9 = defpackage.o7.t(r4)
            be0 r3 = defpackage.o7.x(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131361857(0x7f0a0041, float:1.8343478E38)
            r4.setTag(r0, r9)
            return r2
        L87:
            be0 r9 = r9.l(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2.i():be0");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.Q || super.isTransitionGroup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Type inference failed for: r0v0, types: [re0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [re0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [re0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.runtime.Recomposer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.re0 k() {
        /*
            r5 = this;
            re0 r0 = r5.L
            if (r0 != 0) goto L98
            re0 r0 = defpackage.uw5.a(r5)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            re0 r0 = defpackage.uw5.a(r1)
            android.view.ViewParent r1 = defpackage.oh4.f(r1)
            goto Lf
        L20:
            d14 r1 = defpackage.d14.J
            r2 = 0
            if (r0 == 0) goto L4a
            boolean r3 = r0 instanceof androidx.compose.runtime.Recomposer
            if (r3 == 0) goto L3f
            r3 = r0
            androidx.compose.runtime.Recomposer r3 = (androidx.compose.runtime.Recomposer) r3
            dw4 r3 = r3.getCurrentState()
            java.lang.Object r3 = r3.getValue()
            d14 r3 = (defpackage.d14) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L3d
            goto L3f
        L3d:
            r3 = r2
            goto L40
        L3f:
            r3 = r0
        L40:
            if (r3 == 0) goto L4b
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r5.I = r4
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 != 0) goto L98
            java.lang.ref.WeakReference r0 = r5.I
            if (r0 == 0) goto L71
            java.lang.Object r0 = r0.get()
            re0 r0 = (defpackage.re0) r0
            if (r0 == 0) goto L71
            boolean r3 = r0 instanceof androidx.compose.runtime.Recomposer
            if (r3 == 0) goto L72
            r3 = r0
            androidx.compose.runtime.Recomposer r3 = (androidx.compose.runtime.Recomposer) r3
            dw4 r3 = r3.getCurrentState()
            java.lang.Object r3 = r3.getValue()
            d14 r3 = (defpackage.d14) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L71
            goto L72
        L71:
            r0 = r2
        L72:
            if (r0 != 0) goto L98
            androidx.compose.runtime.Recomposer r0 = defpackage.uw5.b(r5)
            boolean r3 = defpackage.r7.O(r0)
            if (r3 == 0) goto L8e
            dw4 r3 = r0.getCurrentState()
            java.lang.Object r3 = r3.getValue()
            d14 r3 = (defpackage.d14) r3
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L8f
        L8e:
            r2 = r0
        L8f:
            if (r2 == 0) goto L98
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r5.I = r1
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2.k():re0");
    }

    public final be0 l(View view, be0 be0Var) {
        re0 k = k();
        vi2 vi2Var = ViewTreeLifecycleOwner.get(view);
        wr5 wr5Var = ViewTreeViewModelStoreOwner.get(view);
        w94 w94Var = ViewTreeSavedStateRegistryOwner.get(view);
        if (k == be0Var.c() && vi2Var == be0Var.d()) {
            be0Var.g();
            if (wr5Var == be0Var.f) {
                be0Var.g();
                w94 w94Var2 = be0Var.e;
                w94Var2.getClass();
                if (w94Var == w94Var2) {
                    return be0Var;
                }
            }
        }
        if (k.getEffectCoroutineContext() != be0Var.c().getEffectCoroutineContext()) {
            e();
        }
        if (vi2Var == null) {
            vi2Var = be0Var.d();
        }
        vi2 vi2Var2 = vi2Var;
        if (w94Var == null) {
            be0Var.g();
            w94Var = be0Var.e;
            w94Var.getClass();
        }
        be0 be0Var2 = new be0(be0Var, view, k, vi2Var2, w94Var, wr5Var);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(be0Var2));
        return be0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n43 n43Var = uw5.a;
        Object f = oh4.f(this);
        View view = this;
        while (f instanceof View) {
            View view2 = (View) f;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            f = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new z1(this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, vr.a(i));
    }

    public final void setComposeViewContext$ui(be0 be0Var) {
        if (this.M != be0Var) {
            if (be0Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != be0Var.c().getEffectCoroutineContext()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(be0Var);
                }
            }
            this.M = be0Var;
        }
    }

    public final void setParentCompositionContext(re0 re0Var) {
        setParentContext(re0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.O = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((qh3) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.Q = true;
    }

    public final void setViewCompositionStrategy(fr5 fr5Var) {
        ls lsVar = this.N;
        if (lsVar != null) {
            lsVar.invoke();
        }
        ((ui4) fr5Var).getClass();
        bd bdVar = new bd(this, (byte) 1);
        addOnAttachStateChangeListener(bdVar);
        er5 er5Var = new er5(this);
        mu0.C(this).a.add(er5Var);
        this.N = new ls(this, bdVar, er5Var, (byte) 5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
