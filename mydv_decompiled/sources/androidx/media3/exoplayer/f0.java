package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener J;
    public final /* synthetic */ Pair K;

    public /* synthetic */ f0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, byte b) {
        this.I = b;
        this.J = forwardingEventListener;
        this.K = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Pair pair = this.K;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.J;
        switch (b) {
            case 0:
                forwardingEventListener.lambda$onDrmKeysRemoved$10(pair);
                break;
            case 1:
                forwardingEventListener.lambda$onDrmKeysRestored$9(pair);
                break;
            default:
                forwardingEventListener.lambda$onDrmSessionReleased$11(pair);
                break;
        }
    }
}
