package defpackage;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class so5 implements Runnable {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher J;
    public final /* synthetic */ long K;
    public final /* synthetic */ int L;

    public /* synthetic */ so5(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.J = eventDispatcher;
        this.L = i;
        this.K = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        int i = this.L;
        long j = this.K;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.J;
        switch (b) {
            case 0:
                eventDispatcher.lambda$droppedFrames$3(i, j);
                break;
            default:
                eventDispatcher.lambda$reportVideoFrameProcessingOffset$4(j, i);
                break;
        }
    }

    public /* synthetic */ so5(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.J = eventDispatcher;
        this.K = j;
        this.L = i;
    }
}
