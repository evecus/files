package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.video.DefaultVideoSink;
import androidx.media3.exoplayer.video.VideoSink;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ VideoSize J;
    public final /* synthetic */ Object K;

    public /* synthetic */ e(Object obj, VideoSize videoSize, byte b) {
        this.I = b;
        this.K = obj;
        this.J = videoSize;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        VideoSize videoSize = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$onVideoSizeChanged$0(videoSize);
                break;
            default:
                ((VideoSink.Listener) obj).onVideoSizeChanged(videoSize);
                break;
        }
    }
}
