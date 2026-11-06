package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.dr5;
import defpackage.g12;
import defpackage.h24;
import defpackage.hf1;
import defpackage.mo1;
import defpackage.o5;
import defpackage.p5;
import defpackage.s83;
import defpackage.vj2;
import defpackage.wr1;
import defpackage.xj2;
import defpackage.z14;
import defpackage.zy;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final g12 J;
    public final Rect K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        g12 g12Var = new g12((byte) 15);
        this.J = g12Var;
        this.K = new Rect();
        int i3 = e.C(context, attributeSet, i, i2).b;
        if (i3 == this.E) {
            return;
        }
        this.D = true;
        if (i3 < 1) {
            s83.t(hf1.u(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.E = i3;
        g12Var.A();
        g0();
    }

    @Override // androidx.recyclerview.widget.e
    public final int D(f fVar, h24 h24Var) {
        if (this.o == 0) {
            return this.E;
        }
        if (h24Var.b() < 1) {
            return 0;
        }
        return X0(h24Var.b() - 1, h24Var, fVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View D0(f fVar, h24 h24Var, boolean z, boolean z2) {
        int i;
        int i2;
        int u = u();
        int i3 = 1;
        if (z2) {
            i2 = u() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = u;
            i2 = 0;
        }
        int b = h24Var.b();
        x0();
        int k = this.q.k();
        int g = this.q.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View t = t(i2);
            int B = e.B(t);
            if (B >= 0 && B < b && Y0(B, h24Var, fVar) == 0) {
                if (((z14) t.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = t;
                    }
                } else {
                    if (this.q.e(t) < g && this.q.b(t) >= k) {
                        return t;
                    }
                    if (view == null) {
                        view = t;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        r23.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(androidx.recyclerview.widget.f r20, defpackage.h24 r21, defpackage.xj2 r22, defpackage.wj2 r23) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(androidx.recyclerview.widget.f, h24, xj2, wj2):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(f fVar, h24 h24Var, vj2 vj2Var, int i) {
        b1();
        if (h24Var.b() > 0 && !h24Var.f) {
            boolean z = i == 1;
            int Y0 = Y0(vj2Var.b, h24Var, fVar);
            if (z) {
                while (Y0 > 0) {
                    int i2 = vj2Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    vj2Var.b = i3;
                    Y0 = Y0(i3, h24Var, fVar);
                }
            } else {
                int b = h24Var.b() - 1;
                int i4 = vj2Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int Y02 = Y0(i5, h24Var, fVar);
                    if (Y02 <= Y0) {
                        break;
                    }
                    i4 = i5;
                    Y0 = Y02;
                }
                vj2Var.b = i4;
            }
        }
        V0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.View r23, int r24, androidx.recyclerview.widget.f r25, defpackage.h24 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M(android.view.View, int, androidx.recyclerview.widget.f, h24):android.view.View");
    }

    @Override // androidx.recyclerview.widget.e
    public final void O(f fVar, h24 h24Var, p5 p5Var) {
        super.O(fVar, h24Var, p5Var);
        p5Var.i("android.widget.GridView");
    }

    @Override // androidx.recyclerview.widget.e
    public final void Q(f fVar, h24 h24Var, View view, p5 p5Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof wr1)) {
            P(view, p5Var);
            return;
        }
        wr1 wr1Var = (wr1) layoutParams;
        int X0 = X0(wr1Var.a.getLayoutPosition(), h24Var, fVar);
        int i = this.o;
        int i2 = wr1Var.e;
        int i3 = wr1Var.f;
        if (i == 0) {
            p5Var.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o5.b(i2, i3, X0, 1, false).a);
        } else {
            p5Var.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o5.b(X0, 1, i2, i3, false).a);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q0(boolean z) {
        if (z) {
            zy.p("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.Q0(false);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void R(int i, int i2) {
        g12 g12Var = this.J;
        g12Var.A();
        ((SparseIntArray) g12Var.K).clear();
    }

    @Override // androidx.recyclerview.widget.e
    public final void S() {
        g12 g12Var = this.J;
        g12Var.A();
        ((SparseIntArray) g12Var.K).clear();
    }

    @Override // androidx.recyclerview.widget.e
    public final void T(int i, int i2) {
        g12 g12Var = this.J;
        g12Var.A();
        ((SparseIntArray) g12Var.K).clear();
    }

    @Override // androidx.recyclerview.widget.e
    public final void U(int i, int i2) {
        g12 g12Var = this.J;
        g12Var.A();
        ((SparseIntArray) g12Var.K).clear();
    }

    public final void U0(int i) {
        int i2;
        int[] iArr = this.F;
        int i3 = this.E;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.F = iArr;
    }

    @Override // androidx.recyclerview.widget.e
    public final void V(int i, int i2) {
        g12 g12Var = this.J;
        g12Var.A();
        ((SparseIntArray) g12Var.K).clear();
    }

    public final void V0() {
        View[] viewArr = this.G;
        if (viewArr == null || viewArr.length != this.E) {
            this.G = new View[this.E];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final void W(f fVar, h24 h24Var) {
        boolean z = h24Var.f;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.H;
        if (z) {
            int u = u();
            for (int i = 0; i < u; i++) {
                wr1 wr1Var = (wr1) t(i).getLayoutParams();
                int layoutPosition = wr1Var.a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, wr1Var.f);
                sparseIntArray.put(layoutPosition, wr1Var.e);
            }
        }
        super.W(fVar, h24Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int W0(int i, int i2) {
        if (this.o != 1 || !I0()) {
            int[] iArr = this.F;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.F;
        int i3 = this.E;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final void X(h24 h24Var) {
        super.X(h24Var);
        this.D = false;
    }

    public final int X0(int i, h24 h24Var, f fVar) {
        boolean z = h24Var.f;
        int i2 = this.E;
        g12 g12Var = this.J;
        if (!z) {
            g12Var.getClass();
            return g12.y(i, i2);
        }
        int b = fVar.b(i);
        if (b != -1) {
            g12Var.getClass();
            return g12.y(b, i2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int Y0(int i, h24 h24Var, f fVar) {
        boolean z = h24Var.f;
        int i2 = this.E;
        g12 g12Var = this.J;
        if (!z) {
            g12Var.getClass();
            return i % i2;
        }
        int i3 = this.I.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = fVar.b(i);
        if (b != -1) {
            g12Var.getClass();
            return b % i2;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int Z0(int i, h24 h24Var, f fVar) {
        boolean z = h24Var.f;
        g12 g12Var = this.J;
        if (!z) {
            g12Var.getClass();
            return 1;
        }
        int i2 = this.H.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (fVar.b(i) != -1) {
            g12Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void a1(View view, int i, boolean z) {
        int i2;
        int i3;
        wr1 wr1Var = (wr1) view.getLayoutParams();
        Rect rect = wr1Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wr1Var).topMargin + ((ViewGroup.MarginLayoutParams) wr1Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wr1Var).leftMargin + ((ViewGroup.MarginLayoutParams) wr1Var).rightMargin;
        int W0 = W0(wr1Var.e, wr1Var.f);
        if (this.o == 1) {
            i3 = e.v(W0, i, i5, ((ViewGroup.MarginLayoutParams) wr1Var).width, false);
            i2 = e.v(this.q.l(), this.l, i4, ((ViewGroup.MarginLayoutParams) wr1Var).height, true);
        } else {
            int v = e.v(W0, i, i4, ((ViewGroup.MarginLayoutParams) wr1Var).height, false);
            int v2 = e.v(this.q.l(), this.k, i5, ((ViewGroup.MarginLayoutParams) wr1Var).width, true);
            i2 = v;
            i3 = v2;
        }
        z14 z14Var = (z14) view.getLayoutParams();
        if (z ? q0(view, i3, i2, z14Var) : o0(view, i3, i2, z14Var)) {
            view.measure(i3, i2);
        }
    }

    public final void b1() {
        int x;
        int A;
        if (this.o == 1) {
            x = this.m - z();
            A = y();
        } else {
            x = this.n - x();
            A = A();
        }
        U0(x - A);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean e(z14 z14Var) {
        return z14Var instanceof wr1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int h0(int i, h24 h24Var, f fVar) {
        b1();
        V0();
        return super.h0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int i0(int i, h24 h24Var, f fVar) {
        b1();
        V0();
        return super.i0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int j(h24 h24Var) {
        return u0(h24Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int k(h24 h24Var) {
        return v0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final void l0(Rect rect, int i, int i2) {
        int f;
        int f2;
        if (this.F == null) {
            super.l0(rect, i, i2);
        }
        int z = z() + y();
        int x = x() + A();
        if (this.o == 1) {
            int height = rect.height() + x;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = dr5.a;
            f2 = e.f(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.F;
            f = e.f(i, iArr[iArr.length - 1] + z, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + z;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = dr5.a;
            f = e.f(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.F;
            f2 = e.f(i2, iArr2[iArr2.length - 1] + x, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(f, f2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int m(h24 h24Var) {
        return u0(h24Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final int n(h24 h24Var) {
        return v0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 q() {
        return this.o == 0 ? new wr1(-2, -1) : new wr1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 r(Context context, AttributeSet attributeSet) {
        wr1 wr1Var = new wr1(context, attributeSet);
        wr1Var.e = -1;
        wr1Var.f = 0;
        return wr1Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.e
    public final boolean r0() {
        return this.y == null && !this.D;
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            wr1 wr1Var = new wr1((ViewGroup.MarginLayoutParams) layoutParams);
            wr1Var.e = -1;
            wr1Var.f = 0;
            return wr1Var;
        }
        wr1 wr1Var2 = new wr1(layoutParams);
        wr1Var2.e = -1;
        wr1Var2.f = 0;
        return wr1Var2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void s0(h24 h24Var, xj2 xj2Var, mo1 mo1Var) {
        int i = this.E;
        int i2 = i;
        for (int i3 = 0; i3 < i && xj2Var.c(h24Var) && i2 > 0; i3++) {
            mo1Var.a(xj2Var.d, Math.max(0, xj2Var.g));
            this.J.getClass();
            i2--;
            xj2Var.d += xj2Var.e;
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final int w(f fVar, h24 h24Var) {
        if (this.o == 1) {
            return this.E;
        }
        if (h24Var.b() < 1) {
            return 0;
        }
        return X0(h24Var.b() - 1, h24Var, fVar) + 1;
    }
}
