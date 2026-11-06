package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ForwardingExtractorsFactory implements ExtractorsFactory {
    private final ExtractorsFactory factory;

    public ForwardingExtractorsFactory(ExtractorsFactory extractorsFactory) {
        this.factory = extractorsFactory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return this.factory.createExtractors();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this.factory.mo364experimentalSetCodecsToParseWithinGopSampleDependencies(i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this.factory.experimentalSetTextTrackTranscodingEnabled(z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory setParseHagcMetadata(boolean z) {
        return this.factory.setParseHagcMetadata(z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this.factory.mo365setSubtitleParserFactory(factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return this.factory.createExtractors(uri, map);
    }
}
