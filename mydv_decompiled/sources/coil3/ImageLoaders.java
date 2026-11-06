package coil3;

import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import defpackage.g4;
import defpackage.l91;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImageLoaders {
    public static final ImageResult executeBlocking(ImageLoader imageLoader, ImageRequest imageRequest) {
        return (ImageResult) g4.b0(l91.I, new ImageLoaders$executeBlocking$1(imageLoader, imageRequest, null));
    }
}
