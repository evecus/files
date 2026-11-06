package coil3.request;

import coil3.ImageLoader;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RequestService_androidKt {
    public static final RequestService RequestService(ImageLoader imageLoader, SystemCallbacks systemCallbacks, Logger logger) {
        return new AndroidRequestService(imageLoader, systemCallbacks, logger);
    }
}
