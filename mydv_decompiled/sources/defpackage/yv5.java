package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yv5 {
    public static final yv5 b;
    public final vv5 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = tv5.x;
        } else if (i >= 30) {
            b = rv5.w;
        } else {
            b = vv5.b;
        }
    }

    public yv5(yv5 yv5Var) {
        if (yv5Var == null) {
            this.a = new vv5(this);
            return;
        }
        vv5 vv5Var = yv5Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (vv5Var instanceof uv5)) {
            this.a = new uv5(this, (uv5) vv5Var);
        } else if (i >= 34 && (vv5Var instanceof tv5)) {
            this.a = new tv5(this, (tv5) vv5Var);
        } else if (i >= 31 && (vv5Var instanceof sv5)) {
            this.a = new sv5(this, (sv5) vv5Var);
        } else if (i >= 30 && (vv5Var instanceof rv5)) {
            this.a = new rv5(this, (rv5) vv5Var);
        } else if (i >= 29 && (vv5Var instanceof qv5)) {
            this.a = new qv5(this, (qv5) vv5Var);
        } else if (i >= 28 && (vv5Var instanceof pv5)) {
            this.a = new pv5(this, (pv5) vv5Var);
        } else if (vv5Var instanceof ov5) {
            this.a = new ov5(this, (ov5) vv5Var);
        } else if (vv5Var instanceof nv5) {
            this.a = new nv5(this, (nv5) vv5Var);
        } else {
            this.a = new vv5(this);
        }
        vv5Var.e(this);
    }

    public static o12 a(o12 o12Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, o12Var.a - i);
        int max2 = Math.max(0, o12Var.b - i2);
        int max3 = Math.max(0, o12Var.c - i3);
        int max4 = Math.max(0, o12Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? o12Var : o12.b(max, max2, max3, max4);
    }

    public static yv5 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        yv5 yv5Var = new yv5(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = dr5.a;
            yv5 a = wq5.a(view);
            vv5 vv5Var = yv5Var.a;
            vv5Var.y(a);
            View rootView = view.getRootView();
            vv5Var.d(rootView);
            vv5Var.p(rootView);
            vv5Var.q();
            vv5Var.A(view.getWindowSystemUiVisibility());
        }
        return yv5Var;
    }

    public final WindowInsets b() {
        vv5 vv5Var = this.a;
        if (vv5Var instanceof nv5) {
            return ((nv5) vv5Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yv5) {
            return Objects.equals(this.a, ((yv5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        vv5 vv5Var = this.a;
        if (vv5Var == null) {
            return 0;
        }
        return vv5Var.hashCode();
    }

    public yv5(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new uv5(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new tv5(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new sv5(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new rv5(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new qv5(this, windowInsets);
        } else if (i >= 28) {
            this.a = new pv5(this, windowInsets);
        } else {
            this.a = new ov5(this, windowInsets);
        }
    }
}
