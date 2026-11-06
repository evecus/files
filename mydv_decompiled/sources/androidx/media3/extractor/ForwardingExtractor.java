package androidx.media3.extractor;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ForwardingExtractor implements Extractor {
    private final Extractor delegate;

    public ForwardingExtractor(Extractor extractor) {
        this.delegate = extractor;
    }

    @Override // androidx.media3.extractor.Extractor
    public List<SniffFailure> getSniffFailureDetails() {
        return this.delegate.getSniffFailureDetails();
    }

    @Override // androidx.media3.extractor.Extractor
    public Extractor getUnderlyingImplementation() {
        return this.delegate.getUnderlyingImplementation();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.delegate.init(extractorOutput);
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
        this.delegate.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return this.delegate.sniff(extractorInput);
    }
}
