package defpackage;

import androidx.media3.common.video.SurfaceHolderFrameWriter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a05 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SurfaceHolderFrameWriter J;
    public final /* synthetic */ IllegalStateException K;

    public /* synthetic */ a05(SurfaceHolderFrameWriter surfaceHolderFrameWriter, IllegalStateException illegalStateException, byte b) {
        this.I = b;
        this.J = surfaceHolderFrameWriter;
        this.K = illegalStateException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        IllegalStateException illegalStateException = this.K;
        SurfaceHolderFrameWriter surfaceHolderFrameWriter = this.J;
        switch (b) {
            case 0:
                surfaceHolderFrameWriter.lambda$queueInputFrame$8(illegalStateException);
                break;
            default:
                surfaceHolderFrameWriter.lambda$dequeueInputFrame$4(illegalStateException);
                break;
        }
    }
}
