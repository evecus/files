package androidx.media3.extractor.text;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@Deprecated
/* loaded from: classes2.dex */
public class SubtitleTranscodingExtractor implements Extractor {
    private final Extractor delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private SubtitleTranscodingExtractorOutput transcodingExtractorOutput;

    public SubtitleTranscodingExtractor(Extractor extractor, SubtitleParser.Factory factory) {
        this.delegate = extractor;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.Extractor
    public final List getSniffFailureDetails() {
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    @Override // androidx.media3.extractor.Extractor
    public Extractor getUnderlyingImplementation() {
        return this.delegate;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        this.transcodingExtractorOutput = subtitleTranscodingExtractorOutput;
        this.delegate.init(subtitleTranscodingExtractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.delegate.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.transcodingExtractorOutput;
        if (subtitleTranscodingExtractorOutput != null) {
            subtitleTranscodingExtractorOutput.resetSubtitleParsers();
        }
        this.delegate.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return this.delegate.sniff(extractorInput);
    }
}
