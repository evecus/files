package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface ChunkExtractor {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List<Format> list, TrackOutput trackOutput, PlayerId playerId);

        Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

        Format getOutputTextFormat(Format format);

        Factory setSubtitleParserFactory(SubtitleParser.Factory factory);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface TrackOutputProvider {
        TrackOutput track(int i, int i2);
    }

    ChunkIndex getChunkIndex();

    Format[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(ExtractorInput extractorInput);

    void release();
}
