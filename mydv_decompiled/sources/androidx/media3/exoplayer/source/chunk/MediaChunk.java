package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, String str) {
        super(dataSource, dataSpec, 1, format, i, obj, j, j2, str);
        format.getClass();
        this.chunkIndex = j3;
    }

    public long getNextChunkIndex() {
        long j = this.chunkIndex;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
