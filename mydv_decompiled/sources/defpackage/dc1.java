package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.MediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dc1 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ dc1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.gz4
    public final Object get() {
        RenderersFactory lambda$setRenderersFactory$16;
        MediaSource.Factory lambda$setMediaSourceFactory$17;
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16((RenderersFactory) obj);
                return lambda$setRenderersFactory$16;
            default:
                lambda$setMediaSourceFactory$17 = ExoPlayer.Builder.lambda$setMediaSourceFactory$17((MediaSource.Factory) obj);
                return lambda$setMediaSourceFactory$17;
        }
    }
}
