package defpackage;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nd3 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ OfflineLicenseHelper J;
    public final /* synthetic */ DrmSession K;
    public final /* synthetic */ al4 L;

    public /* synthetic */ nd3(al4 al4Var, DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper) {
        this.I = (byte) 1;
        this.J = offlineLicenseHelper;
        this.K = drmSession;
        this.L = al4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        DrmSession drmSession = this.K;
        al4 al4Var = this.L;
        OfflineLicenseHelper offlineLicenseHelper = this.J;
        switch (b) {
            case 0:
                offlineLicenseHelper.lambda$getLicenseDurationRemainingSec$0(al4Var, drmSession);
                break;
            case 1:
                offlineLicenseHelper.lambda$acquireFirstSessionOnHandlerThread$3(drmSession, al4Var);
                break;
            default:
                offlineLicenseHelper.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(al4Var, drmSession);
                break;
        }
    }

    public /* synthetic */ nd3(OfflineLicenseHelper offlineLicenseHelper, al4 al4Var, DrmSession drmSession, byte b) {
        this.I = b;
        this.J = offlineLicenseHelper;
        this.L = al4Var;
        this.K = drmSession;
    }
}
