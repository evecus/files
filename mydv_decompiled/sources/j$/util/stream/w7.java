package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class w7 extends x7 implements j$.util.a1, LongConsumer {
    public long e;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new w7((j$.util.a1) spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.n(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.e);
    }

    @Override // j$.util.stream.x7
    public final e7 j() {
        return new d7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.E(this, consumer);
    }

    @Override // j$.util.stream.x7, j$.util.stream.a8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }
}
