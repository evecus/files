package defpackage;

import android.os.SystemClock;
import coil3.memory.MemoryCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vm2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;

    public /* synthetic */ vm2(long j, byte b) {
        this.I = b;
        this.J = j;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        long maxSizeBytes$lambda$0$0;
        byte b = this.I;
        long j = this.J;
        switch (b) {
            case 0:
                return Long.valueOf(SystemClock.elapsedRealtime() - j);
            case 1:
                maxSizeBytes$lambda$0$0 = MemoryCache.Builder.maxSizeBytes$lambda$0$0(j);
                return Long.valueOf(maxSizeBytes$lambda$0$0);
            default:
                return new v11(j);
        }
    }
}
