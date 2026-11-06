package coil3.fetch;

import coil3.ImageLoader;
import coil3.Uri;
import coil3.UriKt;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.FileSystemsKt;
import coil3.util.MimeTypeMap;
import coil3.util.UtilsKt;
import defpackage.fj0;
import defpackage.o63;
import defpackage.ok3;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class FileUriFetcher implements Fetcher {
    private final Options options;
    private final Uri uri;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (UtilsKt.isFileUri(uri)) {
                return new FileUriFetcher(uri, options);
            }
            return null;
        }
    }

    public FileUriFetcher(Uri uri, Options options) {
        this.uri = uri;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        String str = ok3.J;
        String filePath = UriKt.getFilePath(this.uri);
        if (filePath != null) {
            ok3 f = o63.f(filePath);
            return new SourceFetchResult(ImageSourceKt.ImageSource$default(f, this.options.getFileSystem(), null, null, null, 28, null), MimeTypeMap.INSTANCE.getMimeTypeFromExtension(FileSystemsKt.getExtension(f)), DataSource.DISK);
        }
        zy.i("filePath == null");
        return null;
    }
}
