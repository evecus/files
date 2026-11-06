package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.github.mytv.dv.R;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zu5 extends dv5 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final hd1 f = new hd1();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public zu5(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static void f(View view, ev5 ev5Var) {
        wu5 j = j(view);
        if (j != null) {
            j.a(ev5Var);
            if (j.J == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ev5Var);
            }
        }
    }

    public static void g(View view, ev5 ev5Var, yv5 yv5Var, boolean z) {
        wu5 j = j(view);
        if (j != null) {
            j.I = yv5Var;
            if (!z) {
                j.b(ev5Var);
                z = j.J == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ev5Var, yv5Var, z);
            }
        }
    }

    public static void h(View view, yv5 yv5Var, List list) {
        wu5 j = j(view);
        if (j != null) {
            yv5Var = j.c(yv5Var, list);
            if (j.J == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), yv5Var, list);
            }
        }
    }

    public static void i(View view, ev5 ev5Var, da daVar) {
        wu5 j = j(view);
        if (j != null) {
            j.d(ev5Var, daVar);
            if (j.J == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ev5Var, daVar);
            }
        }
    }

    public static wu5 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof yu5) {
            return ((yu5) tag).a;
        }
        return null;
    }

    public static void k(View view, wu5 wu5Var) {
        View.OnApplyWindowInsetsListener yu5Var = wu5Var != null ? new yu5(view, wu5Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, yu5Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(yu5Var);
        }
    }
}
