package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s0 extends CountedCompleter {
    public Spliterator a;
    public final l5 b;
    public final a c;
    public long d;

    public s0(s0 s0Var, Spliterator spliterator) {
        super(s0Var);
        this.a = spliterator;
        this.b = s0Var.b;
        this.d = s0Var.d;
        this.c = s0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = d.e(estimateSize);
            this.d = j;
        }
        boolean h = y6.SHORT_CIRCUIT.h(this.c.f);
        l5 l5Var = this.b;
        boolean z = false;
        while (true) {
            if (h && l5Var.e()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            s0 s0Var = new s0(this, trySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                s0Var = this;
                this = s0Var;
            }
            z = !z;
            this.fork();
            this = s0Var;
            estimateSize = spliterator.estimateSize();
        }
        this.c.A(spliterator, l5Var);
        this.a = null;
        this.propagateCompletion();
    }

    public s0(a aVar, Spliterator spliterator, l5 l5Var) {
        super(null);
        this.b = l5Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
