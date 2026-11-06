package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.zx1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.L;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                ((MediaPeriodQueue) obj3).lambda$notifyQueueUpdate$0((zx1) obj2, (MediaSource.MediaPeriodId) obj);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) obj3).lambda$onDownstreamFormatChanged$5((Pair) obj2, (MediaLoadData) obj);
                break;
        }
    }
}
