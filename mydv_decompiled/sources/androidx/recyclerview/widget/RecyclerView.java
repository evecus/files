package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.media3.common.util.Log;
import defpackage.a24;
import defpackage.a5;
import defpackage.b24;
import defpackage.b8;
import defpackage.bs0;
import defpackage.bs2;
import defpackage.c24;
import defpackage.c8;
import defpackage.d24;
import defpackage.da;
import defpackage.dr5;
import defpackage.e21;
import defpackage.e24;
import defpackage.e60;
import defpackage.ed;
import defpackage.eg5;
import defpackage.er5;
import defpackage.f24;
import defpackage.f95;
import defpackage.g24;
import defpackage.h24;
import defpackage.hn3;
import defpackage.hr5;
import defpackage.i24;
import defpackage.j0;
import defpackage.j24;
import defpackage.k24;
import defpackage.kr5;
import defpackage.l93;
import defpackage.m24;
import defpackage.md1;
import defpackage.mo1;
import defpackage.mu0;
import defpackage.oo4;
import defpackage.p14;
import defpackage.pn;
import defpackage.pz3;
import defpackage.q14;
import defpackage.r14;
import defpackage.rs;
import defpackage.s83;
import defpackage.v14;
import defpackage.w14;
import defpackage.xq5;
import defpackage.z14;
import defpackage.zy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] g1 = {R.attr.nestedScrollingEnabled};
    public static final float h1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean i1 = true;
    public static final boolean j1 = true;
    public static final boolean k1 = true;
    public static final Class[] l1;
    public static final q14 m1;
    public static final i24 n1;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final int F0;
    public final int G0;
    public final float H0;
    public final float I;
    public final float I0;
    public final f24 J;
    public boolean J0;
    public final f K;
    public final k24 K0;
    public g24 L;
    public a L0;
    public final c8 M;
    public final mo1 M0;
    public final pn N;
    public final h24 N0;
    public final da O;
    public b24 O0;
    public boolean P;
    public ArrayList P0;
    public final p14 Q;
    public boolean Q0;
    public final Rect R;
    public boolean R0;
    public final Rect S;
    public final r14 S0;
    public final RectF T;
    public boolean T0;
    public c U;
    public m24 U0;
    public e V;
    public final int[] V0;
    public final ArrayList W;
    public l93 W0;
    public final int[] X0;
    public final int[] Y0;
    public final int[] Z0;
    public final ArrayList a0;
    public final ArrayList a1;
    public final ArrayList b0;
    public final p14 b1;
    public md1 c0;
    public boolean c1;
    public boolean d0;
    public int d1;
    public boolean e0;
    public int e1;
    public boolean f0;
    public final r14 f1;
    public int g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public final AccessibilityManager m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public w14 r0;
    public EdgeEffect s0;
    public EdgeEffect t0;
    public EdgeEffect u0;
    public EdgeEffect v0;
    public d w0;
    public int x0;
    public int y0;
    public VelocityTracker z0;

    static {
        Class cls = Integer.TYPE;
        l1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        m1 = new q14();
        n1 = new i24();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.github.mytv.dv.R.attr.recyclerViewStyle);
        float a;
        char c;
        int i;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        Object[] objArr;
        this.J = new f24(this);
        this.K = new f(this);
        this.O = new da((byte) 14);
        this.Q = new p14(this, (byte) 0);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new RectF();
        this.W = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = 0;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = n1;
        bs0 bs0Var = new bs0();
        bs0Var.a = null;
        bs0Var.b = new ArrayList();
        bs0Var.c = (byte) 120;
        bs0Var.d = (byte) 120;
        bs0Var.e = (short) 250;
        bs0Var.f = (short) 250;
        byte b = 1;
        bs0Var.g = true;
        bs0Var.h = new ArrayList();
        bs0Var.i = new ArrayList();
        bs0Var.j = new ArrayList();
        bs0Var.k = new ArrayList();
        bs0Var.l = new ArrayList();
        bs0Var.m = new ArrayList();
        bs0Var.n = new ArrayList();
        bs0Var.o = new ArrayList();
        bs0Var.p = new ArrayList();
        bs0Var.q = new ArrayList();
        bs0Var.r = new ArrayList();
        this.w0 = bs0Var;
        this.x0 = 0;
        this.y0 = -1;
        this.H0 = Float.MIN_VALUE;
        this.I0 = Float.MIN_VALUE;
        this.J0 = true;
        this.K0 = new k24(this);
        this.M0 = k1 ? new mo1() : null;
        h24 h24Var = new h24();
        h24Var.a = 0;
        h24Var.b = 0;
        h24Var.c = (byte) 1;
        h24Var.d = 0;
        h24Var.e = false;
        h24Var.f = false;
        h24Var.g = false;
        h24Var.h = false;
        h24Var.i = false;
        h24Var.j = false;
        this.N0 = h24Var;
        this.Q0 = false;
        this.R0 = false;
        r14 r14Var = new r14(this);
        this.S0 = r14Var;
        this.T0 = false;
        this.V0 = new int[2];
        this.X0 = new int[2];
        this.Y0 = new int[2];
        this.Z0 = new int[2];
        this.a1 = new ArrayList();
        this.b1 = new p14(this, b);
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = new r14(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.E0 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = hr5.a;
            a = ed.d(viewConfiguration);
        } else {
            a = hr5.a(viewConfiguration, context);
        }
        this.H0 = a;
        this.I0 = i3 >= 26 ? ed.e(viewConfiguration) : hr5.a(viewConfiguration, context);
        this.F0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.G0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.I = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.w0.a = r14Var;
        this.M = new c8(new b(this));
        this.N = new pn(new r14(this));
        WeakHashMap weakHashMap = dr5.a;
        if ((i3 >= 26 ? xq5.a(this) : 0) == 0 && i3 >= 26) {
            xq5.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.m0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new m24(this));
        int[] iArr = pz3.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.github.mytv.dv.R.attr.recyclerViewStyle, 0);
        dr5.g(this, context, iArr, attributeSet, obtainStyledAttributes, com.github.mytv.dv.R.attr.recyclerViewStyle);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.P = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                s83.t("Trying to set fast scroller without both required drawables.".concat(w()));
                throw null;
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.github.mytv.dv.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.github.mytv.dv.R.dimen.fastscroll_minimum_range);
            c2 = 2;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.github.mytv.dv.R.dimen.fastscroll_margin);
            typedArray = obtainStyledAttributes;
            c = 3;
            i = com.github.mytv.dv.R.attr.recyclerViewStyle;
            z = 1;
            i2 = 4;
            new md1(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            c = 3;
            i = com.github.mytv.dv.R.attr.recyclerViewStyle;
            z = 1;
            c2 = 2;
            typedArray = obtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(e.class);
                    try {
                        constructor = asSubclass.getConstructor(l1);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((e) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    s83.i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    s83.i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    s83.i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    s83.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    s83.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = g1;
        int i4 = i;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        dr5.g(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.github.mytv.dv.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView B = B(viewGroup.getChildAt(i));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public static g G(View view) {
        if (view == null) {
            return null;
        }
        return ((z14) view.getLayoutParams()).a;
    }

    public static void H(Rect rect, View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect2 = z14Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) z14Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) z14Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) z14Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) z14Var).bottomMargin);
    }

    public static void g(g gVar) {
        WeakReference<RecyclerView> weakReference = gVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == gVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            gVar.mNestedRecyclerView = null;
        }
    }

    private l93 getScrollingChildHelper() {
        l93 l93Var = this.W0;
        if (l93Var != null) {
            return l93Var;
        }
        l93 l93Var2 = new l93(this);
        this.W0 = l93Var2;
        return l93Var2;
    }

    public static int j(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && e21.q(edgeEffect) != 0.0f) {
            int round = Math.round(e21.K(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || e21.q(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(e21.K(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public final void A(int[] iArr) {
        pn pnVar = this.N;
        int s = pnVar.s();
        if (s == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Log.LOG_LEVEL_OFF;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            g G = G(pnVar.r(i3));
            if (!G.shouldIgnore()) {
                int layoutPosition = G.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final g C(int i) {
        g gVar = null;
        if (this.n0) {
            return null;
        }
        pn pnVar = this.N;
        int K = pnVar.K();
        for (int i2 = 0; i2 < K; i2++) {
            g G = G(pnVar.J(i2));
            if (G != null && !G.isRemoved() && D(G) == i) {
                if (!((ArrayList) pnVar.d).contains(G.itemView)) {
                    return G;
                }
                gVar = G;
            }
        }
        return gVar;
    }

    public final int D(g gVar) {
        if (gVar.hasAnyOfTheFlags(524) || !gVar.isBound()) {
            return -1;
        }
        int i = gVar.mPosition;
        ArrayList arrayList = (ArrayList) this.M.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b8 b8Var = (b8) arrayList.get(i2);
            byte b = b8Var.a;
            if (b != 1) {
                if (b == 2) {
                    int i3 = b8Var.b;
                    if (i3 <= i) {
                        int i4 = b8Var.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (b == 8) {
                    int i5 = b8Var.b;
                    if (i5 == i) {
                        i = b8Var.d;
                    } else {
                        if (i5 < i) {
                            i--;
                        }
                        if (b8Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (b8Var.b <= i) {
                i += b8Var.d;
            }
        }
        return i;
    }

    public final long E(g gVar) {
        return this.U.hasStableIds() ? gVar.getItemId() : gVar.mPosition;
    }

    public final g F(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return G(view);
        }
        j0.k("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect I(View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        boolean z = z14Var.c;
        Rect rect = z14Var.b;
        if (!z || (this.N0.f && (z14Var.b() || z14Var.d()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.R;
            rect2.set(0, 0, 0, 0);
            ((md1) arrayList.get(i)).getClass();
            md1.a(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        z14Var.c = false;
        return rect;
    }

    public final boolean J() {
        return !this.f0 || this.n0 || this.M.x();
    }

    public final boolean K() {
        return this.p0 > 0;
    }

    public final void L() {
        pn pnVar = this.N;
        int K = pnVar.K();
        for (int i = 0; i < K; i++) {
            ((z14) pnVar.J(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.K.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z14 z14Var = (z14) ((g) arrayList.get(i2)).itemView.getLayoutParams();
            if (z14Var != null) {
                z14Var.c = true;
            }
        }
    }

    public final void M(int i, int i2, boolean z) {
        int i3 = i + i2;
        pn pnVar = this.N;
        int K = pnVar.K();
        for (int i4 = 0; i4 < K; i4++) {
            g G = G(pnVar.J(i4));
            if (G != null && !G.shouldIgnore()) {
                int i5 = G.mPosition;
                h24 h24Var = this.N0;
                if (i5 >= i3) {
                    G.offsetPosition(-i2, z);
                    h24Var.e = true;
                } else if (i5 >= i) {
                    G.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    h24Var.e = true;
                }
            }
        }
        f fVar = this.K;
        ArrayList arrayList = fVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            if (gVar != null) {
                int i6 = gVar.mPosition;
                if (i6 >= i3) {
                    gVar.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    gVar.addFlags(8);
                    fVar.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void N() {
        this.p0++;
    }

    public final void O(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.p0 - 1;
        this.p0 = i2;
        if (i2 < 1) {
            this.p0 = 0;
            if (z) {
                int i3 = this.k0;
                this.k0 = 0;
                if (i3 != 0 && (accessibilityManager = this.m0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    a5.V(obtain, i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.a1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g gVar = (g) arrayList.get(size);
                    if (gVar.itemView.getParent() == this && !gVar.shouldIgnore() && (i = gVar.mPendingAccessibilityState) != -1) {
                        View view = gVar.itemView;
                        WeakHashMap weakHashMap = dr5.a;
                        view.setImportantForAccessibility(i);
                        gVar.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.y0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.C0 = x;
            this.A0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.D0 = y;
            this.B0 = y;
        }
    }

    public final void Q() {
        if (this.T0 || !this.d0) {
            return;
        }
        WeakHashMap weakHashMap = dr5.a;
        postOnAnimation(this.b1);
        this.T0 = true;
    }

    public final void R() {
        boolean z;
        boolean z2 = this.n0;
        c8 c8Var = this.M;
        boolean z3 = false;
        if (z2) {
            c8Var.J((ArrayList) c8Var.d);
            c8Var.J((ArrayList) c8Var.e);
            c8Var.b = 0;
            if (this.o0) {
                this.V.S();
            }
        }
        if (this.w0 != null && this.V.r0()) {
            c8Var.H();
        } else {
            c8Var.o();
        }
        boolean z4 = this.Q0 || this.R0;
        boolean z5 = this.f0 && this.w0 != null && ((z = this.n0) || z4 || this.V.e) && (!z || this.U.hasStableIds());
        h24 h24Var = this.N0;
        h24Var.i = z5;
        if (z5 && z4 && !this.n0 && this.w0 != null && this.V.r0()) {
            z3 = true;
        }
        h24Var.j = z3;
    }

    public final void S(boolean z) {
        this.o0 = z | this.o0;
        this.n0 = true;
        pn pnVar = this.N;
        int K = pnVar.K();
        for (int i = 0; i < K; i++) {
            g G = G(pnVar.J(i));
            if (G != null && !G.shouldIgnore()) {
                G.addFlags(6);
            }
        }
        L();
        f fVar = this.K;
        ArrayList arrayList = fVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = (g) arrayList.get(i2);
            if (gVar != null) {
                gVar.addFlags(6);
                gVar.addChangePayload(null);
            }
        }
        c cVar = fVar.h.U;
        if (cVar == null || !cVar.hasStableIds()) {
            fVar.f();
        }
    }

    public final void T(g gVar, rs rsVar) {
        gVar.setFlags(0, 8192);
        boolean z = this.N0.g;
        da daVar = this.O;
        if (z && gVar.isUpdated() && !gVar.isRemoved() && !gVar.shouldIgnore()) {
            ((bs2) daVar.K).g(E(gVar), gVar);
        }
        oo4 oo4Var = (oo4) daVar.J;
        kr5 kr5Var = (kr5) oo4Var.get(gVar);
        if (kr5Var == null) {
            kr5Var = kr5.b();
            oo4Var.put(gVar, kr5Var);
        }
        kr5Var.b = rsVar;
        kr5Var.a |= 4;
    }

    public final int U(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.s0;
        float f2 = 0.0f;
        if (edgeEffect == null || e21.q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.u0;
            if (edgeEffect2 != null && e21.q(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.u0;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float K = e21.K(edgeEffect3, width, height);
                    if (e21.q(this.u0) == 0.0f) {
                        this.u0.onRelease();
                    }
                    f2 = K;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.s0;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -e21.K(edgeEffect4, -width, 1.0f - height);
                if (e21.q(this.s0) == 0.0f) {
                    this.s0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int V(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.t0;
        float f2 = 0.0f;
        if (edgeEffect == null || e21.q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.v0;
            if (edgeEffect2 != null && e21.q(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.v0;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float K = e21.K(edgeEffect3, height, 1.0f - width);
                    if (e21.q(this.v0) == 0.0f) {
                        this.v0.onRelease();
                    }
                    f2 = K;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.t0;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -e21.K(edgeEffect4, -height, width);
                if (e21.q(this.t0) == 0.0f) {
                    this.t0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.R;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof z14) {
            z14 z14Var = (z14) layoutParams;
            if (!z14Var.c) {
                Rect rect2 = z14Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.V.f0(this, view, this.R, !this.f0, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.z0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        e0(0);
        EdgeEffect edgeEffect = this.s0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.s0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.t0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.t0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.u0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.u0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.v0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.v0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = dr5.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(int r17, int r18, android.view.MotionEvent r19, int r20) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i, int i2, int[] iArr) {
        g gVar;
        c0();
        N();
        int i3 = f95.a;
        Trace.beginSection("RV Scroll");
        h24 h24Var = this.N0;
        x(h24Var);
        f fVar = this.K;
        int h0 = i != 0 ? this.V.h0(i, h24Var, fVar) : 0;
        int i0 = i2 != 0 ? this.V.i0(i2, h24Var, fVar) : 0;
        Trace.endSection();
        pn pnVar = this.N;
        int s = pnVar.s();
        for (int i4 = 0; i4 < s; i4++) {
            View r = pnVar.r(i4);
            g F = F(r);
            if (F != null && (gVar = F.mShadowingHolder) != null) {
                View view = gVar.itemView;
                int left = r.getLeft();
                int top = r.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        O(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = h0;
            iArr[1] = i0;
        }
    }

    public final boolean a0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float q = e21.q(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.I * 0.015f;
        double log = Math.log(abs / f);
        double d = h1;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        e eVar = this.V;
        if (eVar != null) {
            eVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i, int i2, boolean z) {
        e eVar = this.V;
        if (eVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.i0) {
            return;
        }
        int i3 = !eVar.c() ? 0 : i;
        int i4 = !this.V.d() ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().f(i5, 1);
        }
        k24 k24Var = this.K0;
        RecyclerView recyclerView = k24Var.O;
        int abs = Math.abs(i3);
        int abs2 = Math.abs(i4);
        boolean z2 = abs > abs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            abs = abs2;
        }
        int min = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = k24Var.L;
        q14 q14Var = m1;
        if (interpolator != q14Var) {
            k24Var.L = q14Var;
            k24Var.K = new OverScroller(recyclerView.getContext(), q14Var);
        }
        k24Var.J = 0;
        k24Var.I = 0;
        recyclerView.setScrollState(2);
        k24Var.K.startScroll(0, 0, i3, i4, min);
        if (k24Var.M) {
            k24Var.N = true;
            return;
        }
        RecyclerView recyclerView2 = k24Var.O;
        recyclerView2.removeCallbacks(k24Var);
        WeakHashMap weakHashMap = dr5.a;
        recyclerView2.postOnAnimation(k24Var);
    }

    public final void c0() {
        int i = this.g0 + 1;
        this.g0 = i;
        if (i != 1 || this.i0) {
            return;
        }
        this.h0 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof z14) && this.V.e((z14) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        e eVar = this.V;
        if (eVar != null && eVar.c()) {
            return this.V.i(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        e eVar = this.V;
        if (eVar != null && eVar.c()) {
            return this.V.j(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        e eVar = this.V;
        if (eVar != null && eVar.c()) {
            return this.V.k(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        e eVar = this.V;
        if (eVar != null && eVar.d()) {
            return this.V.l(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        e eVar = this.V;
        if (eVar != null && eVar.d()) {
            return this.V.m(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        e eVar = this.V;
        if (eVar != null && eVar.d()) {
            return this.V.n(this.N0);
        }
        return 0;
    }

    public final void d0(boolean z) {
        int i = this.g0;
        if (i < 1) {
            this.g0 = 1;
            i = 1;
        }
        if (!z && !this.i0) {
            this.h0 = false;
        }
        if (i == 1) {
            if (z && this.h0 && !this.i0 && this.V != null && this.U != null) {
                m();
            }
            if (!this.i0) {
                this.h0 = false;
            }
        }
        this.g0--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent d;
        l93 scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.d || (d = scrollingChildHelper.d(0)) == null) {
            return false;
        }
        return eg5.D(d, scrollingChildHelper.c, f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().a(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().c(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((md1) arrayList.get(i)).d(canvas);
        }
        EdgeEffect edgeEffect = this.s0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.P ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.s0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.t0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.P) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.t0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.u0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.P ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.u0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.v0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.P) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.v0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.w0 == null || arrayList.size() <= 0 || !this.w0.f()) ? z : true) {
            WeakHashMap weakHashMap = dr5.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(g gVar) {
        View view = gVar.itemView;
        boolean z = view.getParent() == this;
        this.K.l(F(view));
        boolean isTmpDetached = gVar.isTmpDetached();
        pn pnVar = this.N;
        if (isTmpDetached) {
            pnVar.l(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            pnVar.k(view, -1, true);
            return;
        }
        int indexOfChild = ((r14) pnVar.b).a.indexOfChild(view);
        if (indexOfChild < 0) {
            hn3.i(view, "view is not a child, cannot hide ");
        } else {
            ((e60) pnVar.c).i(indexOfChild);
            pnVar.L(view);
        }
    }

    public final void e0(int i) {
        l93 scrollingChildHelper = getScrollingChildHelper();
        ViewParent d = scrollingChildHelper.d(i);
        if (d != null) {
            eg5.J(d, scrollingChildHelper.c, i);
            if (i == 0) {
                scrollingChildHelper.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                scrollingChildHelper.b = null;
            }
        }
    }

    public final void f(String str) {
        if (!K()) {
            if (this.q0 > 0) {
                android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(w()));
            }
        } else if (str == null) {
            zy.i("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(w()));
        } else {
            zy.i(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0199, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0165, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0183, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0186, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0189, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0191, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = this.V;
        if (eVar != null) {
            return eVar.q();
        }
        zy.i("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        e eVar = this.V;
        if (eVar != null) {
            return eVar.r(getContext(), attributeSet);
        }
        zy.i("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public c getAdapter() {
        return this.U;
    }

    @Override // android.view.View
    public int getBaseline() {
        e eVar = this.V;
        if (eVar == null) {
            return super.getBaseline();
        }
        eVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.P;
    }

    public m24 getCompatAccessibilityDelegate() {
        return this.U0;
    }

    public w14 getEdgeEffectFactory() {
        return this.r0;
    }

    public d getItemAnimator() {
        return this.w0;
    }

    public int getItemDecorationCount() {
        return this.a0.size();
    }

    public e getLayoutManager() {
        return this.V;
    }

    public int getMaxFlingVelocity() {
        return this.G0;
    }

    public int getMinFlingVelocity() {
        return this.F0;
    }

    public long getNanoTime() {
        if (k1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public a24 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.J0;
    }

    public d24 getRecycledViewPool() {
        return this.K.c();
    }

    public int getScrollState() {
        return this.x0;
    }

    public final void h() {
        pn pnVar = this.N;
        int K = pnVar.K();
        for (int i = 0; i < K; i++) {
            g G = G(pnVar.J(i));
            if (!G.shouldIgnore()) {
                G.clearOldPosition();
            }
        }
        f fVar = this.K;
        ArrayList arrayList = fVar.a;
        ArrayList arrayList2 = fVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((g) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((g) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = fVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((g) fVar.b.get(i4)).clearOldPosition();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().e(0);
    }

    public final void i(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.s0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.s0.onRelease();
            z = this.s0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.u0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.u0.onRelease();
            z |= this.u0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.t0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.t0.onRelease();
            z |= this.t0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.v0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.v0.onRelease();
            z |= this.v0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = dr5.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.d0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.i0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        if (!this.f0 || this.n0) {
            int i = f95.a;
            Trace.beginSection("RV FullInvalidate");
            m();
            Trace.endSection();
            return;
        }
        c8 c8Var = this.M;
        if (c8Var.x()) {
            int i2 = c8Var.b;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c8Var.x()) {
                    int i3 = f95.a;
                    Trace.beginSection("RV FullInvalidate");
                    m();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = f95.a;
            Trace.beginSection("RV PartialInvalidate");
            c0();
            N();
            c8Var.H();
            if (!this.h0) {
                pn pnVar = this.N;
                int s = pnVar.s();
                int i5 = 0;
                while (true) {
                    if (i5 < s) {
                        g G = G(pnVar.r(i5));
                        if (G != null && !G.shouldIgnore() && G.isUpdated()) {
                            m();
                            break;
                        }
                        i5++;
                    } else {
                        c8Var.k();
                        break;
                    }
                }
            }
            d0(true);
            O(true);
            Trace.endSection();
        }
    }

    public final void l(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = dr5.a;
        setMeasuredDimension(e.f(i, paddingRight, getMinimumWidth()), e.f(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x034a, code lost:
    
        if (((java.util.ArrayList) r7.d).contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03bd  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m():void");
    }

    public final void n() {
        kr5 kr5Var;
        View y;
        h24 h24Var = this.N0;
        h24Var.a(1);
        x(h24Var);
        h24Var.h = false;
        c0();
        da daVar = this.O;
        oo4 oo4Var = (oo4) daVar.J;
        oo4 oo4Var2 = (oo4) daVar.J;
        oo4Var.clear();
        bs2 bs2Var = (bs2) daVar.K;
        bs2Var.b();
        N();
        R();
        g gVar = null;
        View focusedChild = (this.J0 && hasFocus() && this.U != null) ? getFocusedChild() : null;
        if (focusedChild != null && (y = y(focusedChild)) != null) {
            gVar = F(y);
        }
        if (gVar == null) {
            h24Var.l = -1L;
            h24Var.k = -1;
            h24Var.m = -1;
        } else {
            h24Var.l = this.U.hasStableIds() ? gVar.getItemId() : -1L;
            h24Var.k = this.n0 ? -1 : gVar.isRemoved() ? gVar.mOldPosition : gVar.getAbsoluteAdapterPosition();
            View view = gVar.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            h24Var.m = id;
        }
        h24Var.g = h24Var.i && this.R0;
        this.R0 = false;
        this.Q0 = false;
        h24Var.f = h24Var.j;
        h24Var.d = this.U.getItemCount();
        A(this.V0);
        boolean z = h24Var.i;
        pn pnVar = this.N;
        if (z) {
            int s = pnVar.s();
            for (int i = 0; i < s; i++) {
                g G = G(pnVar.r(i));
                if (!G.shouldIgnore() && (!G.isInvalid() || this.U.hasStableIds())) {
                    d dVar = this.w0;
                    d.b(G);
                    G.getUnmodifiedPayloads();
                    dVar.getClass();
                    rs rsVar = new rs((byte) 1);
                    rsVar.a(G);
                    kr5 kr5Var2 = (kr5) oo4Var2.get(G);
                    if (kr5Var2 == null) {
                        kr5Var2 = kr5.b();
                        oo4Var2.put(G, kr5Var2);
                    }
                    kr5Var2.b = rsVar;
                    kr5Var2.a |= 4;
                    if (h24Var.g && G.isUpdated() && !G.isRemoved() && !G.shouldIgnore() && !G.isInvalid()) {
                        bs2Var.g(E(G), G);
                    }
                }
            }
        }
        if (h24Var.j) {
            int K = pnVar.K();
            for (int i2 = 0; i2 < K; i2++) {
                g G2 = G(pnVar.J(i2));
                if (!G2.shouldIgnore()) {
                    G2.saveOldPosition();
                }
            }
            boolean z2 = h24Var.e;
            h24Var.e = false;
            this.V.W(this.K, h24Var);
            h24Var.e = z2;
            for (int i3 = 0; i3 < pnVar.s(); i3++) {
                g G3 = G(pnVar.r(i3));
                if (!G3.shouldIgnore() && ((kr5Var = (kr5) oo4Var2.get(G3)) == null || (kr5Var.a & 4) == 0)) {
                    d.b(G3);
                    boolean hasAnyOfTheFlags = G3.hasAnyOfTheFlags(8192);
                    d dVar2 = this.w0;
                    G3.getUnmodifiedPayloads();
                    dVar2.getClass();
                    rs rsVar2 = new rs((byte) 1);
                    rsVar2.a(G3);
                    if (hasAnyOfTheFlags) {
                        T(G3, rsVar2);
                    } else {
                        kr5 kr5Var3 = (kr5) oo4Var2.get(G3);
                        if (kr5Var3 == null) {
                            kr5Var3 = kr5.b();
                            oo4Var2.put(G3, kr5Var3);
                        }
                        kr5Var3.a |= 2;
                        kr5Var3.b = rsVar2;
                    }
                }
            }
            h();
        } else {
            h();
        }
        O(true);
        d0(false);
        h24Var.c = (byte) 2;
    }

    public final void o() {
        c0();
        N();
        h24 h24Var = this.N0;
        h24Var.a(6);
        this.M.o();
        h24Var.d = this.U.getItemCount();
        h24Var.b = 0;
        if (this.L != null && this.U.canRestoreState()) {
            Parcelable parcelable = this.L.K;
            if (parcelable != null) {
                this.V.Y(parcelable);
            }
            this.L = null;
        }
        h24Var.f = false;
        this.V.W(this.K, h24Var);
        h24Var.e = false;
        h24Var.i = h24Var.i && this.w0 != null;
        h24Var.c = (byte) 4;
        O(true);
        d0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.p0 = r0
            r1 = 1
            r5.d0 = r1
            boolean r2 = r5.f0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f0 = r2
            androidx.recyclerview.widget.f r2 = r5.K
            r2.d()
            androidx.recyclerview.widget.e r2 = r5.V
            if (r2 == 0) goto L23
            r2.f = r1
        L23:
            r5.T0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.k1
            if (r0 == 0) goto L68
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.a.M
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.a r1 = (androidx.recyclerview.widget.a) r1
            r5.L0 = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.a r1 = new androidx.recyclerview.widget.a
            r1.<init>()
            r5.L0 = r1
            java.util.WeakHashMap r1 = defpackage.dr5.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.a r2 = r5.L0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.K = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.a r0 = r5.L0
            r0.a(r5)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar;
        super.onDetachedFromWindow();
        d dVar = this.w0;
        if (dVar != null) {
            dVar.e();
        }
        int i = 0;
        setScrollState(0);
        k24 k24Var = this.K0;
        k24Var.O.removeCallbacks(k24Var);
        k24Var.K.abortAnimation();
        this.d0 = false;
        e eVar = this.V;
        if (eVar != null) {
            eVar.f = false;
            eVar.L(this);
        }
        this.a1.clear();
        removeCallbacks(this.b1);
        this.O.getClass();
        kr5.a();
        f fVar = this.K;
        ArrayList arrayList = fVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mu0.j(((g) arrayList.get(i2)).itemView);
        }
        fVar.e(fVar.h.U, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = mu0.C(childAt).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((er5) arrayList2.get(size)).a.e();
                }
            }
            i = i3;
        }
        if (!k1 || (aVar = this.L0) == null) {
            return;
        }
        aVar.e(this);
        this.L0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((md1) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.i0) {
            this.c0 = null;
            if (z(motionEvent)) {
                X();
                setScrollState(0);
                return true;
            }
            e eVar = this.V;
            if (eVar != null) {
                boolean c = eVar.c();
                boolean d = this.V.d();
                VelocityTracker velocityTracker = this.z0;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.z0 = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.j0) {
                        this.j0 = false;
                    }
                    this.y0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.C0 = x;
                    this.A0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.D0 = y;
                    this.B0 = y;
                    EdgeEffect edgeEffect = this.s0;
                    if (edgeEffect == null || e21.q(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        e21.K(this.s0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.u0;
                    boolean z3 = z;
                    if (edgeEffect2 != null) {
                        z3 = z;
                        if (e21.q(edgeEffect2) != 0.0f) {
                            z3 = z;
                            if (!canScrollHorizontally(1)) {
                                e21.K(this.u0, 0.0f, motionEvent.getY() / getHeight());
                                z3 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.t0;
                    boolean z4 = z3;
                    if (edgeEffect3 != null) {
                        z4 = z3;
                        if (e21.q(edgeEffect3) != 0.0f) {
                            z4 = z3;
                            if (!canScrollVertically(-1)) {
                                e21.K(this.t0, 0.0f, motionEvent.getX() / getWidth());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.v0;
                    boolean z5 = z4;
                    if (edgeEffect4 != null) {
                        z5 = z4;
                        if (e21.q(edgeEffect4) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(1)) {
                                e21.K(this.v0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z5 = true;
                            }
                        }
                    }
                    if (z5 || this.x0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        e0(1);
                    }
                    int[] iArr = this.Y0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = c;
                    if (d) {
                        i = (c ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().f(i, 0);
                } else if (actionMasked == 1) {
                    this.z0.clear();
                    e0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.y0);
                    if (findPointerIndex < 0) {
                        android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.y0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.x0 != 1) {
                        int i2 = x2 - this.A0;
                        int i3 = y2 - this.B0;
                        if (c == 0 || Math.abs(i2) <= this.E0) {
                            z2 = false;
                        } else {
                            this.C0 = x2;
                            z2 = true;
                        }
                        if (d && Math.abs(i3) > this.E0) {
                            this.D0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    X();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.y0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.C0 = x3;
                    this.A0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.D0 = y3;
                    this.B0 = y3;
                } else if (actionMasked == 6) {
                    P(motionEvent);
                }
                if (this.x0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = f95.a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.f0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e eVar = this.V;
        if (eVar == null) {
            l(i, i2);
            return;
        }
        boolean F = eVar.F();
        boolean z = false;
        h24 h24Var = this.N0;
        if (F) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.V.b.l(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.c1 = z;
            if (z || this.U == null) {
                return;
            }
            if (h24Var.c == 1) {
                n();
            }
            this.V.k0(i, i2);
            h24Var.h = true;
            o();
            this.V.m0(i, i2);
            if (this.V.p0()) {
                this.V.k0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                h24Var.h = true;
                o();
                this.V.m0(i, i2);
            }
            this.d1 = getMeasuredWidth();
            this.e1 = getMeasuredHeight();
            return;
        }
        if (this.e0) {
            this.V.b.l(i, i2);
            return;
        }
        if (this.l0) {
            c0();
            N();
            R();
            O(true);
            if (h24Var.j) {
                h24Var.f = true;
            } else {
                this.M.o();
                h24Var.f = false;
            }
            this.l0 = false;
            d0(false);
        } else if (h24Var.j) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        c cVar = this.U;
        if (cVar != null) {
            h24Var.d = cVar.getItemCount();
        } else {
            h24Var.d = 0;
        }
        c0();
        this.V.b.l(i, i2);
        d0(false);
        h24Var.f = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g24)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g24 g24Var = (g24) parcelable;
        this.L = g24Var;
        super.onRestoreInstanceState(g24Var.a());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g24 g24Var = new g24(super.onSaveInstanceState());
        g24 g24Var2 = this.L;
        if (g24Var2 != null) {
            g24Var.b(g24Var2);
            return g24Var;
        }
        e eVar = this.V;
        if (eVar != null) {
            g24Var.K = eVar.Z();
            return g24Var;
        }
        g24Var.K = null;
        return g24Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.v0 = null;
        this.t0 = null;
        this.u0 = null;
        this.s0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02aa, code lost:
    
        if (r4 == 0) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i2, i3, iArr, iArr2);
    }

    public final void q(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().c(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void r(int i, int i2) {
        this.q0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        b24 b24Var = this.O0;
        if (b24Var != null) {
            b24Var.a(this);
        }
        ArrayList arrayList = this.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b24) this.P0.get(size)).a(this);
            }
        }
        this.q0--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        g G = G(view);
        if (G != null) {
            if (G.isTmpDetached()) {
                G.clearTmpDetachFlag();
            } else if (!G.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(G);
                zy.j(sb, w());
                return;
            }
        }
        view.clearAnimation();
        g G2 = G(view);
        c cVar = this.U;
        if (cVar != null && G2 != null) {
            cVar.onViewDetachedFromWindow(G2);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.V.getClass();
        if (!K() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.V.f0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.b0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((md1) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0 != 0 || this.i0) {
            this.h0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.v0 != null) {
            return;
        }
        ((i24) this.r0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.v0 = edgeEffect;
        if (this.P) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        e eVar = this.V;
        if (eVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.i0) {
            return;
        }
        boolean c = eVar.c();
        boolean d = this.V.d();
        if (c || d) {
            if (!c) {
                i = 0;
            }
            if (!d) {
                i2 = 0;
            }
            Y(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!K()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int I = accessibilityEvent != null ? a5.I(accessibilityEvent) : 0;
            this.k0 |= I != 0 ? I : 0;
        }
    }

    public void setAccessibilityDelegateCompat(m24 m24Var) {
        this.U0 = m24Var;
        dr5.h(this, m24Var);
    }

    public void setAdapter(c cVar) {
        setLayoutFrozen(false);
        c cVar2 = this.U;
        f24 f24Var = this.J;
        if (cVar2 != null) {
            cVar2.unregisterAdapterDataObserver(f24Var);
            this.U.onDetachedFromRecyclerView(this);
        }
        d dVar = this.w0;
        if (dVar != null) {
            dVar.e();
        }
        e eVar = this.V;
        f fVar = this.K;
        if (eVar != null) {
            eVar.b0(fVar);
            this.V.c0(fVar);
        }
        fVar.a.clear();
        fVar.f();
        c8 c8Var = this.M;
        c8Var.J((ArrayList) c8Var.d);
        c8Var.J((ArrayList) c8Var.e);
        c8Var.b = 0;
        c cVar3 = this.U;
        this.U = cVar;
        if (cVar != null) {
            cVar.registerAdapterDataObserver(f24Var);
            cVar.onAttachedToRecyclerView(this);
        }
        e eVar2 = this.V;
        if (eVar2 != null) {
            eVar2.K();
        }
        c cVar4 = this.U;
        fVar.a.clear();
        fVar.f();
        fVar.e(cVar3, true);
        d24 c = fVar.c();
        if (cVar3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                c24 c24Var = (c24) sparseArray.valueAt(i);
                ArrayList arrayList = c24Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mu0.j(((g) obj).itemView);
                }
                c24Var.a.clear();
            }
        }
        if (cVar4 != null) {
            c.b++;
        }
        fVar.d();
        this.N0.e = true;
        S(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(v14 v14Var) {
        if (v14Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.P) {
            this.v0 = null;
            this.t0 = null;
            this.u0 = null;
            this.s0 = null;
        }
        this.P = z;
        super.setClipToPadding(z);
        if (this.f0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(w14 w14Var) {
        w14Var.getClass();
        this.r0 = w14Var;
        this.v0 = null;
        this.t0 = null;
        this.u0 = null;
        this.s0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.e0 = z;
    }

    public void setItemAnimator(d dVar) {
        d dVar2 = this.w0;
        if (dVar2 != null) {
            dVar2.e();
            this.w0.a = null;
        }
        this.w0 = dVar;
        if (dVar != null) {
            dVar.a = this.S0;
        }
    }

    public void setItemViewCacheSize(int i) {
        f fVar = this.K;
        fVar.e = i;
        fVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(e eVar) {
        RecyclerView recyclerView;
        if (eVar == this.V) {
            return;
        }
        setScrollState(0);
        k24 k24Var = this.K0;
        k24Var.O.removeCallbacks(k24Var);
        k24Var.K.abortAnimation();
        e eVar2 = this.V;
        f fVar = this.K;
        if (eVar2 != null) {
            d dVar = this.w0;
            if (dVar != null) {
                dVar.e();
            }
            this.V.b0(fVar);
            this.V.c0(fVar);
            fVar.a.clear();
            fVar.f();
            if (this.d0) {
                e eVar3 = this.V;
                eVar3.f = false;
                eVar3.L(this);
            }
            this.V.n0(null);
            this.V = null;
        } else {
            fVar.a.clear();
            fVar.f();
        }
        pn pnVar = this.N;
        ((e60) pnVar.c).h();
        ArrayList arrayList = (ArrayList) pnVar.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((r14) pnVar.b).a;
            if (size < 0) {
                break;
            }
            g G = G((View) arrayList.get(size));
            if (G != null) {
                G.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            g G2 = G(childAt);
            c cVar = recyclerView.U;
            if (cVar != null && G2 != null) {
                cVar.onViewDetachedFromWindow(G2);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.V = eVar;
        if (eVar != null) {
            if (eVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(eVar);
                String w = eVar.b.w();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(w);
                throw new IllegalArgumentException(sb.toString());
            }
            eVar.n0(this);
            if (this.d0) {
                this.V.f = true;
            }
        }
        fVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            s83.t("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        l93 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = dr5.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(b24 b24Var) {
        this.O0 = b24Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.J0 = z;
    }

    public void setRecycledViewPool(d24 d24Var) {
        f fVar = this.K;
        RecyclerView recyclerView = fVar.h;
        fVar.e(recyclerView.U, false);
        if (fVar.g != null) {
            r1.b--;
        }
        fVar.g = d24Var;
        if (d24Var != null && recyclerView.getAdapter() != null) {
            fVar.g.b++;
        }
        fVar.d();
    }

    public void setScrollState(int i) {
        if (i == this.x0) {
            return;
        }
        this.x0 = i;
        if (i != 2) {
            k24 k24Var = this.K0;
            k24Var.O.removeCallbacks(k24Var);
            k24Var.K.abortAnimation();
        }
        e eVar = this.V;
        if (eVar != null) {
            eVar.a0(i);
        }
        ArrayList arrayList = this.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b24) this.P0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.E0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            android.util.Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.E0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(j24 j24Var) {
        this.K.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        l93 scrollingChildHelper = getScrollingChildHelper();
        ViewParent d = scrollingChildHelper.d(0);
        if (d != null) {
            eg5.J(d, scrollingChildHelper.c, 0);
            scrollingChildHelper.a = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.i0) {
            f("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.i0 = false;
                if (this.h0 && this.V != null && this.U != null) {
                    requestLayout();
                }
                this.h0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.i0 = true;
            this.j0 = true;
            setScrollState(0);
            k24 k24Var = this.K0;
            k24Var.O.removeCallbacks(k24Var);
            k24Var.K.abortAnimation();
        }
    }

    public final void t() {
        if (this.s0 != null) {
            return;
        }
        ((i24) this.r0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.s0 = edgeEffect;
        if (this.P) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.u0 != null) {
            return;
        }
        ((i24) this.r0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.u0 = edgeEffect;
        if (this.P) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.t0 != null) {
            return;
        }
        ((i24) this.r0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.t0 = edgeEffect;
        if (this.P) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return " " + super.toString() + ", adapter:" + this.U + ", layout:" + this.V + ", context:" + getContext();
    }

    public final void x(h24 h24Var) {
        if (getScrollState() != 2) {
            h24Var.getClass();
            return;
        }
        OverScroller overScroller = this.K0.K;
        overScroller.getFinalX();
        overScroller.getCurrX();
        h24Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View y(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.y(android.view.View):android.view.View");
    }

    public final boolean z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.b0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            md1 md1Var = (md1) arrayList.get(i);
            if (md1Var.e(motionEvent) && action != 3) {
                this.c0 = md1Var;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = this.V;
        if (eVar != null) {
            return eVar.s(layoutParams);
        }
        zy.i("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    public void setOnFlingListener(a24 a24Var) {
    }

    @Deprecated
    public void setRecyclerListener(e24 e24Var) {
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
