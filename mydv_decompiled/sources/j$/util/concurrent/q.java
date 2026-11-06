package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class q extends ConcurrentHashMap.CollectionView implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        j[] jVarArr = this.a.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j a = nVar.a();
            if (a == null) {
                return;
            } else {
                consumer.n(a.c);
            }
        }
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new g(jVarArr, length, length, concurrentHashMap, (byte) 1);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(j$.time.a.a0(this), true);
        return Stream.Wrapper.convert(Z);
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean remove(Object obj) {
        a aVar;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            aVar = (a) it;
            if (!aVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((g) it).next()));
        aVar.remove();
        return true;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return z;
            }
            if (collection.contains(((g) it).next())) {
                aVar.remove();
                z = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        predicate.getClass();
        j[] jVarArr = concurrentHashMap.a;
        boolean z = false;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    break;
                }
                Object obj = a.b;
                Object obj2 = a.c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new h(jVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 1);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(j$.time.a.a0(this), false);
        return Stream.Wrapper.convert(Z);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(j$.time.a.a0(this), true);
        return Z;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(j$.time.a.a0(this), false);
        return Z;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }
}
