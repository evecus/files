package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class or implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher J;
    public final /* synthetic */ Exception K;

    public /* synthetic */ or(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, byte b) {
        this.I = b;
        this.J = eventDispatcher;
        this.K = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Exception exc = this.K;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.J;
        switch (b) {
            case 0:
                eventDispatcher.lambda$audioCodecError$9(exc);
                break;
            default:
                eventDispatcher.lambda$audioSinkError$8(exc);
                break;
        }
    }
}
