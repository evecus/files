package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class v7 extends x7 implements j$.util.x0, IntConsumer {
    public int e;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new v7((j$.util.x0) spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.m(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.e);
    }

    @Override // j$.util.stream.x7
    public final e7 j() {
        return new c7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.D(this, consumer);
    }

    @Override // j$.util.stream.x7, j$.util.stream.a8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }
}
