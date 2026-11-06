package coil3;

import android.graphics.drawable.Drawable;
import android.os.Build;
import coil3.ComponentRegistry;
import coil3.RealImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.ExifOrientationStrategy;
import coil3.decode.StaticImageDecoder;
import coil3.fetch.AssetUriFetcher;
import coil3.fetch.ContentUriFetcher;
import coil3.fetch.DrawableFetcher;
import coil3.fetch.ResourceUriFetcher;
import coil3.key.AndroidResourceUriKeyer;
import coil3.map.AndroidUriMapper;
import coil3.map.ResourceIntMapper;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.OneShotDisposable;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.size.ViewSizeResolver;
import coil3.target.Target;
import coil3.target.ViewTarget;
import coil3.transition.NoneTransition;
import coil3.transition.Transition;
import coil3.transition.TransitionTarget;
import defpackage.ij4;
import defpackage.j42;
import defpackage.jj4;
import defpackage.kt0;
import defpackage.rm1;
import defpackage.s24;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealImageLoader_androidKt {
    public static final ComponentRegistry.Builder addAndroidComponents(ComponentRegistry.Builder builder, RealImageLoader.Options options) {
        builder.add(new AndroidUriMapper(), s24.a(android.net.Uri.class));
        builder.add(new ResourceIntMapper(), s24.a(Integer.class));
        builder.add(new AndroidResourceUriKeyer(), s24.a(Uri.class));
        builder.add(new AssetUriFetcher.Factory(), s24.a(Uri.class));
        builder.add(new ContentUriFetcher.Factory(), s24.a(Uri.class));
        builder.add(new ResourceUriFetcher.Factory(), s24.a(Uri.class));
        builder.add(new DrawableFetcher.Factory(), s24.a(Drawable.class));
        int bitmapFactoryMaxParallelism = ImageLoaders_androidKt.getBitmapFactoryMaxParallelism(options);
        int i = jj4.a;
        ij4 ij4Var = new ij4(bitmapFactoryMaxParallelism);
        if (enableStaticImageDecoder(options)) {
            builder.add(new StaticImageDecoder.Factory(ij4Var));
        }
        builder.add(new BitmapFactoryDecoder.Factory(ij4Var, ImageLoaders_androidKt.getBitmapFactoryExifOrientationStrategy(options)));
        return builder;
    }

    private static final boolean enableStaticImageDecoder(RealImageLoader.Options options) {
        return Build.VERSION.SDK_INT >= 29 && ImageLoaders_androidKt.getImageDecoderEnabled(options) && j42.c(ImageLoaders_androidKt.getBitmapFactoryExifOrientationStrategy(options), ExifOrientationStrategy.RESPECT_PERFORMANCE);
    }

    public static final Disposable getDisposable(ImageRequest imageRequest, kt0 kt0Var) {
        return imageRequest.getTarget() instanceof ViewTarget ? ViewTargetRequestManagerKt.getRequestManager(((ViewTarget) imageRequest.getTarget()).getView()).getDisposable(kt0Var) : new OneShotDisposable(kt0Var);
    }

    public static final boolean needsExecuteOnMainDispatcher(ImageRequest imageRequest) {
        return (imageRequest.getTarget() instanceof ViewTarget) || (imageRequest.getSizeResolver() instanceof ViewSizeResolver) || ImageRequests_androidKt.getLifecycle(imageRequest) != null;
    }

    public static final void transition(ImageResult imageResult, Target target, EventListener eventListener, rm1 rm1Var) {
        if (!(target instanceof TransitionTarget)) {
            rm1Var.invoke();
            return;
        }
        Transition create = ImageRequests_androidKt.getTransitionFactory(imageResult.getRequest()).create((TransitionTarget) target, imageResult);
        if (create instanceof NoneTransition) {
            rm1Var.invoke();
            return;
        }
        eventListener.transitionStart(imageResult.getRequest(), create);
        create.transition();
        eventListener.transitionEnd(imageResult.getRequest(), create);
    }
}
