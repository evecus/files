package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fe5 implements ListIterator {
    public ListIterator I;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.I.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.I.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.I.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.I.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.I.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
