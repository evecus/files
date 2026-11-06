package androidx.media3.common.util;

import androidx.media3.common.C;
import androidx.media3.common.audio.SpeedProvider;
import defpackage.sp0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class SpeedProviderUtil {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SpeedProviderMapper {
        private final long[] inputSegmentStartTimesUs;
        private final long[] outputSegmentStartTimesUs;
        private final float[] speeds;

        public SpeedProviderMapper(SpeedProvider speedProvider) {
            LongArray longArray = new LongArray();
            LongArray longArray2 = new LongArray();
            ArrayList arrayList = new ArrayList();
            float speed = speedProvider.getSpeed(0L);
            longArray.add(0L);
            longArray2.add(0L);
            arrayList.add(Float.valueOf(speed));
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(0L);
            sp0.z(speed > 0.0f);
            long j = 0;
            long j2 = nextSpeedChangeTimeUs;
            float f = speed;
            long j3 = 0;
            while (j2 != C.TIME_UNSET) {
                sp0.z(j2 > j3);
                sp0.z(f > 0.0f);
                j += Util.getPlayoutDurationForMediaDuration(j2 - j3, f);
                f = speedProvider.getSpeed(j2);
                longArray.add(j);
                longArray2.add(j2);
                arrayList.add(Float.valueOf(f));
                j3 = j2;
                j2 = speedProvider.getNextSpeedChangeTimeUs(j2);
            }
            this.outputSegmentStartTimesUs = longArray.toArray();
            this.inputSegmentStartTimesUs = longArray2.toArray();
            Object[] array = arrayList.toArray();
            int length = array.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                Object obj = array[i];
                obj.getClass();
                fArr[i] = ((Number) obj).floatValue();
            }
            this.speeds = fArr;
        }

        public long getAdjustedTimeUs(long j) {
            sp0.o((j == C.TIME_UNSET || j == Long.MIN_VALUE) ? false : true);
            sp0.o(j >= 0);
            int binarySearchFloor = Util.binarySearchFloor(this.inputSegmentStartTimesUs, j, true, true);
            return Util.getPlayoutDurationForMediaDuration(j - this.inputSegmentStartTimesUs[binarySearchFloor], this.speeds[binarySearchFloor]) + this.outputSegmentStartTimesUs[binarySearchFloor];
        }

        public long getOriginalTimeUs(long j) {
            sp0.o((j == C.TIME_UNSET || j == Long.MIN_VALUE) ? false : true);
            sp0.o(j >= 0);
            int binarySearchFloor = Util.binarySearchFloor(this.outputSegmentStartTimesUs, j, true, true);
            return Util.getMediaDurationForPlayoutDuration(j - this.outputSegmentStartTimesUs[binarySearchFloor], this.speeds[binarySearchFloor]) + this.inputSegmentStartTimesUs[binarySearchFloor];
        }
    }

    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j) {
        long j2 = 0;
        double d = 0.0d;
        while (j2 < j) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j2);
            if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            sp0.z(nextSpeedChangeTimeUs > j2);
            d += (Math.min(nextSpeedChangeTimeUs, j) - j2) / speedProvider.getSpeed(j2);
            j2 = nextSpeedChangeTimeUs;
        }
        return (long) Math.floor(d);
    }

    public static long getNextSpeedChangeSamplePosition(SpeedProvider speedProvider, long j, int i) {
        sp0.o(j >= 0);
        sp0.o(i > 0);
        long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(Util.sampleCountToDurationUs(j, i));
        if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
            return -1L;
        }
        return Util.durationUsToSampleCount(nextSpeedChangeTimeUs, i);
    }

    public static float getSampleAlignedSpeed(SpeedProvider speedProvider, long j, int i) {
        sp0.o(j >= 0);
        sp0.o(i > 0);
        return speedProvider.getSpeed(Util.sampleCountToDurationUs(j, i));
    }
}
