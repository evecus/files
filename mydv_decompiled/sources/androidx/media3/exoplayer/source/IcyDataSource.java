package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import defpackage.sp0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class IcyDataSource implements DataSource {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final DataSource upstream;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i, Listener listener) {
        sp0.o(i > 0);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i;
    }

    private boolean readMetadata() {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.upstream.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.listener.onIcyMetadata(new ParsableByteArray(bArr, i));
        }
        return true;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.bytesUntilMetadata;
        if (i3 == 0) {
            if (!readMetadata()) {
                return -1;
            }
            i3 = this.metadataIntervalBytes;
            this.bytesUntilMetadata = i3;
        }
        int read = this.upstream.read(bArr, i, Math.min(i3, i2));
        if (read != -1) {
            this.bytesUntilMetadata -= read;
        }
        return read;
    }
}
