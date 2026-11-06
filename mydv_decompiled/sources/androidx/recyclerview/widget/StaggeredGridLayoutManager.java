package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.media3.common.util.Log;
import defpackage.bl;
import defpackage.dr5;
import defpackage.g12;
import defpackage.h24;
import defpackage.hc4;
import defpackage.lv4;
import defpackage.mo1;
import defpackage.mv4;
import defpackage.oc2;
import defpackage.ov4;
import defpackage.pv4;
import defpackage.s83;
import defpackage.sg3;
import defpackage.y14;
import defpackage.z14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends e {
    public final g12 A;
    public final byte B;
    public boolean C;
    public boolean D;
    public ov4 E;
    public final Rect F;
    public final lv4 G;
    public final boolean H;
    public int[] I;
    public final bl J;
    public final int o;
    public final pv4[] p;
    public final sg3 q;
    public final sg3 r;
    public final int s;
    public int t;
    public final oc2 u;
    public boolean v;
    public final BitSet x;
    public boolean w = false;
    public int y = -1;
    public int z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = -1;
        this.v = false;
        g12 g12Var = new g12((byte) 27, false);
        this.A = g12Var;
        this.B = (byte) 2;
        this.F = new Rect();
        this.G = new lv4(this);
        this.H = true;
        this.J = new bl(this, (byte) 7);
        y14 C = e.C(context, attributeSet, i, i2);
        int i3 = C.a;
        if (i3 != 0 && i3 != 1) {
            s83.t("invalid orientation.");
            throw null;
        }
        b(null);
        if (i3 != this.s) {
            this.s = i3;
            sg3 sg3Var = this.q;
            this.q = this.r;
            this.r = sg3Var;
            g0();
        }
        int i4 = C.b;
        b(null);
        if (i4 != this.o) {
            g12Var.m();
            g0();
            this.o = i4;
            this.x = new BitSet(this.o);
            this.p = new pv4[this.o];
            for (int i5 = 0; i5 < this.o; i5++) {
                this.p[i5] = new pv4(this, i5);
            }
            g0();
        }
        boolean z = C.c;
        b(null);
        ov4 ov4Var = this.E;
        if (ov4Var != null && ov4Var.P != z) {
            ov4Var.P = z;
        }
        this.v = z;
        g0();
        oc2 oc2Var = new oc2();
        oc2Var.a = true;
        oc2Var.f = 0;
        oc2Var.g = 0;
        this.u = oc2Var;
        this.q = sg3.a(this, this.s);
        this.r = sg3.a(this, 1 - this.s);
    }

    public static int S0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A0() {
        int u = u();
        if (u == 0) {
            return 0;
        }
        return e.B(t(u - 1));
    }

    public final int B0(int i) {
        int f = this.p[0].f(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int f2 = this.p[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    public final int C0(int i) {
        int h = this.p[0].h(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int h2 = this.p[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View E0() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean F() {
        return this.B != 0;
    }

    public final boolean F0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = dr5.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public final void G0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.I(view));
        }
        mv4 mv4Var = (mv4) view.getLayoutParams();
        int S0 = S0(i, ((ViewGroup.MarginLayoutParams) mv4Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) mv4Var).rightMargin + rect.right);
        int S02 = S0(i2, ((ViewGroup.MarginLayoutParams) mv4Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) mv4Var).bottomMargin + rect.bottom);
        if (o0(view, S0, S02, mv4Var)) {
            view.measure(S0, S02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < z0()) != r17.w) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.w != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(androidx.recyclerview.widget.f r18, defpackage.h24 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H0(androidx.recyclerview.widget.f, h24, boolean):void");
    }

    @Override // androidx.recyclerview.widget.e
    public final void I(int i) {
        super.I(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            pv4 pv4Var = this.p[i2];
            int i3 = pv4Var.b;
            if (i3 != Integer.MIN_VALUE) {
                pv4Var.b = i3 + i;
            }
            int i4 = pv4Var.c;
            if (i4 != Integer.MIN_VALUE) {
                pv4Var.c = i4 + i;
            }
        }
    }

    public final boolean I0(int i) {
        if (this.s == 0) {
            return (i == -1) != this.w;
        }
        return ((i == -1) == this.w) == F0();
    }

    @Override // androidx.recyclerview.widget.e
    public final void J(int i) {
        super.J(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            pv4 pv4Var = this.p[i2];
            int i3 = pv4Var.b;
            if (i3 != Integer.MIN_VALUE) {
                pv4Var.b = i3 + i;
            }
            int i4 = pv4Var.c;
            if (i4 != Integer.MIN_VALUE) {
                pv4Var.c = i4 + i;
            }
        }
    }

    public final void J0(int i) {
        int z0;
        int i2;
        if (i > 0) {
            z0 = A0();
            i2 = 1;
        } else {
            z0 = z0();
            i2 = -1;
        }
        oc2 oc2Var = this.u;
        oc2Var.a = true;
        Q0(z0);
        P0(i2);
        oc2Var.c = z0 + oc2Var.d;
        oc2Var.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.e
    public final void K() {
        this.A.m();
        for (int i = 0; i < this.o; i++) {
            this.p[i].b();
        }
    }

    public final void K0(f fVar, oc2 oc2Var) {
        if (!oc2Var.a || oc2Var.i) {
            return;
        }
        int i = oc2Var.b;
        int i2 = oc2Var.e;
        if (i == 0) {
            if (i2 == -1) {
                L0(fVar, oc2Var.g);
                return;
            } else {
                M0(fVar, oc2Var.f);
                return;
            }
        }
        int i3 = this.o;
        pv4[] pv4VarArr = this.p;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = oc2Var.f;
            int h = pv4VarArr[0].h(i5);
            while (i4 < i3) {
                int h2 = pv4VarArr[i4].h(i5);
                if (h2 > h) {
                    h = h2;
                }
                i4++;
            }
            int i6 = i5 - h;
            int i7 = oc2Var.g;
            if (i6 >= 0) {
                i7 -= Math.min(i6, oc2Var.b);
            }
            L0(fVar, i7);
            return;
        }
        int i8 = oc2Var.g;
        int f = pv4VarArr[0].f(i8);
        while (i4 < i3) {
            int f2 = pv4VarArr[i4].f(i8);
            if (f2 < f) {
                f = f2;
            }
            i4++;
        }
        int i9 = f - oc2Var.g;
        int i10 = oc2Var.f;
        if (i9 >= 0) {
            i10 += Math.min(i9, oc2Var.b);
        }
        M0(fVar, i10);
    }

    @Override // androidx.recyclerview.widget.e
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.J);
        }
        for (int i = 0; i < this.o; i++) {
            this.p[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void L0(f fVar, int i) {
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            sg3 sg3Var = this.q;
            if (sg3Var.e(t) < i || sg3Var.n(t) < i) {
                return;
            }
            mv4 mv4Var = (mv4) t.getLayoutParams();
            mv4Var.getClass();
            if (mv4Var.e.a.size() == 1) {
                return;
            }
            pv4 pv4Var = mv4Var.e;
            ArrayList arrayList = pv4Var.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            mv4 mv4Var2 = (mv4) view.getLayoutParams();
            mv4Var2.e = null;
            if (mv4Var2.a.isRemoved() || mv4Var2.a.isUpdated()) {
                pv4Var.d -= pv4Var.f.q.c(view);
            }
            if (size == 1) {
                pv4Var.b = Integer.MIN_VALUE;
            }
            pv4Var.c = Integer.MIN_VALUE;
            d0(t, fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (F0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (F0() == false) goto L34;
     */
    @Override // androidx.recyclerview.widget.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.View r9, int r10, androidx.recyclerview.widget.f r11, defpackage.h24 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M(android.view.View, int, androidx.recyclerview.widget.f, h24):android.view.View");
    }

    public final void M0(f fVar, int i) {
        while (u() > 0) {
            View t = t(0);
            sg3 sg3Var = this.q;
            if (sg3Var.b(t) > i || sg3Var.m(t) > i) {
                return;
            }
            mv4 mv4Var = (mv4) t.getLayoutParams();
            mv4Var.getClass();
            if (mv4Var.e.a.size() == 1) {
                return;
            }
            pv4 pv4Var = mv4Var.e;
            ArrayList arrayList = pv4Var.a;
            View view = (View) arrayList.remove(0);
            mv4 mv4Var2 = (mv4) view.getLayoutParams();
            mv4Var2.e = null;
            if (arrayList.size() == 0) {
                pv4Var.c = Integer.MIN_VALUE;
            }
            if (mv4Var2.a.isRemoved() || mv4Var2.a.isUpdated()) {
                pv4Var.d -= pv4Var.f.q.c(view);
            }
            pv4Var.b = Integer.MIN_VALUE;
            d0(t, fVar);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (u() > 0) {
            View w0 = w0(false);
            View v0 = v0(false);
            if (w0 == null || v0 == null) {
                return;
            }
            int a = ((z14) w0.getLayoutParams()).a();
            int a2 = ((z14) v0.getLayoutParams()).a();
            if (a < a2) {
                accessibilityEvent.setFromIndex(a);
                accessibilityEvent.setToIndex(a2);
            } else {
                accessibilityEvent.setFromIndex(a2);
                accessibilityEvent.setToIndex(a);
            }
        }
    }

    public final void N0() {
        if (this.s == 1 || !F0()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    public final int O0(int i, h24 h24Var, f fVar) {
        if (u() == 0 || i == 0) {
            return 0;
        }
        J0(i);
        oc2 oc2Var = this.u;
        int u0 = u0(fVar, oc2Var, h24Var);
        if (oc2Var.b >= u0) {
            i = i < 0 ? -u0 : u0;
        }
        this.q.o(-i);
        this.C = this.w;
        oc2Var.b = 0;
        K0(fVar, oc2Var);
        return i;
    }

    public final void P0(int i) {
        oc2 oc2Var = this.u;
        oc2Var.e = i;
        oc2Var.d = this.w != (i == -1) ? -1 : 1;
    }

    public final void Q0(int i) {
        oc2 oc2Var = this.u;
        boolean z = false;
        oc2Var.b = 0;
        oc2Var.c = i;
        RecyclerView recyclerView = this.b;
        sg3 sg3Var = this.q;
        if (recyclerView == null || !recyclerView.P) {
            oc2Var.g = sg3Var.f();
            oc2Var.f = 0;
        } else {
            oc2Var.f = sg3Var.k();
            oc2Var.g = sg3Var.g();
        }
        oc2Var.h = false;
        oc2Var.a = true;
        if (sg3Var.i() == 0 && sg3Var.f() == 0) {
            z = true;
        }
        oc2Var.i = z;
    }

    @Override // androidx.recyclerview.widget.e
    public final void R(int i, int i2) {
        D0(i, i2, 1);
    }

    public final void R0(pv4 pv4Var, int i, int i2) {
        int i3 = pv4Var.d;
        int i4 = pv4Var.e;
        BitSet bitSet = this.x;
        if (i != -1) {
            int i5 = pv4Var.c;
            if (i5 == Integer.MIN_VALUE) {
                pv4Var.a();
                i5 = pv4Var.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = pv4Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) pv4Var.a.get(0);
            mv4 mv4Var = (mv4) view.getLayoutParams();
            pv4Var.b = pv4Var.f.q.e(view);
            mv4Var.getClass();
            i6 = pv4Var.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void S() {
        this.A.m();
        g0();
    }

    @Override // androidx.recyclerview.widget.e
    public final void T(int i, int i2) {
        D0(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.e
    public final void U(int i, int i2) {
        D0(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.e
    public final void V(int i, int i2) {
        D0(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.e
    public final void W(f fVar, h24 h24Var) {
        H0(fVar, h24Var, true);
    }

    @Override // androidx.recyclerview.widget.e
    public final void X(h24 h24Var) {
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.E = null;
        this.G.a();
    }

    @Override // androidx.recyclerview.widget.e
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof ov4) {
            ov4 ov4Var = (ov4) parcelable;
            this.E = ov4Var;
            if (this.y != -1) {
                ov4Var.I = -1;
                ov4Var.J = -1;
                ov4Var.L = null;
                ov4Var.K = 0;
                ov4Var.M = 0;
                ov4Var.N = null;
                ov4Var.O = null;
            }
            g0();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final Parcelable Z() {
        int h;
        int k;
        int[] iArr;
        ov4 ov4Var = this.E;
        if (ov4Var != null) {
            ov4 ov4Var2 = new ov4();
            ov4Var2.K = ov4Var.K;
            ov4Var2.I = ov4Var.I;
            ov4Var2.J = ov4Var.J;
            ov4Var2.L = ov4Var.L;
            ov4Var2.M = ov4Var.M;
            ov4Var2.N = ov4Var.N;
            ov4Var2.P = ov4Var.P;
            ov4Var2.Q = ov4Var.Q;
            ov4Var2.R = ov4Var.R;
            ov4Var2.O = ov4Var.O;
            return ov4Var2;
        }
        ov4 ov4Var3 = new ov4();
        ov4Var3.P = this.v;
        ov4Var3.Q = this.C;
        ov4Var3.R = this.D;
        g12 g12Var = this.A;
        if (g12Var == null || (iArr = (int[]) g12Var.J) == null) {
            ov4Var3.M = 0;
        } else {
            ov4Var3.N = iArr;
            ov4Var3.M = iArr.length;
            ov4Var3.O = (ArrayList) g12Var.K;
        }
        if (u() <= 0) {
            ov4Var3.I = -1;
            ov4Var3.J = -1;
            ov4Var3.K = 0;
            return ov4Var3;
        }
        ov4Var3.I = this.C ? A0() : z0();
        View v0 = this.w ? v0(true) : w0(true);
        ov4Var3.J = v0 != null ? ((z14) v0.getLayoutParams()).a.getLayoutPosition() : -1;
        int i = this.o;
        ov4Var3.K = i;
        ov4Var3.L = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.C;
            sg3 sg3Var = this.q;
            pv4[] pv4VarArr = this.p;
            if (z) {
                h = pv4VarArr[i2].f(Integer.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k = sg3Var.g();
                    h -= k;
                    ov4Var3.L[i2] = h;
                } else {
                    ov4Var3.L[i2] = h;
                }
            } else {
                h = pv4VarArr[i2].h(Integer.MIN_VALUE);
                if (h != Integer.MIN_VALUE) {
                    k = sg3Var.k();
                    h -= k;
                    ov4Var3.L[i2] = h;
                } else {
                    ov4Var3.L[i2] = h;
                }
            }
        }
        return ov4Var3;
    }

    @Override // androidx.recyclerview.widget.e
    public final void a0(int i) {
        if (i == 0) {
            s0();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.E != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean c() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean d() {
        return this.s == 1;
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean e(z14 z14Var) {
        return z14Var instanceof mv4;
    }

    @Override // androidx.recyclerview.widget.e
    public final void g(int i, int i2, h24 h24Var, mo1 mo1Var) {
        oc2 oc2Var;
        int f;
        if (this.s != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        J0(i);
        int[] iArr = this.I;
        int i3 = this.o;
        if (iArr == null || iArr.length < i3) {
            this.I = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            oc2Var = this.u;
            if (i4 >= i3) {
                break;
            }
            int i6 = oc2Var.d;
            pv4[] pv4VarArr = this.p;
            if (i6 == -1) {
                int i7 = oc2Var.f;
                f = i7 - pv4VarArr[i4].h(i7);
            } else {
                f = pv4VarArr[i4].f(oc2Var.g) - oc2Var.g;
            }
            if (f >= 0) {
                this.I[i5] = f;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.I, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = oc2Var.c;
            if (i9 < 0 || i9 >= h24Var.b()) {
                return;
            }
            mo1Var.a(oc2Var.c, this.I[i8]);
            oc2Var.c += oc2Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final int h0(int i, h24 h24Var, f fVar) {
        return O0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final int i(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return hc4.m(h24Var, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.e
    public final int i0(int i, h24 h24Var, f fVar) {
        return O0(i, h24Var, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final int j(h24 h24Var) {
        return t0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final int k(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return hc4.o(h24Var, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.e
    public final int l(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return hc4.m(h24Var, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.e
    public final void l0(Rect rect, int i, int i2) {
        int f;
        int f2;
        int z = z() + y();
        int x = x() + A();
        int i3 = this.s;
        int i4 = this.o;
        if (i3 == 1) {
            int height = rect.height() + x;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = dr5.a;
            f2 = e.f(i2, height, recyclerView.getMinimumHeight());
            f = e.f(i, (this.t * i4) + z, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + z;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = dr5.a;
            f = e.f(i, width, recyclerView2.getMinimumWidth());
            f2 = e.f(i2, (this.t * i4) + x, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(f, f2);
    }

    @Override // androidx.recyclerview.widget.e
    public final int m(h24 h24Var) {
        return t0(h24Var);
    }

    @Override // androidx.recyclerview.widget.e
    public final int n(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return hc4.o(h24Var, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 q() {
        return this.s == 0 ? new mv4(-2, -1) : new mv4(-1, -2);
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 r(Context context, AttributeSet attributeSet) {
        return new mv4(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean r0() {
        return this.E == null;
    }

    @Override // androidx.recyclerview.widget.e
    public final z14 s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mv4((ViewGroup.MarginLayoutParams) layoutParams) : new mv4(layoutParams);
    }

    public final boolean s0() {
        int z0;
        if (u() != 0 && this.B != 0 && this.f) {
            if (this.w) {
                z0 = A0();
                z0();
            } else {
                z0 = z0();
                A0();
            }
            if (z0 == 0 && E0() != null) {
                this.A.m();
                this.e = true;
                g0();
                return true;
            }
        }
        return false;
    }

    public final int t0(h24 h24Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return hc4.n(h24Var, this.q, w0(z), v0(z), this, this.H, this.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x026b, code lost:
    
        K0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u0(androidx.recyclerview.widget.f r25, defpackage.oc2 r26, defpackage.h24 r27) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u0(androidx.recyclerview.widget.f, oc2, h24):int");
    }

    public final View v0(boolean z) {
        sg3 sg3Var = this.q;
        int k = sg3Var.k();
        int g = sg3Var.g();
        View view = null;
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            int e = sg3Var.e(t);
            int b = sg3Var.b(t);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return t;
                }
                if (view == null) {
                    view = t;
                }
            }
        }
        return view;
    }

    public final View w0(boolean z) {
        sg3 sg3Var = this.q;
        int k = sg3Var.k();
        int g = sg3Var.g();
        int u = u();
        View view = null;
        for (int i = 0; i < u; i++) {
            View t = t(i);
            int e = sg3Var.e(t);
            if (sg3Var.b(t) > k && e < g) {
                if (e >= k || !z) {
                    return t;
                }
                if (view == null) {
                    view = t;
                }
            }
        }
        return view;
    }

    public final void x0(f fVar, h24 h24Var, boolean z) {
        int g;
        int B0 = B0(Integer.MIN_VALUE);
        if (B0 != Integer.MIN_VALUE && (g = this.q.g() - B0) > 0) {
            int i = g - (-O0(-g, h24Var, fVar));
            if (!z || i <= 0) {
                return;
            }
            this.q.o(i);
        }
    }

    public final void y0(f fVar, h24 h24Var, boolean z) {
        int k;
        int C0 = C0(Log.LOG_LEVEL_OFF);
        if (C0 != Integer.MAX_VALUE && (k = C0 - this.q.k()) > 0) {
            int O0 = k - O0(k, h24Var, fVar);
            if (!z || O0 <= 0) {
                return;
            }
            this.q.o(-O0);
        }
    }

    public final int z0() {
        if (u() == 0) {
            return 0;
        }
        return e.B(t(0));
    }
}
