package defpackage;

import coil3.Image;
import coil3.ImageLoader;
import coil3.request.ImageRequest;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dx1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Image J;

    public /* synthetic */ dx1(Image image, byte b) {
        this.I = b;
        this.J = image;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        Image error$lambda$0;
        Image fallback$lambda$0;
        Image placeholder$lambda$0;
        Image fallback$lambda$02;
        Image error$lambda$02;
        Image placeholder$lambda$02;
        byte b = this.I;
        Image image = this.J;
        ImageRequest imageRequest = (ImageRequest) obj;
        switch (b) {
            case 0:
                error$lambda$0 = ImageLoader.Builder.error$lambda$0(image, imageRequest);
                return error$lambda$0;
            case 1:
                fallback$lambda$0 = ImageLoader.Builder.fallback$lambda$0(image, imageRequest);
                return fallback$lambda$0;
            case 2:
                placeholder$lambda$0 = ImageLoader.Builder.placeholder$lambda$0(image, imageRequest);
                return placeholder$lambda$0;
            case 3:
                fallback$lambda$02 = ImageRequest.Builder.fallback$lambda$0(image, imageRequest);
                return fallback$lambda$02;
            case 4:
                error$lambda$02 = ImageRequest.Builder.error$lambda$0(image, imageRequest);
                return error$lambda$02;
            default:
                placeholder$lambda$02 = ImageRequest.Builder.placeholder$lambda$0(image, imageRequest);
                return placeholder$lambda$02;
        }
    }
}
