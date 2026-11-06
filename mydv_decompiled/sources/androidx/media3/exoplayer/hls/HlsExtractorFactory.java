package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface HlsExtractorFactory {

    @Deprecated
    public static final HlsExtractorFactory DEFAULT = new DefaultHlsExtractorFactory();

    HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput, PlayerId playerId);

    HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z);

    HlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

    Format getOutputTextFormat(Format format);

    HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory);
}
