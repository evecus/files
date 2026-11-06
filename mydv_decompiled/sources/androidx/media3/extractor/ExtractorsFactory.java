package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.or0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new or0(14);

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

    @Deprecated
    ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z);

    ExtractorsFactory setParseHagcMetadata(boolean z);

    /* renamed from: setSubtitleParserFactory */
    ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory);
}
