package androidx.media3.extractor.bmp;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import defpackage.jp0;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BmpExtractor implements Extractor {
    private static final int BMP_FILE_SIGNATURE = 16973;
    private static final int BMP_FILE_SIGNATURE_LENGTH = 2;
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(BMP_FILE_SIGNATURE, 2, MimeTypes.IMAGE_BMP);

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.imageExtractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.imageExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.imageExtractor.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return this.imageExtractor.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
