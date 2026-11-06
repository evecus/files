package androidx.media3.common.util;

import androidx.media3.common.C;
import defpackage.sp0;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return Util.scaleLargeTimestamp(j, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j) {
        return Util.scaleLargeTimestamp(j, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long j2 = this.firstSampleTimestampUs;
                if (j2 == MODE_SHARED) {
                    Long l = this.nextSampleTimestampUs.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.timestampOffsetUs = j2 - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j4 = ((j3 - 1) * MAX_PTS_PLUS_ONE) + j;
                long j5 = (j3 * MAX_PTS_PLUS_ONE) + j;
                j = Math.abs(j4 - usToNonWrappedPts) < Math.abs(j5 - usToNonWrappedPts) ? j4 : j5;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != C.TIME_UNSET) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = usToNonWrappedPts / MAX_PTS_PLUS_ONE;
            Long.signum(j3);
            long j4 = (j3 * MAX_PTS_PLUS_ONE) + j;
            j = j4 >= usToNonWrappedPts ? j4 : ((j3 + 1) * MAX_PTS_PLUS_ONE) + j;
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j != C.TIME_UNSET ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) {
        try {
            sp0.z(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                long j3 = 0;
                long j4 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        sp0.z(j4 > 0);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        wait(j4);
                        j3 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j3 >= j2 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j4 = j2 - j3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
