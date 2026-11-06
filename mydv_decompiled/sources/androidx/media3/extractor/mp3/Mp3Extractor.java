package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Seeker;
import defpackage.jp0;
import defpackage.js0;
import defpackage.sp0;
import defpackage.vt0;
import defpackage.zl1;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 16;
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SEARCH_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private long endPositionOfLastSampleRead;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private Metadata id3Metadata;
    private final Id3Peeker id3Peeker;
    private boolean isSeekInProgress;
    private TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private long seekTimeUs;
    private Seeker seeker;
    private final TrackOutput skippingTrackOutput;
    private final MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    private Metadata xingMetadata;
    public static final ExtractorsFactory FACTORY = new zl1(24);
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new zl1(25);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    public Mp3Extractor(int i, long j) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.forcedFirstSampleTimestampUs = j;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioUtil.Header();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
        this.endPositionOfLastSampleRead = -1L;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        this.realTrackOutput.getClass();
        Util.castNonNull(this.extractorOutput);
    }

    private long computeFinalIndexSeekerDurationUs(long j) {
        if (this.gaplessInfoHolder.hasGaplessInfo()) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            j = (j - gaplessInfoHolder.encoderDelay) - gaplessInfoHolder.encoderPadding;
        }
        return j >= 0 ? computeTimeUs(j) : C.TIME_UNSET;
    }

    private Seeker computeSeeker(ExtractorInput extractorInput) {
        Seeker maybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        MlltSeeker maybeHandleSeekMetadata = maybeHandleSeekMetadata(this.id3Metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new Seeker.UnseekableSeeker();
        }
        if (maybeHandleSeekMetadata != null) {
            maybeReadSeekFrame = maybeHandleSeekMetadata;
        } else if (maybeReadSeekFrame == null) {
            maybeReadSeekFrame = getConstantBitrateSeeker(extractorInput);
        }
        if ((this.flags & 4) != 0 && !maybeReadSeekFrame.isSeekable()) {
            return new IndexSeeker(maybeReadSeekFrame.getDurationUs(), extractorInput.getPosition(), maybeReadSeekFrame.getDataEndPosition());
        }
        if (maybeReadSeekFrame instanceof ConstantBitrateSeeker) {
            return maybeReadSeekFrame;
        }
        if (!shouldFallbackToConstantBitrateSeeking(maybeReadSeekFrame)) {
            return maybeReadSeekFrame;
        }
        long durationUs = maybeReadSeekFrame.getDurationUs();
        long dataEndPosition = maybeReadSeekFrame.getDataEndPosition() != -1 ? maybeReadSeekFrame.getDataEndPosition() : extractorInput.getLength();
        if (durationUs == C.TIME_UNSET || dataEndPosition == -1) {
            return getConstantBitrateSeeker(extractorInput);
        }
        long dataStartPosition = maybeReadSeekFrame.getDataStartPosition() != -1 ? maybeReadSeekFrame.getDataStartPosition() : 0L;
        int computeAverageBitrate = Mp3Util.computeAverageBitrate(dataEndPosition - dataStartPosition, durationUs);
        return computeAverageBitrate == -2147483647 ? getConstantBitrateSeeker(extractorInput) : new ConstantBitrateSeeker(dataEndPosition, dataStartPosition, computeAverageBitrate, -1, false, durationUs);
    }

    private long computeTimeUs(long j) {
        return ((j * 1000000) / this.synchronizedHeader.sampleRate) + this.basisTimeUs;
    }

    private Seeker getConstantBitrateSeeker(long j, XingFrame xingFrame, long j2) {
        long j3;
        long j4;
        long computeDurationUs = xingFrame.computeDurationUs();
        if (computeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j5 = xingFrame.dataSize;
        if (j5 != -1) {
            j4 = j + j5;
            j3 = j5 - xingFrame.header.frameSize;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - xingFrame.header.frameSize;
            j4 = j2;
        }
        int computeAverageBitrate = Mp3Util.computeAverageBitrate(j3, computeDurationUs);
        if (computeAverageBitrate == -2147483647) {
            return null;
        }
        return new ConstantBitrateSeeker(j4, xingFrame.header.frameSize + j, computeAverageBitrate, sp0.B(vt0.n(j3, xingFrame.frameCount, RoundingMode.HALF_UP)), false, computeDurationUs);
    }

    private static long getId3TlenUs(Metadata metadata) {
        TextInformationFrame textInformationFrame;
        return (metadata == null || (textInformationFrame = (TextInformationFrame) metadata.getFirstMatchingEntry(TextInformationFrame.class, new js0((byte) 2))) == null) ? C.TIME_UNSET : Util.msToUs(Long.parseLong((String) textInformationFrame.values.get(0)));
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.limit() >= i + 4) {
            parsableByteArray.setPosition(i);
            int readInt = parsableByteArray.readInt();
            if (readInt == SEEK_HEADER_XING || readInt == SEEK_HEADER_INFO) {
                return readInt;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & MPEG_AUDIO_HEADER_MASK)) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getId3TlenUs$2(TextInformationFrame textInformationFrame) {
        return textInformationFrame.id.equals("TLEN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp3Extractor()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    private static MlltSeeker maybeHandleSeekMetadata(Metadata metadata, long j) {
        MlltFrame mlltFrame;
        if (metadata == null || (mlltFrame = (MlltFrame) metadata.getFirstEntryOfType(MlltFrame.class)) == null) {
            return null;
        }
        return MlltSeeker.create(j, mlltFrame, getId3TlenUs(metadata));
    }

    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) {
        int i;
        int i2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        MpegAudioUtil.Header header = this.synchronizedHeader;
        int i3 = 21;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i3 = 36;
            }
        } else if (header.channels == 1) {
            i3 = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i3);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                VbriSeeker create = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return create;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        XingFrame parse = XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && (i = parse.encoderDelay) != -1 && (i2 = parse.encoderPadding) != -1) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            gaplessInfoHolder.encoderDelay = i;
            gaplessInfoHolder.encoderPadding = i2;
        }
        this.xingMetadata = parse.getMetadata();
        long position = extractorInput.getPosition();
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return seekFrameHeader == SEEK_HEADER_XING ? XingSeeker.create(parse, position, extractorInput.getLength()) : getConstantBitrateSeeker(position, parse, extractorInput.getLength());
    }

    private void maybeUpdateCbrDurationToLastSample() {
        Seeker seeker = this.seeker;
        if ((seeker instanceof ConstantBitrateSeeker) && seeker.isSeekable()) {
            long j = this.endPositionOfLastSampleRead;
            if (j == -1 || j == this.seeker.getDataEndPosition()) {
                return;
            }
            this.seeker = ((ConstantBitrateSeeker) this.seeker).copyWithNewDataEndPosition(this.endPositionOfLastSampleRead);
            ExtractorOutput extractorOutput = this.extractorOutput;
            extractorOutput.getClass();
            extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput = this.realTrackOutput;
            trackOutput.getClass();
            trackOutput.durationUs(this.seeker.getDurationUs());
        }
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(ExtractorInput extractorInput) {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker computeSeeker = computeSeeker(extractorInput);
            this.seeker = computeSeeker;
            this.realTrackOutput.durationUs(computeSeeker.getDurationUs());
            this.extractorOutput.seekMap(this.seeker);
            Metadata metadata = this.id3Metadata;
            if (metadata == null || (this.flags & 8) != 0) {
                metadata = this.xingMetadata;
            } else {
                Metadata metadata2 = this.xingMetadata;
                if (metadata2 != null) {
                    metadata = metadata.copyWithAppendedEntriesFrom(metadata2);
                }
            }
            Format.Builder metadata3 = new Format.Builder().setContainerMimeType(MimeTypes.AUDIO_MPEG).setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata(metadata);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                metadata3.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(metadata3.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j = this.firstSamplePosition;
            if (position < j) {
                extractorInput.skipFully((int) (j - position));
            }
        }
        return readSample(extractorInput);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(ExtractorInput extractorInput) {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int readInt = this.scratch.readInt();
            if (!headersMatch(readInt, this.synchronizedHeaderData) || MpegAudioUtil.getFrameSize(readInt) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(readInt);
            if (this.basisTimeUs == C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C.TIME_UNSET) {
                    this.basisTimeUs = (this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L)) + this.basisTimeUs;
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            long position = extractorInput.getPosition();
            MpegAudioUtil.Header header = this.synchronizedHeader;
            this.endPositionOfLastSampleRead = position + header.frameSize;
            Seeker seeker = this.seeker;
            if (seeker instanceof IndexSeeker) {
                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + header.samplesPerFrame), this.endPositionOfLastSampleRead);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int sampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i = this.sampleBytesRemaining - sampleData;
        this.sampleBytesRemaining = i;
        if (i > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private boolean shouldFallbackToConstantBitrateSeeking(Seeker seeker) {
        return (seeker.isSeekable() || (this.flags & 1) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        if (r12 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        r11.skipFully(r0 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r10.synchronizedHeaderData = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        r11.resetPeekPosition();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean synchronize(androidx.media3.extractor.ExtractorInput r11, boolean r12) {
        /*
            r10 = this;
            r11.resetPeekPosition()
            long r0 = r11.getPosition()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L49
            int r0 = r10.flags
            r4 = r0 & 8
            if (r4 != 0) goto L19
            r4 = r2
            goto L1a
        L19:
            r4 = r3
        L1a:
            r0 = r0 & 16
            if (r0 == 0) goto L20
            r0 = r2
            goto L21
        L20:
            r0 = r3
        L21:
            if (r4 != 0) goto L26
            androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate r0 = androidx.media3.extractor.mp3.Mp3Extractor.REQUIRED_ID3_FRAME_PREDICATE
            goto L2c
        L26:
            if (r0 == 0) goto L2b
            androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate r0 = androidx.media3.extractor.metadata.id3.Id3Decoder.NO_ARTWORK_PREDICATE
            goto L2c
        L2b:
            r0 = 0
        L2c:
            androidx.media3.extractor.Id3Peeker r4 = r10.id3Peeker
            androidx.media3.common.Metadata r0 = r4.peekId3Data(r11, r0, r1)
            r10.id3Metadata = r0
            if (r0 == 0) goto L3b
            androidx.media3.extractor.GaplessInfoHolder r4 = r10.gaplessInfoHolder
            r4.setFromMetadata(r0)
        L3b:
            long r4 = r11.getPeekPosition()
            int r0 = (int) r4
            if (r12 != 0) goto L45
            r11.skipFully(r0)
        L45:
            r4 = r3
        L46:
            r5 = r4
            r6 = r5
            goto L4c
        L49:
            r0 = r3
            r4 = r0
            goto L46
        L4c:
            boolean r7 = r10.peekEndOfStreamOrHeader(r11)
            if (r7 == 0) goto L5c
            if (r5 <= 0) goto L55
            goto La5
        L55:
            r10.maybeUpdateCbrDurationToLastSample()
            defpackage.zy.c()
            return r3
        L5c:
            androidx.media3.common.util.ParsableByteArray r7 = r10.scratch
            r7.setPosition(r3)
            androidx.media3.common.util.ParsableByteArray r7 = r10.scratch
            int r7 = r7.readInt()
            if (r4 == 0) goto L70
            long r8 = (long) r4
            boolean r8 = headersMatch(r7, r8)
            if (r8 == 0) goto L77
        L70:
            int r8 = androidx.media3.extractor.MpegAudioUtil.getFrameSize(r7)
            r9 = -1
            if (r8 != r9) goto L97
        L77:
            int r4 = r6 + 1
            if (r6 != r1) goto L85
            if (r12 == 0) goto L7e
            return r3
        L7e:
            r10.maybeUpdateCbrDurationToLastSample()
            defpackage.zy.c()
            return r3
        L85:
            if (r12 == 0) goto L90
            r11.resetPeekPosition()
            int r5 = r0 + r4
            r11.advancePeekPosition(r5)
            goto L93
        L90:
            r11.skipFully(r2)
        L93:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L4c
        L97:
            int r5 = r5 + 1
            if (r5 != r2) goto La2
            androidx.media3.extractor.MpegAudioUtil$Header r4 = r10.synchronizedHeader
            r4.setForHeaderData(r7)
            r4 = r7
            goto Lb2
        La2:
            r7 = 4
            if (r5 != r7) goto Lb2
        La5:
            if (r12 == 0) goto Lac
            int r0 = r0 + r6
            r11.skipFully(r0)
            goto Laf
        Lac:
            r11.resetPeekPosition()
        Laf:
            r10.synchronizedHeaderData = r4
            return r2
        Lb2:
            int r8 = r8 + (-4)
            r11.advancePeekPosition(r8)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.synchronize(androidx.media3.extractor.ExtractorInput, boolean):boolean");
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput track = extractorOutput.track(0, 1);
        this.realTrackOutput = track;
        this.currentTrackOutput = track;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        assertInitialized();
        int readInternal = readInternal(extractorInput);
        if (readInternal == -1 && (this.seeker instanceof IndexSeeker)) {
            long j = this.samplesRead - 1;
            long computeFinalIndexSeekerDurationUs = j >= 0 ? computeFinalIndexSeekerDurationUs(j) : C.TIME_UNSET;
            if (this.seeker.getDurationUs() != computeFinalIndexSeekerDurationUs) {
                ((IndexSeeker) this.seeker).setDurationUs(computeFinalIndexSeekerDurationUs);
                this.extractorOutput.seekMap(this.seeker);
                this.realTrackOutput.durationUs(this.seeker.getDurationUs());
            }
        }
        return readInternal;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.endPositionOfLastSampleRead = -1L;
        this.seekTimeUs = j2;
        Seeker seeker = this.seeker;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).isTimeUsInIndex(j2)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return synchronize(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public Mp3Extractor(int i) {
        this(i, C.TIME_UNSET);
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, (this.flags & 2) != 0);
    }
}
