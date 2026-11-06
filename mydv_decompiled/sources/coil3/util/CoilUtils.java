package coil3.util;

import android.view.View;
import coil3.request.ImageResult;
import coil3.request.ViewTargetRequestManagerKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CoilUtils {
    public static final CoilUtils INSTANCE = new CoilUtils();

    private CoilUtils() {
    }

    public static final void dispose(View view) {
        ViewTargetRequestManagerKt.getRequestManager(view).dispose();
    }

    public static final ImageResult result(View view) {
        return ViewTargetRequestManagerKt.getRequestManager(view).getResult();
    }
}
