package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ a0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ c0 h(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof b0 ? ((b0) doubleStream).a : new a0(doubleStream);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 a() {
        return h(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 average() {
        return j$.time.a.I(this.a.average());
    }

    @Override // j$.util.stream.c0
    public final c0 b(j$.util.p pVar) {
        DoubleStream doubleStream = this.a;
        j$.util.p pVar2 = new j$.util.p((byte) 4);
        pVar2.b = pVar;
        return h(doubleStream.flatMap(pVar2));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream boxed() {
        return w6.h(this.a.boxed());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 c() {
        return h(this.a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 d() {
        return h(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 distinct() {
        return h(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.time.a.I(this.a.findAny());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.time.a.I(this.a.findFirst());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ j$.util.h0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.g0 ? ((j$.util.g0) it).a : new j$.util.f0(it);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean l() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 limit(long j) {
        return h(this.a.limit(j));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 map(DoubleUnaryOperator doubleUnaryOperator) {
        return h(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return w6.h(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 max() {
        return j$.time.a.I(this.a.max());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 min() {
        return j$.time.a.I(this.a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.h(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.h(this.a.parallel());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 peek(DoubleConsumer doubleConsumer) {
        return h(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.time.a.I(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.h(this.a.sequential());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 skip(long j) {
        return h(this.a.skip(j));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 sorted() {
        return h(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ j$.util.u0 spliterator() {
        return j$.util.s0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.c0
    public final j$.util.w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean t() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ l1 u() {
        return j1.h(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.h(this.a.unordered());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean z() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ c0 parallel() {
        return h(this.a.parallel());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ c0 sequential() {
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
