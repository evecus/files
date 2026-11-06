package coil3;

import android.content.Context;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.RealImageLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageLoadersKt {
    private static final Extras.Key<Boolean> serviceLoaderEnabledKey = new Extras.Key<>(Boolean.TRUE);

    public static final ImageLoader ImageLoader(Context context) {
        return new ImageLoader.Builder(context).build();
    }

    public static final boolean getServiceLoaderEnabled(RealImageLoader.Options options) {
        return ((Boolean) ExtrasKt.getOrDefault(options.getDefaults().getExtras(), serviceLoaderEnabledKey)).booleanValue();
    }

    public static final ImageLoader.Builder serviceLoaderEnabled(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(serviceLoaderEnabledKey, Boolean.valueOf(z));
        return builder;
    }
}
