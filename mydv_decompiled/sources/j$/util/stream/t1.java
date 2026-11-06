package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class t1 extends b {
    public final j$.util.concurrent.r j;

    public t1(t1 t1Var, Spliterator spliterator) {
        super(t1Var, spliterator);
        this.j = t1Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        r1 r1Var = (r1) ((Supplier) this.j.c).get();
        aVar.R(this.b, r1Var);
        boolean z = r1Var.b;
        if (z == ((s1) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t1(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((s1) this.j.b).b);
    }

    public t1(j$.util.concurrent.r rVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = rVar;
    }
}
