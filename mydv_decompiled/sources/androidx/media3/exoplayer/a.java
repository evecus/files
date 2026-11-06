package androidx.media3.exoplayer;

import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.StreamVolumeManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ a(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) obj).lambda$disable$2();
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) obj).lambda$disable$2();
                break;
            default:
                ((StreamVolumeManager.VolumeChangeReceiver) obj).lambda$onReceive$0();
                break;
        }
    }
}
