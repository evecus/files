package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ms0 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ BandwidthMeter J;

    public /* synthetic */ ms0(BandwidthMeter bandwidthMeter, byte b) {
        this.I = b;
        this.J = bandwidthMeter;
    }

    @Override // defpackage.gz4
    public final Object get() {
        BandwidthMeter lambda$setBandwidthMeter$4;
        BandwidthMeter lambda$setBandwidthMeter$20;
        BandwidthMeter lambda$new$12;
        byte b = this.I;
        BandwidthMeter bandwidthMeter = this.J;
        switch (b) {
            case 0:
                lambda$setBandwidthMeter$4 = DefaultPreloadManager.Builder.lambda$setBandwidthMeter$4(bandwidthMeter);
                return lambda$setBandwidthMeter$4;
            case 1:
                lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
                return lambda$setBandwidthMeter$20;
            default:
                lambda$new$12 = ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
                return lambda$new$12;
        }
    }
}
