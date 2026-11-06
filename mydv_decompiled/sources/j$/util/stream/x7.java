package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class x7 extends a8 implements j$.util.d1 {
    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        e7 e7Var = null;
        while (true) {
            z7 f = f();
            if (f == z7.NO_MORE) {
                return;
            }
            z7 z7Var = z7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (f != z7Var) {
                ((j$.util.d1) spliterator).forEachRemaining(obj);
                return;
            }
            if (e7Var == null) {
                e7Var = j();
            } else {
                e7Var.b = 0;
            }
            long j = 0;
            while (((j$.util.d1) spliterator).tryAdvance(e7Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                e7Var.a(obj, a(j));
            }
        }
    }

    public abstract void g(Object obj);

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

    public e7 j() {
        return new b7();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != z7.NO_MORE && ((j$.util.d1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.stream.a8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
