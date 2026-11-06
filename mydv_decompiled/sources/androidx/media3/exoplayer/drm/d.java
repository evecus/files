package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

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
                ((DefaultDrmSessionManager.PreacquiredSessionReference) obj).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) obj).release(null);
                break;
        }
    }
}
