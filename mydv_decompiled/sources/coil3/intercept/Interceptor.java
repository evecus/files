package coil3.intercept;

import coil3.request.ImageRequest;
import coil3.size.Size;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Interceptor {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Chain {
        ImageRequest getRequest();

        Size getSize();

        Object proceed(fj0 fj0Var);

        Chain withRequest(ImageRequest imageRequest);

        Chain withSize(Size size);
    }

    Object intercept(Chain chain, fj0 fj0Var);
}
