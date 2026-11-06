package coil3.fetch;

import android.graphics.Bitmap;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class BitmapFetcher implements Fetcher {
    private final Bitmap data;

    public BitmapFetcher(Bitmap bitmap) {
        this.data = bitmap;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        return new ImageFetchResult(Image_androidKt.asImage$default(this.data, false, 1, null), false, DataSource.MEMORY);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Bitmap bitmap, Options options, ImageLoader imageLoader) {
            return new BitmapFetcher(bitmap);
        }
    }
}
