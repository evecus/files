package coil3.fetch;

import coil3.ImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.AssetMetadata;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import coil3.util.Utils_androidKt;
import defpackage.fj0;
import defpackage.o70;
import defpackage.s04;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AssetUriFetcher implements Fetcher {
    private final Uri data;
    private final Options options;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (Utils_androidKt.isAssetUri(uri)) {
                return new AssetUriFetcher(uri, options);
            }
            return null;
        }
    }

    public AssetUriFetcher(Uri uri, Options options) {
        this.data = uri;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        String Z0 = o70.Z0(o70.Q0(UriKt.getPathSegments(this.data), 1), "/", null, null, 0, null, 62);
        return new SourceFetchResult(ImageSourceKt.ImageSource(new s04(sp0.e0(this.options.getContext().getAssets().open(Z0))), this.options.getFileSystem(), new AssetMetadata(Z0)), MimeTypeMap.INSTANCE.getMimeTypeFromUrl(Z0), DataSource.DISK);
    }
}
