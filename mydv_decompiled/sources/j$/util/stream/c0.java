package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface c0 extends g {
    c0 a();

    j$.util.b0 average();

    c0 b(j$.util.p pVar);

    Stream boxed();

    c0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    c0 d();

    c0 distinct();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.g
    j$.util.h0 iterator();

    boolean l();

    c0 limit(long j);

    c0 map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    @Override // j$.util.stream.g
    c0 parallel();

    c0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.g
    c0 sequential();

    c0 skip(long j);

    c0 sorted();

    @Override // j$.util.stream.g
    j$.util.u0 spliterator();

    double sum();

    j$.util.w summaryStatistics();

    boolean t();

    double[] toArray();

    l1 u();

    IntStream x();

    boolean z();
}
