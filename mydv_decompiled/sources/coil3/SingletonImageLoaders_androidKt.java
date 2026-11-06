package coil3;

import android.content.Context;
import android.widget.ImageView;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.util.CoilUtils;
import defpackage.tm1;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonImageLoaders_androidKt {
    public static final void dispose(ImageView imageView) {
        CoilUtils.dispose(imageView);
    }

    public static final ImageLoader getImageLoader(Context context) {
        return SingletonImageLoader.get(context);
    }

    public static final ImageResult getResult(ImageView imageView) {
        return CoilUtils.result(imageView);
    }

    public static final Disposable load(ImageView imageView, Object obj, ImageLoader imageLoader, tm1 tm1Var) {
        ImageRequest.Builder target = ImageRequests_androidKt.target(new ImageRequest.Builder(imageView.getContext()).data(obj), imageView);
        tm1Var.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static /* synthetic */ Disposable load$default(ImageView imageView, Object obj, ImageLoader imageLoader, tm1 tm1Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            imageLoader = SingletonImageLoader.get(imageView.getContext());
        }
        if ((i & 4) != 0) {
            tm1Var = new tm1() { // from class: coil3.SingletonImageLoaders_androidKt$load$1
                @Override // defpackage.tm1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((ImageRequest.Builder) obj3);
                    return wd5.a;
                }

                public final void invoke(ImageRequest.Builder builder) {
                }
            };
        }
        ImageRequest.Builder target = ImageRequests_androidKt.target(new ImageRequest.Builder(imageView.getContext()).data(obj), imageView);
        tm1Var.invoke(target);
        return imageLoader.enqueue(target.build());
    }
}
