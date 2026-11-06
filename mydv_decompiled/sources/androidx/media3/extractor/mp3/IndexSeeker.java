package androidx.media3.extractor.mp3;

import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class IndexSeeker implements Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final IndexSeekMap indexSeekMap;

    public IndexSeeker(long j, long j2, long j3) {
        this.indexSeekMap = new IndexSeekMap(new long[]{j2}, new long[]{0}, j);
        this.dataStartPosition = j2;
        this.dataEndPosition = j3;
        this.averageBitrate = Mp3Util.computeAverageBitrate(j3 - j2, j);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.indexSeekMap.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.indexSeekMap.getTimeUs(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j) {
        return this.indexSeekMap.isTimeUsInIndex(j, 100000L);
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j, j2);
    }

    public void setDurationUs(long j) {
        this.indexSeekMap.setDurationUs(j);
    }
}
