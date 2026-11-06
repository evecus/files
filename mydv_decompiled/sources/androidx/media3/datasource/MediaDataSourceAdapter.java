package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class MediaDataSourceAdapter extends BaseDataSource {
    private long bytesRemaining;
    private final MediaDataSource mediaDataSource;
    private boolean opened;
    private long position;
    private Uri uri;

    public MediaDataSourceAdapter(MediaDataSource mediaDataSource, boolean z) {
        super(z);
        this.mediaDataSource = mediaDataSource;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        long size;
        this.uri = dataSpec.uri;
        this.position = dataSpec.position;
        transferInitializing(dataSpec);
        if (this.mediaDataSource.getSize() != -1 && this.position > this.mediaDataSource.getSize()) {
            throw new DataSourceException(2008);
        }
        if (this.mediaDataSource.getSize() == -1) {
            this.bytesRemaining = -1L;
            size = -1;
        } else {
            size = this.mediaDataSource.getSize() - this.position;
            this.bytesRemaining = size;
        }
        long j = dataSpec.length;
        if (j != -1) {
            if (size != -1) {
                j = Math.min(size, j);
            }
            this.bytesRemaining = j;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j2 = dataSpec.length;
        return j2 != -1 ? j2 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int readAt = this.mediaDataSource.readAt(this.position, bArr, i, i2);
            if (readAt == -1) {
                return -1;
            }
            long j2 = readAt;
            this.position += j2;
            long j3 = this.bytesRemaining;
            if (j3 != -1) {
                this.bytesRemaining = j3 - j2;
            }
            bytesTransferred(readAt);
            return readAt;
        } catch (IOException e) {
            throw new DataSourceException(e, 2000);
        }
    }
}
