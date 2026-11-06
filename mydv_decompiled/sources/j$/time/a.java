package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.a1;
import j$.util.c0;
import j$.util.d0;
import j$.util.e0;
import j$.util.i0;
import j$.util.m0;
import j$.util.r0;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import j$.util.t1;
import j$.util.u0;
import j$.util.x0;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static long A(j$.time.chrono.e eVar, y yVar) {
        Objects.a(yVar, "offset");
        return ((eVar.toLocalDate().toEpochDay() * 86400) + eVar.toLocalTime().toSecondOfDay()) - yVar.b;
    }

    public static long B(j$.time.chrono.j jVar) {
        return ((jVar.toLocalDate().toEpochDay() * 86400) + jVar.toLocalTime().toSecondOfDay()) - jVar.getOffset().b;
    }

    public static boolean C(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return u0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (t1.a) {
            t1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return u0Var.tryAdvance((DoubleConsumer) new e0(consumer, (byte) 0));
    }

    public static boolean D(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return x0Var.tryAdvance((IntConsumer) consumer);
        }
        if (t1.a) {
            t1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return x0Var.tryAdvance((IntConsumer) new i0(consumer, (byte) 0));
    }

    public static boolean E(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return a1Var.tryAdvance((LongConsumer) consumer);
        }
        if (t1.a) {
            t1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return a1Var.tryAdvance((LongConsumer) new m0(consumer, (byte) 0));
    }

    public static String F(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String G(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static j$.util.a0 H(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? new j$.util.a0(optional.get()) : j$.util.a0.b;
    }

    public static j$.util.b0 I(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new j$.util.b0(optionalDouble.getAsDouble()) : j$.util.b0.c;
    }

    public static c0 J(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? new c0(optionalInt.getAsInt()) : c0.c;
    }

    public static d0 K(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? new d0(optionalLong.getAsLong()) : d0.c;
    }

    public static Optional L(j$.util.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        Object obj = a0Var.a;
        if (obj == null) {
            return Optional.empty();
        }
        if (obj != null) {
            return Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalDouble M(j$.util.b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z = b0Var.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(b0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt N(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z = c0Var.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong O(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        boolean z = d0Var.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(d0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static void P(Collection collection, Consumer consumer) {
        if (collection instanceof j$.util.Collection) {
            ((j$.util.Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static void Q(Iterator it, Consumer consumer) {
        if (it instanceof j$.util.y) {
            ((j$.util.y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.a R(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        j$.time.chrono.a aVar = (j$.time.chrono.a) mVar.i(j$.time.temporal.q.b);
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        if (aVar != null) {
            return aVar;
        }
        Objects.a(sVar, "defaultObj");
        return sVar;
    }

    public static /* synthetic */ long S(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry T(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ long U(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long V(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long W(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long X(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String Y(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static /* synthetic */ Stream Z(Collection collection) {
        Stream Z;
        if (collection instanceof j$.util.Collection) {
            return ((j$.util.Collection) collection).parallelStream();
        }
        Z = v3.Z(a0(collection), true);
        return Z;
    }

    public static j$.time.temporal.l a(j$.time.chrono.b bVar, j$.time.temporal.l lVar) {
        return lVar.a(bVar.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static Spliterator a0(Collection collection) {
        Spliterator spliterator;
        if (collection instanceof j$.util.Collection) {
            return ((j$.util.Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new r0(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return Spliterators.spliterator((Set) collection, 1);
        }
        if (collection instanceof List) {
            return List.CC.$default$spliterator((java.util.List) collection);
        }
        spliterator = Spliterators.spliterator(collection, 0);
        return spliterator;
    }

    public static j$.util.function.g b(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new j$.util.function.g(predicate, predicate2, (byte) 0);
    }

    public static /* synthetic */ Stream b0(Collection collection) {
        Stream Z;
        if (collection instanceof j$.util.Collection) {
            return ((j$.util.Collection) collection).stream();
        }
        Z = v3.Z(a0(collection), false);
        return Z;
    }

    public static j$.util.concurrent.r c(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new j$.util.concurrent.r((Object) biConsumer, (Object) biConsumer2, (byte) 1);
    }

    public static b c0() {
        String id = TimeZone.getDefault().getID();
        Map map = x.a;
        Objects.a(id, "zoneId");
        Objects.a(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return new b(x.r(id, true));
    }

    public static j$.util.concurrent.r d(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new j$.util.concurrent.r(biFunction, function);
    }

    public static j$.util.concurrent.r e(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new j$.util.concurrent.r((Object) consumer, (Object) consumer2, (byte) 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b f(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.time.a.f(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static j$.util.function.f g(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.time.a.g(this, longConsumer3);
            }
        };
    }

    public static int h(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.toEpochDay(), bVar2.toEpochDay());
        if (compare != 0) {
            return compare;
        }
        return bVar.getChronology().getId().compareTo(bVar2.getChronology().getId());
    }

    public static int i(j$.time.chrono.e eVar, j$.time.chrono.e eVar2) {
        int p = eVar.toLocalDate().p(eVar2.toLocalDate());
        return (p == 0 && (p = eVar.toLocalTime().q(eVar2.toLocalTime())) == 0) ? eVar.getChronology().getId().compareTo(eVar2.getChronology().getId()) : p;
    }

    public static int j(j$.time.chrono.j jVar, j$.time.chrono.j jVar2) {
        int compare = Long.compare(jVar.toEpochSecond(), jVar2.toEpochSecond());
        return (compare == 0 && (compare = jVar.toLocalTime().d - jVar2.toLocalTime().d) == 0 && (compare = jVar.toLocalDateTime().o(jVar2.toLocalDateTime())) == 0 && (compare = jVar.getZone().getId().compareTo(jVar2.getZone().getId())) == 0) ? jVar.getChronology().getId().compareTo(jVar2.getChronology().getId()) : compare;
    }

    public static void k(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void l(u0 u0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            u0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(u0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            u0Var.forEachRemaining((DoubleConsumer) new e0(consumer, (byte) 0));
        }
    }

    public static void m(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            x0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(x0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            x0Var.forEachRemaining((IntConsumer) new i0(consumer, (byte) 0));
        }
    }

    public static void n(a1 a1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a1Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(a1Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            a1Var.forEachRemaining((LongConsumer) new m0(consumer, (byte) 0));
        }
    }

    public static int o(j$.time.chrono.j jVar, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.a(jVar, pVar);
        }
        int i = j$.time.chrono.i.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? jVar.toLocalDateTime().d(pVar) : jVar.getOffset().b;
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int p(j$.time.chrono.m mVar, j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.ERA ? mVar.getValue() : j$.time.temporal.q.a(mVar, pVar);
    }

    public static long q(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long r(j$.time.chrono.m mVar, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        return pVar.f(mVar);
    }

    public static boolean s(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean t(j$.time.chrono.b bVar, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isDateBased() : pVar != null && pVar.d(bVar);
    }

    public static boolean u(j$.time.chrono.m mVar, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.d(mVar);
    }

    public static j$.util.function.g v(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new j$.util.function.g(predicate, predicate2, (byte) 1);
    }

    public static Object w(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.g) {
            return null;
        }
        return aVar == j$.time.temporal.q.b ? bVar.getChronology() : aVar == j$.time.temporal.q.c ? ChronoUnit.DAYS : aVar.a(bVar);
    }

    public static Object x(j$.time.chrono.e eVar, j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d) {
            return null;
        }
        return aVar == j$.time.temporal.q.g ? eVar.toLocalTime() : aVar == j$.time.temporal.q.b ? eVar.getChronology() : aVar == j$.time.temporal.q.c ? ChronoUnit.NANOS : aVar.a(eVar);
    }

    public static Object y(j$.time.chrono.j jVar, j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.a) ? jVar.getZone() : aVar == j$.time.temporal.q.d ? jVar.getOffset() : aVar == j$.time.temporal.q.g ? jVar.toLocalTime() : aVar == j$.time.temporal.q.b ? jVar.getChronology() : aVar == j$.time.temporal.q.c ? ChronoUnit.NANOS : aVar.a(jVar);
    }

    public static Object z(j$.time.chrono.m mVar, j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.c ? ChronoUnit.ERAS : j$.time.temporal.q.c(mVar, aVar);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
