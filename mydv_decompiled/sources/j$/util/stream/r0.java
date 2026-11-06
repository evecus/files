package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class r0 extends CountedCompleter {
    public final a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final q0 e;
    public final r0 f;
    public f2 g;

    public r0(a aVar, Spliterator spliterator, q0 q0Var) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = q0Var;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            r0 r0Var = new r0(this, trySplit, this.f);
            r0 r0Var2 = new r0(this, spliterator, r0Var);
            this.addToPendingCount(1);
            r0Var2.addToPendingCount(1);
            this.d.put(r0Var, r0Var2);
            if (this.f != null) {
                r0Var.addToPendingCount(1);
                if (this.d.replace(this.f, this, r0Var)) {
                    this.addToPendingCount(-1);
                } else {
                    r0Var.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                this = r0Var;
                r0Var = r0Var2;
            } else {
                this = r0Var2;
            }
            z = !z;
            r0Var.fork();
        }
        if (this.getPendingCount() > 0) {
            f0 f0Var = new f0((byte) 6);
            a aVar = this.a;
            x1 J = aVar.J(aVar.G(spliterator), f0Var);
            this.a.R(spliterator, J);
            this.g = J.build();
            this.b = null;
        }
        this.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.R(spliterator, this.e);
                this.b = null;
            }
        }
        r0 r0Var = (r0) this.d.remove(this);
        if (r0Var != null) {
            r0Var.tryComplete();
        }
    }

    public r0(r0 r0Var, Spliterator spliterator, r0 r0Var2) {
        super(r0Var);
        this.a = r0Var.a;
        this.b = spliterator;
        this.c = r0Var.c;
        this.d = r0Var.d;
        this.e = r0Var.e;
        this.f = r0Var2;
    }
}
