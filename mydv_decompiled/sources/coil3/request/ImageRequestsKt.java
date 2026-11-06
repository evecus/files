package coil3.request;

import coil3.Extras;
import coil3.ExtrasKt;
import coil3.ImageLoader;
import coil3.request.ImageRequest;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.transform.Transformation;
import coil3.util.Collections_jvmCommonKt;
import defpackage.dq;
import defpackage.o70;
import defpackage.o91;
import defpackage.p24;
import defpackage.v1;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageRequestsKt {
    public static final int DEFAULT_CROSSFADE_MILLIS = 200;
    private static final Extras.Key<List<Transformation>> transformationsKey = new Extras.Key<>(o91.I);
    private static final Extras.Key<Size> maxBitmapSizeKey = new Extras.Key<>(SizeKt.Size(4096, 4096));
    private static final Extras.Key<Boolean> addLastModifiedToFileCacheKeyKey = new Extras.Key<>(Boolean.FALSE);
    private static final Extras.Key<Boolean> allowConversionToBitmapKey = new Extras.Key<>(Boolean.TRUE);

    public static final ImageRequest.Builder addLastModifiedToFileCacheKey(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(addLastModifiedToFileCacheKeyKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder allowConversionToBitmap(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(allowConversionToBitmapKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder crossfade(ImageRequest.Builder builder, boolean z) {
        return ImageRequests_androidKt.crossfade(builder, z ? 200 : 0);
    }

    public static final boolean getAddLastModifiedToFileCacheKey(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, addLastModifiedToFileCacheKeyKey)).booleanValue();
    }

    public static final boolean getAllowConversionToBitmap(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, allowConversionToBitmapKey)).booleanValue();
    }

    public static final Size getMaxBitmapSize(ImageRequest imageRequest) {
        return (Size) ExtrasKt.getExtra(imageRequest, maxBitmapSizeKey);
    }

    public static final List<Transformation> getTransformations(ImageRequest imageRequest) {
        return (List) ExtrasKt.getExtra(imageRequest, transformationsKey);
    }

    public static final ImageRequest.Builder maxBitmapSize(ImageRequest.Builder builder, Size size) {
        builder.getExtras().set(maxBitmapSizeKey, size);
        return builder;
    }

    public static final ImageRequest.Builder transformations(ImageRequest.Builder builder, List<? extends Transformation> list) {
        builder.getExtras().set(transformationsKey, Collections_jvmCommonKt.toImmutableList(list));
        builder.memoryCacheKeyExtra("coil#transformations", o70.Z0(list, null, null, null, 0, new v1((Object) new p24(), (byte) 25), 31));
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence transformations$lambda$0$0(p24 p24Var, Transformation transformation) {
        int i = p24Var.I;
        p24Var.I = i + 1;
        return i + ":" + transformation.getCacheKey();
    }

    public static final Size getMaxBitmapSize(Options options) {
        return (Size) ExtrasKt.getExtra(options, maxBitmapSizeKey);
    }

    public static final List<Transformation> getTransformations(Options options) {
        return (List) ExtrasKt.getExtra(options, transformationsKey);
    }

    public static final Extras.Key<Size> getMaxBitmapSize(Extras.Key.Companion companion) {
        return maxBitmapSizeKey;
    }

    public static final Extras.Key<List<Transformation>> getTransformations(Extras.Key.Companion companion) {
        return transformationsKey;
    }

    public static final ImageLoader.Builder maxBitmapSize(ImageLoader.Builder builder, Size size) {
        builder.getExtras().set(maxBitmapSizeKey, size);
        return builder;
    }

    public static final ImageLoader.Builder crossfade(ImageLoader.Builder builder, boolean z) {
        return ImageRequests_androidKt.crossfade(builder, z ? 200 : 0);
    }

    public static final boolean getAddLastModifiedToFileCacheKey(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, addLastModifiedToFileCacheKeyKey)).booleanValue();
    }

    public static final boolean getAllowConversionToBitmap(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, allowConversionToBitmapKey)).booleanValue();
    }

    public static final ImageLoader.Builder addLastModifiedToFileCacheKey(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(addLastModifiedToFileCacheKeyKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder allowConversionToBitmap(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(allowConversionToBitmapKey, Boolean.valueOf(z));
        return builder;
    }

    public static final Extras.Key<Boolean> getAddLastModifiedToFileCacheKey(Extras.Key.Companion companion) {
        return addLastModifiedToFileCacheKeyKey;
    }

    public static final Extras.Key<Boolean> getAllowConversionToBitmap(Extras.Key.Companion companion) {
        return allowConversionToBitmapKey;
    }

    public static final ImageRequest.Builder transformations(ImageRequest.Builder builder, Transformation... transformationArr) {
        return transformations(builder, (List<? extends Transformation>) dq.o1(transformationArr));
    }
}
