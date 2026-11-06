package defpackage;

import android.content.Context;
import android.media.AudioManager;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jr implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;

    public /* synthetic */ jr(Context context, byte b) {
        this.I = b;
        this.J = context;
    }

    @Override // defpackage.gz4
    public final Object get() {
        AudioManager audioManager;
        RenderersFactory lambda$new$0;
        MediaSource.Factory lambda$new$1;
        TrackSelector lambda$new$14;
        BandwidthMeter singletonInstance;
        byte b = this.I;
        Context context = this.J;
        switch (b) {
            case 0:
                audioManager = AudioManagerCompat.getAudioManager(context);
                return audioManager;
            case 1:
                lambda$new$0 = ExoPlayer.Builder.lambda$new$0(context);
                return lambda$new$0;
            case 2:
                lambda$new$1 = ExoPlayer.Builder.lambda$new$1(context);
                return lambda$new$1;
            case 3:
                lambda$new$14 = ExoPlayer.Builder.lambda$new$14(context);
                return lambda$new$14;
            default:
                singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                return singletonInstance;
        }
    }
}
