package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ob {
    public static final ob a = new ob();

    public static PointerIcon b(Context context, pp3 pp3Var) {
        return pp3Var instanceof ge ? PointerIcon.getSystemIcon(context, ((ge) pp3Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    public final void a(View view, pp3 pp3Var) {
        PointerIcon b = b(view.getContext(), pp3Var);
        if (j42.c(view.getPointerIcon(), b)) {
            return;
        }
        view.setPointerIcon(b);
    }
}
