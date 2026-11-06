package androidx.media3.datasource;

import android.net.Uri;
import defpackage.sp0;
import defpackage.w7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private byte[] data;
    private boolean opened;
    private int readPosition;
    private Uri uri;
    private final UriResolver uriResolver;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface UriResolver {
        byte[] resolve(Uri uri);
    }

    public ByteArrayDataSource(byte[] bArr) {
        this(new w7(bArr, (byte) 4));
        sp0.o(bArr.length > 0);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        byte[] resolve = this.uriResolver.resolve(uri);
        this.data = resolve;
        long j = dataSpec.position;
        if (j > resolve.length) {
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.readPosition = i;
        int length = resolve.length - i;
        this.bytesRemaining = length;
        long j2 = dataSpec.length;
        if (j2 != -1) {
            this.bytesRemaining = (int) Math.min(length, j2);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.data;
        bArr2.getClass();
        System.arraycopy(bArr2, this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        uriResolver.getClass();
        this.uriResolver = uriResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$new$0(byte[] bArr, Uri uri) {
        return bArr;
    }
}
