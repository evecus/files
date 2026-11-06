package coil3.compose;

import coil3.Extras;
import coil3.ExtrasKt;
import coil3.ImageLoader;
import coil3.request.ImageRequest;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageRequestsKt {
    private static final Extras.Key<Boolean> preferEndFirstIntrinsicSizeKey;
    private static final Extras.Key<Boolean> useExistingImageAsPlaceholderKey;

    static {
        Boolean bool = Boolean.FALSE;
        useExistingImageAsPlaceholderKey = new Extras.Key<>(bool);
        preferEndFirstIntrinsicSizeKey = new Extras.Key<>(bool);
    }

    public static final boolean getPreferEndFirstIntrinsicSize(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, preferEndFirstIntrinsicSizeKey)).booleanValue();
    }

    public static final boolean getUseExistingImageAsPlaceholder(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, useExistingImageAsPlaceholderKey)).booleanValue();
    }

    public static final ImageRequest.Builder preferEndFirstIntrinsicSize(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(preferEndFirstIntrinsicSizeKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder useExistingImageAsPlaceholder(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(useExistingImageAsPlaceholderKey, Boolean.valueOf(z));
        return builder;
    }

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(ImageRequest imageRequest) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(ImageRequest imageRequest) {
    }

    public static final Extras.Key<Boolean> getPreferEndFirstIntrinsicSize(Extras.Key.Companion companion) {
        return preferEndFirstIntrinsicSizeKey;
    }

    public static final Extras.Key<Boolean> getUseExistingImageAsPlaceholder(Extras.Key.Companion companion) {
        return useExistingImageAsPlaceholderKey;
    }

    public static final ImageLoader.Builder preferEndFirstIntrinsicSize(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(preferEndFirstIntrinsicSizeKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder useExistingImageAsPlaceholder(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(useExistingImageAsPlaceholderKey, Boolean.valueOf(z));
        return builder;
    }

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(Extras.Key.Companion companion) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(Extras.Key.Companion companion) {
    }
}
