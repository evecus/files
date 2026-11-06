package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.github.mytv.dv.R;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yu5 implements View.OnApplyWindowInsetsListener {
    public final wu5 a;
    public yv5 b;

    public yu5(View view, wu5 wu5Var) {
        yv5 yv5Var;
        this.a = wu5Var;
        WeakHashMap weakHashMap = dr5.a;
        yv5 a = wq5.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            yv5Var = (i >= 36 ? new lv5(a) : i >= 35 ? new kv5(a) : i >= 34 ? new jv5(a) : i >= 31 ? new iv5(a) : i >= 30 ? new hv5(a) : i >= 29 ? new gv5(a) : new fv5(a)).b();
        } else {
            yv5Var = null;
        }
        this.b = yv5Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = yv5.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        yv5 c = yv5.c(windowInsets, view);
        vv5 vv5Var = c.a;
        yv5 yv5Var = this.b;
        if (yv5Var == null) {
            WeakHashMap weakHashMap = dr5.a;
            yv5Var = wq5.a(view);
            this.b = yv5Var;
        }
        if (yv5Var == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            wu5 j = zu5.j(view);
            if (j == null || !Objects.equals(j.I, c)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                yv5 yv5Var2 = this.b;
                int i = 1;
                while (i <= 512) {
                    o12 i2 = vv5Var.i(i);
                    o12 i3 = yv5Var2.a.i(i);
                    int i4 = i2.a;
                    int i5 = i2.d;
                    int i6 = i2.c;
                    int i7 = i2.b;
                    int i8 = i3.a;
                    int i9 = i3.d;
                    int[] iArr4 = iArr2;
                    int i10 = i3.c;
                    int i11 = i3.b;
                    if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i12 = iArr2[0];
                int i13 = iArr3[0];
                int i14 = i12 | i13;
                if (i14 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    yv5 yv5Var3 = this.b;
                    ev5 ev5Var = new ev5(i14, (i12 & 8) != 0 ? zu5.e : (i13 & 8) != 0 ? zu5.f : (i12 & 519) != 0 ? zu5.g : (i13 & 519) != 0 ? zu5.h : null, (i14 & 8) != 0 ? 160L : 250L);
                    ev5Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ev5Var.a.b());
                    o12 i15 = vv5Var.i(i14);
                    o12 i16 = yv5Var3.a.i(i14);
                    int min = Math.min(i15.a, i16.a);
                    int i17 = i15.b;
                    int i18 = i16.b;
                    int min2 = Math.min(i17, i18);
                    int i19 = i15.c;
                    int i20 = i16.c;
                    int min3 = Math.min(i19, i20);
                    int i21 = i15.d;
                    int i22 = i16.d;
                    da daVar = new da((Object) o12.b(min, min2, min3, Math.min(i21, i22)), (Object) o12.b(Math.max(i15.a, i16.a), Math.max(i17, i18), Math.max(i19, i20), Math.max(i21, i22)), (byte) 15);
                    zu5.g(view, ev5Var, c, false);
                    duration.addUpdateListener(new xu5(ev5Var, c, yv5Var3, i14, view));
                    duration.addListener(new yr5(ev5Var, view, (byte) 1));
                    z10 z10Var = new z10(view, ev5Var, daVar, duration);
                    if (view != null) {
                        we3 we3Var = new we3(view, z10Var);
                        view.getViewTreeObserver().addOnPreDrawListener(we3Var);
                        view.addOnAttachStateChangeListener(we3Var);
                    } else {
                        zy.m("view == null");
                    }
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
