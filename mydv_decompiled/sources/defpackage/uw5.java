package defpackage;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposerPolicy;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class uw5 {
    public static final n43 a;

    static {
        long[] jArr = ia4.a;
        a = new n43();
    }

    public static final re0 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof re0) {
            return (re0) tag;
        }
        return null;
    }

    public static final Recomposer b(View view) {
        if (!view.isAttachedToWindow()) {
            q02.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object f = oh4.f(view);
        while (f instanceof View) {
            View view2 = (View) f;
            if (view2.getId() == 16908290) {
                break;
            }
            f = view2.getParent();
            view = view2;
        }
        re0 a2 = a(view);
        if (a2 == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui(view);
        }
        if (a2 instanceof Recomposer) {
            return (Recomposer) a2;
        }
        zy.i("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }
}
