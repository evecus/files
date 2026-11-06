package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class d extends ConcurrentHashMap.CollectionView implements Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null) {
            return false;
        }
        return value == obj2 || value.equals(obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set != this) {
            return containsAll(set) && set.containsAll(this);
        }
        return true;
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
                consumer.n(new i(a.b, a.c, this.a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        j[] jVarArr = this.a.a;
        int i = 0;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    break;
                }
                i += a.hashCode();
            }
        }
        return i;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new c(jVarArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        j$.util.stream.Stream Z;
        Z = v3.Z(j$.time.a.a0(this), true);
        return Stream.Wrapper.convert(Z);
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
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
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new e(jVarArr, length, 0, length, j < 0 ? 0L : j, concurrentHashMap);
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }
}
