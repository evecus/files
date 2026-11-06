package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class u7 extends x7 implements j$.util.u0, DoubleConsumer {
    public double e;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.f(this, doubleConsumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new u7((j$.util.u0) spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.l(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.e);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.C(this, consumer);
    }

    @Override // j$.util.stream.x7, j$.util.stream.a8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
