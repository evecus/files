package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class b4 extends f04 {
    @Override // defpackage.f04
    public final int a(int i) {
        return (g().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.f04
    public final int b() {
        return g().nextInt();
    }

    @Override // defpackage.f04
    public final long d() {
        return g().nextLong();
    }

    public Random g() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    public final int h(int i) {
        return g().nextInt(i);
    }
}
