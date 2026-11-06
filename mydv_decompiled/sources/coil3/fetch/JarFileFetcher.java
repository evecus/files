package coil3.fetch;

import coil3.ImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import coil3.util.FileSystemsKt;
import coil3.util.MimeTypeMap;
import defpackage.fj0;
import defpackage.g06;
import defpackage.j42;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.ny5;
import defpackage.o63;
import defpackage.ok3;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class JarFileFetcher implements Fetcher {
    private final Options options;
    private final Uri uri;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final boolean isApplicable(Uri uri) {
            return j42.c(uri.getScheme(), "jar:file");
        }

        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (isApplicable(uri)) {
                return new JarFileFetcher(uri, options);
            }
            return null;
        }
    }

    public JarFileFetcher(Uri uri, Options options) {
        this.uri = uri;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        String path = this.uri.getPath();
        if (path == null) {
            path = "";
        }
        int I = jx4.I(path, '!', 0, 6);
        if (I == -1) {
            s83.k(this.uri, "Invalid jar:file URI: ");
            return null;
        }
        String str = ok3.J;
        ok3 f = o63.f(path.substring(0, I));
        ok3 f2 = o63.f(path.substring(I + 1, path.length()));
        ke1 fileSystem = this.options.getFileSystem();
        fileSystem.getClass();
        return new SourceFetchResult(ImageSourceKt.ImageSource$default(f2, g06.d(f, fileSystem, new ny5((byte) 3)), null, null, null, 28, null), MimeTypeMap.INSTANCE.getMimeTypeFromExtension(FileSystemsKt.getExtension(f2)), DataSource.DISK);
    }
}
