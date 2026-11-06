package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class d5 extends a implements Stream {
    @Override // j$.util.stream.a
    public final f2 F(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return v3.A(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final z6 I() {
        return z6.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final x1 J(long j, IntFunction intFunction) {
        return v3.x(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator Q(a aVar, Supplier supplier, boolean z) {
        return new c8(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) D(v3.V(s1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) D(v3.V(s1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream b(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new p(this, y6.p | y6.n | y6.t, pVar, (byte) 6);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return D(new a4(z6.REFERENCE, biConsumer2, biConsumer, supplier, (byte) 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) D(new c4((byte) 2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new m(this, y6.m | y6.t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = v8.a;
        Objects.requireNonNull(predicate);
        return new h8(this, v8.b, predicate, (byte) 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new p(this, y6.t, predicate, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.a0 findAny() {
        return (j$.util.a0) D(i0.d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) D(i0.c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new p0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new p0(consumer, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0137, code lost:
    
        if (r0.contains(j$.util.stream.h.UNORDERED) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x020c  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(j$.util.stream.i r10) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.d5.g(j$.util.stream.i):java.lang.Object");
    }

    @Override // j$.util.stream.g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return v3.W(this, 0L, j);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final l1 m(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new e1(this, y6.p | y6.n | y6.t, pVar, (byte) 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new p(this, y6.p | y6.n, function, (byte) 5);
    }

    @Override // j$.util.stream.Stream
    public final c0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new q(this, y6.p | y6.n, toDoubleFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new u0(this, y6.p | y6.n, toIntFunction, (byte) 2);
    }

    @Override // j$.util.stream.Stream
    public final l1 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new e1(this, y6.p | y6.n, toLongFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.a0 max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, (byte) 0));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.a0 min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, (byte) 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) D(v3.V(s1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new p(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final c0 q(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new q(this, y6.p | y6.n | y6.t, pVar, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return D(new a4(z6.REFERENCE, binaryOperator, biFunction, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final IntStream s(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new u0(this, y6.p | y6.n | y6.t, pVar, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.W(this, j, -1L);
        }
        j$.time.h.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new g6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = v8.a;
        Objects.requireNonNull(predicate);
        return new h8(this, v8.a, predicate, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return v3.I(E(intFunction), intFunction).m(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new g6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new g2((byte) 8));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return D(new a4(z6.REFERENCE, binaryOperator, binaryOperator, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.a0 reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.a0) D(new y3(z6.REFERENCE, binaryOperator, (byte) 2));
    }
}
