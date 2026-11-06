package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements l1 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ j1(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ l1 h(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof k1 ? ((k1) longStream).a : new j1(longStream);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 a() {
        return h(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ c0 asDoubleStream() {
        return a0.h(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.b0 average() {
        return j$.time.a.I(this.a.average());
    }

    @Override // j$.util.stream.l1
    public final l1 b(j$.util.p pVar) {
        LongStream longStream = this.a;
        j$.util.p pVar2 = new j$.util.p((byte) 6);
        pVar2.b = pVar;
        return h(longStream.flatMap(pVar2));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Stream boxed() {
        return w6.h(this.a.boxed());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 c() {
        return h(this.a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 d() {
        return h(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 distinct() {
        return h(this.a.distinct());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 e() {
        return h(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof j1) {
            obj = ((j1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.d0 findAny() {
        return j$.time.a.K(this.a.findAny());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.d0 findFirst() {
        return j$.time.a.K(this.a.findFirst());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ c0 i() {
        return a0.h(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ j$.util.p0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.o0 ? ((j$.util.o0) it).a : new j$.util.n0(it);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean k() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 limit(long j) {
        return h(this.a.limit(j));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return w6.h(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.d0 max() {
        return j$.time.a.K(this.a.max());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.d0 min() {
        return j$.time.a.K(this.a.min());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean o() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.h(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.h(this.a.parallel());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 peek(LongConsumer longConsumer) {
        return h(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.time.a.K(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.h(this.a.sequential());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 skip(long j) {
        return h(this.a.skip(j));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 sorted() {
        return h(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ j$.util.a1 spliterator() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.l1
    public final j$.util.z summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.h(this.a.unordered());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean v() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ IntStream y() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ l1 parallel() {
        return h(this.a.parallel());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ l1 sequential() {
        return h(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }
}
