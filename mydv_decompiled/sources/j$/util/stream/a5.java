package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a5 extends d5 {
    @Override // j$.util.stream.a
    public final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.d5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.k) {
            super.forEachOrdered(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.h(this.f) ? this : new z4(this, y6.r);
    }
}
