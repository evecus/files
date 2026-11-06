package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a71 extends z61 {
    @Override // defpackage.y61, defpackage.w61, defpackage.b71
    public void b(x05 x05Var, x05 x05Var2, Window window, View view, boolean z, boolean z2) {
        x05Var.getClass();
        x05Var2.getClass();
        window.getClass();
        view.getClass();
        li4.m(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof h80)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        ep epVar = new ep(view);
        int i3 = Build.VERSION.SDK_INT;
        ui4 cw5Var = i3 >= 35 ? new cw5(window, epVar) : i3 >= 30 ? new bw5(window, epVar) : i3 >= 26 ? new aw5(window, epVar) : new zv5(window, epVar);
        cw5Var.p(!z);
        cw5Var.o(!z2);
    }
}
