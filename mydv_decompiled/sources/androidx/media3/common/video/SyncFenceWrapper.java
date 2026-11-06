package androidx.media3.common.video;

import android.hardware.SyncFence;
import android.os.Build;
import j$.time.Duration;
import j$.time.TimeConversions;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SyncFenceWrapper {
    private final SyncFence syncFence;

    private SyncFenceWrapper(SyncFence syncFence) {
        this.syncFence = syncFence;
    }

    public static SyncFenceWrapper of(SyncFence syncFence) {
        return new SyncFenceWrapper(syncFence);
    }

    public SyncFence asSyncFence() {
        return this.syncFence;
    }

    public boolean await(Duration duration) {
        boolean await;
        if (Build.VERSION.SDK_INT < 33) {
            return true;
        }
        await = this.syncFence.await(TimeConversions.convert(duration));
        return await;
    }

    public void awaitForever() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.syncFence.awaitForever();
        }
    }

    public boolean awaitMs(long j) {
        boolean await;
        if (Build.VERSION.SDK_INT < 33) {
            return true;
        }
        await = this.syncFence.await(TimeConversions.convert(Duration.ofMillis(j)));
        return await;
    }

    public void close() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.syncFence.close();
        }
    }
}
