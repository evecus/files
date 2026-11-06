package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class r2 extends i2 {
    @Override // j$.util.stream.f2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.f2
    public final f2 j(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.j(j - count, j2 - count, intFunction);
        }
        f2 f2Var = this.a;
        if (j2 <= count) {
            return f2Var.j(j, j2, intFunction);
        }
        return v3.E(z6.REFERENCE, f2Var.j(j, count, intFunction), this.b.j(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.f2
    public final void k(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        f2 f2Var = this.a;
        f2Var.k(objArr, i);
        this.b.k(objArr, i + ((int) f2Var.count()));
    }

    @Override // j$.util.stream.f2
    public final Object[] m(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f2
    public final Spliterator spliterator() {
        return new i3(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
