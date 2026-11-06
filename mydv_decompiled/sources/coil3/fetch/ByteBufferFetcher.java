package coil3.fetch;

import coil3.ImageLoader;
import coil3.decode.ByteBufferMetadata;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import defpackage.fj0;
import defpackage.sv2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ByteBufferFetcher implements Fetcher {
    private final ByteBuffer data;
    private final Options options;

    public ByteBufferFetcher(ByteBuffer byteBuffer, Options options) {
        this.data = byteBuffer;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        return new SourceFetchResult(ImageSourceKt.ImageSource(sv2.m(ByteBufferFetcherKt.asSource(this.data)), this.options.getFileSystem(), new ByteBufferMetadata(this.data)), null, DataSource.MEMORY);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<ByteBuffer> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(ByteBuffer byteBuffer, Options options, ImageLoader imageLoader) {
            return new ByteBufferFetcher(byteBuffer, options);
        }
    }
}
