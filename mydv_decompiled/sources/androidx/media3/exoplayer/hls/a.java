package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements PlayerMessage.Target, Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ a(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 1:
                HlsInterstitialsAdsLoader.lambda$startLoadingAssetList$11((HlsInterstitialsAdsLoader.AssetListData) obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((HlsInterstitialsAdsLoader.LoaderCallback) obj2).lambda$onLoadCompleted$0((HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        ((HlsInterstitialsAdsLoader.RunnableAtPosition) this.J).run();
    }
}
