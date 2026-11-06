package coil3.size;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ViewSizeResolverKt {
    public static final <T extends View> ViewSizeResolver<T> ViewSizeResolver(T t) {
        return ViewSizeResolver$default(t, false, 2, null);
    }

    public static /* synthetic */ ViewSizeResolver ViewSizeResolver$default(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return ViewSizeResolver(view, z);
    }

    public static final <T extends View> ViewSizeResolver<T> ViewSizeResolver(T t, boolean z) {
        return new RealViewSizeResolver(t, z);
    }
}
