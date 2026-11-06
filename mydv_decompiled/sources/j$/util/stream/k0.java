package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class k0 extends b {
    public final d0 j;
    public final boolean k;

    public k0(k0 k0Var, Spliterator spliterator) {
        super(k0Var, spliterator);
        this.k = k0Var.k;
        this.j = k0Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        f8 f8Var = (f8) this.j.d.get();
        aVar.R(this.b, f8Var);
        Object obj = f8Var.get();
        if (this.k) {
            if (obj != null) {
                d dVar = this;
                while (dVar != null) {
                    d dVar2 = (d) dVar.getCompleter();
                    if (dVar2 != null && dVar2.d != dVar) {
                        g();
                        return obj;
                    }
                    dVar = dVar2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new k0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            k0 k0Var = (k0) this.d;
            k0 k0Var2 = null;
            while (true) {
                if (k0Var != k0Var2) {
                    Object i = k0Var.i();
                    if (i != null && this.j.c.test(i)) {
                        d(i);
                        d dVar = this;
                        while (true) {
                            if (dVar != null) {
                                d dVar2 = (d) dVar.getCompleter();
                                if (dVar2 != null && dVar2.d != dVar) {
                                    g();
                                    break;
                                }
                                dVar = dVar2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, i) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        k0Var2 = k0Var;
                        k0Var = (k0) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public k0(d0 d0Var, boolean z, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z;
        this.j = d0Var;
    }
}
