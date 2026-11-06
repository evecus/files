package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class rr implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ Object M;

    public /* synthetic */ rr(Object obj, String str, long j, long j2, byte b) {
        this.I = b;
        this.M = obj;
        this.J = str;
        this.K = j;
        this.L = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.J, this.K, this.L);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.J, this.K, this.L);
                break;
        }
    }
}
