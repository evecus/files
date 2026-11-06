package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.da;
import defpackage.dr5;
import defpackage.e60;
import defpackage.h24;
import defpackage.kr5;
import defpackage.mo1;
import defpackage.oo4;
import defpackage.p5;
import defpackage.pn;
import defpackage.pz3;
import defpackage.r14;
import defpackage.x14;
import defpackage.y14;
import defpackage.z14;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class e {
    public pn a;
    public RecyclerView b;
    public final da c;
    public final da d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public e() {
        x14 x14Var = new x14(this, (byte) 0);
        x14 x14Var2 = new x14(this, (byte) 1);
        this.c = new da(x14Var);
        this.d = new da(x14Var2);
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int B(View view) {
        return ((z14) view.getLayoutParams()).a();
    }

    public static y14 C(Context context, AttributeSet attributeSet, int i, int i2) {
        y14 y14Var = new y14();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pz3.a, i, i2);
        y14Var.a = obtainStyledAttributes.getInt(0, 1);
        y14Var.b = obtainStyledAttributes.getInt(10, 1);
        y14Var.c = obtainStyledAttributes.getBoolean(9, false);
        y14Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return y14Var;
    }

    public static boolean G(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void H(View view, int i, int i2, int i3, int i4) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect = z14Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) z14Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) z14Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) z14Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) z14Var).bottomMargin);
    }

    public static int f(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.v(int, int, int, int, boolean):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int D(f fVar, h24 h24Var) {
        return -1;
    }

    public final void E(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((z14) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.T;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean F() {
        return true;
    }

    public void I(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int s = recyclerView.N.s();
            for (int i2 = 0; i2 < s; i2++) {
                recyclerView.N.r(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void J(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int s = recyclerView.N.s();
            for (int i2 = 0; i2 < s; i2++) {
                recyclerView.N.r(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract View M(View view, int i, f fVar, h24 h24Var);

    public void N(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        f fVar = recyclerView.K;
        h24 h24Var = recyclerView.N0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        c cVar = this.b.U;
        if (cVar != null) {
            accessibilityEvent.setItemCount(cVar.getItemCount());
        }
    }

    public void O(f fVar, h24 h24Var, p5 p5Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            p5Var.a(8192);
            p5Var.a.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            p5Var.a(4096);
            p5Var.a.setScrollable(true);
        }
        p5Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(D(fVar, h24Var), w(fVar, h24Var), false, 0));
    }

    public final void P(View view, p5 p5Var) {
        g G = RecyclerView.G(view);
        if (G == null || G.isRemoved()) {
            return;
        }
        pn pnVar = this.a;
        if (((ArrayList) pnVar.d).contains(G.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        Q(recyclerView.K, recyclerView.N0, view, p5Var);
    }

    public abstract void W(f fVar, h24 h24Var);

    public abstract void X(h24 h24Var);

    public abstract void Y(Parcelable parcelable);

    public abstract Parcelable Z();

    public final void a(View view, int i, boolean z) {
        g G = RecyclerView.G(view);
        if (z || G.isRemoved()) {
            oo4 oo4Var = (oo4) this.b.O.J;
            kr5 kr5Var = (kr5) oo4Var.get(G);
            if (kr5Var == null) {
                kr5Var = kr5.b();
                oo4Var.put(G, kr5Var);
            }
            kr5Var.a |= 1;
        } else {
            this.b.O.t(G);
        }
        z14 z14Var = (z14) view.getLayoutParams();
        if (G.wasReturnedFromScrap() || G.isScrap()) {
            if (G.isScrap()) {
                G.unScrap();
            } else {
                G.clearReturnedFromScrapFlag();
            }
            this.a.l(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            pn pnVar = this.a;
            if (parent == recyclerView) {
                e60 e60Var = (e60) pnVar.c;
                int indexOfChild = ((r14) pnVar.b).a.indexOfChild(view);
                int b = (indexOfChild == -1 || e60Var.e(indexOfChild)) ? -1 : indexOfChild - e60Var.b(indexOfChild);
                if (i == -1) {
                    i = this.a.s();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.w());
                }
                if (b != i) {
                    e eVar = this.b.V;
                    View t = eVar.t(b);
                    if (t == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + eVar.b.toString());
                    }
                    eVar.t(b);
                    eVar.a.n(b);
                    z14 z14Var2 = (z14) t.getLayoutParams();
                    g G2 = RecyclerView.G(t);
                    boolean isRemoved = G2.isRemoved();
                    RecyclerView recyclerView2 = eVar.b;
                    if (isRemoved) {
                        oo4 oo4Var2 = (oo4) recyclerView2.O.J;
                        kr5 kr5Var2 = (kr5) oo4Var2.get(G2);
                        if (kr5Var2 == null) {
                            kr5Var2 = kr5.b();
                            oo4Var2.put(G2, kr5Var2);
                        }
                        kr5Var2.a = 1 | kr5Var2.a;
                    } else {
                        recyclerView2.O.t(G2);
                    }
                    eVar.a.l(t, i, z14Var2, G2.isRemoved());
                }
            } else {
                pnVar.k(view, i, false);
                z14Var.c = true;
            }
        }
        if (z14Var.d) {
            G.itemView.invalidate();
            z14Var.d = false;
        }
    }

    public abstract void b(String str);

    public final void b0(f fVar) {
        for (int u = u() - 1; u >= 0; u--) {
            if (!RecyclerView.G(t(u)).shouldIgnore()) {
                View t = t(u);
                e0(u);
                fVar.h(t);
            }
        }
    }

    public abstract boolean c();

    public final void c0(f fVar) {
        ArrayList arrayList;
        int size = fVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = fVar.a;
            if (i < 0) {
                break;
            }
            View view = ((g) arrayList.get(i)).itemView;
            g G = RecyclerView.G(view);
            if (!G.shouldIgnore()) {
                G.setIsRecyclable(false);
                if (G.isTmpDetached()) {
                    this.b.removeDetachedView(view, false);
                }
                d dVar = this.b.w0;
                if (dVar != null) {
                    dVar.d(G);
                }
                G.setIsRecyclable(true);
                g G2 = RecyclerView.G(view);
                G2.mScrapContainer = null;
                G2.mInChangeScrap = false;
                G2.clearReturnedFromScrapFlag();
                fVar.i(G2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = fVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract boolean d();

    public final void d0(View view, f fVar) {
        pn pnVar = this.a;
        r14 r14Var = (r14) pnVar.b;
        int indexOfChild = r14Var.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e60) pnVar.c).g(indexOfChild)) {
                pnVar.Y(view);
            }
            r14Var.c(indexOfChild);
        }
        fVar.h(view);
    }

    public boolean e(z14 z14Var) {
        return true;
    }

    public final void e0(int i) {
        if (t(i) != null) {
            pn pnVar = this.a;
            int G = pnVar.G(i);
            r14 r14Var = (r14) pnVar.b;
            View childAt = r14Var.a.getChildAt(G);
            if (childAt == null) {
                return;
            }
            if (((e60) pnVar.c).g(G)) {
                pnVar.Y(childAt);
            }
            r14Var.c(G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if ((r8.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.y()
            int r1 = r8.A()
            int r2 = r8.m
            int r3 = r8.z()
            int r2 = r2 - r3
            int r3 = r8.n
            int r4 = r8.x()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
            java.util.WeakHashMap r7 = defpackage.dr5.a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.y()
            int r2 = r8.A()
            int r3 = r8.m
            int r4 = r8.z()
            int r3 = r3 - r4
            int r4 = r8.n
            int r5 = r8.x()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            android.graphics.Rect r8 = r8.R
            androidx.recyclerview.widget.RecyclerView.H(r8, r13)
            int r13 = r8.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r8.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r8.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r8 = r8.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.b0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.f0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract void g(int i, int i2, h24 h24Var, mo1 mo1Var);

    public final void g0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int h0(int i, h24 h24Var, f fVar);

    public abstract int i(h24 h24Var);

    public abstract int i0(int i, h24 h24Var, f fVar);

    public abstract int j(h24 h24Var);

    public final void j0(RecyclerView recyclerView) {
        k0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int k(h24 h24Var);

    public final void k0(int i, int i2) {
        this.m = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k = mode;
        if (mode == 0 && !RecyclerView.i1) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l = mode2;
        if (mode2 != 0 || RecyclerView.i1) {
            return;
        }
        this.n = 0;
    }

    public abstract int l(h24 h24Var);

    public void l0(Rect rect, int i, int i2) {
        int z = z() + y() + rect.width();
        int x = x() + A() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = dr5.a;
        this.b.setMeasuredDimension(f(i, z, recyclerView.getMinimumWidth()), f(i2, x, this.b.getMinimumHeight()));
    }

    public abstract int m(h24 h24Var);

    public final void m0(int i, int i2) {
        int u = u();
        if (u == 0) {
            this.b.l(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < u; i7++) {
            View t = t(i7);
            Rect rect = this.b.R;
            RecyclerView.H(rect, t);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.R.set(i6, i4, i3, i5);
        l0(this.b.R, i, i2);
    }

    public abstract int n(h24 h24Var);

    public final void n0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.N;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = 1073741824;
        this.l = 1073741824;
    }

    public final void o(f fVar) {
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            g G = RecyclerView.G(t);
            if (!G.shouldIgnore()) {
                if (!G.isInvalid() || G.isRemoved() || this.b.U.hasStableIds()) {
                    t(u);
                    this.a.n(u);
                    fVar.j(t);
                    this.b.O.t(G);
                } else {
                    e0(u);
                    fVar.i(G);
                }
            }
        }
    }

    public final boolean o0(View view, int i, int i2, z14 z14Var) {
        return (!view.isLayoutRequested() && this.g && G(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) z14Var).width) && G(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) z14Var).height)) ? false : true;
    }

    public View p(int i) {
        int u = u();
        for (int i2 = 0; i2 < u; i2++) {
            View t = t(i2);
            g G = RecyclerView.G(t);
            if (G != null && G.getLayoutPosition() == i && !G.shouldIgnore() && (this.b.N0.f || !G.isRemoved())) {
                return t;
            }
        }
        return null;
    }

    public boolean p0() {
        return false;
    }

    public z14 q() {
        return new z14(-2, -2);
    }

    public final boolean q0(View view, int i, int i2, z14 z14Var) {
        return (this.g && G(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) z14Var).width) && G(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) z14Var).height)) ? false : true;
    }

    public z14 r(Context context, AttributeSet attributeSet) {
        return new z14(context, attributeSet);
    }

    public abstract boolean r0();

    public z14 s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z14 ? new z14((z14) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new z14((ViewGroup.MarginLayoutParams) layoutParams) : new z14(layoutParams);
    }

    public final View t(int i) {
        pn pnVar = this.a;
        if (pnVar != null) {
            return pnVar.r(i);
        }
        return null;
    }

    public final int u() {
        pn pnVar = this.a;
        if (pnVar != null) {
            return pnVar.s();
        }
        return 0;
    }

    public int w(f fVar, h24 h24Var) {
        return -1;
    }

    public final int x() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public void K() {
    }

    public void S() {
    }

    public void L(RecyclerView recyclerView) {
    }

    public void a0(int i) {
    }

    public void R(int i, int i2) {
    }

    public void T(int i, int i2) {
    }

    public void U(int i, int i2) {
    }

    public void V(int i, int i2) {
    }

    public void h(int i, mo1 mo1Var) {
    }

    public void Q(f fVar, h24 h24Var, View view, p5 p5Var) {
    }
}
