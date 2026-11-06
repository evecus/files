package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l7 extends a7 implements j$.util.x0 {
    @Override // j$.util.stream.a7
    public final void d() {
        q6 q6Var = new q6();
        this.h = q6Var;
        Objects.requireNonNull(q6Var);
        this.e = this.b.S(new k7(q6Var, (byte) 1));
        this.f = new j$.util.p((byte) 11, this);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new l7(this.b, spliterator, this.a);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        k7 k7Var = new k7(intConsumer, (byte) 0);
        this.b.R(this.d, k7Var);
        this.i = true;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            q6 q6Var = (q6) this.h;
            long j = this.g;
            int r = q6Var.r(j);
            intConsumer.accept((q6Var.c == 0 && r == 0) ? ((int[]) q6Var.e)[(int) j] : ((int[][]) q6Var.f)[r][(int) (j - q6Var.d[r])]);
        }
        return a;
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.D(this, consumer);
    }
}
