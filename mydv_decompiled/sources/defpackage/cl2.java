package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.media3.common.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class cl2 implements xn4 {
    public static final Method h0;
    public static final Method i0;
    public static final Method j0;
    public final Context I;
    public ListAdapter J;
    public m41 K;
    public int N;
    public int O;
    public boolean Q;
    public boolean R;
    public boolean S;
    public zk2 V;
    public View W;
    public AdapterView.OnItemClickListener X;
    public final Handler c0;
    public Rect e0;
    public boolean f0;
    public final wl g0;
    public final int L = -2;
    public int M = -2;
    public final short P = 1002;
    public int T = 0;
    public final int U = Log.LOG_LEVEL_OFF;
    public final yk2 Y = new yk2(this, (byte) 1);
    public final bl2 Z = new bl2(this);
    public final al2 a0 = new al2(this);
    public final yk2 b0 = new yk2(this, (byte) 0);
    public final Rect d0 = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                h0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                j0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT == 23) {
            try {
                i0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                android.util.Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public cl2(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.I = context;
        this.c0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.o, i, 0);
        this.N = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.O = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.Q = true;
        }
        obtainStyledAttributes.recycle();
        wl wlVar = new wl(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, qz3.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            wlVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        wlVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : j42.C(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.g0 = wlVar;
        wlVar.setInputMethodMode(1);
    }

    public m41 a(Context context, boolean z) {
        return new m41(context, z);
    }

    @Override // defpackage.xn4
    public final boolean b() {
        return this.g0.isShowing();
    }

    public final int c() {
        return this.N;
    }

    @Override // defpackage.xn4
    public final void dismiss() {
        wl wlVar = this.g0;
        wlVar.dismiss();
        wlVar.setContentView(null);
        this.K = null;
        this.c0.removeCallbacks(this.Y);
    }

    public final void e(int i) {
        this.N = i;
    }

    @Override // defpackage.xn4
    public final void g() {
        int i;
        int g;
        int paddingBottom;
        m41 m41Var;
        m41 m41Var2 = this.K;
        Context context = this.I;
        wl wlVar = this.g0;
        if (m41Var2 == null) {
            m41 a = a(context, !this.f0);
            this.K = a;
            a.setAdapter(this.J);
            this.K.setOnItemClickListener(this.X);
            this.K.setFocusable(true);
            this.K.setFocusableInTouchMode(true);
            this.K.setOnItemSelectedListener(new xk2(this));
            this.K.setOnScrollListener(this.a0);
            wlVar.setContentView(this.K);
        }
        Drawable background = wlVar.getBackground();
        Rect rect = this.d0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.Q) {
                this.O = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = wlVar.getInputMethodMode() == 2;
        View view = this.W;
        int i3 = this.O;
        if (Build.VERSION.SDK_INT == 23) {
            Method method = i0;
            if (method != null) {
                try {
                    g = ((Integer) method.invoke(wlVar, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            g = wlVar.getMaxAvailableHeight(view, i3);
        } else {
            g = g7.g(wlVar, view, i3, z);
        }
        int i4 = this.L;
        if (i4 == -1) {
            paddingBottom = g + i;
        } else {
            int i5 = this.M;
            int a2 = this.K.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), g);
            paddingBottom = a2 + (a2 > 0 ? this.K.getPaddingBottom() + this.K.getPaddingTop() + i : 0);
        }
        boolean z2 = wlVar.getInputMethodMode() == 2;
        wlVar.setWindowLayoutType(this.P);
        if (wlVar.isShowing()) {
            if (this.W.isAttachedToWindow()) {
                int i6 = this.M;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.W.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    int i7 = this.M;
                    if (z2) {
                        wlVar.setWidth(i7 == -1 ? -1 : 0);
                        wlVar.setHeight(0);
                    } else {
                        wlVar.setWidth(i7 == -1 ? -1 : 0);
                        wlVar.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                wlVar.setOutsideTouchable(true);
                int i8 = i6;
                wlVar.update(this.W, this.N, this.O, i8 < 0 ? -1 : i8, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i9 = this.M;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = this.W.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        wlVar.setWidth(i9);
        wlVar.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = h0;
            if (method2 != null) {
                try {
                    method2.invoke(wlVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            io.u(wlVar);
        }
        wlVar.setOutsideTouchable(true);
        wlVar.setTouchInterceptor(this.Z);
        if (this.S) {
            wlVar.setOverlapAnchor(this.R);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = j0;
            if (method3 != null) {
                try {
                    method3.invoke(wlVar, this.e0);
                } catch (Exception e) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            io.t(wlVar, this.e0);
        }
        wlVar.showAsDropDown(this.W, this.N, this.O, this.T);
        this.K.setSelection(-1);
        if ((!this.f0 || this.K.isInTouchMode()) && (m41Var = this.K) != null) {
            m41Var.setListSelectionHidden(true);
            m41Var.requestLayout();
        }
        if (this.f0) {
            return;
        }
        this.c0.post(this.b0);
    }

    public final Drawable h() {
        return this.g0.getBackground();
    }

    @Override // defpackage.xn4
    public final m41 j() {
        return this.K;
    }

    public final void k(Drawable drawable) {
        this.g0.setBackgroundDrawable(drawable);
    }

    public final void m(int i) {
        this.O = i;
        this.Q = true;
    }

    public final int p() {
        if (this.Q) {
            return this.O;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        zk2 zk2Var = this.V;
        if (zk2Var == null) {
            this.V = new zk2(this);
        } else {
            ListAdapter listAdapter2 = this.J;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(zk2Var);
            }
        }
        this.J = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.V);
        }
        m41 m41Var = this.K;
        if (m41Var != null) {
            m41Var.setAdapter(this.J);
        }
    }

    public final void r(int i) {
        Drawable background = this.g0.getBackground();
        if (background == null) {
            this.M = i;
            return;
        }
        Rect rect = this.d0;
        background.getPadding(rect);
        this.M = rect.left + rect.right + i;
    }
}
