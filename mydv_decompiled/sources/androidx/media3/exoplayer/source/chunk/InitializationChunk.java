package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DefaultExtractorInput;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class InitializationChunk extends Chunk {
    private final ChunkExtractor chunkExtractor;
    private ChunkIndex chunkIndex;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, format, i, obj, C.TIME_UNSET, C.TIME_UNSET, null);
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public ChunkIndex getChunkIndex() {
        return this.chunkIndex;
    }

    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.trackOutputProvider = trackOutputProvider;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        if (this.nextLoadPosition == 0) {
            this.chunkExtractor.init(this.trackOutputProvider, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, subrange.position, statsDataSource.open(subrange));
            while (!this.loadCanceled && this.chunkExtractor.read(defaultExtractorInput)) {
                try {
                } finally {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    this.chunkIndex = this.chunkExtractor.getChunkIndex();
                }
            }
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
