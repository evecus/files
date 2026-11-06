package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class x0 extends a1 {
    @Override // j$.util.stream.a
    public final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a1, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEach(intConsumer);
        } else {
            a1.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.a1, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEachOrdered(intConsumer);
        } else {
            a1.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.h(this.f) ? this : new s(this, y6.r, (byte) 2);
    }
}
