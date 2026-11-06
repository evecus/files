package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y7 extends a8 implements Spliterator, Consumer {
    public Object e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        f7 f7Var = null;
        while (true) {
            z7 f = f();
            if (f == z7.NO_MORE) {
                return;
            }
            z7 z7Var = z7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (f != z7Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (f7Var == null) {
                f7Var = new f7();
            } else {
                f7Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(f7Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long a = a(j);
            for (int i = 0; i < a; i++) {
                consumer.accept(f7Var.b[i]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.time.a.q(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.time.a.s(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != z7.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }
}
