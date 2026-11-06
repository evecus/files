package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ns0 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;

    public /* synthetic */ ns0(Context context, byte b) {
        this.I = b;
        this.J = context;
    }

    @Override // defpackage.gz4
    public final Object get() {
        BandwidthMeter singletonInstance;
        RenderersFactory lambda$new$1;
        MediaSource.Factory lambda$new$3;
        RenderersFactory lambda$new$4;
        byte b = this.I;
        Context context = this.J;
        switch (b) {
            case 0:
                singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                return singletonInstance;
            case 1:
                lambda$new$1 = DefaultPreloadManager.Builder.lambda$new$1(context);
                return lambda$new$1;
            case 2:
                lambda$new$3 = ExoPlayer.Builder.lambda$new$3(context);
                return lambda$new$3;
            default:
                lambda$new$4 = ExoPlayer.Builder.lambda$new$4(context);
                return lambda$new$4;
        }
    }
}
