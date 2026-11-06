package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class z extends a implements c0 {
    public static j$.util.u0 U(Spliterator spliterator) {
        if (spliterator instanceof j$.util.u0) {
            return (j$.util.u0) spliterator;
        }
        if (!g8.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        g8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final boolean H(Spliterator spliterator, l5 l5Var) {
        DoubleConsumer e0Var;
        boolean e;
        j$.util.u0 U = U(spliterator);
        if (l5Var instanceof DoubleConsumer) {
            e0Var = (DoubleConsumer) l5Var;
        } else {
            if (g8.a) {
                g8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            e0Var = new j$.util.e0(l5Var, (byte) 1);
        }
        do {
            e = l5Var.e();
            if (e) {
                break;
            }
        } while (U.tryAdvance(e0Var));
        return e;
    }

    @Override // j$.util.stream.c0
    public final c0 a() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new d6(this, v8.a, (byte) 1);
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 average() {
        double[] dArr = (double[]) collect(new j$.time.format.a((byte) 24), new j$.time.format.a((byte) 25), new j$.time.format.a((byte) 26));
        if (dArr[2] <= 0.0d) {
            return j$.util.b0.c;
        }
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.b0(d / dArr[2]);
    }

    @Override // j$.util.stream.c0
    public final c0 b(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new q(this, y6.p | y6.n | y6.t, pVar, (byte) 1);
    }

    @Override // j$.util.stream.c0
    public final Stream boxed() {
        return new p(this, 0, new j$.time.format.a((byte) 16), (byte) 0);
    }

    @Override // j$.util.stream.c0
    public final c0 c() {
        Objects.requireNonNull(null);
        return new v(this, y6.t, (byte) 1);
    }

    @Override // j$.util.stream.c0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, (byte) 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return D(new a4(z6.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, (byte) 1));
    }

    @Override // j$.util.stream.c0
    public final long count() {
        return ((Long) D(new c4((byte) 1))).longValue();
    }

    @Override // j$.util.stream.c0
    public final c0 d() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new d6(this, v8.b, (byte) 2);
    }

    @Override // j$.util.stream.c0
    public final c0 distinct() {
        return ((d5) boxed()).distinct().mapToDouble(new j$.time.format.a((byte) 17));
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 findAny() {
        return (j$.util.b0) D(e0.d);
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) D(e0.c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new m0(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new m0(doubleConsumer, true));
    }

    @Override // j$.util.stream.g
    public final j$.util.h0 iterator() {
        j$.util.u0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.i1(spliterator);
    }

    @Override // j$.util.stream.c0
    public final boolean l() {
        return ((Boolean) D(v3.P(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final c0 limit(long j) {
        if (j >= 0) {
            return v3.Q(this, 0L, j);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.c0
    public final c0 map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new q(this, y6.p | y6.n, doubleUnaryOperator, (byte) 0);
    }

    @Override // j$.util.stream.c0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new p(this, y6.p | y6.n, doubleFunction, (byte) 0);
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 max() {
        return reduce(new j$.time.format.a((byte) 19));
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 min() {
        return reduce(new j$.time.format.a((byte) 23));
    }

    @Override // j$.util.stream.c0
    public final c0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new q(this, doubleConsumer);
    }

    @Override // j$.util.stream.c0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) D(new e4(z6.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.c0
    public final c0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.Q(this, j, -1L);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.c0
    public final c0 sorted() {
        return new d6(this, y6.q | y6.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.u0 spliterator() {
        return U(super.spliterator());
    }

    @Override // j$.util.stream.c0
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.format.a((byte) 20), new j$.time.format.a((byte) 21), new j$.time.format.a((byte) 22));
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.c0
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j$.time.format.a((byte) 9), new j$.time.format.a((byte) 27), new j$.time.format.a((byte) 15));
    }

    @Override // j$.util.stream.c0
    public final boolean t() {
        return ((Boolean) D(v3.P(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final double[] toArray() {
        return (double[]) v3.J((z1) E(new j$.time.format.a((byte) 18))).b();
    }

    @Override // j$.util.stream.c0
    public final l1 u() {
        Objects.requireNonNull(null);
        return new t(this, y6.p | y6.n, (byte) 0);
    }

    @Override // j$.util.stream.c0
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new s(this, y6.p | y6.n, (byte) 0);
    }

    @Override // j$.util.stream.c0
    public final boolean z() {
        return ((Boolean) D(v3.P(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.b0) D(new y3(z6.DOUBLE_VALUE, doubleBinaryOperator, (byte) 1));
    }
}
