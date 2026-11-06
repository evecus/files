package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface l1 extends g {
    l1 a();

    c0 asDoubleStream();

    j$.util.b0 average();

    l1 b(j$.util.p pVar);

    Stream boxed();

    l1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    l1 d();

    l1 distinct();

    l1 e();

    j$.util.d0 findAny();

    j$.util.d0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    c0 i();

    @Override // j$.util.stream.g
    j$.util.p0 iterator();

    boolean k();

    l1 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.d0 max();

    j$.util.d0 min();

    boolean o();

    @Override // j$.util.stream.g
    l1 parallel();

    l1 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.d0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.g
    l1 sequential();

    l1 skip(long j);

    l1 sorted();

    @Override // j$.util.stream.g
    j$.util.a1 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    long[] toArray();

    boolean v();

    IntStream y();
}
