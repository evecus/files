package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ep4 implements SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {
    public final /* synthetic */ long I;

    public /* synthetic */ ep4(long j) {
        this.I = j;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return this.I;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        boolean lambda$getMaxCountEvictionFunction$0;
        lambda$getMaxCountEvictionFunction$0 = SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.I, deque);
        return lambda$getMaxCountEvictionFunction$0;
    }
}
