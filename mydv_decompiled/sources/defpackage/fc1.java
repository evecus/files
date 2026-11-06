package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc1 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ TrackSelector J;

    public /* synthetic */ fc1(TrackSelector trackSelector, byte b) {
        this.I = b;
        this.J = trackSelector;
    }

    @Override // defpackage.gz4
    public final Object get() {
        TrackSelector lambda$new$10;
        TrackSelector lambda$setTrackSelector$18;
        byte b = this.I;
        TrackSelector trackSelector = this.J;
        switch (b) {
            case 0:
                lambda$new$10 = ExoPlayer.Builder.lambda$new$10(trackSelector);
                return lambda$new$10;
            default:
                lambda$setTrackSelector$18 = ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
                return lambda$setTrackSelector$18;
        }
    }
}
