package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q7 extends r7 implements j$.util.a1 {
    @Override // j$.util.stream.t7
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new q7((j$.util.a1) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.r7
    public final Object b() {
        return new c2((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.E(this, consumer);
    }
}
