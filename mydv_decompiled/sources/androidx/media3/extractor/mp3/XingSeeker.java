package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j, int i, long j2, long j3, long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i;
        this.durationUs = j2;
        this.averageBitrate = Mp3Util.computeAverageBitrate(j3 - i, j2);
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.dataEndPosition = j3 != -1 ? j + j3 : -1L;
    }

    public static XingSeeker create(XingFrame xingFrame, long j, long j2) {
        long computeDurationUs = xingFrame.computeDurationUs();
        if (computeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j3 = xingFrame.dataSize;
        if (j3 != -1 && j2 != -1 && j + j3 != j2) {
            long j4 = j2 - j;
            StringBuilder A = hf1.A(j4, "Data size mismatch between stream (", ") and Xing frame (");
            A.append(xingFrame.dataSize);
            A.append("), using smaller value.");
            Log.i(TAG, A.toString());
            j3 = Math.min(xingFrame.dataSize, j4);
        }
        return new XingSeeker(j, xingFrame.header.frameSize, computeDurationUs, j3, xingFrame.tableOfContents);
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.durationUs * i) / 100;
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
        return this.dataStartPosition + this.xingFrameSize;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j, 0L, this.durationUs);
        double d = (constrainValue * 100.0d) / this.durationUs;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.tableOfContents;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d - i));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d2 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        long j2 = j - this.dataStartPosition;
        if (!isSeekable() || j2 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = this.tableOfContents;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.dataSize;
        int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
        long j3 = jArr[binarySearchFloor];
        int i = binarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        return Math.round((j3 == (binarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }
}
