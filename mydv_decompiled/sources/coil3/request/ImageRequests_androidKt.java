package coil3.request;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.request.ImageRequest;
import coil3.target.ImageViewTarget;
import coil3.transition.CrossfadeTransition;
import coil3.transition.Transition;
import coil3.util.ContextsKt;
import coil3.util.Utils_androidKt;
import defpackage.ia;
import defpackage.li2;
import defpackage.su0;
import defpackage.vi2;
import defpackage.zl1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageRequests_androidKt {
    private static final Extras.Key<Boolean> allowHardwareKey;
    private static final Extras.Key<Boolean> allowPartialImageKey;
    private static final Extras.Key<Boolean> allowRgb565Key;
    private static final Extras.Key<li2> lifecycleKey;
    private static final Extras.Key<Boolean> premultipliedAlphaKey;
    private static final Extras.Key<Transition.Factory> transitionFactoryKey = new Extras.Key<>(Transition.Factory.NONE);
    private static final Extras.Key<Bitmap.Config> bitmapConfigKey = new Extras.Key<>(Utils_androidKt.getDEFAULT_BITMAP_CONFIG());
    private static final Extras.Key<ColorSpace> colorSpaceKey = new Extras.Key<>(Utils_androidKt.getNULL_COLOR_SPACE());

    static {
        Boolean bool = Boolean.TRUE;
        premultipliedAlphaKey = new Extras.Key<>(bool);
        lifecycleKey = new Extras.Key<>(null);
        allowPartialImageKey = new Extras.Key<>(bool);
        allowHardwareKey = new Extras.Key<>(bool);
        allowRgb565Key = new Extras.Key<>(Boolean.FALSE);
    }

    public static final ImageRequest.Builder allowHardware(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(allowHardwareKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder allowPartialImage(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(allowPartialImageKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder allowRgb565(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(allowRgb565Key, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder bitmapConfig(ImageRequest.Builder builder, Bitmap.Config config) {
        builder.getExtras().set(bitmapConfigKey, config);
        return builder;
    }

    public static final ImageRequest.Builder colorSpace(ImageRequest.Builder builder, ColorSpace colorSpace) {
        builder.getExtras().set(colorSpaceKey, colorSpace);
        return builder;
    }

    public static final ImageRequest.Builder crossfade(ImageRequest.Builder builder, int i) {
        return transitionFactory(builder, newCrossfadeTransitionFactory(i));
    }

    public static final ImageRequest.Builder error(ImageRequest.Builder builder, Drawable drawable) {
        return builder.error(drawable != null ? Image_androidKt.asImage(drawable) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Image error$lambda$0(int i, ImageRequest imageRequest) {
        return Image_androidKt.asImage(ContextsKt.getDrawableCompat(imageRequest.getContext(), i));
    }

    public static final ImageRequest.Builder fallback(ImageRequest.Builder builder, Drawable drawable) {
        return builder.fallback(drawable != null ? Image_androidKt.asImage(drawable) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Image fallback$lambda$0(int i, ImageRequest imageRequest) {
        return Image_androidKt.asImage(ContextsKt.getDrawableCompat(imageRequest.getContext(), i));
    }

    public static final boolean getAllowHardware(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, allowHardwareKey)).booleanValue();
    }

    public static final boolean getAllowPartialImage(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, allowPartialImageKey)).booleanValue();
    }

    public static final boolean getAllowRgb565(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, allowRgb565Key)).booleanValue();
    }

    public static final Bitmap.Config getBitmapConfig(ImageRequest imageRequest) {
        return (Bitmap.Config) ExtrasKt.getExtra(imageRequest, bitmapConfigKey);
    }

    public static final ColorSpace getColorSpace(ImageRequest imageRequest) {
        return zl1.b(ExtrasKt.getExtra(imageRequest, colorSpaceKey));
    }

    public static final int getCrossfadeMillis(ImageRequest imageRequest) {
        Transition.Factory transitionFactory = getTransitionFactory(imageRequest);
        CrossfadeTransition.Factory factory = transitionFactory instanceof CrossfadeTransition.Factory ? (CrossfadeTransition.Factory) transitionFactory : null;
        if (factory != null) {
            return factory.getDurationMillis();
        }
        return 0;
    }

    public static final li2 getLifecycle(ImageRequest imageRequest) {
        return (li2) ExtrasKt.getExtra(imageRequest, lifecycleKey);
    }

    public static final boolean getPremultipliedAlpha(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, premultipliedAlphaKey)).booleanValue();
    }

    public static final Transition.Factory getTransitionFactory(ImageRequest imageRequest) {
        return (Transition.Factory) ExtrasKt.getExtra(imageRequest, transitionFactoryKey);
    }

    public static final ImageRequest.Builder lifecycle(ImageRequest.Builder builder, vi2 vi2Var) {
        return lifecycle(builder, vi2Var != null ? vi2Var.k() : null);
    }

    private static final Transition.Factory newCrossfadeTransitionFactory(int i) {
        if (i <= 0) {
            return Transition.Factory.NONE;
        }
        return new CrossfadeTransition.Factory(i, false, 2, null);
    }

    public static final ImageRequest.Builder placeholder(ImageRequest.Builder builder, Drawable drawable) {
        return builder.placeholder(drawable != null ? Image_androidKt.asImage(drawable) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Image placeholder$lambda$0(int i, ImageRequest imageRequest) {
        return Image_androidKt.asImage(ContextsKt.getDrawableCompat(imageRequest.getContext(), i));
    }

    public static final ImageRequest.Builder premultipliedAlpha(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(premultipliedAlphaKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageRequest.Builder target(ImageRequest.Builder builder, ImageView imageView) {
        return builder.target(new ImageViewTarget(imageView));
    }

    public static final ImageRequest.Builder transitionFactory(ImageRequest.Builder builder, Transition.Factory factory) {
        builder.getExtras().set(transitionFactoryKey, factory);
        return builder;
    }

    @su0
    public static /* synthetic */ void getAllowConversionToBitmap$annotations(ImageRequest imageRequest) {
    }

    @su0
    public static /* synthetic */ void getTransformations$annotations(ImageRequest imageRequest) {
    }

    @su0
    public static /* synthetic */ void getAllowConversionToBitmap$annotations(Options options) {
    }

    @su0
    public static /* synthetic */ void getTransformations$annotations(Options options) {
    }

    public static final ImageLoader.Builder crossfade(ImageLoader.Builder builder, int i) {
        return transitionFactory(builder, newCrossfadeTransitionFactory(i));
    }

    public static final Bitmap.Config getBitmapConfig(Options options) {
        return (Bitmap.Config) ExtrasKt.getExtra(options, bitmapConfigKey);
    }

    public static final li2 getLifecycle(Options options) {
        return (li2) ExtrasKt.getExtra(options, lifecycleKey);
    }

    public static final Extras.Key<Transition.Factory> getTransitionFactory(Extras.Key.Companion companion) {
        return transitionFactoryKey;
    }

    public static final ImageLoader.Builder bitmapConfig(ImageLoader.Builder builder, Bitmap.Config config) {
        builder.getExtras().set(bitmapConfigKey, config);
        return builder;
    }

    public static final ImageLoader.Builder colorSpace(ImageLoader.Builder builder, ColorSpace colorSpace) {
        builder.getExtras().set(colorSpaceKey, colorSpace);
        return builder;
    }

    public static final Extras.Key<Bitmap.Config> getBitmapConfig(Extras.Key.Companion companion) {
        return bitmapConfigKey;
    }

    public static final Extras.Key<li2> getLifecycle(Extras.Key.Companion companion) {
        return lifecycleKey;
    }

    public static final ImageLoader.Builder transitionFactory(ImageLoader.Builder builder, Transition.Factory factory) {
        builder.getExtras().set(transitionFactoryKey, factory);
        return builder;
    }

    public static final ColorSpace getColorSpace(Options options) {
        return zl1.b(ExtrasKt.getExtra(options, colorSpaceKey));
    }

    public static final Extras.Key<ColorSpace> getColorSpace(Extras.Key.Companion companion) {
        return colorSpaceKey;
    }

    public static final ImageRequest.Builder error(ImageRequest.Builder builder, int i) {
        return builder.error(new ia((byte) 5, i));
    }

    public static final ImageRequest.Builder fallback(ImageRequest.Builder builder, int i) {
        return builder.fallback(new ia((byte) 4, i));
    }

    public static final boolean getAllowHardware(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, allowHardwareKey)).booleanValue();
    }

    public static final boolean getAllowPartialImage(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, allowPartialImageKey)).booleanValue();
    }

    public static final boolean getAllowRgb565(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, allowRgb565Key)).booleanValue();
    }

    public static final boolean getPremultipliedAlpha(Options options) {
        return ((Boolean) ExtrasKt.getExtra(options, premultipliedAlphaKey)).booleanValue();
    }

    public static final ImageRequest.Builder lifecycle(ImageRequest.Builder builder, li2 li2Var) {
        builder.getExtras().set(lifecycleKey, li2Var);
        return builder;
    }

    public static final ImageRequest.Builder placeholder(ImageRequest.Builder builder, int i) {
        return builder.placeholder(new ia((byte) 6, i));
    }

    public static final ImageLoader.Builder allowHardware(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(allowHardwareKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder allowPartialImage(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(allowPartialImageKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder allowRgb565(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(allowRgb565Key, Boolean.valueOf(z));
        return builder;
    }

    public static final Extras.Key<Boolean> getAllowHardware(Extras.Key.Companion companion) {
        return allowHardwareKey;
    }

    public static final Extras.Key<Boolean> getAllowPartialImage(Extras.Key.Companion companion) {
        return allowPartialImageKey;
    }

    public static final Extras.Key<Boolean> getAllowRgb565(Extras.Key.Companion companion) {
        return allowRgb565Key;
    }

    public static final Extras.Key<Boolean> getPremultipliedAlpha(Extras.Key.Companion companion) {
        return premultipliedAlphaKey;
    }

    public static final ImageLoader.Builder premultipliedAlpha(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(premultipliedAlphaKey, Boolean.valueOf(z));
        return builder;
    }

    @su0
    public static /* synthetic */ void getAllowConversionToBitmap$annotations(Extras.Key.Companion companion) {
    }

    @su0
    public static /* synthetic */ void getTransformations$annotations(Extras.Key.Companion companion) {
    }
}
