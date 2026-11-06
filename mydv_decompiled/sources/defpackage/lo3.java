package defpackage;

import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lo3 extends b4 {
    @Override // defpackage.f04
    public final int c(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.f04
    public final long e() {
        return ThreadLocalRandom.current().nextLong(1000L);
    }

    @Override // defpackage.f04
    public final long f() {
        return ThreadLocalRandom.current().nextLong(0L, 1000L);
    }
}
