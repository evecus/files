package coil3;

import android.graphics.Bitmap;
import coil3.decode.DecodeResult;
import coil3.decode.Decoder;
import coil3.fetch.FetchResult;
import coil3.fetch.Fetcher;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.SuccessResult;
import coil3.size.Size;
import coil3.size.SizeResolver;
import coil3.transition.Transition;
import defpackage.er0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class EventListener implements ImageRequest.Listener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: coil3.EventListener$Companion$NONE$1
    };

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Factory NONE = new zy(25);

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        EventListener create(ImageRequest imageRequest);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onCancel(ImageRequest imageRequest) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onStart(ImageRequest imageRequest) {
    }

    public void keyEnd(ImageRequest imageRequest, String str) {
    }

    public void keyStart(ImageRequest imageRequest, Object obj) {
    }

    public void mapEnd(ImageRequest imageRequest, Object obj) {
    }

    public void mapStart(ImageRequest imageRequest, Object obj) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
    }

    public void resolveSizeEnd(ImageRequest imageRequest, Size size) {
    }

    public void resolveSizeStart(ImageRequest imageRequest, SizeResolver sizeResolver) {
    }

    public void transformEnd(ImageRequest imageRequest, Bitmap bitmap) {
    }

    public void transformStart(ImageRequest imageRequest, Bitmap bitmap) {
    }

    public void transitionEnd(ImageRequest imageRequest, Transition transition) {
    }

    public void transitionStart(ImageRequest imageRequest, Transition transition) {
    }

    public void decodeStart(ImageRequest imageRequest, Decoder decoder, Options options) {
    }

    public void fetchStart(ImageRequest imageRequest, Fetcher fetcher, Options options) {
    }

    public void decodeEnd(ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
    }

    public void fetchEnd(ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
    }
}
