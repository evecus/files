package okhttp3.internal.connection;

import defpackage.er0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AddressPolicy {
    public final long backoffDelayMillis;
    public final int backoffJitterMillis;
    public final int minimumConcurrentCalls;

    public /* synthetic */ AddressPolicy(int i, long j, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 60000L : j, (i3 & 4) != 0 ? 100 : i2);
    }

    public AddressPolicy(int i, long j, int i2) {
        this.minimumConcurrentCalls = i;
        this.backoffDelayMillis = j;
        this.backoffJitterMillis = i2;
    }

    public AddressPolicy() {
        this(0, 0L, 0, 7, null);
    }
}
