package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class f1 extends i1 {
    @Override // j$.util.stream.a
    public final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.i1, j$.util.stream.l1
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            i1.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.i1, j$.util.stream.l1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            i1.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final l1 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final l1 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.h(this.f) ? this : new t(this, y6.r, (byte) 4);
    }
}
