package defpackage;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i41 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher J;
    public final /* synthetic */ DrmSessionEventListener K;

    public /* synthetic */ i41(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, byte b) {
        this.I = b;
        this.J = eventDispatcher;
        this.K = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        DrmSessionEventListener drmSessionEventListener = this.K;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.J;
        switch (b) {
            case 0:
                eventDispatcher.lambda$drmKeysRemoved$4(drmSessionEventListener);
                break;
            case 1:
                eventDispatcher.lambda$drmKeysRestored$3(drmSessionEventListener);
                break;
            default:
                eventDispatcher.lambda$drmSessionReleased$5(drmSessionEventListener);
                break;
        }
    }
}
