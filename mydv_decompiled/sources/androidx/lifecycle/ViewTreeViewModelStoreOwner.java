package androidx.lifecycle;

import android.view.View;
import com.github.mytv.dv.R;
import defpackage.oh4;
import defpackage.wr5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final wr5 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            wr5 wr5Var = tag instanceof wr5 ? (wr5) tag : null;
            if (wr5Var != null) {
                return wr5Var;
            }
            Object f = oh4.f(view);
            view = f instanceof View ? (View) f : null;
        }
        return null;
    }

    public static final void set(View view, wr5 wr5Var) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, wr5Var);
    }
}
