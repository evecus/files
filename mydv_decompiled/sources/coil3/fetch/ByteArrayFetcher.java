package coil3.fetch;

import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import defpackage.cz;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ByteArrayFetcher implements Fetcher {
    private final byte[] byteArray;
    private final Options options;

    public ByteArrayFetcher(byte[] bArr, Options options) {
        this.byteArray = bArr;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        cz czVar = new cz();
        byte[] bArr = this.byteArray;
        bArr.getClass();
        czVar.m196write(bArr, 0, bArr.length);
        return new SourceFetchResult(ImageSourceKt.ImageSource$default(czVar, this.options.getFileSystem(), null, 4, null), null, DataSource.MEMORY);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<byte[]> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(byte[] bArr, Options options, ImageLoader imageLoader) {
            return new ByteArrayFetcher(bArr, options);
        }
    }
}
