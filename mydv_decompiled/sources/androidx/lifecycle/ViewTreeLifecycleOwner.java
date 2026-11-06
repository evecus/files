package androidx.lifecycle;

import android.view.View;
import com.github.mytv.dv.R;
import defpackage.oh4;
import defpackage.vi2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final vi2 get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            vi2 vi2Var = tag instanceof vi2 ? (vi2) tag : null;
            if (vi2Var != null) {
                return vi2Var;
            }
            Object f = oh4.f(view);
            view = f instanceof View ? (View) f : null;
        }
        return null;
    }

    public static final void set(View view, vi2 vi2Var) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, vi2Var);
    }
}
