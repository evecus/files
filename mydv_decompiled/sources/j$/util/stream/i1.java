package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class i1 extends a implements l1 {
    public static j$.util.a1 U(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a1) {
            return (j$.util.a1) spliterator;
        }
        if (!g8.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        g8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final f2 F(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return v3.D(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean H(Spliterator spliterator, l5 l5Var) {
        LongConsumer m0Var;
        boolean e;
        j$.util.a1 U = U(spliterator);
        if (l5Var instanceof LongConsumer) {
            m0Var = (LongConsumer) l5Var;
        } else {
            if (g8.a) {
                g8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            m0Var = new j$.util.m0(l5Var, (byte) 1);
        }
        do {
            e = l5Var.e();
            if (e) {
                break;
            }
        } while (U.tryAdvance(m0Var));
        return e;
    }

    @Override // j$.util.stream.a
    public final z6 I() {
        return z6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final x1 J(long j, IntFunction intFunction) {
        return v3.O(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator Q(a aVar, Supplier supplier, boolean z) {
        return new n7(aVar, supplier, z);
    }

    @Override // j$.util.stream.l1
    public final l1 a() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new f6(this, v8.a, (byte) 1);
    }

    @Override // j$.util.stream.l1
    public final c0 asDoubleStream() {
        return new v(this, y6.n, (byte) 4);
    }

    @Override // j$.util.stream.l1
    public final j$.util.b0 average() {
        long j = ((long[]) collect(new f0((byte) 22), new f0((byte) 23), new f0((byte) 24)))[0];
        return j > 0 ? new j$.util.b0(r4[1] / j) : j$.util.b0.c;
    }

    @Override // j$.util.stream.l1
    public final l1 b(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new e1(this, y6.p | y6.n | y6.t, pVar, (byte) 0);
    }

    @Override // j$.util.stream.l1
    public final Stream boxed() {
        return new p(this, 0, new f0((byte) 21), (byte) 2);
    }

    @Override // j$.util.stream.l1
    public final l1 c() {
        Objects.requireNonNull(null);
        return new t(this, y6.t, (byte) 5);
    }

    @Override // j$.util.stream.l1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, (byte) 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(oVar);
        return D(new a4(z6.LONG_VALUE, oVar, objLongConsumer, supplier, (byte) 0));
    }

    @Override // j$.util.stream.l1
    public final long count() {
        return ((Long) D(new c4((byte) 0))).longValue();
    }

    @Override // j$.util.stream.l1
    public final l1 d() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new f6(this, v8.b, (byte) 2);
    }

    @Override // j$.util.stream.l1
    public final l1 distinct() {
        return ((d5) boxed()).distinct().mapToLong(new f0((byte) 28));
    }

    @Override // j$.util.stream.l1
    public final l1 e() {
        Objects.requireNonNull(null);
        return new t(this, y6.p | y6.n, (byte) 3);
    }

    @Override // j$.util.stream.l1
    public final j$.util.d0 findAny() {
        return (j$.util.d0) D(h0.d);
    }

    @Override // j$.util.stream.l1
    public final j$.util.d0 findFirst() {
        return (j$.util.d0) D(h0.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new o0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new o0(longConsumer, true));
    }

    @Override // j$.util.stream.l1
    public final c0 i() {
        Objects.requireNonNull(null);
        return new v(this, y6.p | y6.n, (byte) 5);
    }

    @Override // j$.util.stream.g
    public final j$.util.p0 iterator() {
        j$.util.a1 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.l1
    public final boolean k() {
        return ((Boolean) D(v3.T(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.l1
    public final l1 limit(long j) {
        if (j >= 0) {
            return v3.U(this, 0L, j);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.l1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new p(this, y6.p | y6.n, longFunction, (byte) 2);
    }

    @Override // j$.util.stream.l1
    public final j$.util.d0 max() {
        return reduce(new f0((byte) 25));
    }

    @Override // j$.util.stream.l1
    public final j$.util.d0 min() {
        return reduce(new f0((byte) 27));
    }

    @Override // j$.util.stream.l1
    public final boolean o() {
        return ((Boolean) D(v3.T(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.l1
    public final l1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new e1(this, longConsumer);
    }

    @Override // j$.util.stream.l1
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) D(new w3(z6.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.l1
    public final l1 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.U(this, j, -1L);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.l1
    public final l1 sorted() {
        return new f6(this, y6.q | y6.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.a1 spliterator() {
        return U(super.spliterator());
    }

    @Override // j$.util.stream.l1
    public final long sum() {
        return reduce(0L, new f0((byte) 26));
    }

    @Override // j$.util.stream.l1
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j$.time.format.a((byte) 11), new f0((byte) 18), new f0((byte) 19));
    }

    @Override // j$.util.stream.l1
    public final long[] toArray() {
        return (long[]) v3.L((d2) E(new f0((byte) 20))).b();
    }

    @Override // j$.util.stream.l1
    public final boolean v() {
        return ((Boolean) D(v3.T(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.l1
    public final IntStream y() {
        Objects.requireNonNull(null);
        return new s(this, y6.p | y6.n, (byte) 4);
    }

    @Override // j$.util.stream.l1
    public final j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.d0) D(new y3(z6.LONG_VALUE, longBinaryOperator, (byte) 0));
    }
}
