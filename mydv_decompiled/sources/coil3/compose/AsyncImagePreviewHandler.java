package coil3.compose;

import coil3.ImageLoader;
import coil3.request.ImageRequest;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface AsyncImagePreviewHandler {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final AsyncImagePreviewHandler Default = AsyncImagePreviewHandler$Companion$Default$1.INSTANCE;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Object handle(ImageLoader imageLoader, ImageRequest imageRequest, fj0 fj0Var);
}
