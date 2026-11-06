package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class j7 extends a7 implements j$.util.u0 {
    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        i7 i7Var = new i7(doubleConsumer, (byte) 0);
        this.b.R(this.d, i7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            o6 o6Var = (o6) this.h;
            long j = this.g;
            int r = o6Var.r(j);
            doubleConsumer.accept((o6Var.c == 0 && r == 0) ? ((double[]) o6Var.e)[(int) j] : ((double[][]) o6Var.f)[r][(int) (j - o6Var.d[r])]);
        }
        return a;
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.C(this, consumer);
    }
}
