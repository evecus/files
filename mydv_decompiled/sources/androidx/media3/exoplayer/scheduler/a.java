package androidx.media3.exoplayer.scheduler;

import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ RequirementsWatcher.NetworkCallback J;

    public /* synthetic */ a(RequirementsWatcher.NetworkCallback networkCallback, byte b) {
        this.I = b;
        this.J = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        RequirementsWatcher.NetworkCallback networkCallback = this.J;
        switch (b) {
            case 0:
                networkCallback.lambda$postCheckRequirements$0();
                break;
            default:
                networkCallback.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
