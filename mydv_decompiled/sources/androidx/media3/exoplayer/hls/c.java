package androidx.media3.exoplayer.hls;

import androidx.media3.common.Metadata;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((HlsInterstitialsAdsLoader.LoaderCallback) obj2).lambda$onLoadError$4((IOException) obj);
                break;
            case 1:
                ((HlsInterstitialsAdsLoader.LoaderCallback) obj2).lambda$onLoadCompleted$2((ParsingLoadable) obj);
                break;
            case 2:
                ((HlsInterstitialsAdsLoader.PlayerListener) obj2).lambda$onTimelineChanged$2((Timeline) obj);
                break;
            case 3:
                ((HlsInterstitialsAdsLoader.PlayerListener) obj2).lambda$onMetadata$0((Metadata) obj);
                break;
            default:
                ((HlsSampleStreamWrapper) obj2).lambda$onPlaylistUpdated$0((HlsMediaChunk) obj);
                break;
        }
    }
}
