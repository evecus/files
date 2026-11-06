package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class r3 extends CountedCompleter implements l5 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public r3(r3 r3Var, Spliterator spliterator, long j, long j2, int i) {
        super(r3Var);
        this.a = spliterator;
        this.b = r3Var.b;
        this.c = r3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract r3 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        r3 r3Var = this;
        while (spliterator.estimateSize() > r3Var.c && (trySplit = spliterator.trySplit()) != null) {
            r3Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            r3Var.a(trySplit, r3Var.d, estimateSize).fork();
            r3Var = r3Var.a(spliterator, r3Var.d + estimateSize, r3Var.e - estimateSize);
        }
        r3Var.b.R(spliterator, r3Var);
        r3Var.propagateCompletion();
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    public r3(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}
