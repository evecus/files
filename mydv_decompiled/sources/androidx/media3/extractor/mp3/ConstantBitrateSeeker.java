package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final long dataEndPosition;
    private final long durationUs;

    public ConstantBitrateSeeker(long j, long j2, MpegAudioUtil.Header header, boolean z) {
        this(j, j2, header.bitrate, header.frameSize, z, C.TIME_UNSET);
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j) {
        return new ConstantBitrateSeeker(j, getFirstFramePosition(), getAverageBitrate(), getFrameSize(), shouldAllowSeeksIfLengthUnknown(), false, this.durationUs);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return getBitrate();
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return getFirstFramePosition();
    }

    @Override // androidx.media3.extractor.ConstantBitrateSeekMap, androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        long j = this.durationUs;
        return j != C.TIME_UNSET ? j : super.getDurationUs();
    }

    @Override // androidx.media3.extractor.ConstantBitrateSeekMap, androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        long j2 = this.durationUs;
        if (j2 == C.TIME_UNSET || j < j2 || this.dataEndPosition == -1) {
            return super.getSeekPoints(j);
        }
        return new SeekMap.SeekPoints(new SeekPoint(Math.max(0L, this.durationUs - getTimeUsAtPosition(getFirstFramePosition() + getFrameSize())), Math.max(getFirstFramePosition(), this.dataEndPosition - getFrameSize())));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z, long j3) {
        this(j, j2, i, i2, z, true, j3);
    }

    private ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        this.durationUs = j3;
        this.dataEndPosition = j == -1 ? -1L : j;
    }
}
