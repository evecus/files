package androidx.media3.exoplayer.upstream.contentsteering;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SteeringManifestTracker J;

    public /* synthetic */ c(SteeringManifestTracker steeringManifestTracker, byte b) {
        this.I = b;
        this.J = steeringManifestTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        SteeringManifestTracker steeringManifestTracker = this.J;
        switch (b) {
            case 0:
                SteeringManifestTracker.access$1100(steeringManifestTracker);
                break;
            default:
                SteeringManifestTracker.access$1100(steeringManifestTracker);
                break;
        }
    }
}
