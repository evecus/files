package androidx.media3.extractor.avif;

import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import defpackage.jp0;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AvifExtractor implements Extractor {
    private static final int AVIF_FILE_SIGNATURE_PART_1 = 1718909296;
    private static final int AVIF_FILE_SIGNATURE_PART_2 = 1635150182;
    private static final int FILE_SIGNATURE_SEGMENT_LENGTH = 4;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(-1, -1, MimeTypes.IMAGE_AVIF);

    private boolean readAndCompareFourBytes(ExtractorInput extractorInput, int i) {
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        return this.scratch.readUnsignedInt() == ((long) i);
    }

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
        extractorInput.advancePeekPosition(4);
        return readAndCompareFourBytes(extractorInput, 1718909296) && readAndCompareFourBytes(extractorInput, AVIF_FILE_SIGNATURE_PART_2);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
