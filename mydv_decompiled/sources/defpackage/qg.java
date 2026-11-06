package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class qg extends ViewGroup implements n93, ld0, rh3, yd3 {
    public static final q4 l0 = new q4((byte) 5);
    public final d93 I;
    public final View J;
    public final qh3 K;
    public rm1 L;
    public boolean M;
    public rm1 N;
    public rm1 O;
    public l13 P;
    public tm1 Q;
    public iu0 R;
    public tm1 S;
    public vi2 T;
    public w94 U;
    public final int[] V;
    public long W;
    public yv5 a0;
    public tm1 b0;
    public final lg c0;
    public final lg d0;
    public tm1 e0;
    public final int[] f0;
    public int g0;
    public int h0;
    public final o93 i0;
    public boolean j0;
    public final wa2 k0;

    public qg(Context context, eo1 eo1Var, int i, d93 d93Var, View view, qh3 qh3Var) {
        super(context);
        this.I = d93Var;
        this.J = view;
        this.K = qh3Var;
        n43 n43Var = uw5.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, eo1Var);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ir5 ir5Var = (ir5) this;
        mg mgVar = new mg(ir5Var);
        WeakHashMap weakHashMap = dr5.a;
        ev5.a(this, mgVar);
        vq5.c(this, this);
        this.L = new q7((byte) 7);
        this.N = new q7((byte) 8);
        this.O = new q7((byte) 9);
        i13 i13Var = i13.a;
        this.P = i13Var;
        this.R = mu0.a();
        byte b2 = 2;
        this.V = new int[2];
        this.W = 0L;
        this.c0 = new lg(ir5Var, b);
        byte b3 = 1;
        this.d0 = new lg(ir5Var, b3);
        this.f0 = new int[2];
        this.g0 = Integer.MIN_VALUE;
        this.h0 = Integer.MIN_VALUE;
        this.i0 = new o93();
        wa2 wa2Var = new wa2(3);
        wa2Var.W = ir5Var;
        l13 a = oi4.a(j42.R(i13Var, j42.a, d93Var), true, new q4((byte) 6));
        aq3 aq3Var = new aq3();
        aq3Var.a = new kg(ir5Var, b2);
        sy syVar = new sy();
        sy syVar2 = aq3Var.b;
        if (syVar2 != null) {
            syVar2.J = null;
        }
        aq3Var.b = syVar;
        syVar.J = aq3Var;
        setOnRequestDisallowInterceptTouchEvent$ui(syVar);
        l13 then = qb.X(j42.t(a.then(aq3Var), new ig(ir5Var, wa2Var, ir5Var)), new jg(ir5Var, wa2Var, b)).then(new yx(new kg(ir5Var, b)));
        wa2Var.g0(this.P.then(then));
        this.Q = new m1(wa2Var, then, b3);
        wa2Var.c0(this.R);
        this.S = new i9(wa2Var, b2);
        wa2Var.u0 = new jg(ir5Var, wa2Var, b3);
        wa2Var.v0 = new kg(ir5Var, b3);
        wa2Var.f0(new ng(ir5Var, wa2Var));
        this.k0 = wa2Var;
    }

    private final sh3 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            q02.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.K.getSnapshotObserver();
    }

    public static o12 k(o12 o12Var, int i, int i2, int i3, int i4) {
        int i5 = o12Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = o12Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = o12Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = o12Var.d - i4;
        return o12.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int n(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(ut0.r(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final void o(ir5 ir5Var) {
        if (ir5Var.M && ir5Var.isAttachedToWindow() && ir5Var.J.getParent() == ir5Var) {
            sh3 snapshotObserver = ir5Var.getSnapshotObserver();
            snapshotObserver.a.d(ir5Var, l0, ir5Var.L);
        }
    }

    @Override // defpackage.m93
    public final void a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (this.J.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            h93 h93Var = this.I.a;
            h93 k0 = h93Var != null ? h93Var.k0() : null;
            if (k0 != null) {
                k0.V(i6, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.ld0
    public final void b() {
        this.O.invoke();
    }

    @Override // defpackage.n93
    public final void c(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.J.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            h93 h93Var = this.I.a;
            h93 k0 = h93Var != null ? h93Var.k0() : null;
            long V = k0 != null ? k0.V(i6, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = dq2.u(Float.intBitsToFloat((int) (V >> 32)));
            iArr[1] = dq2.u(Float.intBitsToFloat((int) (V & 4294967295L)));
        }
    }

    @Override // defpackage.ld0
    public final void d() {
        this.N.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.m93
    public final void e(int i, View view) {
        o93 o93Var = this.i0;
        if (i == 1) {
            o93Var.b = 0;
        } else {
            o93Var.a = 0;
        }
    }

    @Override // defpackage.m93
    public final void f(int i, int i2, int i3, int[] iArr) {
        if (this.J.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L) | (Float.floatToRawIntBits(i * (-1.0f)) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            h93 h93Var = this.I.a;
            h93 k0 = h93Var != null ? h93Var.k0() : null;
            long C = k0 != null ? k0.C(i4, floatToRawIntBits) : 0L;
            iArr[0] = dq2.u(Float.intBitsToFloat((int) (C >> 32)));
            iArr[1] = dq2.u(Float.intBitsToFloat((int) (C & 4294967295L)));
        }
    }

    @Override // defpackage.m93
    public final boolean g(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f0;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final iu0 getDensity() {
        return this.R;
    }

    public final View getInteropView() {
        return this.J;
    }

    public final wa2 getLayoutNode() {
        return this.k0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.J.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final vi2 getLifecycleOwner() {
        return this.T;
    }

    public final l13 getModifier() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o93 o93Var = this.i0;
        return o93Var.b | o93Var.a;
    }

    public final tm1 getOnDensityChanged$ui() {
        return this.S;
    }

    public final tm1 getOnModifierChanged$ui() {
        return this.Q;
    }

    public final tm1 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.e0;
    }

    public final rm1 getRelease() {
        return this.O;
    }

    public final rm1 getReset() {
        return this.N;
    }

    public final w94 getSavedStateRegistryOwner() {
        return this.U;
    }

    public final rm1 getUpdate() {
        return this.L;
    }

    public final View getView() {
        return this.J;
    }

    @Override // defpackage.m93
    public final void h(View view, View view2, int i, int i2) {
        o93 o93Var = this.i0;
        if (i2 == 1) {
            o93Var.b = i;
        } else {
            o93Var.a = i;
        }
    }

    @Override // defpackage.ld0
    public final void i() {
        View view = this.J;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.N.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.j0) {
            this.k0.E();
            return null;
        }
        this.J.postOnAnimation(new fa(this.d0, (byte) 2));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.J.isNestedScrollingEnabled();
    }

    @Override // defpackage.yd3
    public final yv5 j(View view, yv5 yv5Var) {
        this.a0 = new yv5(yv5Var);
        return m(yv5Var);
    }

    @Override // defpackage.rh3
    public final boolean l() {
        return isAttachedToWindow();
    }

    public final yv5 m(yv5 yv5Var) {
        vv5 vv5Var = yv5Var.a;
        o12 i = vv5Var.i(-1);
        o12 o12Var = o12.e;
        if (!i.equals(o12Var) || !vv5Var.j(-9).equals(o12Var) || vv5Var.h() != null) {
            x02 x02Var = this.k0.n0.c;
            if (x02Var.h()) {
                long U = sv2.U(x02Var.M(0L));
                int i2 = (int) (U >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (U & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long o = mu0.q(x02Var).o();
                int i4 = (int) (o >> 32);
                int i5 = (int) (o & 4294967295L);
                long j = x02Var.K;
                long U2 = sv2.U(x02Var.M((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i6 = i4 - ((int) (U2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & U2));
                int i8 = i7 >= 0 ? i7 : 0;
                if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                    return yv5Var.a.r(i2, i3, i6, i8);
                }
            }
        }
        return yv5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.j0) {
            this.k0.E();
        } else {
            this.J.postOnAnimation(new fa(this.d0, (byte) 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.J.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.J;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.g0 = i;
        this.h0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.J.isNestedScrollingEnabled()) {
            return false;
        }
        p70.g0(this.I.c(), null, null, new og(z, this, eg5.e(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.J.isNestedScrollingEnabled()) {
            return false;
        }
        p70.g0(this.I.c(), null, null, new pg(this, eg5.e(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        tm1 tm1Var = this.b0;
        if (tm1Var == null) {
            return true;
        }
        tm1Var.invoke(rect != null ? sp0.l0(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        tm1 tm1Var = this.e0;
        if (tm1Var != null) {
            tm1Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(iu0 iu0Var) {
        if (iu0Var != this.R) {
            this.R = iu0Var;
            tm1 tm1Var = this.S;
            if (tm1Var != null) {
                tm1Var.invoke(iu0Var);
            }
        }
    }

    public final void setLifecycleOwner(vi2 vi2Var) {
        if (vi2Var != this.T) {
            this.T = vi2Var;
            ViewTreeLifecycleOwner.set(this, vi2Var);
        }
    }

    public final void setModifier(l13 l13Var) {
        if (l13Var != this.P) {
            this.P = l13Var;
            tm1 tm1Var = this.Q;
            if (tm1Var != null) {
                tm1Var.invoke(l13Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(tm1 tm1Var) {
        this.S = tm1Var;
    }

    public final void setOnModifierChanged$ui(tm1 tm1Var) {
        this.Q = tm1Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(tm1 tm1Var) {
        this.e0 = tm1Var;
    }

    public final void setRelease(rm1 rm1Var) {
        this.O = rm1Var;
    }

    public final void setReset(rm1 rm1Var) {
        this.N = rm1Var;
    }

    public final void setSavedStateRegistryOwner(w94 w94Var) {
        if (w94Var != this.U) {
            this.U = w94Var;
            ViewTreeSavedStateRegistryOwner.set(this, w94Var);
        }
    }

    public final void setUpdate(rm1 rm1Var) {
        this.L = rm1Var;
        this.M = true;
        this.c0.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
