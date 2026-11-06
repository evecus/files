package androidx.media3.common.util;

import android.content.Context;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.WakeLockManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ b(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                ((NetworkTypeObserver.Receiver) obj2).lambda$onReceive$0((Context) obj);
                break;
            default:
                ((WakeLockManager.WakeLockManagerInternal) obj2).lambda$forceReleaseWakeLock$0((AtomicBoolean) obj);
                break;
        }
    }
}
