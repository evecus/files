package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@Deprecated
/* loaded from: classes2.dex */
public final class SingleSampleMediaChunk extends BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final Format sampleFormat;
    private final int trackType;

    public SingleSampleMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(dataSource, dataSpec, format, i, obj, j, j2, C.TIME_UNSET, C.TIME_UNSET, j3);
        this.trackType = i2;
        this.sampleFormat = format2;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        int i = 0;
        TrackOutput track = output.track(0, this.trackType);
        track.format(this.sampleFormat);
        try {
            long open = this.dataSource.open(this.dataSpec.subrange(this.nextLoadPosition));
            if (open != -1) {
                open += this.nextLoadPosition;
            }
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.dataSource, this.nextLoadPosition, open);
            while (true) {
                long j = this.nextLoadPosition;
                if (i == -1) {
                    track.sampleMetadata(this.startTimeUs, 1, (int) j, 0, null);
                    DataSourceUtil.closeQuietly(this.dataSource);
                    this.loadCompleted = true;
                    return;
                }
                this.nextLoadPosition = j + i;
                i = track.sampleData((DataReader) defaultExtractorInput, Log.LOG_LEVEL_OFF, true);
            }
        } catch (Throwable th) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
    }
}
