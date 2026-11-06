package androidx.media3.exoplayer.upstream.experimental;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic(double d) {
        this.smoothingFactor = d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j3;
            return;
        }
        double pow = Math.pow(this.smoothingFactor, Math.sqrt(j));
        this.bitrateEstimate = (long) (((1.0d - pow) * j3) + (this.bitrateEstimate * pow));
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }
}
