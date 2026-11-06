package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.sp0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {
    private static final String TAG = "SubtitleTranscodingTO";
    private Format currentFormat;
    private SubtitleParser currentSubtitleParser;
    private final TrackOutput delegate;
    private boolean shouldSuppressParsingErrors;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final CueEncoder cueEncoder = new CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray parsableScratch = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    private void ensureSampleDataCapacity(int i) {
        int length = this.sampleData.length;
        int i2 = this.sampleDataEnd;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.sampleDataStart;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i3);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i3;
        this.sampleData = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outputSample, reason: merged with bridge method [inline-methods] */
    public void lambda$sampleMetadata$0(CuesWithTiming cuesWithTiming, long j, int i) {
        long j2;
        this.currentFormat.getClass();
        byte[] encode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(encode);
        this.delegate.sampleData(this.parsableScratch, encode.length);
        long j3 = cuesWithTiming.startTimeUs;
        Format format = this.currentFormat;
        if (j3 == C.TIME_UNSET) {
            sp0.z(format.subsampleOffsetUs == Long.MAX_VALUE);
            j2 = j;
        } else {
            long j4 = format.subsampleOffsetUs;
            j2 = j4 == Long.MAX_VALUE ? j3 + j : j3 + j4;
        }
        this.delegate.sampleMetadata(j2, i | 1, encode.length, 0, null);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        format.sampleMimeType.getClass();
        sp0.o(MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        TrackOutput trackOutput = this.delegate;
        if (subtitleParser == null) {
            trackOutput.format(format);
        } else {
            trackOutput.format(format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).build());
        }
    }

    public void resetSubtitleParser() {
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z, int i2) {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i, z, i2);
        }
        ensureSampleDataCapacity(i);
        int read = dataReader.read(this.sampleData, this.sampleDataEnd, i);
        if (read != -1) {
            this.sampleDataEnd += read;
            return read;
        }
        if (z) {
            return -1;
        }
        zy.c();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(final long r5, final int r7, int r8, int r9, androidx.media3.extractor.TrackOutput.CryptoData r10) {
        /*
            r4 = this;
            androidx.media3.extractor.text.SubtitleParser r0 = r4.currentSubtitleParser
            if (r0 != 0) goto La
            androidx.media3.extractor.TrackOutput r4 = r4.delegate
            r4.sampleMetadata(r5, r7, r8, r9, r10)
            return
        La:
            r1 = 0
            if (r10 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = r1
        L10:
            java.lang.String r0 = "DRM on subtitles is not supported"
            defpackage.sp0.p(r10, r0)
            int r10 = r4.sampleDataEnd
            int r10 = r10 - r9
            int r10 = r10 - r8
            r2 = r5
            androidx.media3.extractor.text.SubtitleParser r5 = r4.currentSubtitleParser     // Catch: java.lang.RuntimeException -> L30
            byte[] r6 = r4.sampleData     // Catch: java.lang.RuntimeException -> L30
            androidx.media3.extractor.text.SubtitleParser$OutputOptions r9 = androidx.media3.extractor.text.SubtitleParser.OutputOptions.allCues()     // Catch: java.lang.RuntimeException -> L30
            r0 = r7
            r7 = r10
            androidx.media3.extractor.text.c r10 = new androidx.media3.extractor.text.c     // Catch: java.lang.RuntimeException -> L2d
            r10.<init>()     // Catch: java.lang.RuntimeException -> L2d
            r5.parse(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L2d
            goto L3e
        L2d:
            r0 = move-exception
        L2e:
            r5 = r0
            goto L33
        L30:
            r0 = move-exception
            r7 = r10
            goto L2e
        L33:
            boolean r6 = r4.shouldSuppressParsingErrors
            if (r6 == 0) goto L4b
            java.lang.String r6 = "SubtitleTranscodingTO"
            java.lang.String r9 = "Parsing subtitles failed, ignoring sample."
            androidx.media3.common.util.Log.w(r6, r9, r5)
        L3e:
            int r10 = r7 + r8
            r4.sampleDataStart = r10
            int r5 = r4.sampleDataEnd
            if (r10 != r5) goto L4a
            r4.sampleDataStart = r1
            r4.sampleDataEnd = r1
        L4a:
            return
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.SubtitleTranscodingTrackOutput.sampleMetadata(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public void shouldSuppressParsingErrors(boolean z) {
        this.shouldSuppressParsingErrors = z;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void durationUs(long j) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i, i2);
            return;
        }
        ensureSampleDataCapacity(i);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i);
        this.sampleDataEnd += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z) {
        return sampleData(dataReader, i, z, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }
}
