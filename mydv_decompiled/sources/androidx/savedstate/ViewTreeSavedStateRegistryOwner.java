package androidx.savedstate;

import android.view.View;
import com.github.mytv.dv.R;
import defpackage.oh4;
import defpackage.w94;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final w94 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            w94 w94Var = tag instanceof w94 ? (w94) tag : null;
            if (w94Var != null) {
                return w94Var;
            }
            Object f = oh4.f(view);
            view = f instanceof View ? (View) f : null;
        }
        return null;
    }

    public static final void set(View view, w94 w94Var) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, w94Var);
    }
}
