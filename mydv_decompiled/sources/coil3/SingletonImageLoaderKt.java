package coil3;

import android.content.Context;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import defpackage.cq4;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonImageLoaderKt {
    private static final SingletonImageLoader.Factory DefaultSingletonImageLoaderFactory = new cq4();
    private static final Extras.Key<wd5> DefaultSingletonImageLoaderKey = new Extras.Key<>(wd5.a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageLoader DefaultSingletonImageLoaderFactory$lambda$0(Context context) {
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        builder.getExtras().set(DefaultSingletonImageLoaderKey, wd5.a);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDefault(ImageLoader imageLoader) {
        return imageLoader.getDefaults().getExtras().get(DefaultSingletonImageLoaderKey) != null;
    }
}
