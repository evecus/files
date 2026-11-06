package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class a8 {
    public final Spliterator a;
    public final boolean b;
    public final long c;
    public final AtomicLong d;

    public a8(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long min;
        do {
            j2 = this.d.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.d.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    public Spliterator b(Spliterator spliterator) {
        return new y7(spliterator, this);
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final z7 f() {
        return this.d.get() > 0 ? z7.MAYBE_MORE : this.b ? z7.UNLIMITED : z7.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.d.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }

    public a8(Spliterator spliterator, a8 a8Var) {
        this.a = spliterator;
        this.b = a8Var.b;
        this.d = a8Var.d;
        this.c = a8Var.c;
    }
}
