package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.DefaultVideoSink;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ d(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$renderFrame$1();
                break;
            case 1:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$dropFrame$2();
                break;
            default:
                ((DefaultVideoSink) obj).lambda$handleInputFrame$3();
                break;
        }
    }
}
