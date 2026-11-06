package androidx.media3.exoplayer.source;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private Extractor extractor;
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public String getUnderlyingImplementationName() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            return extractor.getUnderlyingImplementation().getClass().getSimpleName();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(androidx.media3.common.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, androidx.media3.extractor.ExtractorOutput r15) {
        /*
            r7 = this;
            androidx.media3.extractor.DefaultExtractorInput r1 = new androidx.media3.extractor.DefaultExtractorInput
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.extractorInput = r1
            androidx.media3.extractor.Extractor r8 = r7.extractor
            if (r8 == 0) goto Lf
            return
        Lf:
            androidx.media3.extractor.ExtractorsFactory r8 = r7.extractorsFactory
            androidx.media3.extractor.Extractor[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            zx1 r10 = defpackage.dy1.o(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.extractor = r8
            goto L81
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7c
            r0 = r8[r14]
            boolean r2 = r0.sniff(r1)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6c
            if (r2 == 0) goto L3a
            r7.extractor = r0     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6c
            r1.resetPeekPosition()
            goto L7c
        L37:
            r0 = move-exception
            r8 = r0
            goto L58
        L3a:
            java.util.List r0 = r0.getSniffFailureDetails()     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6c
            r10.d(r0)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6c
            androidx.media3.extractor.Extractor r0 = r7.extractor
            if (r0 != 0) goto L50
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4e
            goto L50
        L4e:
            r0 = r12
            goto L51
        L50:
            r0 = r13
        L51:
            defpackage.sp0.z(r0)
            r1.resetPeekPosition()
            goto L79
        L58:
            androidx.media3.extractor.Extractor r7 = r7.extractor
            if (r7 != 0) goto L64
            long r9 = r1.getPosition()
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L65
        L64:
            r12 = r13
        L65:
            defpackage.sp0.z(r12)
            r1.resetPeekPosition()
            throw r8
        L6c:
            androidx.media3.extractor.Extractor r0 = r7.extractor
            if (r0 != 0) goto L50
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4e
            goto L50
        L79:
            int r14 = r14 + 1
            goto L27
        L7c:
            androidx.media3.extractor.Extractor r7 = r7.extractor
            if (r7 == 0) goto L85
            r8 = r7
        L81:
            r8.init(r15)
            return
        L85:
            androidx.media3.exoplayer.source.UnrecognizedInputFormatException r7 = new androidx.media3.exoplayer.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "None of the available extractors ("
            r11.<init>(r13)
            g62 r13 = defpackage.g62.d()
            x24 r8 = defpackage.dy1.q(r8)
            qz r14 = new qz
            r14.<init>(r12)
            java.util.AbstractList r8 = defpackage.sv2.a0(r8, r14)
            java.lang.String r8 = r13.c(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            x24 r10 = r10.f()
            r7.<init>(r8, r9, r10)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.BundledExtractorsAdapter.init(androidx.media3.common.DataReader, android.net.Uri, java.util.Map, long, long, androidx.media3.extractor.ExtractorOutput):void");
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) {
        Extractor extractor = this.extractor;
        extractor.getClass();
        ExtractorInput extractorInput = this.extractorInput;
        extractorInput.getClass();
        return extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        Extractor extractor = this.extractor;
        extractor.getClass();
        extractor.seek(j, j2);
    }
}
