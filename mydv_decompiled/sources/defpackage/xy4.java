package defpackage;

import j$.lang.Iterable$CC;
import j$.time.a;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xy4 implements Collection, w72, j$.util.Collection {
    public final /* synthetic */ byte I = 0;
    public final Object J;

    public xy4() {
        int i = ng3.a;
        this.J = new f43(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.I) {
            case 0:
                return ((f43) this.J).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.I) {
            case 0:
                ((f43) this.J).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                return ((f43) obj2).c(obj);
            default:
                return ((n43) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((f43) obj).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((n43) obj).d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        byte b = this.I;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((f43) obj).g == 0;
            default:
                return ((n43) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.I) {
            case 0:
                return new i43((f43) this.J).iterator();
            default:
                return oh4.n(new ua1(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        byte b = this.I;
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.I) {
            case 0:
                return ((f43) this.J).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.I) {
            case 0:
                return ((f43) this.J).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.I) {
            case 0:
                return ((f43) this.J).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return ((f43) obj).g;
            default:
                return ((n43) obj).e;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        byte b = this.I;
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        byte b = this.I;
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.I) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return j42.i0(this, objArr);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        j$.util.stream.Stream Z;
        byte b = this.I;
        Z = v3.Z(a.a0(this), true);
        return Z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        j$.util.Spliterator spliterator;
        byte b = this.I;
        spliterator = Spliterators.spliterator(this, 0);
        return spliterator;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        j$.util.stream.Stream Z;
        byte b = this.I;
        Z = v3.Z(a.a0(this), false);
        return Z;
    }

    public xy4(n43 n43Var) {
        this.J = n43Var;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        byte b = this.I;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.I) {
        }
        return j42.h0(this);
    }
}
