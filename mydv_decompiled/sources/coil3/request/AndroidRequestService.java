package coil3.request;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import coil3.BitmapImage;
import coil3.Extras;
import coil3.Image;
import coil3.ImageLoader;
import coil3.memory.MemoryCache;
import coil3.request.ImageRequest;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeResolver;
import coil3.size.ViewSizeResolver;
import coil3.size.ViewSizeResolverKt;
import coil3.target.Target;
import coil3.target.ViewTarget;
import coil3.util.BitmapsKt;
import coil3.util.ContextsKt;
import coil3.util.HardwareBitmapService;
import coil3.util.HardwareBitmapsKt;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import coil3.util.Utils_androidKt;
import defpackage.dq;
import defpackage.j42;
import defpackage.li2;
import defpackage.sv2;
import defpackage.v52;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidRequestService implements RequestService {
    private final HardwareBitmapService hardwareBitmapService;
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final SystemCallbacks systemCallbacks;

    public AndroidRequestService(ImageLoader imageLoader, SystemCallbacks systemCallbacks, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.logger = logger;
        this.hardwareBitmapService = HardwareBitmapsKt.HardwareBitmapService(logger);
    }

    private final li2 findLifecycle(ImageRequest imageRequest) {
        Target target = imageRequest.getTarget();
        return ContextsKt.getLifecycle(target instanceof ViewTarget ? ((ViewTarget) target).getView().getContext() : imageRequest.getContext());
    }

    private final boolean isBitmapConfigValidMainThread(ImageRequest imageRequest, Size size) {
        return (ImageRequestsKt.getTransformations(imageRequest).isEmpty() || dq.M0(Utils_androidKt.getVALID_TRANSFORMATION_CONFIGS(), ImageRequests_androidKt.getBitmapConfig(imageRequest))) && (!BitmapsKt.isHardware(ImageRequests_androidKt.getBitmapConfig(imageRequest)) || (isConfigValidForHardware(imageRequest, ImageRequests_androidKt.getBitmapConfig(imageRequest)) && this.hardwareBitmapService.allowHardwareMainThread(size)));
    }

    private final boolean isBitmapConfigValidWorkerThread(Options options) {
        return !BitmapsKt.isHardware(ImageRequests_androidKt.getBitmapConfig(options)) || this.hardwareBitmapService.allowHardwareWorkerThread();
    }

    private final boolean isConfigValidForHardware(ImageRequest imageRequest, Bitmap.Config config) {
        if (!BitmapsKt.isHardware(config)) {
            return true;
        }
        if (!ImageRequests_androidKt.getAllowHardware(imageRequest)) {
            return false;
        }
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            View view = ((ViewTarget) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    private final Extras resolveExtras(ImageRequest imageRequest, Size size) {
        Bitmap.Config bitmapConfig = ImageRequests_androidKt.getBitmapConfig(imageRequest);
        boolean allowRgb565 = ImageRequests_androidKt.getAllowRgb565(imageRequest);
        if (!isBitmapConfigValidMainThread(imageRequest, size)) {
            bitmapConfig = Bitmap.Config.ARGB_8888;
        }
        boolean z = allowRgb565 && ImageRequestsKt.getTransformations(imageRequest).isEmpty() && bitmapConfig != Bitmap.Config.ALPHA_8;
        Extras.Builder builder = new Extras.Builder(sv2.P(imageRequest.getDefaults().getExtras().asMap(), imageRequest.getExtras().asMap()));
        if (bitmapConfig != ImageRequests_androidKt.getBitmapConfig(imageRequest)) {
            builder = builder.set(ImageRequests_androidKt.getBitmapConfig(Extras.Key.Companion), bitmapConfig);
        }
        if (z != ImageRequests_androidKt.getAllowRgb565(imageRequest)) {
            builder = builder.set(ImageRequests_androidKt.getAllowRgb565(Extras.Key.Companion), Boolean.valueOf(z));
        }
        return builder.build();
    }

    private final Precision resolvePrecision(ImageRequest imageRequest, SizeResolver sizeResolver) {
        return (imageRequest.getDefined().getSizeResolver() == null && j42.c(sizeResolver, SizeResolver.ORIGINAL)) ? Precision.INEXACT : ((imageRequest.getTarget() instanceof ViewTarget) && (sizeResolver instanceof ViewSizeResolver) && (((ViewTarget) imageRequest.getTarget()).getView() instanceof ImageView) && ((ViewTarget) imageRequest.getTarget()).getView() == ((ViewSizeResolver) sizeResolver).getView()) ? Precision.INEXACT : Precision.EXACT;
    }

    private final Scale resolveScale(ImageRequest imageRequest) {
        Target target = imageRequest.getTarget();
        ViewTarget viewTarget = target instanceof ViewTarget ? (ViewTarget) target : null;
        KeyEvent.Callback view = viewTarget != null ? viewTarget.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? Utils_androidKt.getScale(imageView) : imageRequest.getScale();
    }

    private final SizeResolver resolveSizeResolver(ImageRequest imageRequest) {
        ImageView.ScaleType scaleType;
        if (!(imageRequest.getTarget() instanceof ViewTarget)) {
            return SizeResolver.ORIGINAL;
        }
        View view = ((ViewTarget) imageRequest.getTarget()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? SizeResolver.ORIGINAL : ViewSizeResolverKt.ViewSizeResolver$default(view, false, 2, null);
    }

    @Override // coil3.request.RequestService
    public boolean isCacheValueValidForHardware(ImageRequest imageRequest, MemoryCache.Value value) {
        Image image = value.getImage();
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        return isConfigValidForHardware(imageRequest, BitmapsKt.getSafeConfig(bitmapImage.getBitmap()));
    }

    @Override // coil3.request.RequestService
    public Options options(ImageRequest imageRequest, Size size) {
        return new Options(imageRequest.getContext(), size, imageRequest.getScale(), imageRequest.getPrecision(), imageRequest.getDiskCacheKey(), imageRequest.getFileSystem(), imageRequest.getMemoryCachePolicy(), imageRequest.getDiskCachePolicy(), imageRequest.getNetworkCachePolicy(), resolveExtras(imageRequest, size));
    }

    @Override // coil3.request.RequestService
    public RequestDelegate requestDelegate(ImageRequest imageRequest, v52 v52Var, boolean z) {
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            li2 lifecycle = ImageRequests_androidKt.getLifecycle(imageRequest);
            if (lifecycle == null) {
                lifecycle = findLifecycle(imageRequest);
            }
            return new ViewTargetRequestDelegate(this.imageLoader, imageRequest, (ViewTarget) target, lifecycle, v52Var);
        }
        li2 lifecycle2 = ImageRequests_androidKt.getLifecycle(imageRequest);
        if (lifecycle2 == null) {
            lifecycle2 = z ? findLifecycle(imageRequest) : null;
        }
        return lifecycle2 != null ? new LifecycleRequestDelegate(lifecycle2, v52Var) : BaseRequestDelegate.m102boximpl(BaseRequestDelegate.m103constructorimpl(v52Var));
    }

    @Override // coil3.request.RequestService
    public Options updateOptions(Options options) {
        boolean z;
        Extras extras = options.getExtras();
        if (isBitmapConfigValidWorkerThread(options)) {
            z = false;
        } else {
            extras = extras.newBuilder().set(ImageRequests_androidKt.getBitmapConfig(Extras.Key.Companion), Bitmap.Config.ARGB_8888).build();
            z = true;
        }
        return z ? Options.copy$default(options, null, null, null, null, null, null, null, null, null, extras, 511, null) : options;
    }

    @Override // coil3.request.RequestService
    public ImageRequest updateRequest(ImageRequest imageRequest) {
        ImageRequest.Builder defaults = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(this.imageLoader.getDefaults());
        SizeResolver sizeResolver = imageRequest.getDefined().getSizeResolver();
        if (sizeResolver == null) {
            sizeResolver = resolveSizeResolver(imageRequest);
            defaults.size(sizeResolver);
        }
        if (imageRequest.getDefined().getScale() == null) {
            defaults.scale(resolveScale(imageRequest));
        }
        if (imageRequest.getDefined().getPrecision() == null) {
            defaults.precision(resolvePrecision(imageRequest, sizeResolver));
        }
        return defaults.build();
    }
}
