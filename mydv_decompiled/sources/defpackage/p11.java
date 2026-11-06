package defpackage;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p11 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ p11(byte b, Object obj, boolean z) {
        this.I = b;
        this.K = obj;
        this.J = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        boolean z = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((DownloadHelper) obj).lambda$onMediaPrepared$1(z);
                break;
            default:
                ((PreCacheHelper) obj).lambda$release$2(z);
                break;
        }
    }
}
