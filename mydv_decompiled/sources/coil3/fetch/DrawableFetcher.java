package coil3.fetch;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.fetch.Fetcher;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.util.DrawableUtils;
import coil3.util.Utils_androidKt;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DrawableFetcher implements Fetcher {
    private final Drawable data;
    private final Options options;

    public DrawableFetcher(Drawable drawable, Options options) {
        this.data = drawable;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        Drawable drawable;
        boolean isVector = Utils_androidKt.isVector(this.data);
        if (isVector) {
            drawable = new BitmapDrawable(this.options.getContext().getResources(), DrawableUtils.INSTANCE.convertToBitmap(this.data, ImageRequests_androidKt.getBitmapConfig(this.options), this.options.getSize(), this.options.getScale(), ImageRequestsKt.getMaxBitmapSize(this.options), this.options.getPrecision() == Precision.INEXACT));
        } else {
            drawable = this.data;
        }
        return new ImageFetchResult(Image_androidKt.asImage(drawable), isVector, DataSource.MEMORY);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Drawable> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Drawable drawable, Options options, ImageLoader imageLoader) {
            return new DrawableFetcher(drawable, options);
        }
    }
}
