package defpackage;

import j$.lang.Iterable$CC;
import j$.time.a;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tq2 implements Collection, w72, j$.util.Collection {
    public static final tq2 K = new tq2(o91.I);
    public final List I;
    public final int J;

    public tq2(List list) {
        this.I = list;
        this.J = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final sq2 c() {
        return (sq2) this.I.get(0);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof sq2)) {
            return false;
        }
        return this.I.contains((sq2) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.I.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tq2) {
            return this.I.equals(((tq2) obj).I);
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.I.iterator();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.J;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j42.h0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.I + ")";
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j42.i0(this, objArr);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(a.a0(this), true);
        return Z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        j$.util.Spliterator spliterator;
        spliterator = Spliterators.spliterator(this, 0);
        return spliterator;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(a.a0(this), false);
        return Z;
    }
}
