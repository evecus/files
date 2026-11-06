package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener J;
    public final /* synthetic */ Pair K;
    public final /* synthetic */ LoadEventInfo L;
    public final /* synthetic */ MediaLoadData M;

    public /* synthetic */ e0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, byte b) {
        this.I = b;
        this.J = forwardingEventListener;
        this.K = pair;
        this.L = loadEventInfo;
        this.M = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        MediaLoadData mediaLoadData = this.M;
        LoadEventInfo loadEventInfo = this.L;
        Pair pair = this.K;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.J;
        switch (b) {
            case 0:
                forwardingEventListener.lambda$onLoadCanceled$2(pair, loadEventInfo, mediaLoadData);
                break;
            default:
                forwardingEventListener.lambda$onLoadCompleted$1(pair, loadEventInfo, mediaLoadData);
                break;
        }
    }
}
