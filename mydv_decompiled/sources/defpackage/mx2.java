package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx2 implements Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher J;
    public final /* synthetic */ LoadEventInfo K;
    public final /* synthetic */ MediaLoadData L;

    public /* synthetic */ mx2(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, byte b) {
        this.I = b;
        this.J = eventDispatcher;
        this.K = loadEventInfo;
        this.L = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        byte b = this.I;
        MediaLoadData mediaLoadData = this.L;
        LoadEventInfo loadEventInfo = this.K;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.J;
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (b) {
            case 0:
                eventDispatcher.lambda$loadCompleted$1(loadEventInfo, mediaLoadData, mediaSourceEventListener);
                break;
            default:
                eventDispatcher.lambda$loadCanceled$2(loadEventInfo, mediaLoadData, mediaSourceEventListener);
                break;
        }
    }
}
