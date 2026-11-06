package coil3;

import coil3.Extras;
import coil3.ImageLoader;
import coil3.RealImageLoader;
import coil3.decode.ExifOrientationStrategy;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageLoaders_androidKt {
    private static final Extras.Key<Integer> bitmapFactoryMaxParallelismKey = new Extras.Key<>(4);
    private static final Extras.Key<ExifOrientationStrategy> bitmapFactoryExifOrientationStrategyKey = new Extras.Key<>(ExifOrientationStrategy.RESPECT_PERFORMANCE);
    private static final Extras.Key<Boolean> imageDecoderEnabledKey = new Extras.Key<>(Boolean.TRUE);
    private static final Extras.Key<Double> memoryCacheMaxSizePercentWhileInBackgroundKey = new Extras.Key<>(Double.valueOf(1.0d));

    public static final ImageLoader.Builder bitmapFactoryExifOrientationStrategy(ImageLoader.Builder builder, ExifOrientationStrategy exifOrientationStrategy) {
        builder.getExtras().set(bitmapFactoryExifOrientationStrategyKey, exifOrientationStrategy);
        return builder;
    }

    public static final ImageLoader.Builder bitmapFactoryMaxParallelism(ImageLoader.Builder builder, int i) {
        if (i > 0) {
            builder.getExtras().set(bitmapFactoryMaxParallelismKey, Integer.valueOf(i));
            return builder;
        }
        s83.t("maxParallelism must be > 0.");
        return null;
    }

    public static final ExifOrientationStrategy getBitmapFactoryExifOrientationStrategy(RealImageLoader.Options options) {
        return (ExifOrientationStrategy) ExtrasKt.getOrDefault(options.getDefaults().getExtras(), bitmapFactoryExifOrientationStrategyKey);
    }

    public static final int getBitmapFactoryMaxParallelism(RealImageLoader.Options options) {
        return ((Number) ExtrasKt.getOrDefault(options.getDefaults().getExtras(), bitmapFactoryMaxParallelismKey)).intValue();
    }

    public static final boolean getImageDecoderEnabled(RealImageLoader.Options options) {
        return ((Boolean) ExtrasKt.getOrDefault(options.getDefaults().getExtras(), imageDecoderEnabledKey)).booleanValue();
    }

    public static final double getMemoryCacheMaxSizePercentWhileInBackground(RealImageLoader.Options options) {
        return ((Number) ExtrasKt.getOrDefault(options.getDefaults().getExtras(), memoryCacheMaxSizePercentWhileInBackgroundKey)).doubleValue();
    }

    public static final ImageLoader.Builder imageDecoderEnabled(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(imageDecoderEnabledKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder memoryCacheMaxSizePercentWhileInBackground(ImageLoader.Builder builder, double d) {
        if (0.0d > d || d > 1.0d) {
            s83.t("percent must be in the range [0.0, 1.0].");
            return null;
        }
        builder.getExtras().set(memoryCacheMaxSizePercentWhileInBackgroundKey, Double.valueOf(d));
        return builder;
    }
}
