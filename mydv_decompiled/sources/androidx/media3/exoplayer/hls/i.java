package androidx.media3.exoplayer.hls;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ i(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3((Player.PositionInfo) obj3, obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 1:
                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$4((Player.PositionInfo) obj3, obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 2:
                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$5((Player.PositionInfo) obj3, obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPlaybackStateChanged$7((ExoPlayer) obj3, obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
