package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class t7 {
    public final long a;
    public final long b;
    public Spliterator c;
    public long d;
    public long e;

    public t7(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.c = spliterator;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    public Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new o7((j$.util.u0) spliterator, j, j2, j3, j4);
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.d;
            long min = Math.min(estimateSize, this.b);
            long j2 = this.a;
            if (j2 >= min) {
                this.d = min;
            } else {
                long j3 = this.b;
                if (min < j3) {
                    long j4 = this.d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.d = min;
                        return a(trySplit, j2, j3, j4, min);
                    }
                    this.d = min;
                    return trySplit;
                }
                this.c = trySplit;
                this.e = min;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d1 m200trySplit() {
        return (j$.util.d1) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.x0 m202trySplit() {
        return (j$.util.x0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a1 m199trySplit() {
        return (j$.util.a1) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.u0 m201trySplit() {
        return (j$.util.u0) trySplit();
    }
}
