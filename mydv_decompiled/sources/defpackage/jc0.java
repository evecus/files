package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jc0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(MainActivity mainActivity, tc0 tc0Var) {
        View childAt = ((ViewGroup) mainActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        yd0 yd0Var = childAt instanceof yd0 ? (yd0) childAt : null;
        if (yd0Var != null) {
            yd0Var.setParentCompositionContext(null);
            yd0Var.setContent(tc0Var);
            return;
        }
        yd0 yd0Var2 = new yd0(mainActivity);
        yd0Var2.setParentCompositionContext(null);
        yd0Var2.setContent(tc0Var);
        View decorView = mainActivity.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.get(decorView) == null) {
            ViewTreeLifecycleOwner.set(decorView, mainActivity);
        }
        if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
            ViewTreeViewModelStoreOwner.set(decorView, mainActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.set(decorView, mainActivity);
        }
        mainActivity.setContentView(yd0Var2, a);
    }
}
