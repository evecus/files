package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class j3 implements Spliterator {
    public f2 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public Deque e;

    public j3(i2 i2Var) {
        this.a = i2Var;
    }

    public static f2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            f2 f2Var = (f2) arrayDeque.pollFirst();
            if (f2Var == null) {
                return null;
            }
            if (f2Var.o() != 0) {
                for (int o = f2Var.o() - 1; o >= 0; o--) {
                    arrayDeque.addFirst(f2Var.a(o));
                }
            } else if (f2Var.count() > 0) {
                return f2Var;
            }
        }
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int o = this.a.o();
        while (true) {
            o--;
            if (o < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(o));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        Deque b = b();
        this.e = b;
        f2 a = a(b);
        if (a != null) {
            this.d = a.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.o(); i++) {
            j += this.a.a(i).count();
        }
        return j;
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
    public final Spliterator trySplit() {
        f2 f2Var = this.a;
        if (f2Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int o = f2Var.o() - 1;
        f2 f2Var2 = this.a;
        int i2 = this.b;
        if (i < o) {
            this.b = i2 + 1;
            return f2Var2.a(i2).spliterator();
        }
        f2 a = f2Var2.a(i2);
        this.a = a;
        int o2 = a.o();
        f2 f2Var3 = this.a;
        if (o2 != 0) {
            this.b = 1;
            return f2Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = f2Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
