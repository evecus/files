package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n7 extends a7 implements j$.util.a1 {
    @Override // j$.util.stream.a7
    public final void d() {
        s6 s6Var = new s6();
        this.h = s6Var;
        Objects.requireNonNull(s6Var);
        this.e = this.b.S(new m7(s6Var, (byte) 1));
        this.f = new j$.util.p((byte) 12, this);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new n7(this.b, spliterator, this.a);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        m7 m7Var = new m7(longConsumer, (byte) 0);
        this.b.R(this.d, m7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            s6 s6Var = (s6) this.h;
            long j = this.g;
            int r = s6Var.r(j);
            longConsumer.accept((s6Var.c == 0 && r == 0) ? ((long[]) s6Var.e)[(int) j] : ((long[][]) s6Var.f)[r][(int) (j - s6Var.d[r])]);
        }
        return a;
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a1) super.trySplit();
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
