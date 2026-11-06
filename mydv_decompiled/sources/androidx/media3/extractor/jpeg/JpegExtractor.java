package androidx.media3.extractor.jpeg;

import android.util.Pair;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import defpackage.jp0;
import defpackage.sp0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class JpegExtractor implements Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private static final int JPEG_FILE_SIGNATURE = 65496;
    private static final int JPEG_FILE_SIGNATURE_LENGTH = 2;
    private Extractor activeExtractor;
    private ExtractorOutput extractorOutput;
    private final Extractor imageExtractor;
    private Pair<Long, Long> pendingSeek;
    private final Extractor videoExtractor;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    public JpegExtractor(int i) {
        this.imageExtractor = new SingleSampleExtractor(JPEG_FILE_SIGNATURE, 2, "image/jpeg");
        this.videoExtractor = (i & 1) == 0 ? new JpegMotionPhotoExtractor() : null;
    }

    @EnsuresNonNull({"this.activeExtractor"})
    private void assignActiveExtractor(ExtractorInput extractorInput) {
        sp0.z(this.activeExtractor == null);
        Extractor extractor = this.videoExtractor;
        extractor.getClass();
        this.activeExtractor = extractor.sniff(extractorInput) ? this.videoExtractor : this.imageExtractor;
        extractorInput.resetPeekPosition();
        Pair<Long, Long> pair = this.pendingSeek;
        if (pair != null) {
            this.activeExtractor.seek(((Long) pair.first).longValue(), ((Long) this.pendingSeek.second).longValue());
            this.pendingSeek = null;
        }
        Extractor extractor2 = this.activeExtractor;
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractor2.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.videoExtractor == null) {
            Extractor extractor = this.imageExtractor;
            this.activeExtractor = extractor;
            extractor.init(extractorOutput);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.activeExtractor == null) {
            assignActiveExtractor(extractorInput);
        }
        return this.activeExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        Extractor extractor = this.videoExtractor;
        if (extractor != null) {
            extractor.release();
        }
        this.imageExtractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        Extractor extractor = this.activeExtractor;
        if (extractor != null) {
            extractor.seek(j, j2);
        } else {
            this.pendingSeek = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        Extractor extractor = this.videoExtractor;
        if (extractor != null && extractor.sniff(extractorInput)) {
            return true;
        }
        extractorInput.resetPeekPosition();
        return this.imageExtractor.sniff(extractorInput);
    }

    public JpegExtractor() {
        this(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }
}
