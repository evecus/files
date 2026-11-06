package androidx.media3.common.util;

import androidx.media3.common.C;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(long j, long j2, float f) {
        boolean z = false;
        sp0.o(j2 > 0);
        sp0.o(f > 0.0f);
        if (0 <= j && j < j2) {
            z = true;
        }
        sp0.o(z);
        this.startPositionUs = j;
        this.endPositionUs = j2;
        this.frameRate = f;
        this.totalNumberOfFramesToAdd = Math.max(Math.round(((j2 - j) / 1000000.0f) * f), 1);
        this.framesDurationUs = 1000000.0f / f;
    }

    private long getTimestampUsAfter(int i) {
        long round = Math.round(this.framesDurationUs * i) + this.startPositionUs;
        sp0.z(round >= 0);
        return round;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i = this.totalNumberOfFramesToAdd;
        return i == 0 ? C.TIME_UNSET : getTimestampUsAfter(i - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        sp0.z(hasNext());
        int i = this.framesAdded;
        this.framesAdded = i + 1;
        return getTimestampUsAfter(i);
    }

    public ConstantRateTimestampIterator(long j, float f) {
        this(0L, j, f);
    }
}
