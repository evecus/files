package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class d0 implements e8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public d0(boolean z, z6 z6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : y6.r) | y6.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.e8
    public final Object a(a aVar, Spliterator spliterator) {
        f8 f8Var = (f8) this.d.get();
        aVar.R(spliterator, f8Var);
        Object obj = f8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.e8
    public final Object b(a aVar, Spliterator spliterator) {
        return new k0(this, y6.ORDERED.h(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.e8
    public final int f() {
        return this.a;
    }
}
