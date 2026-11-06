package coil3.compose.internal;

import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Utils_androidKt {
    public static final void validateRequestProperties(ImageRequest imageRequest) {
        if (imageRequest.getTarget() != null) {
            s83.t("request.target must be null.");
        } else {
            if (ImageRequests_androidKt.getLifecycle(imageRequest) == null) {
                return;
            }
            s83.t("request.lifecycle must be null.");
        }
    }
}
