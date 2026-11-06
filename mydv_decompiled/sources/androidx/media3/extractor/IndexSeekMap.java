package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        LongArray longArray;
        LongArray longArray2;
        sp0.o(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            longArray = new LongArray(length);
            this.positions = longArray;
            longArray2 = new LongArray(length);
            this.timesUs = longArray2;
        } else {
            int i = length + 1;
            longArray = new LongArray(i);
            this.positions = longArray;
            longArray2 = new LongArray(i);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        }
        longArray.addAll(jArr);
        longArray2.addAll(jArr2);
        this.durationUs = j;
    }

    public void addSeekPoint(long j, long j2) {
        if (this.timesUs.size() == 0 && j > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j2);
        this.timesUs.add(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(binarySearchFloor), this.positions.get(binarySearchFloor));
        if (seekPoint.timeUs == j || binarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i), this.positions.get(i)));
    }

    public long getTimeUs(long j) {
        if (this.timesUs.size() == 0) {
            return C.TIME_UNSET;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j, long j2) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < j2;
    }

    public void setDurationUs(long j) {
        this.durationUs = j;
    }
}
