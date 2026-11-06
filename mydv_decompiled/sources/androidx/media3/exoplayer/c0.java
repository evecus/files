package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener J;
    public final /* synthetic */ Pair K;
    public final /* synthetic */ Object L;

    public /* synthetic */ c0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, Object obj, byte b) {
        this.I = b;
        this.J = forwardingEventListener;
        this.K = pair;
        this.L = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.L;
        Pair pair = this.K;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.J;
        switch (b) {
            case 0:
                forwardingEventListener.lambda$onUpstreamDiscarded$4(pair, (MediaLoadData) obj);
                break;
            case 1:
                forwardingEventListener.lambda$onDrmKeysLoaded$7(pair, (KeyRequestInfo) obj);
                break;
            default:
                forwardingEventListener.lambda$onDrmSessionManagerError$8(pair, (Exception) obj);
                break;
        }
    }
}
