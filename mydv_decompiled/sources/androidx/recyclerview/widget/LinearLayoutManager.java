package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.dr5;
import defpackage.h24;
import defpackage.hc4;
import defpackage.hf1;
import defpackage.mo1;
import defpackage.s83;
import defpackage.sg3;
import defpackage.vj2;
import defpackage.wj2;
import defpackage.xj2;
import defpackage.y14;
import defpackage.yj2;
import defpackage.z14;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends e {
    public final wj2 A;
    public final byte B;
    public final int[] C;
    public int o;
    public xj2 p;
    public sg3 q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public int w;
    public int x;
    public yj2 y;
    public final vj2 z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new vj2();
        this.A = new wj2();
        this.B = (byte) 2;
        this.C = new int[2];
        y14 C = e.C(context, attributeSet, i, i2);
        P0(C.a);
        boolean z = C.c;
        b(null);
        if (z != this.s) {
            this.s = z;
            g0();
        }
        Q0(C.d);
    }

    public final View A0(boolean z) {
        return this.t ? C0(u() - 1, -1, z) : C0(0, u(), z);
    }

    public final View B0(int i, int i2) {
        int i3;
        int i4;
        x0();
        if (i2 <= i && i2 >= i) {
            return t(i);
        }
        if (this.q.e(t(i)) < this.q.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.o == 0 ? this.c.k(i, i2, i3, i4) : this.d.k(i, i2, i3, i4);
    }

    public final View C0(int i, int i2, boolean z) {
        x0();
        int i3 = z ? 24579 : 320;
        return this.o == 0 ? this.c.k(i, i2, i3, 320) : this.d.k(i, i2, i3, 320);
    }

    public View D0(f fVar, h24 h24Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        x0();
        int u = u();
        if (z2) {
            i2 = u() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = u;
            i2 = 0;
            i3 = 1;
        }
        int b = h24Var.b();
        int k = this.q.k();
        int g = this.q.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View t = t(i2);
            int B = e.B(t);
            int e = this.q.e(t);
            int b2 = this.q.b(t);
            if (B >= 0 && B < b) {
                if (!((z14) t.getLayoutParams()).c()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return t;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = t;
                        }
                        view2 = t;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = t;
                        }
                        view2 = t;
                    }
                } else if (view3 == null) {
                    view3 = t;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int E0(int i, f fVar, h24 h24Var, boolean z) {
        int g;
        int g2 = this.q.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -O0(-g2, h24Var, fVar);
        int i3 = i + i2;
        if (!z || (g = this.q.g() - i3) <= 0) {
            return i2;
        }
        this.q.o(g);
        return g + i2;
    }

    public final int F0(int i, f fVar, h24 h24Var, boolean z) {
        int k;
        int k2 = i - this.q.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -O0(k2, h24Var, fVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.q.k()) <= 0) {
            return i2;
        }
        this.q.o(-k);
        return i2 - k;
    }

    public final View G0() {
        return t(this.t ? 0 : u() - 1);
    }

    public final View H0() {
        return t(this.t ? u() - 1 : 0);
    }

    public final boolean I0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = dr5.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void J0(f fVar, h24 h24Var, xj2 xj2Var, wj2 wj2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        View d = xj2Var.d(fVar);
        if (d == null) {
            wj2Var.b = true;
            return;
        }
        z14 z14Var = (z14) d.getLayoutParams();
        List list = xj2Var.k;
        boolean z = this.t;
        int i5 = xj2Var.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                a(d, -1, false);
            } else {
                a(d, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                a(d, -1, true);
            } else {
                a(d, 0, true);
            }
        }
        z14 z14Var2 = (z14) d.getLayoutParams();
        Rect I = this.b.I(d);
        int i6 = I.left + I.right;
        int i7 = I.top + I.bottom;
        int v = e.v(this.m, this.k, z() + y() + ((ViewGroup.MarginLayoutParams) z14Var2).leftMargin + ((ViewGroup.MarginLayoutParams) z14Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) z14Var2).width, c());
        int v2 = e.v(this.n, this.l, x() + A() + ((ViewGroup.MarginLayoutParams) z14Var2).topMargin + ((ViewGroup.MarginLayoutParams) z14Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) z14Var2).height, d());
        if (o0(d, v, v2, z14Var2)) {
            d.measure(v, v2);
        }
        wj2Var.a = this.q.c(d);
        if (this.o == 1) {
            if (I0()) {
                i4 = this.m - z();
                i2 = i4 - this.q.d(d);
            } else {
                int y = y();
                i4 = this.q.d(d) + y;
                i2 = y;
            }
            int i8 = xj2Var.f;
            i3 = xj2Var.b;
            int i9 = wj2Var.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int A = A();
            int d2 = this.q.d(d) + A;
            int i11 = xj2Var.f;
            int i12 = xj2Var.b;
            int i13 = wj2Var.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = A;
                i = d2;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = d2;
                i2 = i12;
                i3 = A;
                i4 = i15;
            }
        }
        e.H(d, i2, i3, i4, i);
        if (z14Var.c() || z14Var.b()) {
            wj2Var.c = true;
        }
        wj2Var.d = d.hasFocusable();
    }

    public final void L0(f fVar, xj2 xj2Var) {
        if (!xj2Var.a || xj2Var.l) {
            return;
        }
        int i = xj2Var.g;
        int i2 = xj2Var.i;
        if (xj2Var.f == -1) {
            int u = u();
            if (i < 0) {
                return;
            }
            int f = (this.q.f() - i) + i2;
            if (this.t) {
                for (int i3 = 0; i3 < u; i3++) {
                    View t = t(i3);
                    if (this.q.e(t) < f || this.q.n(t) < f) {
                        M0(fVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = u - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View t2 = t(i5);
                if (this.q.e(t2) < f || this.q.n(t2) < f) {
                    M0(fVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int u2 = u();
        if (!this.t) {
            for (int i7 = 0; i7 < u2; i7++) {
                View t3 = t(i7);
                if (this.q.b(t3) > i6 || this.q.m(t3) > i6) {
                    M0(fVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = u2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View t4 = t(i9);
            if (this.q.b(t4) > i6 || this.q.m(t4) > i6) {
                M0(fVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public View M(View view, int i, f fVar, h24 h24Var) {
        int w0;
        N0();
        if (u() != 0 && (w0 = w0(i)) != Integer.MIN_VALUE) {
            x0();
            R0(w0, (int) (this.q.l() * 0.33333334f), false, h24Var);
            xj2 xj2Var = this.p;
            xj2Var.g = Integer.MIN_VALUE;
            xj2Var.a = false;
            y0(fVar, xj2Var, h24Var, true);
            boolean z = this.t;
            View B0 = w0 == -1 ? z ? B0(u() - 1, -1) : B0(0, u()) : z ? B0(0, u()) : B0(u() - 1, -1);
            View H0 = w0 == -1 ? H0() : G0();
            if (!H0.hasFocusable()) {
                return B0;
            }
            if (B0 != null) {
                return H0;
            }
        }
        return null;
    }

    public final void M0(f fVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View t = t(i);
                e0(i);
                fVar.h(t);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View t2 = t(i3);
            e0(i3);
            fVar.h(t2);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (u() > 0) {
            View C0 = C0(0, u(), false);
            accessibilityEvent.setFromIndex(C0 == null ? -1 : ((z14) C0.getLayoutParams()).a());
            View C02 = C0(u() - 1, -1, false);
            accessibilityEvent.setToIndex(C02 != null ? ((z14) C02.getLayoutParams()).a() : -1);
        }
    }

    public final void N0() {
        if (this.o == 1 || !I0()) {
            this.t = this.s;
        } else {
            this.t = !this.s;
        }
    }

    public final int O0(int i, h24 h24Var, f fVar) {
        if (u() != 0 && i != 0) {
            x0();
            this.p.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            R0(i2, abs, true, h24Var);
            xj2 xj2Var = this.p;
            int y0 = y0(fVar, xj2Var, h24Var, false) + xj2Var.g;
            if (y0 >= 0) {
                if (abs > y0) {
                    i = i2 * y0;
                }
                this.q.o(-i);
                this.p.j = i;
                return i;
            }
        }
        return 0;
    }

    public final void P0(int i) {
        if (i != 0 && i != 1) {
            s83.t(hf1.u(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            sg3 a = sg3.a(this, i);
            this.q = a;
            this.z.a = a;
            this.o = i;
            g0();
        }
    }

    public void Q0(boolean z) {
        b(null);
        if (this.u == z) {
            return;
        }
        this.u = z;
        g0();
    }

    public final void R0(int i, int i2, boolean z, h24 h24Var) {
        int k;
        this.p.l = this.q.i() == 0 && this.q.f() == 0;
        this.p.f = i;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        h24Var.getClass();
        int i3 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int max = Math.max(0, 0);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        xj2 xj2Var = this.p;
        int i4 = z2 ? max2 : max;
        xj2Var.h = i4;
        if (!z2) {
            max = max2;
        }
        xj2Var.i = max;
        if (z2) {
            xj2Var.h = this.q.h() + i4;
            View G0 = G0();
            xj2 xj2Var2 = this.p;
            xj2Var2.e = this.t ? -1 : 1;
            int B = e.B(G0);
            xj2 xj2Var3 = this.p;
            xj2Var2.d = B + xj2Var3.e;
            xj2Var3.b = this.q.b(G0);
            k = this.q.b(G0) - this.q.g();
        } else {
            View H0 = H0();
            xj2 xj2Var4 = this.p;
            xj2Var4.h = this.q.k() + xj2Var4.h;
            xj2 xj2Var5 = this.p;
            xj2Var5.e = this.t ? 1 : -1;
            int B2 = e.B(H0);
            xj2 xj2Var6 = this.p;
            xj2Var5.d = B2 + xj2Var6.e;
            xj2Var6.b = this.q.e(H0);
            k = (-this.q.e(H0)) + this.q.k();
        }
        xj2 xj2Var7 = this.p;
        xj2Var7.c = i2;
        if (z) {
            xj2Var7.c = i2 - k;
        }
        xj2Var7.g = k;
    }

    public final void S0(int i, int i2) {
        this.p.c = this.q.g() - i2;
        xj2 xj2Var = this.p;
        xj2Var.e = this.t ? -1 : 1;
        xj2Var.d = i;
        xj2Var.f = 1;
        xj2Var.b = i2;
        xj2Var.g = Integer.MIN_VALUE;
    }

    public final void T0(int i, int i2) {
        this.p.c = i2 - this.q.k();
        xj2 xj2Var = this.p;
        xj2Var.d = i;
        xj2Var.e = this.t ? 1 : -1;
        xj2Var.f = -1;
        xj2Var.b = i2;
        xj2Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.e
    public void W(f fVar, h24 h24Var) {
        View view;
        View view2;
        View D0;
        int i;
        int e;
        int i2;
        int i3;
        ?? r4;
        int i4;
        int i5;
        int E0;
        int i6;
        View p;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.y == null && this.w == -1) && h24Var.b() == 0) {
            b0(fVar);
            return;
        }
        yj2 yj2Var = this.y;
        if (yj2Var != null && (i8 = yj2Var.I) >= 0) {
            this.w = i8;
        }
        x0();
        boolean z = false;
        this.p.a = false;
        N0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view)) {
            view = null;
        }
        vj2 vj2Var = this.z;
        if (!vj2Var.e || this.w != -1 || this.y != null) {
            vj2Var.c();
            vj2Var.d = this.t ^ this.u;
            if (!h24Var.f && (i = this.w) != -1) {
                if (i < 0 || i >= h24Var.b()) {
                    this.w = -1;
                    this.x = Integer.MIN_VALUE;
                } else {
                    int i10 = this.w;
                    vj2Var.b = i10;
                    yj2 yj2Var2 = this.y;
                    if (yj2Var2 != null && yj2Var2.I >= 0) {
                        boolean z2 = yj2Var2.K;
                        vj2Var.d = z2;
                        sg3 sg3Var = this.q;
                        if (z2) {
                            vj2Var.c = sg3Var.g() - this.y.J;
                        } else {
                            vj2Var.c = sg3Var.k() + this.y.J;
                        }
                    } else if (this.x == Integer.MIN_VALUE) {
                        View p2 = p(i10);
                        if (p2 == null) {
                            if (u() > 0) {
                                vj2Var.d = (this.w < e.B(t(0))) == this.t;
                            }
                            vj2Var.a();
                        } else if (this.q.c(p2) > this.q.l()) {
                            vj2Var.a();
                        } else {
                            int e3 = this.q.e(p2) - this.q.k();
                            sg3 sg3Var2 = this.q;
                            if (e3 < 0) {
                                vj2Var.c = sg3Var2.k();
                                vj2Var.d = false;
                            } else if (sg3Var2.g() - this.q.b(p2) < 0) {
                                vj2Var.c = this.q.g();
                                vj2Var.d = true;
                            } else {
                                boolean z3 = vj2Var.d;
                                sg3 sg3Var3 = this.q;
                                if (z3) {
                                    int b = sg3Var3.b(p2);
                                    sg3 sg3Var4 = this.q;
                                    e = (Integer.MIN_VALUE == sg3Var4.b ? 0 : sg3Var4.l() - sg3Var4.b) + b;
                                } else {
                                    e = sg3Var3.e(p2);
                                }
                                vj2Var.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.t;
                        vj2Var.d = z4;
                        sg3 sg3Var5 = this.q;
                        if (z4) {
                            vj2Var.c = sg3Var5.g() - this.x;
                        } else {
                            vj2Var.c = sg3Var5.k() + this.x;
                        }
                    }
                    vj2Var.e = true;
                }
            }
            if (u() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    z14 z14Var = (z14) view2.getLayoutParams();
                    if (!z14Var.c() && z14Var.a() >= 0 && z14Var.a() < h24Var.b()) {
                        vj2Var.b(((z14) view2.getLayoutParams()).a(), view2);
                        vj2Var.e = true;
                    }
                }
                boolean z5 = this.r;
                boolean z6 = this.u;
                if (z5 == z6 && (D0 = D0(fVar, h24Var, vj2Var.d, z6)) != null) {
                    int a = ((z14) D0.getLayoutParams()).a();
                    boolean z7 = vj2Var.d;
                    sg3 sg3Var6 = vj2Var.a;
                    if (z7) {
                        int b2 = sg3Var6.b(D0);
                        sg3 sg3Var7 = vj2Var.a;
                        vj2Var.c = (Integer.MIN_VALUE == sg3Var7.b ? 0 : sg3Var7.l() - sg3Var7.b) + b2;
                    } else {
                        vj2Var.c = sg3Var6.e(D0);
                    }
                    vj2Var.b = a;
                    if (!h24Var.f && r0()) {
                        int e4 = this.q.e(D0);
                        int b3 = this.q.b(D0);
                        int k = this.q.k();
                        int g = this.q.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (vj2Var.d) {
                                k = g;
                            }
                            vj2Var.c = k;
                        }
                    }
                    vj2Var.e = true;
                }
            }
            vj2Var.a();
            vj2Var.b = this.u ? h24Var.b() - 1 : 0;
            vj2Var.e = true;
        } else if (view != null && (this.q.e(view) >= this.q.g() || this.q.b(view) <= this.q.k())) {
            vj2Var.b(((z14) view.getLayoutParams()).a(), view);
        }
        xj2 xj2Var = this.p;
        xj2Var.f = xj2Var.j >= 0 ? 1 : -1;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        h24Var.getClass();
        int i11 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int k2 = this.q.k() + Math.max(0, 0);
        int h = this.q.h() + Math.max(0, iArr[1]);
        if (h24Var.f && (i6 = this.w) != -1 && this.x != Integer.MIN_VALUE && (p = p(i6)) != null) {
            boolean z10 = this.t;
            sg3 sg3Var8 = this.q;
            if (z10) {
                i7 = sg3Var8.g() - this.q.b(p);
                e2 = this.x;
            } else {
                e2 = sg3Var8.e(p) - this.q.k();
                i7 = this.x;
            }
            int i12 = i7 - e2;
            if (i12 > 0) {
                k2 += i12;
            } else {
                h -= i12;
            }
        }
        boolean z11 = vj2Var.d;
        boolean z12 = this.t;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        K0(fVar, h24Var, vj2Var, i9);
        o(fVar);
        this.p.l = this.q.i() == 0 && this.q.f() == 0;
        this.p.getClass();
        this.p.i = 0;
        boolean z13 = vj2Var.d;
        int i13 = vj2Var.b;
        if (z13) {
            T0(i13, vj2Var.c);
            xj2 xj2Var2 = this.p;
            xj2Var2.h = k2;
            y0(fVar, xj2Var2, h24Var, false);
            xj2 xj2Var3 = this.p;
            i3 = xj2Var3.b;
            int i14 = xj2Var3.d;
            int i15 = xj2Var3.c;
            if (i15 > 0) {
                h += i15;
            }
            S0(vj2Var.b, vj2Var.c);
            xj2 xj2Var4 = this.p;
            xj2Var4.h = h;
            xj2Var4.d += xj2Var4.e;
            y0(fVar, xj2Var4, h24Var, false);
            xj2 xj2Var5 = this.p;
            i2 = xj2Var5.b;
            int i16 = xj2Var5.c;
            if (i16 > 0) {
                T0(i14, i3);
                xj2 xj2Var6 = this.p;
                xj2Var6.h = i16;
                y0(fVar, xj2Var6, h24Var, false);
                i3 = this.p.b;
            }
        } else {
            S0(i13, vj2Var.c);
            xj2 xj2Var7 = this.p;
            xj2Var7.h = h;
            y0(fVar, xj2Var7, h24Var, false);
            xj2 xj2Var8 = this.p;
            i2 = xj2Var8.b;
            int i17 = xj2Var8.d;
            int i18 = xj2Var8.c;
            if (i18 > 0) {
                k2 += i18;
            }
            T0(vj2Var.b, vj2Var.c);
            xj2 xj2Var9 = this.p;
            xj2Var9.h = k2;
            xj2Var9.d += xj2Var9.e;
            y0(fVar, xj2Var9, h24Var, false);
            xj2 xj2Var10 = this.p;
            int i19 = xj2Var10.b;
            int i20 = xj2Var10.c;
            if (i20 > 0) {
                S0(i17, i2);
                xj2 xj2Var11 = this.p;
                xj2Var11.h = i20;
                y0(fVar, xj2Var11, h24Var, false);
                i2 = this.p.b;
            }
            i3 = i19;
        }
        if (u() > 0) {
            if (this.t ^ this.u) {
                int E02 = E0(i2, fVar, h24Var, true);
                i4 = i3 + E02;
                i5 = i2 + E02;
                E0 = F0(i4, fVar, h24Var, false);
            } else {
                int F0 = F0(i3, fVar, h24Var, true);
                i4 = i3 + F0;
                i5 = i2 + F0;
                E0 = E0(i5, fVar, h24Var, false);
            }
            i3 = i4 + E0;
            i2 = i5 + E0;
        }
        if (h24Var.j && u() != 0 && !h24Var.f && r0()) {
            List list = fVar.d;
            int size = list.size();
            int B = e.B(t(0));
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < size) {
                g gVar = (g) list.get(i21);
                if (!gVar.isRemoved()) {
                    boolean z14 = gVar.getLayoutPosition() < B ? true : z;
                    boolean z15 = this.t;
                    sg3 sg3Var9 = this.q;
                    View view3 = gVar.itemView;
                    if (z14 != z15) {
                        i22 += sg3Var9.c(view3);
                    } else {
                        i23 += sg3Var9.c(view3);
                    }
                }
                i21++;
                z = false;
            }
            this.p.k = list;
            if (i22 > 0) {
                T0(e.B(H0()), i3);
                xj2 xj2Var12 = this.p;
                xj2Var12.h = i22;
                r4 = 0;
                xj2Var12.c = 0;
                xj2Var12.a();
                y0(fVar, this.p, h24Var, false);
            } else {
                r4 = 0;
            }
            if (i23 > 0) {
                S0(e.B(G0()), i2);
                xj2 xj2Var13 = this.p;
                xj2Var13.h = i23;
                xj2Var13.c = r4;
                xj2Var13.a();
                y0(fVar, this.p, h24Var, r4);
            }
            this.p.k = null;
        }
        if (h24Var.f) {
            vj2Var.c();
        } else {
            sg3 sg3Var10 = this.q;
            sg3Var10.b = sg3Var10.l();
        }
        this.r = this.u;
    }

    @Override // androidx.recyclerview.widget.e
    public void X(h24 h24Var) {
        this.y = null;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.z.c();
    }

    @Override // androidx.recyclerview.widget.e
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof yj2) {
            yj2 yj2Var = (yj2) parcelable;
            this.y = yj2Var;
            if (this.w != -1) {
                yj2Var.I = -1;
            }
            g0();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final Parcelable Z() {
        yj2 yj2Var = this.y;
        if (yj2Var != null) {
            yj2 yj2Var2 = new yj2();
            yj2Var2.I = yj2Var.I;
            yj2Var2.J = yj2Var.J;
            yj2Var2.K = yj2Var.K;
            return yj2Var2;
        }
        yj2 yj2Var3 = new yj2();
        if (u() <= 0) {
            yj2Var3.I = -1;
            return yj2Var3;
        }
        x0();
        boolean z = this.r ^ this.t;
        yj2Var3.K = z;
        if (z) {
            View G0 = G0();
            yj2Var3.J = this.q.g() - this.q.b(G0);
            yj2Var3.I = ((z14) G0.getLayoutParams()).a();
            return yj2Var3;
        }
        View H0 = H0();
        yj2Var3.I = e.B(H0);
        yj2Var3.J = this.q.e(H0) - this.q.k();
        return yj2Var3;
    }

    @Override // androidx.recyclerview.widget.e
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.y != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean c() {
        return this.o == 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean d() {
        return this.o == 1;
    }

    @Override // androidx.recyclerview.widget.e
    public final void g(int i, int i2, h24 h24Var, mo1 mo1Var) {
        if (this.o != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        x0();
        R0(i > 0 ? 1 : -1, Math.abs(i), true, h24Var);
        s0(h24Var, this.p, mo1Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final void h(int i, mo1 mo1Var) {
        boolean z;
        int i2;
        yj2 yj2Var = this.y;
        if (yj2Var == null || (i2 = yj2Var.I) < 0) {
            N0();
            z = this.t;
            i2 = this.w;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = yj2Var.K;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.B && i2 >= 0 && i2 < i; i4++) {
            mo1Var.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.e
    public int h0(int i, h24 h24Var, f fVar) {
        if (this.o == 1) {
            return 0;
        }
        return O0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final int i(h24 h24Var) {
        return t0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public int i0(int i, h24 h24Var, f fVar) {
        if (this.o == 0) {
            return 0;
        }
        return O0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public int j(h24 h24Var) {
        return u0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public int k(h24 h24Var) {
        return v0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final int l(h24 h24Var) {
        return t0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public int m(h24 h24Var) {
        return u0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public int n(h24 h24Var) {
        return v0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final View p(int i) {
        int u = u();
        if (u == 0) {
            return null;
        }
        int B = i - e.B(t(0));
        if (B >= 0 && B < u) {
            View t = t(B);
            if (e.B(t) == i) {
                return t;
            }
        }
        return super.p(i);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean p0() {
        if (this.l != 1073741824 && this.k != 1073741824) {
            int u = u();
            for (int i = 0; i < u; i++) {
                ViewGroup.LayoutParams layoutParams = t(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e
    public boolean r0() {
        return this.y == null && this.r == this.u;
    }

    public void s0(h24 h24Var, xj2 xj2Var, mo1 mo1Var) {
        int i = xj2Var.d;
        if (i < 0 || i >= h24Var.b()) {
            return;
        }
        mo1Var.a(i, Math.max(0, xj2Var.g));
    }

    public final int t0(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        x0();
        sg3 sg3Var = this.q;
        boolean z = !this.v;
        return hc4.m(h24Var, sg3Var, A0(z), z0(z), this, this.v);
    }

    public final int u0(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        x0();
        sg3 sg3Var = this.q;
        boolean z = !this.v;
        return hc4.n(h24Var, sg3Var, A0(z), z0(z), this, this.v, this.t);
    }

    public final int v0(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        x0();
        sg3 sg3Var = this.q;
        boolean z = !this.v;
        return hc4.o(h24Var, sg3Var, A0(z), z0(z), this, this.v);
    }

    public final int w0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.o == 1) ? 1 : Integer.MIN_VALUE : this.o == 0 ? 1 : Integer.MIN_VALUE : this.o == 1 ? -1 : Integer.MIN_VALUE : this.o == 0 ? -1 : Integer.MIN_VALUE : (this.o != 1 && I0()) ? -1 : 1 : (this.o != 1 && I0()) ? 1 : -1;
    }

    public final void x0() {
        if (this.p == null) {
            this.p = new xj2();
        }
    }

    public final int y0(f fVar, xj2 xj2Var, h24 h24Var, boolean z) {
        int i = xj2Var.c;
        int i2 = xj2Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                xj2Var.g = i2 + i;
            }
            L0(fVar, xj2Var);
        }
        int i3 = xj2Var.c + xj2Var.h;
        while (true) {
            if ((!xj2Var.l && i3 <= 0) || !xj2Var.c(h24Var)) {
                break;
            }
            wj2 wj2Var = this.A;
            wj2Var.a = 0;
            wj2Var.b = false;
            wj2Var.c = false;
            wj2Var.d = false;
            J0(fVar, h24Var, xj2Var, wj2Var);
            if (!wj2Var.b) {
                int i4 = xj2Var.b;
                int i5 = wj2Var.a;
                xj2Var.b = (xj2Var.f * i5) + i4;
                if (!wj2Var.c || xj2Var.k != null || !h24Var.f) {
                    xj2Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = xj2Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    xj2Var.g = i7;
                    int i8 = xj2Var.c;
                    if (i8 < 0) {
                        xj2Var.g = i7 + i8;
                    }
                    L0(fVar, xj2Var);
                }
                if (z && wj2Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - xj2Var.c;
    }

    public final View z0(boolean z) {
        return this.t ? C0(0, u(), z) : C0(u() - 1, -1, z);
    }

    public LinearLayoutManager() {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new vj2();
        this.A = new wj2();
        this.B = (byte) 2;
        this.C = new int[2];
        P0(1);
        b(null);
        if (this.s) {
            this.s = false;
            g0();
        }
    }

    public void K0(f fVar, h24 h24Var, vj2 vj2Var, int i) {
    }
}
