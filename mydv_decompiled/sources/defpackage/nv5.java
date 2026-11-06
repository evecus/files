package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class nv5 extends vv5 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public o12[] d;
    public o12 e;
    public yv5 f;
    public o12 g;
    public int h;
    public vx0 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public nv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private vx0 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return vx0.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        j74 m = ub.m(display, 0);
        j74 m2 = ub.m(display, 1);
        j74 m3 = ub.m(display, 2);
        j74 m4 = ub.m(display, 3);
        return vx0.a(point.x, point.y, false, m != null ? m.a() : 0, m2 != null ? m2.a() : 0, m3 != null ? m3.a() : 0, m4 != null ? m4.a() : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[qi4.h(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(o12 o12Var) {
        ArrayList arrayList = new ArrayList();
        int i = o12Var.a;
        int i2 = o12Var.d;
        int i3 = o12Var.c;
        int i4 = o12Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, o12Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private o12 G(int i, boolean z) {
        o12 o12Var = o12.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                o12Var = o12.a(o12Var, H(i2, z));
            }
        }
        return o12Var;
    }

    private o12 I() {
        yv5 yv5Var = this.f;
        return yv5Var != null ? yv5Var.a.l() : o12.e;
    }

    private o12 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            zy.p("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(invoke));
                if (rect != null) {
                    return o12.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.vv5
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.vv5
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.vv5
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public o12 H(int i, boolean z) {
        o12 l;
        int i2;
        o12 o12Var = o12.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    o12[] o12VarArr = this.d;
                    l = o12VarArr != null ? o12VarArr[qi4.h(8)] : null;
                    if (l != null) {
                        return l;
                    }
                    o12 n2 = n();
                    o12 I = I();
                    int i3 = n2.d;
                    if (i3 > I.d) {
                        return o12.b(0, 0, 0, i3);
                    }
                    o12 o12Var2 = this.g;
                    if (o12Var2 != null && !o12Var2.equals(o12Var) && (i2 = this.g.d) > I.d) {
                        return o12.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        yv5 yv5Var = this.f;
                        tx0 h = yv5Var != null ? yv5Var.a.h() : h();
                        if (h != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return o12.b(i4 >= 28 ? ck.u(h.a) : 0, i4 >= 28 ? ck.w(h.a) : 0, i4 >= 28 ? ck.v(h.a) : 0, i4 >= 28 ? ck.t(h.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    o12 I2 = I();
                    o12 l2 = l();
                    return o12.b(Math.max(I2.a, l2.a), 0, Math.max(I2.c, l2.c), Math.max(I2.d, l2.d));
                }
                if ((this.h & 2) == 0) {
                    o12 n3 = n();
                    yv5 yv5Var2 = this.f;
                    l = yv5Var2 != null ? yv5Var2.a.l() : null;
                    int i5 = n3.d;
                    if (l != null) {
                        i5 = Math.min(i5, l.d);
                    }
                    return o12.b(n3.a, 0, n3.c, i5);
                }
            }
        } else {
            if (z) {
                return o12.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return o12.b(0, n().b, 0, 0);
            }
        }
        return o12Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(o12.e);
    }

    @Override // defpackage.vv5
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        o12 J = J(view);
        if (J == null) {
            J = o12.e;
        }
        x(J);
    }

    @Override // defpackage.vv5
    public void e(yv5 yv5Var) {
        yv5Var.a.y(this.f);
        o12 o12Var = this.g;
        vv5 vv5Var = yv5Var.a;
        vv5Var.x(o12Var);
        vv5Var.A(this.h);
        vv5Var.v(this.i);
        vv5Var.B(this.l);
        vv5Var.C(this.m);
    }

    @Override // defpackage.vv5
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        nv5 nv5Var = (nv5) obj;
        return Objects.equals(this.g, nv5Var.g) && M(this.h, nv5Var.h);
    }

    @Override // defpackage.vv5
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.vv5
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.vv5
    public o12 i(int i) {
        return G(i, false);
    }

    @Override // defpackage.vv5
    public o12 j(int i) {
        return G(i, true);
    }

    @Override // defpackage.vv5
    public final o12 n() {
        o12 o12Var = this.e;
        if (o12Var != null) {
            return o12Var;
        }
        WindowInsets windowInsets = this.c;
        o12 b = o12.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = b;
        return b;
    }

    @Override // defpackage.vv5
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.vv5
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int h = qi4.h(i);
            this.l[h] = F(i(i));
            if (i != 8) {
                this.m[h] = F(j(i));
            }
        }
    }

    @Override // defpackage.vv5
    public yv5 r(int i, int i2, int i3, int i4) {
        yv5 c = yv5.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        mv5 lv5Var = i5 >= 36 ? new lv5(c) : i5 >= 35 ? new kv5(c) : i5 >= 34 ? new jv5(c) : i5 >= 31 ? new iv5(c) : i5 >= 30 ? new hv5(c) : i5 >= 29 ? new gv5(c) : new fv5(c);
        lv5Var.h(yv5.a(n(), i, i2, i3, i4));
        lv5Var.f(yv5.a(l(), i, i2, i3, i4));
        return lv5Var.b();
    }

    @Override // defpackage.vv5
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.vv5
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vv5
    public void v(vx0 vx0Var) {
        this.i = vx0Var;
    }

    @Override // defpackage.vv5
    public void w(o12[] o12VarArr) {
        this.d = o12VarArr;
    }

    @Override // defpackage.vv5
    public void x(o12 o12Var) {
        this.g = o12Var;
    }

    @Override // defpackage.vv5
    public void y(yv5 yv5Var) {
        this.f = yv5Var;
    }

    public nv5(yv5 yv5Var, nv5 nv5Var) {
        this(yv5Var, new WindowInsets(nv5Var.c));
    }
}
