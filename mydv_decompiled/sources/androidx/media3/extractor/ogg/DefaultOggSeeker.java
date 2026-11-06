package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import defpackage.s83;
import defpackage.sp0;
import defpackage.zl1;
import defpackage.zy;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            long convertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j);
            return new SeekMap.SeekPoints(new SeekPoint(j, Util.constrainValue((BigInteger.valueOf(convertTimeToGranule).multiply(BigInteger.valueOf(DefaultOggSeeker.this.payloadEndPosition - DefaultOggSeeker.this.payloadStartPosition)).divide(BigInteger.valueOf(DefaultOggSeeker.this.totalGranules)).longValue() + DefaultOggSeeker.this.payloadStartPosition) - 30000, DefaultOggSeeker.this.payloadStartPosition, DefaultOggSeeker.this.payloadEndPosition - 1)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
        sp0.o(j >= 0 && j2 > j);
        this.streamReader = streamReader;
        this.payloadStartPosition = j;
        this.payloadEndPosition = j2;
        if (j3 == j2 - j || z) {
            this.totalGranules = j4;
            this.state = 4;
        } else {
            this.state = 0;
        }
        this.pageHeader = new OggPageHeader();
    }

    private long getNextSeekPosition(ExtractorInput extractorInput) {
        if (this.start == this.end) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!this.pageHeader.skipToNextPage(extractorInput, this.end)) {
            long j = this.start;
            if (j != position) {
                return j;
            }
            zl1.g("No ogg page can be found.");
            return 0L;
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j2 = this.targetGranule;
        OggPageHeader oggPageHeader = this.pageHeader;
        long j3 = oggPageHeader.granulePosition;
        long j4 = j2 - j3;
        int i = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.end = position;
            this.endGranule = j3;
        } else {
            this.start = extractorInput.getPosition() + i;
            this.startGranule = this.pageHeader.granulePosition;
        }
        long j5 = this.end;
        long j6 = this.start;
        if (j5 - j6 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.end = j6;
            return j6;
        }
        long position2 = extractorInput.getPosition() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.end;
        long j8 = this.start;
        return Util.constrainValue((((j7 - j8) * j4) / (this.endGranule - this.startGranule)) + position2, j8, j7 - 1);
    }

    private void skipToPageOfTargetGranule(ExtractorInput extractorInput) {
        while (true) {
            this.pageHeader.skipToNextPage(extractorInput);
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            if (oggPageHeader.granulePosition > this.targetGranule) {
                extractorInput.resetPeekPosition();
                return;
            } else {
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                this.start = extractorInput.getPosition();
                this.startGranule = this.pageHeader.granulePosition;
            }
        }
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) {
        int i = this.state;
        if (i == 0) {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j = this.payloadEndPosition - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long nextSeekPosition = getNextSeekPosition(extractorInput);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.state = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                s83.r();
                return 0L;
            }
            skipToPageOfTargetGranule(extractorInput);
            this.state = 4;
            return -(this.startGranule + 2);
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    public long readGranuleOfLastPage(ExtractorInput extractorInput) {
        this.pageHeader.reset();
        if (!this.pageHeader.skipToNextPage(extractorInput)) {
            zy.c();
            return 0L;
        }
        this.pageHeader.populate(extractorInput, false);
        OggPageHeader oggPageHeader = this.pageHeader;
        extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        long j = this.pageHeader.granulePosition;
        while (true) {
            OggPageHeader oggPageHeader2 = this.pageHeader;
            if ((oggPageHeader2.type & 4) == 4 || !oggPageHeader2.skipToNextPage(extractorInput) || extractorInput.getPosition() >= this.payloadEndPosition || !this.pageHeader.populate(extractorInput, true)) {
                break;
            }
            OggPageHeader oggPageHeader3 = this.pageHeader;
            if (!ExtractorUtil.skipFullyQuietly(extractorInput, oggPageHeader3.headerSize + oggPageHeader3.bodySize)) {
                break;
            }
            j = this.pageHeader.granulePosition;
        }
        return j;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public void startSeek(long j) {
        this.targetGranule = Util.constrainValue(j, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }
}
