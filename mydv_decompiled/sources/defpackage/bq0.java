package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bq0 implements ListenerSet.Event, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ long K;

    public /* synthetic */ bq0(long j, Clock clock) {
        this.I = (byte) 3;
        this.K = j;
        this.J = clock;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged((AnalyticsListener.EventTime) this.J, this.K);
                break;
            case 1:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged((AnalyticsListener.EventTime) this.J, this.K);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged((AnalyticsListener.EventTime) this.J, this.K);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        boolean lambda$getAgeBasedEvictionFunction$1;
        lambda$getAgeBasedEvictionFunction$1 = SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.K, (Clock) this.J, deque);
        return lambda$getAgeBasedEvictionFunction$1;
    }

    public /* synthetic */ bq0(AnalyticsListener.EventTime eventTime, long j, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = j;
    }
}
