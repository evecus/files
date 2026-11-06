package androidx.media3.datasource;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TeeDataSource implements DataSource {
    private long bytesRemaining;
    private final DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final DataSource upstream;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        dataSource.getClass();
        this.upstream = dataSource;
        dataSink.getClass();
        this.dataSink = dataSink;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        try {
            this.upstream.close();
        } finally {
            if (this.dataSinkNeedsClosing) {
                this.dataSinkNeedsClosing = false;
                this.dataSink.close();
            }
        }
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
        long open = this.upstream.open(dataSpec);
        this.bytesRemaining = open;
        if (open == 0) {
            return 0L;
        }
        if (dataSpec.length == -1 && open != -1) {
            dataSpec = dataSpec.subrange(0L, open);
        }
        this.dataSinkNeedsClosing = true;
        this.dataSink.open(dataSpec);
        return this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int read = this.upstream.read(bArr, i, i2);
        if (read > 0) {
            this.dataSink.write(bArr, i, read);
            long j = this.bytesRemaining;
            if (j != -1) {
                this.bytesRemaining = j - read;
            }
        }
        return read;
    }
}
